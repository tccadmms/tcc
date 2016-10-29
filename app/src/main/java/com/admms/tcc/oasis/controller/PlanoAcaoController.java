package com.admms.tcc.oasis.controller;

import android.content.Context;

import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.util.Date;

/**
 * Created by DemonHide-RB on 10/24/2016.
 */
public class PlanoAcaoController {

    private static PlanoAcaoDAO planoAcaoDAO;

    public static int criarPlanoAcao(Legislacao legislacao, Estabelecimento estabelecimento, Context context) {
        planoAcaoDAO = new PlanoAcaoDAO(context);
        PlanoAcao planoAcao = new PlanoAcao();

        planoAcao.setLegislacao(legislacao);
        planoAcao.setData(new Date());
        planoAcao.setEstabelecimento(estabelecimento);
        planoAcaoDAO.inserir(planoAcao);

        return planoAcao.getCodigo();
    }

}
