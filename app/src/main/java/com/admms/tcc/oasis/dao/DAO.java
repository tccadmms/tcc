package com.admms.tcc.oasis.dao;

import java.util.List;

/**
 * Created by DemonHide-RB on 10/6/2016.
 */
public interface DAO<T> {

    public T inserir(T t);
    public void alterar(T t);
    public T buscarPorID(T t);
    public List<T> listar();

}
