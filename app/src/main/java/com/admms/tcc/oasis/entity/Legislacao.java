package com.admms.tcc.oasis.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by DemonHide-RB on 8/7/2016.
 */

@DatabaseTable(tableName = "tb_Legislacao")
public class Legislacao {

    @DatabaseField(generatedId = true)
    private int codigo;

    @DatabaseField(canBeNull = false)
    private String nome;

    public Legislacao() {
    }

    public Legislacao(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
