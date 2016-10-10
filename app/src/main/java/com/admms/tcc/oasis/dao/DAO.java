package com.admms.tcc.oasis.dao;

/**
 * Created by DemonHide-RB on 10/6/2016.
 */
public interface DAO<T> {

    public T inserir(T t);
    public void alterar(T t);
    public T buscar(T t);

}
