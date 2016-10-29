package com.admms.tcc.oasis.controller;

import android.content.Context;

import com.admms.tcc.oasis.dao.DAO;
import com.admms.tcc.oasis.dao.EstabelecimentoDAO;

import java.util.List;

/**
 * Created by DemonHide-RB on 10/28/2016.
 */
public interface Controller<T> {

    public DAO<T> inicializarDB(Context context);
    public T criar();
    public void salvar(T t, Context context);
    public List<T> lista(Context context);
}
