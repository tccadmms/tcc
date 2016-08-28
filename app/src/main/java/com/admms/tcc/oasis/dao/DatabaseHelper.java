package com.admms.tcc.oasis.dao;

import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.entity.Avaliador;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.Pergunta;
import com.admms.tcc.oasis.entity.PlanoAcao;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
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
    private Dao<ItemAvaliacao, Integer> itemAvaliacaoDao = null;
    private Dao<Legislacao, Integer> legislacaoDao = null;
    private Dao<Pergunta, Integer> perguntaDao = null;


    private RuntimeExceptionDao<Avaliador, Integer> avaliadorRuntimeExceptionDao = null;
    private RuntimeExceptionDao<Estabelecimento, Integer> estabelecimentoRuntimeExceptionDao = null;
    private RuntimeExceptionDao<PlanoAcao, Integer> planoAcaoRuntimeExceptionDao = null;
    private RuntimeExceptionDao<ItemAvaliacao, Integer> itemAvaliacaoIntegerRuntimeExceptionDao = null;
    private RuntimeExceptionDao<Legislacao, Integer> legislacaoRuntimeExceptionDao = null;
    private RuntimeExceptionDao<Pergunta, Integer> perguntaRuntimeExceptionDao = null;

    private static Context context;

    public DatabaseHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION, R.raw.ormlite_config);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {


        try {
            //Criação de tabelas usando o ORMLite

            TableUtils.createTableIfNotExists(connectionSource, Avaliador.class);
            TableUtils.createTableIfNotExists(connectionSource, Estabelecimento.class);
            TableUtils.createTableIfNotExists(connectionSource, Legislacao.class);
            TableUtils.createTableIfNotExists(connectionSource, Pergunta.class);
            TableUtils.createTableIfNotExists(connectionSource, PlanoAcao.class);
            TableUtils.createTableIfNotExists(connectionSource, ItemAvaliacao.class);

            onPopulate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void onPopulate() {

        try {
            String str = IOUtils.toString(context.getResources().openRawResource(R.raw.sql_legislacao));
            IOUtils.closeQuietly(context.getResources().openRawResource(R.raw.sql_legislacao));

            RuntimeExceptionDao<Estabelecimento, Integer> legislacaoREDao = getEstabelecimentoRuntimeExceptionDao();

            legislacaoREDao.executeRaw(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            //No update, as tabelas sofrem um drop e são criadas novamente.

            TableUtils.dropTable(connectionSource, ItemAvaliacao.class, true);
            TableUtils.dropTable(connectionSource, PlanoAcao.class, true);
            TableUtils.dropTable(connectionSource, Pergunta.class, true);
            TableUtils.dropTable(connectionSource, Legislacao.class, true);
            TableUtils.dropTable(connectionSource, Estabelecimento.class, true);
            TableUtils.dropTable(connectionSource, Avaliador.class, true);

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

    public Dao<ItemAvaliacao, Integer> getItemAvaliacaoDao() throws SQLException {

        if (itemAvaliacaoDao== null) {
            itemAvaliacaoDao = getDao(ItemAvaliacao.class);
        }

        return itemAvaliacaoDao;
    }

    public RuntimeExceptionDao<ItemAvaliacao, Integer> getItemAvaliacaoRuntimeExceptionDao() {

        if (itemAvaliacaoIntegerRuntimeExceptionDao == null) {
            itemAvaliacaoIntegerRuntimeExceptionDao = getRuntimeExceptionDao(ItemAvaliacao.class);
        }

        return itemAvaliacaoIntegerRuntimeExceptionDao ;
    }

    public Dao<Legislacao, Integer> getLegislacaoDao() throws SQLException {

        if (legislacaoDao == null) {
            legislacaoDao = getDao(Legislacao.class);
        }

        return legislacaoDao;
    }

    public RuntimeExceptionDao<Legislacao, Integer> getLegislacaoRuntimeExceptionDao() {

        if (legislacaoRuntimeExceptionDao == null) {
            legislacaoRuntimeExceptionDao = getRuntimeExceptionDao(Legislacao.class);
        }

        return legislacaoRuntimeExceptionDao;
    }

    public Dao<Pergunta, Integer> getPerguntaDao() throws SQLException {

        if (perguntaDao == null) {
            perguntaDao = getDao(Pergunta.class);
        }

        return perguntaDao;
    }

    public RuntimeExceptionDao<Pergunta, Integer> getPerguntaRuntimeExceptionDao() {

        if (perguntaRuntimeExceptionDao == null) {
            perguntaRuntimeExceptionDao = getRuntimeExceptionDao(Pergunta.class);
        }

        return perguntaRuntimeExceptionDao;
    }
}
