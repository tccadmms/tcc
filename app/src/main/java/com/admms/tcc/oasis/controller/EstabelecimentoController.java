package com.admms.tcc.oasis.controller;

import android.content.Context;

import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.entity.Estabelecimento;

import java.util.List;

/**
 * Created by DemonHide-RB on 10/28/2016.
 */
public class EstabelecimentoController {

    private static EstabelecimentoDAO estabelecimentoDAO;

    public static EstabelecimentoDAO inicializarDB(Context context) {
        estabelecimentoDAO = new EstabelecimentoDAO(context);

        return estabelecimentoDAO;
    }

    public static Estabelecimento criar() {
        Estabelecimento estabelecimento = new Estabelecimento();

        return estabelecimento;
    }

    public static Estabelecimento salvar(Estabelecimento estabelecimento, Context context) {
        if (estabelecimentoDAO == null) {
            inicializarDB(context);
        }

        return estabelecimentoDAO.inserir(estabelecimento);
    }

    public static void alterar(Estabelecimento estabelecimento, Context context) {
        if (estabelecimentoDAO == null) {
            inicializarDB(context);
        }

        estabelecimentoDAO.alterar(estabelecimento);
    }

    public static Estabelecimento buscarPorID(Estabelecimento estabelecimento, Context context) {
        if (estabelecimentoDAO == null) {
            inicializarDB(context);
        }

        return estabelecimentoDAO.buscarPorID(estabelecimento);
    }

    public static List<Estabelecimento> lista(Context context) {
        if (estabelecimentoDAO == null) {
            inicializarDB(context);
        }

        return estabelecimentoDAO.listar();
    }
}
