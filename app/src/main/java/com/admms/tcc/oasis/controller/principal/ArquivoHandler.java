package com.admms.tcc.oasis.controller.principal;

import android.content.Context;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;

import com.admms.tcc.oasis.dao.DatabaseHelper;
import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.dao.ItemAvaliacaoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.PlanoAcao;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by DemonHide-RB on 10/9/2016.
 */
public class ArquivoHandler {

    private static final String PASTA_FOTOS_CONSTANTE = "/Fotos DBP/";
    private static final Font FONTE_TITULO = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font FONTE_TEXTO = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
    private static final Font FONTE_PS = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

    public static File criaPastaFotos() {
        File dir = Environment.getExternalStorageDirectory();
        File imagesFolder = new File(dir.getAbsolutePath() + PASTA_FOTOS_CONSTANTE);

        if(!imagesFolder.exists()) {
            imagesFolder.mkdirs();
        }

        Log.i("sucess","dir variable " + imagesFolder.getAbsolutePath());
        return imagesFolder;

    }

    public static String criaPlanoAcaoPDF(Context context, PlanoAcao planoAcao) {
        ItemAvaliacaoDAO itemAvaliacaoDao = new ItemAvaliacaoDAO(context);
        EstabelecimentoDAO estabelecimentoDao = new EstabelecimentoDAO(context);
        List<ItemAvaliacao> listaItensAvaliacao = new ArrayList<ItemAvaliacao>();

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String nomeArquivo = "DBP-Relatorio_" + timeStamp + ".pdf";
        String caminho = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/" + nomeArquivo;

        listaItensAvaliacao = itemAvaliacaoDao.buscarPlanoAcao(planoAcao);
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setCodigo(planoAcao.getEstabelecimento().getCodigo());
        estabelecimento = estabelecimentoDao.buscar(estabelecimento);

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(caminho));
            Log.i("success","Arquivo " + caminho + "criado com sucesso");
            document.open();
            criaHeader(document, estabelecimento.getRazaoSocial());
            if(!listaItensAvaliacao.isEmpty()) {
                insereConteudo(document, listaItensAvaliacao);
            }
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return nomeArquivo;
    }


    private static void criaHeader(Document document, String nomeEstabelecimento) throws DocumentException {
        Paragraph header = new Paragraph();

        adicionaLinhaVazia(header, 1);
        header.add(new Paragraph(nomeEstabelecimento,FONTE_TITULO));
        adicionaLinhaVazia(header, 1);
        header.add(new Paragraph("Documento gerado às " + new Date(), FONTE_PS));
        PdfPTable table = new PdfPTable(2);
        header.add(table);
        document.add(header);
    }

    private static void insereConteudo(Document document, List<ItemAvaliacao> listaItensAvaliacao) {
        PdfPTable tabela = new PdfPTable(2);
        Paragraph paragrafo = new Paragraph();
        adicionaLinhaVazia(paragrafo, 1);

        try {
            for (ItemAvaliacao item: listaItensAvaliacao) {
                if(item.getConformidade().equals(Constantes.CONFORMIDADE_INADEQUADA)) {
                    document.add(paragrafo);
                    tabela = criaItemTabela(item);
                    document.add(tabela);
                }
            }
        } catch (Exception e) {
            Log.i("fail","erro criando item da tabela" + e.getMessage());
        }

    }

    private static PdfPTable criaItemTabela(ItemAvaliacao itemAvaliacao) throws BadElementException, IOException {
        PdfPTable tabela = new PdfPTable(2);

        PdfPCell cell;

        File dir = Environment.getExternalStorageDirectory();
        File imagesFolder = new File(dir.getAbsolutePath() + PASTA_FOTOS_CONSTANTE);

        if(itemAvaliacao.getFoto() != null) {
            Image imagem = Image.getInstance( imagesFolder.getAbsolutePath() + "/" + itemAvaliacao.getFoto(),true);
            cell = new PdfPCell(imagem, true);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_CENTER);
            cell.setRowspan(2);
            tabela.addCell(cell);
        } else {
            cell = new PdfPCell(new Phrase("\nN/A\n"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_CENTER);
            cell.setRowspan(2);
            tabela.addCell(cell);
        }

        cell = new PdfPCell(new Phrase(itemAvaliacao.getPergunta() + "\n"));
        cell.setRowspan(1);
        tabela.addCell(cell);
        if(itemAvaliacao.getDescricao() == null) {
            cell = new PdfPCell(new Phrase("N/A"));
            tabela.addCell(cell);
        } else {
            cell = new PdfPCell(new Phrase(itemAvaliacao.getDescricao() + "\n"));
            tabela.addCell(cell);
        }

        return tabela;
    }

    private static void adicionaLinhaVazia(Paragraph paragrafo, int numeroLinhas) {
        for (int i = 0; i < numeroLinhas; i++) {
            paragrafo.add(new Paragraph(" "));
        }
    }
}
