package com.admms.tcc.oasis.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by DemonHide-RB on 8/14/2016.
 */

@DatabaseTable(tableName = "tb_Pergunta")
public class Pergunta {

    @DatabaseField(generatedId = true)
    private int codigo;

    @DatabaseField(foreign = true)
    private Legislacao legislacao;

    @DatabaseField
    private String pergunta;

    public Pergunta() {
    }

    public Pergunta(Legislacao legislacao, String pergunta) {
        this.legislacao = legislacao;
        this.pergunta = pergunta;
    }

    public int getCodigo() {
        return codigo;
    }

    public Legislacao getLegislacao() {
        return legislacao;
    }

    public void setLegislacao(Legislacao legislacao) {
        this.legislacao = legislacao;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
}
