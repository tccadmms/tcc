package com.admms.tcc.oasis.dao;

import android.content.Context;
import android.util.Log;

import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.util.List;

/**
 * Created by DemonHide-RB on 10/6/2016.
 */
public class EstabelecimentoDAO implements DAO<Estabelecimento> {

    private DatabaseHelper databaseHelper;
    private static RuntimeExceptionDao<Estabelecimento, Integer> estabelecimentoReDAO;

    private EstabelecimentoDAO() {

    }

    public EstabelecimentoDAO(Context context) {
        databaseHelper = OpenHelperManager.getHelper(context, DatabaseHelper.class);
        estabelecimentoReDAO = databaseHelper.getEstabelecimentoRuntimeExceptionDao();
    }

    @Override
    public Estabelecimento inserir(Estabelecimento estabelecimento) {
        estabelecimentoReDAO.create(estabelecimento);

        return estabelecimentoReDAO.queryForId(estabelecimento.getCodigo());
    }

    @Override
    public void alterar(Estabelecimento estabelecimento) {
        estabelecimentoReDAO.update(estabelecimento);
    }

    @Override
    public Estabelecimento buscar(Estabelecimento estabelecimento) {
        return estabelecimentoReDAO.queryForId(estabelecimento.getCodigo());
    }

    public List<Estabelecimento> listar() {
        return estabelecimentoReDAO.queryForAll();
    }
}
