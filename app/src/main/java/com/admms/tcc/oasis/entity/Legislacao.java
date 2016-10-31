package com.admms.tcc.oasis.entity;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by DemonHide-RB on 8/7/2016.
 */

@DatabaseTable(tableName = "tb_Legislacao")
public class Legislacao {

    public static final String ID_FIELD_NAME = "codigo";
    public static final String NOME_FIELD_NAME = "nome";

    @DatabaseField(generatedId = true)
    private int codigo;

    @DatabaseField(canBeNull = false)
    private String nome;

    @DatabaseField
    private int numeroPerguntasArmazenamento;

    @DatabaseField
    private int numeroPerguntasDocumentacao;

    @DatabaseField
    private int numeroPerguntasEdificacao;

    @DatabaseField
    private int numeroPerguntasExposicao;

    @DatabaseField
    private int numeroPerguntasHigiene;

    @DatabaseField
    private int numeroPerguntasIngredientes;

    @DatabaseField
    private int numeroPerguntasManipuladores;

    @DatabaseField
    private int numeroPerguntasPreparo;

    @DatabaseField
    private int numeroPerguntasQualidade;

    @DatabaseField
    private int numeroPerguntasResiduos;

    @DatabaseField
    private int numeroPerguntasResponsavel;

    @DatabaseField
    private int numeroPerguntasSaneamento;

    @DatabaseField
    private int numeroPerguntasVetores;

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

    public int getNumeroPerguntasArmazenamento() {
        return numeroPerguntasArmazenamento;
    }

    public void setNumeroPerguntasArmazenamento(int numeroPerguntasArmazenamento) {
        this.numeroPerguntasArmazenamento = numeroPerguntasArmazenamento;
    }

    public int getNumeroPerguntasDocumentacao() {
        return numeroPerguntasDocumentacao;
    }

    public void setNumeroPerguntasDocumentacao(int numeroPerguntasDocumentacao) {
        this.numeroPerguntasDocumentacao = numeroPerguntasDocumentacao;
    }

    public int getNumeroPerguntasEdificacao() {
        return numeroPerguntasEdificacao;
    }

    public void setNumeroPerguntasEdificacao(int numeroPerguntasEdificacao) {
        this.numeroPerguntasEdificacao = numeroPerguntasEdificacao;
    }

    public int getNumeroPerguntasExposicao() {
        return numeroPerguntasExposicao;
    }

    public void setNumeroPerguntasExposicao(int numeroPerguntasExposicao) {
        this.numeroPerguntasExposicao = numeroPerguntasExposicao;
    }

    public int getNumeroPerguntasHigiene() {
        return numeroPerguntasHigiene;
    }

    public void setNumeroPerguntasHigiene(int numeroPerguntasHigiene) {
        this.numeroPerguntasHigiene = numeroPerguntasHigiene;
    }

    public int getNumeroPerguntasIngredientes() {
        return numeroPerguntasIngredientes;
    }

    public void setNumeroPerguntasIngredientes(int numeroPerguntasIngredientes) {
        this.numeroPerguntasIngredientes = numeroPerguntasIngredientes;
    }

    public int getNumeroPerguntasManipuladores() {
        return numeroPerguntasManipuladores;
    }

    public void setNumeroPerguntasManipuladores(int numeroPerguntasManipuladores) {
        this.numeroPerguntasManipuladores = numeroPerguntasManipuladores;
    }

    public int getNumeroPerguntasPreparo() {
        return numeroPerguntasPreparo;
    }

    public void setNumeroPerguntasPreparo(int numeroPerguntasPreparo) {
        this.numeroPerguntasPreparo = numeroPerguntasPreparo;
    }

    public int getNumeroPerguntasQualidade() {
        return numeroPerguntasQualidade;
    }

    public void setNumeroPerguntasQualidade(int numeroPerguntasQualidade) {
        this.numeroPerguntasQualidade = numeroPerguntasQualidade;
    }

    public int getNumeroPerguntasResiduos() {
        return numeroPerguntasResiduos;
    }

    public void setNumeroPerguntasResiduos(int numeroPerguntasResiduos) {
        this.numeroPerguntasResiduos = numeroPerguntasResiduos;
    }

    public int getNumeroPerguntasResponsavel() {
        return numeroPerguntasResponsavel;
    }

    public void setNumeroPerguntasResponsavel(int numeroPerguntasResponsavel) {
        this.numeroPerguntasResponsavel = numeroPerguntasResponsavel;
    }

    public int getNumeroPerguntasSaneamento() {
        return numeroPerguntasSaneamento;
    }

    public void setNumeroPerguntasSaneamento(int numeroPerguntasSaneamento) {
        this.numeroPerguntasSaneamento = numeroPerguntasSaneamento;
    }

    public int getNumeroPerguntasVetores() {
        return numeroPerguntasVetores;
    }

    public void setNumeroPerguntasVetores(int numeroPerguntasVetores) {
        this.numeroPerguntasVetores = numeroPerguntasVetores;
    }
}
