package com.admms.tcc.oasis.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.entity.Avaliador;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.PlanoAcao;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by DemonHide-RB on 7/31/2016.
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "oasis.db";
    private static final int DATABASE_VERSION = 1;

    private Dao<Avaliador, Integer> avaliadorDao = null;
    private Dao<Estabelecimento, Integer> estabelecimentoDao= null;
    private Dao<PlanoAcao, Integer> planoAcaoDao = null;

    private RuntimeExceptionDao<Avaliador, Integer> avaliadorRuntimeExceptionDao = null;
    private RuntimeExceptionDao<Estabelecimento, Integer> estabelecimentoRuntimeExceptionDao = null;
    private RuntimeExceptionDao<PlanoAcao, Integer> planoAcaoRuntimeExceptionDao = null;


    public DatabaseHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);

    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            //Criação de tabelas usando o ORMLite

            TableUtils.createTable(connectionSource, Avaliador.class);
            TableUtils.createTable(connectionSource, Estabelecimento.class);
            TableUtils.createTable(connectionSource, PlanoAcao.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            //No update, as tabelas sofrem um drop e são criadas novamente.

            TableUtils.dropTable(connectionSource, Avaliador.class,true);
            TableUtils.dropTable(connectionSource, Estabelecimento.class, true);
            TableUtils.dropTable(connectionSource, PlanoAcao.class, true);

            onCreate(database, connectionSource);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Dao<Avaliador, Integer> getAvaliadorDao() throws SQLException {

        if (avaliadorDao == null) {
            avaliadorDao = getDao(Avaliador.class);
        }

        return avaliadorDao;
    }

    public RuntimeExceptionDao<Avaliador, Integer> getAvaliadorRuntimeExceptionDao() {

        if (avaliadorRuntimeExceptionDao == null) {
            avaliadorRuntimeExceptionDao = getRuntimeExceptionDao(Avaliador.class);
        }

        return avaliadorRuntimeExceptionDao;
    }

    public Dao<Estabelecimento, Integer> getEstabelecimentoDao() throws SQLException {

        if (estabelecimentoDao == null) {
            estabelecimentoDao = getDao(Estabelecimento.class);
        }

        return estabelecimentoDao;
    }

    public RuntimeExceptionDao<Estabelecimento, Integer> getEstabelecimentoRuntimeExceptionDao() {

        if (estabelecimentoRuntimeExceptionDao == null) {
            estabelecimentoRuntimeExceptionDao = getRuntimeExceptionDao(Estabelecimento.class);
        }

        return estabelecimentoRuntimeExceptionDao;
    }

    public Dao<PlanoAcao, Integer> getPlanoAcaoDao() throws SQLException {

        if (planoAcaoDao == null) {
            planoAcaoDao = getDao(PlanoAcao.class);
        }

        return planoAcaoDao;
    }

    public RuntimeExceptionDao<PlanoAcao, Integer> getPlanoAcaoRuntimeExceptionDao() {

        if (planoAcaoRuntimeExceptionDao == null) {
            planoAcaoRuntimeExceptionDao = getRuntimeExceptionDao(PlanoAcao.class);
        }

        return planoAcaoRuntimeExceptionDao ;
    }
}
