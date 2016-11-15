package com.admms.tcc.oasis.controller.principal;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.dao.ItemAvaliacaoDAO;
import com.admms.tcc.oasis.dao.LegislacaoDAO;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.Legislacao;
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
public class ArquivoController {

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

    public static void criaPlanoAcaoPDF(Context context, PlanoAcao planoAcao) {
        ItemAvaliacaoDAO itemAvaliacaoDao = new ItemAvaliacaoDAO(context);
        EstabelecimentoDAO estabelecimentoDao = new EstabelecimentoDAO(context);
        List<ItemAvaliacao> listaItensAvaliacao = new ArrayList<ItemAvaliacao>();

        String caminho = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "/" + planoAcao.getNomeArquivo();

        listaItensAvaliacao = itemAvaliacaoDao.buscarPorPlanoAcao(planoAcao);
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setCodigo(planoAcao.getEstabelecimento().getCodigo());
        estabelecimento = estabelecimentoDao.buscarPorID(estabelecimento);

        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(caminho));
            Log.i("success","Arquivo " + caminho + "criado com sucesso");
            document.open();
            criaHeader(document, estabelecimento.getRazaoSocial());
            if(!listaItensAvaliacao.isEmpty()) {
                insereConteudo(document, listaItensAvaliacao);
                Paragraph paragrafo = new Paragraph();
                adicionaLinhaVazia(paragrafo, 1);
                document.add(paragrafo);
                insereResumo(document,listaItensAvaliacao,estabelecimento,context);
            }
            document.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    private static void criaHeader(Document document, String nomeEstabelecimento) throws DocumentException {
        PdfPTable table = new PdfPTable(3);

        PdfPCell cell = new PdfPCell(new Phrase(nomeEstabelecimento,FONTE_TITULO));
        cell.setColspan(2);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Documento gerado às " + new SimpleDateFormat("yy/MM/dd").format(new Date()), FONTE_PS));
        table.addCell(cell);

        document.add(table);
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

    private static void insereResumo(Document document, List<ItemAvaliacao> listaItensAvaliacao, Estabelecimento estabelecimento, Context context) throws DocumentException {
        LegislacaoDAO legislacaoDAO = new LegislacaoDAO(context);
        Legislacao legislacao = legislacaoDAO.buscarPorID(estabelecimento.getLegislacao());
        
        int contArmazenamento = 0, contDocumentacao = 0, contEdificacao = 0, contExposicao = 0;
        int contHigiene = 0, contIngredientes = 0, contManipuladores = 0, contPreparo = 0, contQualidade = 0;
        int contResiduos = 0, contResponsavel = 0, contSaneamento = 0, contVetores = 0;

        for (ItemAvaliacao item: listaItensAvaliacao) {
            if (item.getConformidade().equals(Constantes.CONFORMIDADE_INADEQUADA)) {
                if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_ARMAZENAMENTO)) {
                    contArmazenamento++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_DOCUMENTACAO)) {
                    contDocumentacao++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_EDIFICACAO)) {
                    contEdificacao++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_EXPOSICAO)) {
                    contExposicao++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_HIGIENE)) {
                    contHigiene++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_INGREDIENTES)) {
                    contIngredientes++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_MANIPULADORES)) {
                    contManipuladores++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_PREPARO)) {
                    contPreparo++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_QUALIDADE)) {
                    contQualidade++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_RESIDUOS)) {
                    contResiduos++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_RESPONSAVEL)) {
                    contResponsavel++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_SANEAMENTO)) {
                    contSaneamento++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_VETORES)) {
                    contVetores++;
                }
            }
        }

        PdfPTable tabela = new PdfPTable(3);
        PdfPCell cell = new PdfPCell(new Phrase("Legislação: " + legislacao.getNome()));
        tabela.addCell(cell);
        cell = new PdfPCell(new Phrase("% Itens Atendidos"));
        tabela.addCell(cell);
        cell = new PdfPCell(new Phrase("Parecer Técnico"));
        tabela.addCell(cell);

        float porcentagem;
        if (legislacao.getNumeroPerguntasArmazenamento() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_ARMAZENAMENTO));
            tabela.addCell(cell);
            porcentagem = contArmazenamento/legislacao.getNumeroPerguntasArmazenamento() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasDocumentacao() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_DOCUMENTACAO));
            tabela.addCell(cell);
            porcentagem = contDocumentacao/legislacao.getNumeroPerguntasDocumentacao() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasEdificacao() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_EDIFICACAO));
            tabela.addCell(cell);
            porcentagem = contEdificacao/legislacao.getNumeroPerguntasEdificacao() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasExposicao() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_EXPOSICAO));
            tabela.addCell(cell);
            porcentagem = contExposicao/legislacao.getNumeroPerguntasExposicao() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasHigiene() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_HIGIENE));
            tabela.addCell(cell);
            porcentagem = contHigiene/legislacao.getNumeroPerguntasHigiene() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasIngredientes() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_INGREDIENTES));
            tabela.addCell(cell);
            porcentagem = contIngredientes/legislacao.getNumeroPerguntasIngredientes() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasManipuladores() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_MANIPULADORES));
            tabela.addCell(cell);
            porcentagem = contManipuladores/legislacao.getNumeroPerguntasManipuladores() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasPreparo() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_PREPARO));
            tabela.addCell(cell);
            porcentagem = contPreparo/legislacao.getNumeroPerguntasPreparo() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasQualidade() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_QUALIDADE));
            tabela.addCell(cell);
            porcentagem = contQualidade/legislacao.getNumeroPerguntasQualidade() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasResiduos() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_RESIDUOS));
            tabela.addCell(cell);
            porcentagem = contResiduos/legislacao.getNumeroPerguntasResiduos() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasResponsavel() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_RESPONSAVEL));
            tabela.addCell(cell);
            porcentagem = contResponsavel/legislacao.getNumeroPerguntasResponsavel() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasSaneamento() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_SANEAMENTO));
            tabela.addCell(cell);
            porcentagem = contSaneamento/legislacao.getNumeroPerguntasSaneamento() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }
        if (legislacao.getNumeroPerguntasVetores() != 0) {
            cell = new PdfPCell(new Phrase(Constantes.AREA_AVALIADA_VETORES));
            tabela.addCell(cell);
            porcentagem = contVetores/legislacao.getNumeroPerguntasVetores() * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem)));
            tabela.addCell(cell);
            cell = new PdfPCell(new Phrase(parecerTecnico(porcentagem)));
            tabela.addCell(cell);
        }

        document.add(tabela);
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
            cell.setRowspan(6);
            tabela.addCell(cell);
        } else {
            cell = new PdfPCell(new Phrase("\nN/A\n"));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_CENTER);
            cell.setRowspan(6);
            tabela.addCell(cell);
        }

        cell = new PdfPCell(new Phrase("Item Inadequado: " + itemAvaliacao.getPergunta().substring(0, itemAvaliacao.getPergunta().indexOf(" ")) + "\n"));
        cell.setRowspan(1);
        tabela.addCell(cell);
        if(itemAvaliacao.getDescricao() == null) {
            cell = new PdfPCell(new Phrase("O que está inadequado: " + "N/A"));
            tabela.addCell(cell);
        } else {
            cell = new PdfPCell(new Phrase("O que está inadequado: " + itemAvaliacao.getDescricao() + "\n"));
            tabela.addCell(cell);
        }

        cell = new PdfPCell(new Phrase("Quem vai resolver: " + "\n"));
        cell.setRowspan(1);
        tabela.addCell(cell);

        cell = new PdfPCell(new Phrase("Como vai ser resolvido: " + "\n"));
        cell.setRowspan(1);
        tabela.addCell(cell);

        cell = new PdfPCell(new Phrase("Quanto vai custar: " + "\r\n"));
        cell.setRowspan(1);
        tabela.addCell(cell);

        cell = new PdfPCell(new Phrase("Quando vai ser adequado: " + "\n"));
        cell.setRowspan(1);
        tabela.addCell(cell);

        return tabela;
    }

    private static void adicionaLinhaVazia(Paragraph paragrafo, int numeroLinhas) {
        for (int i = 0; i < numeroLinhas; i++) {
            paragrafo.add(new Paragraph(" "));
        }
    }

    private static String parecerTecnico(float numero) {
        if (numero < 60) {
            return "Não qualificado ou Item Crítico";
        } else if ((numero >= 60) && (numero < 90)) {
            return "Qualificado com providências";
        } else {
            return "Qualificado";
        }
    }
}
