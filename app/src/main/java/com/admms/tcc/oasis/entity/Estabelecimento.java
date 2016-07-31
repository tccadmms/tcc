package com.admms.tcc.oasis.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by DemonHide-RB on 7/31/2016.
 */

@DatabaseTable(tableName = "tb_Estabelecimento")
public class Estabelecimento {

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
    private String estado;

    @DatabaseField
    private String ramo;

    @DatabaseField
    private String responsavelLegal;

    @DatabaseField
    private String legislacao;

    public Estabelecimento() {
    }

    public Estabelecimento(String razaoSocial, String email, String numCNPJ, String numCEP, String cidade, String estado, String ramo, String responsavelLegal, String legislacao) {
        this.razaoSocial = razaoSocial;
        this.email = email;
        this.numCNPJ = numCNPJ;
        this.numCEP = numCEP;
        this.cidade = cidade;
        this.estado = estado;
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

    public String getLegislacao() {
        return legislacao;
    }

    public void setLegislacao(String legislacao) {
        this.legislacao = legislacao;
    }
}
