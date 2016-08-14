package com.admms.tcc.oasis.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by DemonHide-RB on 8/7/2016.
 */

@DatabaseTable(tableName = "tb_ItemAvaliacao")
public class ItemAvaliacao {

    @DatabaseField(generatedId = true)
    private int codigo;

    @DatabaseField(canBeNull = false)
    private int codPlanoAcao;

    @DatabaseField
    private String areaAvaliada;

    @DatabaseField
    private String pergunta;

    @DatabaseField
    private String conformidade;

    @DatabaseField
    private String foto;

    @DatabaseField
    private String descricao;

    @DatabaseField
    private PlanoAcao planoAcao;

    public ItemAvaliacao(int codPlanoAcao, String areaAvaliada, String pergunta, String conformidade, String foto, String descricao, PlanoAcao planoAcao) {
        this.codPlanoAcao = codPlanoAcao;
        this.areaAvaliada = areaAvaliada;
        this.pergunta = pergunta;
        this.conformidade = conformidade;
        this.foto = foto;
        this.descricao = descricao;
        this.planoAcao = planoAcao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public int getCodPlanoAcao() {
        return codPlanoAcao;
    }

    public void setCodPlanoAcao(int codPlanoAcao) {
        this.codPlanoAcao = codPlanoAcao;
    }

    public String getAreaAvaliada() {

        return areaAvaliada;
    }

    public void setAreaAvaliada(String areaAvaliada) {

        this.areaAvaliada = areaAvaliada;
    }

    public String getPergunta() {

        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getConformidade() {

        return conformidade;
    }

    public void setConformidade(String conformidade) {

        this.conformidade = conformidade;
    }

    public String getFoto() {

        return foto;
    }

    public void setFoto(String foto) {

        this.foto = foto;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public PlanoAcao getPlanoAcao() {
        return planoAcao;
    }

    public void setPlanoAcao(PlanoAcao planoAcao) {
        this.planoAcao = planoAcao;
    }
}
