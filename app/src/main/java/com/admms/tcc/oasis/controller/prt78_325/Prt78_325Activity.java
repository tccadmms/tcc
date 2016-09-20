package com.admms.tcc.oasis.controller.prt78_325;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.admms.tcc.oasis.R;

public class Prt78_325Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt78_325);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.prt78_325_armazenamento_prt78_325);
        ImageButton documentacao = (ImageButton) findViewById(R.id.prt78_325_documentacao_prt78_325);
        ImageButton edificacao = (ImageButton) findViewById(R.id.prt78_325_edificacao_prt78_325);
        ImageButton exposicao = (ImageButton) findViewById(R.id.prt78_325_exposicao_prt78_325);
        ImageButton higiene = (ImageButton) findViewById(R.id.prt78_325_higiene_prt78_325);
        ImageButton ingredientes = (ImageButton) findViewById(R.id.prt78_325_ingredientes_prt78_325);
        ImageButton manipulador = (ImageButton) findViewById(R.id.prt78_325_manipulador_prt78_325);
        ImageButton vetores = (ImageButton) findViewById(R.id.prt78_325_vetores_prt78_325);
        ImageButton preparo = (ImageButton) findViewById(R.id.prt78_325_preparo_prt78_325);
        ImageButton residuos = (ImageButton) findViewById(R.id.prt78_325_residuos_prt78_325);
        ImageButton responsavel = (ImageButton) findViewById(R.id.prt78_325_responsavel_prt78_325);
        ImageButton saneamento = (ImageButton) findViewById(R.id.prt78_325_saneamento_prt78_325);


        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Prt78_325Activity.this, Prt78_325_ArmazenamentoActivity.class);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Prt78_325Activity.this, Prt78_325_DocumentacaoActivity.class);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Prt78_325Activity.this, Prt78_325_EdificacaoActivity.class);
                startActivity(intentVaiPraEdificacao);
            }
        });

        exposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraExposicao = new Intent(Prt78_325Activity.this, Prt78_325_ExposicaoActivity.class);
                startActivity(intentVaiPraExposicao);
            }
        });

        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Prt78_325Activity.this, Prt78_325_HigieneActivity.class);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Prt78_325Activity.this, Prt78_325_IngredientesActivity.class);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Prt78_325Activity.this, Prt78_325_ManipuladoresActivity.class);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Prt78_325Activity.this, Prt78_325_VetoresActivity.class);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Prt78_325Activity.this, Prt78_325_PreparoActivity.class);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Prt78_325Activity.this, Prt78_325_ResiduosActivity.class);
                startActivity(intentVaiPraResiduos);
            }
        });
        responsavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResponsavel = new Intent(Prt78_325Activity.this, Prt78_325_ResponsavelActivity.class);
                startActivity(intentVaiPraResponsavel);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Prt78_325Activity.this, Prt78_325_SaneamentoActivity.class);
                startActivity(intentVaiPraSaneamento);
            }
        });


    }
}

