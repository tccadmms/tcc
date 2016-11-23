package com.admms.tcc.oasis.controller;

import android.content.Context;

import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by DemonHide-RB on 10/24/2016.
 */
public class PlanoAcaoController {

    private static PlanoAcaoDAO planoAcaoDAO;

    public static PlanoAcao criarPlanoAcao(Legislacao legislacao, Estabelecimento estabelecimento, Context context) {

        if(planoAcaoDAO == null) {
            planoAcaoDAO = new PlanoAcaoDAO(context);
        }

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String nomeArquivo = "DBP-Relatorio_" + timeStamp + ".pdf";

        PlanoAcao planoAcao = new PlanoAcao();
        planoAcao.setLegislacao(legislacao);
        planoAcao.setData(new Date());
        planoAcao.setEstabelecimento(estabelecimento);
        planoAcao.setNomeArquivo(nomeArquivo);
        planoAcaoDAO.inserir(planoAcao);

        return planoAcao;
    }

    public static List<PlanoAcao> listarPlanoAcaoEstabelecimento(Estabelecimento estabelecimento, Context context) {
        if(planoAcaoDAO == null) {
            planoAcaoDAO = new PlanoAcaoDAO(context);
        }

        return planoAcaoDAO.buscarPlanoAcaoEstabelecimento(estabelecimento);
    }

    public static PlanoAcao buscarPlanoAcaoPorID(PlanoAcao planoAcao, Context context) {
        if(planoAcaoDAO == null) {
            planoAcaoDAO = new PlanoAcaoDAO(context);
        }

        return planoAcaoDAO.buscarPorID(planoAcao);
    }

}
