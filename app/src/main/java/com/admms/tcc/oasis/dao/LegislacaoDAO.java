package com.admms.tcc.oasis.dao;

import android.content.Context;
import android.util.Log;

import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.Legislacao;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;

/**
 * Created by DemonHide-RB on 10/6/2016.
 */
public class LegislacaoDAO implements DAO<Legislacao> {

    private DatabaseHelper databaseHelper;
    private static RuntimeExceptionDao<Legislacao, Integer> legislacaoReDAO;

    private LegislacaoDAO() {
    }

    public LegislacaoDAO(Context context) {
        databaseHelper = OpenHelperManager.getHelper(context, DatabaseHelper.class);
        legislacaoReDAO = databaseHelper.getLegislacaoRuntimeExceptionDao();
    }

    public Legislacao inserir(Legislacao legislacao) {
        legislacaoReDAO.create(legislacao);

        return legislacaoReDAO.queryForId(legislacao.getCodigo());
    }

    public void alterar(Legislacao legislacao) {
        legislacaoReDAO.update(legislacao);
    }

    public Legislacao buscar(Legislacao legislacao) {
        QueryBuilder<Legislacao, Integer> qb = legislacaoReDAO.queryBuilder();

        try {
            legislacao = qb.where().eq(Legislacao.NOME_FIELD_NAME, legislacao.getNome()).query().get(0);
        } catch (Exception e) {
            Log.i("fail","fetching legislacao:" + legislacao.getNome() +"(" + legislacao.getCodigo() + ")");
            return null;
        }

        return legislacao;
    }
}
