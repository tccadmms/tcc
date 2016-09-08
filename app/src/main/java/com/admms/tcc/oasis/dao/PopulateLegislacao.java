package com.admms.tcc.oasis.dao;

import android.content.Context;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.SQLUtil;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.List;

/**
 * Created by DemonHide-RB on 9/7/2016.
 */
public class PopulateLegislacao {

    static public void populate(DatabaseHelper dbHelper, Context context) {
        List<String> listaLegislacao;
        String str = null;

        try {
            str = IOUtils.toString(context.getResources().openRawResource(R.raw.sql_legislacao));
        } catch (IOException e) {
            e.printStackTrace();
        }
        IOUtils.closeQuietly(context.getResources().openRawResource(R.raw.sql_legislacao));

        RuntimeExceptionDao<Legislacao, Integer> legislacaoREDao = dbHelper.getLegislacaoRuntimeExceptionDao();

        listaLegislacao = new SQLUtil(str).parseSQL();

        for (String legislacao: listaLegislacao) {
            legislacaoREDao.executeRawNoArgs(legislacao);
        }
    }
}
