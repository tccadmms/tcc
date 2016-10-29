package com.admms.tcc.oasis.controller;

import android.content.Context;

import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.entity.Estabelecimento;

import java.util.List;

/**
 * Created by DemonHide-RB on 10/28/2016.
 */
public class EstabelecimentoController implements Controller<Estabelecimento> {

    private static EstabelecimentoDAO estabelecimentoDAO;

    @Override
    public EstabelecimentoDAO inicializarDB(Context context) {
        estabelecimentoDAO = new EstabelecimentoDAO(context);

        return estabelecimentoDAO;
    }

    @Override
    public Estabelecimento criar() {
        Estabelecimento estabelecimento = new Estabelecimento();

        return estabelecimento;
    }

    @Override
    public void salvar(Estabelecimento estabelecimento, Context context) {
        if (estabelecimentoDAO == null) {
            inicializarDB(context);
        }

        estabelecimentoDAO.inserir(estabelecimento);
    }

    @Override
    public List<Estabelecimento> lista(Context context) {
        if (estabelecimentoDAO == null) {
            inicializarDB(context);
        }

        return estabelecimentoDAO.listar();
    }
}
