package com.admms.tcc.oasis.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.util.Date;

/**
 * Created by DemonHide-RB on 7/31/2016.
 */

@DatabaseTable(tableName = "tb_Plano_Acao")
public class PlanoAcao {

    public static final String ESTABELECIMENTO_FIELD_NAME = "estabelecimento_id";

    @DatabaseField(generatedId = true)
    private int codigo;

    @DatabaseField(canBeNull = false)
    private Date data;

    @DatabaseField(foreign = true)
    private Legislacao legislacao;

    @DatabaseField(foreign = true)
    private Estabelecimento estabelecimento;

    public PlanoAcao() {
    }

    public PlanoAcao(Date data, Legislacao legislacao) {
        this.data = new Date(System.currentTimeMillis());
        this.legislacao = legislacao;
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

    public Legislacao getLegislacao() {
        return legislacao;
    }

    public void setLegislacao(Legislacao legislacao) {
        this.legislacao = legislacao;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
}
