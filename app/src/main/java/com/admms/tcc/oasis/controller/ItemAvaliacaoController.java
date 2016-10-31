package com.admms.tcc.oasis.controller;

import android.content.Context;

import com.admms.tcc.oasis.dao.ItemAvaliacaoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

/**
 * Created by DemonHide-RB on 10/21/2016.
 */
public class ItemAvaliacaoController {

    public static ItemAvaliacao criaItemAvaliacao(int codigoPlanoAcao, ItemAvaliacao itemAvaliacao, String areaAvaliada, Context context) {
        //Cria plano de Acao para busca
        PlanoAcao planoAcao = new PlanoAcao();
        PlanoAcaoDAO planoAcaoDAO = new PlanoAcaoDAO(context);

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
        ItemAvaliacaoDAO itemAvaliacaoDAO = new ItemAvaliacaoDAO(context);
        itemAvaliacaoDAO.inserir(itemAvaliacao);
    }
}
