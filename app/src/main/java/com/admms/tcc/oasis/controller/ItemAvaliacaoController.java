package com.admms.tcc.oasis.controller;

import android.content.Context;

import com.admms.tcc.oasis.dao.ItemAvaliacaoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.util.List;

/**
 * Created by DemonHide-RB on 10/21/2016.
 */
public class ItemAvaliacaoController {

    private static PlanoAcaoDAO planoAcaoDAO;
    private static ItemAvaliacaoDAO itemAvaliacaoDAO;

    private static void inicializaDB(Context context) {
        itemAvaliacaoDAO = new ItemAvaliacaoDAO(context);
    }

    public static ItemAvaliacao criaItemAvaliacao(int codigoPlanoAcao, ItemAvaliacao itemAvaliacao, String areaAvaliada, Context context) {
        //Cria plano de Acao para busca
        PlanoAcao planoAcao = new PlanoAcao();

        if (planoAcaoDAO == null) {
            planoAcaoDAO = new PlanoAcaoDAO(context);
        }

        planoAcao.setCodigo(codigoPlanoAcao);
        itemAvaliacao = new ItemAvaliacao();
        itemAvaliacao.setPlanoAcao(planoAcaoDAO.buscarPorID(planoAcao));
        itemAvaliacao.setAreaAvaliada(areaAvaliada);

        return itemAvaliacao;
    }

    public static ItemAvaliacao limpaItemAvaliacao(ItemAvaliacao itemAvaliacao) {

        itemAvaliacao.setFoto(null);
        itemAvaliacao.setDescricao(null);
        itemAvaliacao.setPergunta(null);

        return itemAvaliacao;
    }

    public static ItemAvaliacao limpaItemAvaliacao(ItemAvaliacao itemAvaliacao, Context context) {

        return criaItemAvaliacao(itemAvaliacao.getPlanoAcao().getCodigo(), itemAvaliacao, itemAvaliacao.getAreaAvaliada(), context);
    }

    public static void salvarItemAvaliacao(ItemAvaliacao itemAvaliacao, Context context) {
        if (itemAvaliacaoDAO == null) {
            inicializaDB(context);
        }

        itemAvaliacaoDAO.inserir(itemAvaliacao);
    }

    public static ItemAvaliacao buscarItemAvaliacao(ItemAvaliacao itemAvaliacao, Context context) {
        if (itemAvaliacaoDAO == null) {
            inicializaDB(context);
        }

        return itemAvaliacaoDAO.buscarPorID(itemAvaliacao);
    }

    public static List<ItemAvaliacao> buscaItemAvaliacaoPorAreaAvaliada(PlanoAcao planoAcao, String areaAvaliada, Context context) {
        if (itemAvaliacaoDAO == null) {
            inicializaDB(context);
        }

        return itemAvaliacaoDAO.buscarPorAreaAvaliada(planoAcao, areaAvaliada);
    }

    public static List<ItemAvaliacao> buscaItemAvaliacaoPorAreaAvaliadaConformidade(PlanoAcao planoAcao, String areaAvaliada, String conformidade , Context context) {
        if (itemAvaliacaoDAO == null) {
            inicializaDB(context);
        }

        return itemAvaliacaoDAO.buscarPorAreaAvaliadaConformidade(planoAcao, areaAvaliada, conformidade);
    }
}
