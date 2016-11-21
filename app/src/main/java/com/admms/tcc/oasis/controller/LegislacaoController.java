package com.admms.tcc.oasis.controller;

import android.content.Context;

import com.admms.tcc.oasis.dao.DAO;
import com.admms.tcc.oasis.dao.LegislacaoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Legislacao;

import java.util.List;

/**
 * Created by DemonHide-RB on 11/21/2016.
 */
public class LegislacaoController {

    private static LegislacaoDAO legislacaoDAO;

    private static LegislacaoDAO inicializarDB(Context context) {
        if (legislacaoDAO == null) {
            legislacaoDAO = new LegislacaoDAO(context);
        }

        return legislacaoDAO;
    }

    public static Legislacao buscarLegislacaoPorID(Legislacao legislacao, Context context) {
        inicializarDB(context);

        return legislacaoDAO.buscarPorID(legislacao);
    }
}
