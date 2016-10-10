package com.admms.tcc.oasis.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by DemonHide-RB on 8/7/2016.
 */

@DatabaseTable(tableName = "tb_ItemAvaliacao")
public class ItemAvaliacao {

    public static final String AREA_AVALIADA_FIELD_NAME = "areaAvaliada";
    public static final String PERGUNTA_FIELD_NAME = "pergunta";
    public static final String CONFORMIDADE_FIELD_NAME = "conformidade";
    public static final String PLANO_ACAO_FIELD_NAME = "planoAcao_id";

    @DatabaseField(generatedId = true)
    private int codigo;

    @DatabaseField(foreign = true, canBeNull = false)
    private PlanoAcao planoAcao;

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

    public ItemAvaliacao() {
    }

    public ItemAvaliacao(int codPlanoAcao, String areaAvaliada, String pergunta, String conformidade, String foto, String descricao, PlanoAcao planoAcao) {
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
