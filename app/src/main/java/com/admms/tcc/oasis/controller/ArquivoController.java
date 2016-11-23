package com.admms.tcc.oasis.controller;

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
        Legislacao legislacao = LegislacaoController.buscarLegislacaoPorID(estabelecimento.getLegislacao(),context);

        int contArmazenamento = 0, contDocumentacao = 0, contEdificacao = 0, contExposicao = 0;
        int contHigiene = 0, contIngredientes = 0, contManipuladores = 0, contPreparo = 0, contQualidade = 0;
        int contResiduos = 0, contResponsavel = 0, contSaneamento = 0, contVetores = 0;

        int contArmazenamentoNA = 0, contDocumentacaoNA = 0, contEdificacaoNA = 0, contExposicaoNA = 0;
        int contHigieneNA = 0, contIngredientesNA = 0, contManipuladoresNA = 0, contPreparoNA = 0, contQualidadeNA = 0;
        int contResiduosNA = 0, contResponsavelNA = 0, contSaneamentoNA = 0, contVetoresNA = 0;

        int contArmazenamentoAD = 0, contDocumentacaoAD = 0, contEdificacaoAD = 0, contExposicaoAD = 0;
        int contHigieneAD = 0, contIngredientesAD = 0, contManipuladoresAD = 0, contPreparoAD = 0, contQualidadeAD = 0;
        int contResiduosAD = 0, contResponsavelAD = 0, contSaneamentoAD = 0, contVetoresAD = 0;

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
            } else if (item.getConformidade().equals(Constantes.CONFORMIDADE_NA)) {
                if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_ARMAZENAMENTO)) {
                    contArmazenamentoNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_DOCUMENTACAO)) {
                    contDocumentacaoNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_EDIFICACAO)) {
                    contEdificacaoNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_EXPOSICAO)) {
                    contExposicaoNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_HIGIENE)) {
                    contHigieneNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_INGREDIENTES)) {
                    contIngredientesNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_MANIPULADORES)) {
                    contManipuladoresNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_PREPARO)) {
                    contPreparoNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_QUALIDADE)) {
                    contQualidadeNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_RESIDUOS)) {
                    contResiduosNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_RESPONSAVEL)) {
                    contResponsavelNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_SANEAMENTO)) {
                    contSaneamentoNA++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_VETORES)) {
                    contVetoresNA++;
                }
            } else if (item.getConformidade().equals(Constantes.CONFORMIDADE_ADEQUADA)) {
                if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_ARMAZENAMENTO)) {
                    contArmazenamentoAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_DOCUMENTACAO)) {
                    contDocumentacaoAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_EDIFICACAO)) {
                    contEdificacaoAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_EXPOSICAO)) {
                    contExposicaoAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_HIGIENE)) {
                    contHigieneAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_INGREDIENTES)) {
                    contIngredientesAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_MANIPULADORES)) {
                    contManipuladoresAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_PREPARO)) {
                    contPreparoAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_QUALIDADE)) {
                    contQualidadeAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_RESIDUOS)) {
                    contResiduosAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_RESPONSAVEL)) {
                    contResponsavelAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_SANEAMENTO)) {
                    contSaneamentoAD++;
                } else if (item.getAreaAvaliada().equals(Constantes.AREA_AVALIADA_VETORES)) {
                    contVetoresAD++;
                }
            }
        }

        PdfPTable tabela = new PdfPTable(2);
        PdfPCell cell = new PdfPCell(new Phrase("Legislação: " + legislacao.getNome()));
        tabela.addCell(cell);
        cell = new PdfPCell(new Phrase("% Itens Atendidos"));
        tabela.addCell(cell);

        List<Double> porcentagemQuesitosAvaliados = new ArrayList<Double>();
        double porcentagemTotal= 0.0;
        int areasAvaliadas=0;

        // Adiciona as avaliações na lista. Se uma area não foi avaliada, o método devolve um resultado negativo.
        if (legislacao.getNumeroPerguntasArmazenamento() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_ARMAZENAMENTO, contArmazenamentoNA,contArmazenamentoAD,contArmazenamento,tabela,legislacao.getNumeroPerguntasArmazenamento()));
        }
        if (legislacao.getNumeroPerguntasDocumentacao() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_DOCUMENTACAO, contDocumentacaoNA,contDocumentacaoAD,contDocumentacao,tabela,legislacao.getNumeroPerguntasDocumentacao()));
        }
        if (legislacao.getNumeroPerguntasEdificacao() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_EDIFICACAO, contEdificacaoNA,contEdificacaoAD,contEdificacao,tabela,legislacao.getNumeroPerguntasEdificacao()));
        }
        if (legislacao.getNumeroPerguntasExposicao() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_EXPOSICAO, contExposicaoNA,contExposicaoAD,contExposicao,tabela,legislacao.getNumeroPerguntasExposicao()));
        }
        if (legislacao.getNumeroPerguntasHigiene() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_HIGIENE, contHigieneNA,contHigieneAD,contHigiene,tabela,legislacao.getNumeroPerguntasHigiene()));
        }
        if (legislacao.getNumeroPerguntasIngredientes() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_INGREDIENTES, contIngredientesNA,contIngredientesAD,contIngredientes,tabela,legislacao.getNumeroPerguntasIngredientes()));
        }
        if (legislacao.getNumeroPerguntasManipuladores() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_MANIPULADORES, contManipuladoresNA,contManipuladoresAD,contManipuladores,tabela,legislacao.getNumeroPerguntasManipuladores()));
        }
        if (legislacao.getNumeroPerguntasPreparo() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_PREPARO, contPreparoNA,contPreparoAD,contPreparo,tabela,legislacao.getNumeroPerguntasPreparo()));
        }
        if (legislacao.getNumeroPerguntasQualidade() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_QUALIDADE, contQualidadeNA,contQualidadeAD,contQualidade,tabela,legislacao.getNumeroPerguntasQualidade()));
        }
        if (legislacao.getNumeroPerguntasResiduos() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_RESIDUOS, contResiduosNA,contResiduosAD,contResiduos,tabela,legislacao.getNumeroPerguntasResiduos()));
        }
        if (legislacao.getNumeroPerguntasResponsavel() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_RESPONSAVEL, contResponsavelNA,contResponsavelAD,contResponsavel,tabela,legislacao.getNumeroPerguntasResponsavel()));
        }
        if (legislacao.getNumeroPerguntasSaneamento() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_SANEAMENTO, contSaneamentoNA,contSaneamentoAD,contSaneamento,tabela,legislacao.getNumeroPerguntasSaneamento()));
        }
        if (legislacao.getNumeroPerguntasVetores() != 0) {
            porcentagemQuesitosAvaliados.add(avaliaArea(Constantes.AREA_AVALIADA_VETORES, contVetoresNA,contVetoresAD,contVetores,tabela,legislacao.getNumeroPerguntasVetores()));
        }

        // Remove todos os resultados que não foram avaliados
        for (Double e : porcentagemQuesitosAvaliados) {
            if (e >= 0.0) {
                porcentagemTotal += e;
                areasAvaliadas++;
            }
        }

        porcentagemTotal = porcentagemTotal/areasAvaliadas;
        cell = new PdfPCell(new Phrase("Porcentagem de Adequação TOTAL"));
        tabela.addCell(cell);
        cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagemTotal) + "%"));
        tabela.addCell(cell);
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
            cell = new PdfPCell(new Phrase("O que: " + "N/A"));
            tabela.addCell(cell);
        } else {
            cell = new PdfPCell(new Phrase("O que: " + itemAvaliacao.getDescricao() + "\n"));
            tabela.addCell(cell);
        }

        cell = new PdfPCell(new Phrase("Quem: " + "\n "));
        cell.setRowspan(1);
        tabela.addCell(cell);

        cell = new PdfPCell(new Phrase("Como: " + "\n "));
        cell.setRowspan(1);
        tabela.addCell(cell);

        cell = new PdfPCell(new Phrase("Quanto: " + "\r\n "));
        cell.setRowspan(1);
        tabela.addCell(cell);

        cell = new PdfPCell(new Phrase("Quando: " + "\n "));
        cell.setRowspan(1);
        tabela.addCell(cell);

        return tabela;
    }

    private static void adicionaLinhaVazia(Paragraph paragrafo, int numeroLinhas) {
        for (int i = 0; i < numeroLinhas; i++) {
            paragrafo.add(new Paragraph(" "));
        }
    }

    private static double avaliaArea(String areaAvaliada, int itensNA, int itensAD, int itensIN, PdfPTable tabela, int NumTotalPerguntas) {
        double porcentagem;
        PdfPCell cell;

        cell = new PdfPCell(new Phrase(areaAvaliada));
        tabela.addCell(cell);

        if ((itensIN == 0) && (itensAD == 0) && (itensNA == 0)) {
            cell = new PdfPCell(new Phrase("Area não Avaliada"));
            tabela.addCell(cell);
            return -1;
        } else {
            porcentagem = 100.0 - ((double) itensIN)/(NumTotalPerguntas - itensNA) * 100;
            cell = new PdfPCell(new Phrase(String.format("%.2f",porcentagem) + "%"));
            tabela.addCell(cell);
        }

        return porcentagem;
    }
}
