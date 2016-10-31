package com.admms.tcc.oasis.dao;

import android.content.Context;
import android.util.Log;

import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.PlanoAcao;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DemonHide-RB on 10/6/2016.
 */
public class PlanoAcaoDAO implements DAO<PlanoAcao> {

    private DatabaseHelper databaseHelper;
    private static RuntimeExceptionDao<PlanoAcao, Integer> planoAcaoReDAO;

    private PlanoAcaoDAO() {
    }

    public PlanoAcaoDAO(Context context ) {
        databaseHelper = OpenHelperManager.getHelper(context, DatabaseHelper.class);
        planoAcaoReDAO = databaseHelper.getPlanoAcaoRuntimeExceptionDao();
    }

    @Override
    public PlanoAcao inserir(PlanoAcao planoAcao) {
        planoAcaoReDAO.create(planoAcao);

        return planoAcaoReDAO.queryForId(planoAcao.getCodigo());
    }

    @Override
    public void alterar(PlanoAcao planoAcao) {

        planoAcaoReDAO.update(planoAcao);
    }

    @Override
    public PlanoAcao buscarPorID(PlanoAcao planoAcao) {
        return planoAcaoReDAO.queryForId(planoAcao.getCodigo());
    }

    @Override
    public List<PlanoAcao> listar() {
        return null;
    }

    public List<PlanoAcao> buscarPlanoAcaoEstabelecimento (Estabelecimento estabelecimento) {
        QueryBuilder<PlanoAcao, Integer> qb = planoAcaoReDAO.queryBuilder();

        List<PlanoAcao> listPlanoAcaoEstabelecimento = new ArrayList<PlanoAcao>();

        try {
            listPlanoAcaoEstabelecimento = qb.where().eq(PlanoAcao.ESTABELECIMENTO_FIELD_NAME,estabelecimento.getCodigo()).query();
        } catch (Exception e) {
            Log.i("fail","fetching planoAcao:" + estabelecimento.getRazaoSocial() +"(" + estabelecimento.getCodigo() + ") não tem planos de ação no banco de dados.");
            return null;
        }

        return listPlanoAcaoEstabelecimento;
    }
}
