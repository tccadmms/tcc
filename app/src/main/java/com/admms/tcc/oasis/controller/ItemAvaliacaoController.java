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

        return itemAvaliacao;
    }

    public static void salvarItemAvaliacao(ItemAvaliacao itemAvaliacao, Context context) {
        if (itemAvaliacaoDAO == null) {
            itemAvaliacaoDAO = new ItemAvaliacaoDAO(context);
        }

        itemAvaliacaoDAO.inserir(itemAvaliacao);
    }

    public static List<ItemAvaliacao> buscaItemAvaliacaoPorAreaAvaliada(PlanoAcao planoAcao, String areaAvaliada, Context context) {
        if (itemAvaliacaoDAO == null) {
            itemAvaliacaoDAO = new ItemAvaliacaoDAO(context);
        }

        return itemAvaliacaoDAO.buscarPorAreaAvaliada(planoAcao, areaAvaliada);
    }
}
