package com.admms.tcc.oasis.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

/**
 * Created by DemonHide-RB on 7/31/2016.
 */

@DatabaseTable(tableName = "tb_Plano_Acao")
public class PlanoAcao {

    @DatabaseField(generatedId = true)
    private int codigo;

    @DatabaseField(canBeNull = false)
    private Date data;

    @DatabaseField(canBeNull = false)
    private int numRequisito;

    @DatabaseField(canBeNull = false)
    private String resultado;

    @DatabaseField
    private String descricao;

    @DatabaseField
    private String foto;

    public PlanoAcao() {
    }

    public PlanoAcao(Date data, int numRequisito, String resultado, String descricao, String foto) {
        this.data = new Date(System.currentTimeMillis());
        this.numRequisito = numRequisito;
        this.resultado = resultado;
        this.descricao = descricao;
        this.foto = foto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNumRequisito() {
        return numRequisito;
    }

    public void setNumRequisito(int numRequisito) {
        this.numRequisito = numRequisito;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
