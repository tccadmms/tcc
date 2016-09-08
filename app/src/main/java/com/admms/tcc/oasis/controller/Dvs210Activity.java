package com.admms.tcc.oasis.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.admms.tcc.oasis.R;

public class Dvs210Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dvs210);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.iten_armazenamento);
        ImageButton documentacao = (ImageButton) findViewById(R.id.iten_documentacao);
        ImageButton edificacao = (ImageButton) findViewById(R.id.iten_edificacao);
        ImageButton higiene = (ImageButton) findViewById(R.id.iten_higiene);
        ImageButton ingredientes = (ImageButton) findViewById(R.id.iten_ingredientes);
        ImageButton manipulador = (ImageButton) findViewById(R.id.iten_manipulador);
        ImageButton vetores = (ImageButton) findViewById(R.id.iten_vetores);
        ImageButton preparo = (ImageButton) findViewById(R.id.iten_preparo);
        ImageButton residuos = (ImageButton) findViewById(R.id.iten_residuos);
        ImageButton responsavel = (ImageButton) findViewById(R.id.iten_responsavel);
        ImageButton saneamento = (ImageButton) findViewById(R.id.iten_saneamento);


        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Dvs210Activity.this, ArmazenamentoActivity.class);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Dvs210Activity.this, DocumentacaoActivity.class);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Dvs210Activity.this, EdificacaoActivity.class);
                startActivity(intentVaiPraEdificacao);
            }
        });
        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Dvs210Activity.this, HigieneActivity.class);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Dvs210Activity.this, IngredientesActivity.class);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Dvs210Activity.this, ManipuladorActivity.class);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Dvs210Activity.this, VetoresActivity.class);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Dvs210Activity.this, PreparoActivity.class);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Dvs210Activity.this, ResiduosActivity.class);
                startActivity(intentVaiPraResiduos);
            }
        });
        responsavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResponsavel = new Intent(Dvs210Activity.this, ResponsavelActivity.class);
                startActivity(intentVaiPraResponsavel);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Dvs210Activity.this, SaneamentoActivity.class);
                startActivity(intentVaiPraSaneamento);
            }
        });
    }
}
