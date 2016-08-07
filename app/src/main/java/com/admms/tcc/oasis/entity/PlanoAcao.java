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
    private int codlegislacao;

    @DatabaseField(canBeNull = false)
    private Date data;

    public PlanoAcao() {
    }

    public PlanoAcao(int codlegislacao, Date data) {
        this.codlegislacao = codlegislacao;
        this.data = new Date(System.currentTimeMillis());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodlegislacao() {
        return codlegislacao;
    }

    public void setCodlegislacao(int codlegislacao) {
        this.codlegislacao = codlegislacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
