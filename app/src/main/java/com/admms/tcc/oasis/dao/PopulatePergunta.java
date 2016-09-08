package com.admms.tcc.oasis.dao;

import android.content.Context;
import android.util.Log;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.Pergunta;
import com.admms.tcc.oasis.entity.SQLUtil;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DemonHide-RB on 9/7/2016.
 */
public class PopulatePergunta {

    static public void populate(DatabaseHelper dbHelper, Context context, int recursoRaw, Legislacao legislacao) {

        String str = null;
        Boolean processStatement = true;
        int posInsert;
        String newStatement;
        List<String> listaPergunta = new ArrayList<String>();
        Pergunta pergunta = new Pergunta();

        try {
            str = IOUtils.toString(context.getResources().openRawResource(recursoRaw));
        } catch (IOException e) {
            e.printStackTrace();
        }

        IOUtils.closeQuietly(context.getResources().openRawResource(recursoRaw));
        RuntimeExceptionDao<Legislacao, Integer> legislacaoREDao = dbHelper.getLegislacaoRuntimeExceptionDao();
        RuntimeExceptionDao<Pergunta, Integer> perguntaREDao = dbHelper.getPerguntaRuntimeExceptionDao();

        listaPergunta = new SQLUtil(str).parseLine();

        for (String perguntaStr : listaPergunta) {
            pergunta.setPergunta(perguntaStr);
            pergunta.setLegislacao(legislacao);

            perguntaREDao.create(pergunta);
            Log.i("success","creating pergunta:" + pergunta.getPergunta() +"(" + pergunta.getCodigo() + ")");
        }
    }
}
