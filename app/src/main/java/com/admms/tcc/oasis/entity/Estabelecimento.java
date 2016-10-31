package com.admms.tcc.oasis.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by DemonHide-RB on 7/31/2016.
 */

@DatabaseTable(tableName = "tb_Estabelecimento")
public class Estabelecimento {

    public static final String RAZAO_SOCIAL_FIELD_NAME = "razaoSocial";

    @DatabaseField(generatedId = true)
    private int codigo;

    @DatabaseField(canBeNull = false)
    private String razaoSocial;

    @DatabaseField
    private String email;

    @DatabaseField
    private String numCNPJ;

    @DatabaseField
    private String numCEP;

    @DatabaseField
    private String cidade;

    @DatabaseField
    private String telefone;

    @DatabaseField
    private String estado;

    @DatabaseField
    private String ramo;

    @DatabaseField
    private String responsavelLegal;

    @DatabaseField(foreign = true)
    private Legislacao legislacao;

    public Estabelecimento() {
    }

    public Estabelecimento(String razaoSocial, String email, String numCNPJ, String numCEP, String cidade, String estado, String telefone, String ramo, String responsavelLegal, Legislacao legislacao) {
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.numCNPJ = numCNPJ;
        this.numCEP = numCEP;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.ramo = ramo;
        this.responsavelLegal = responsavelLegal;
        this.legislacao = legislacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumCNPJ() {
        return numCNPJ;
    }

    public void setNumCNPJ(String numCNPJ) {
        this.numCNPJ = numCNPJ;
    }

    public String getNumCEP() {
        return numCEP;
    }

    public void setNumCEP(String numCEP) {
        this.numCEP = numCEP;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getResponsavelLegal() {
        return responsavelLegal;
    }

    public void setResponsavelLegal(String responsavelLegal) {
        this.responsavelLegal = responsavelLegal;
    }

    public Legislacao getLegislacao() {
        return legislacao;
    }

    public void setLegislacao(Legislacao legislacao) {
        this.legislacao = legislacao;
    }
}
