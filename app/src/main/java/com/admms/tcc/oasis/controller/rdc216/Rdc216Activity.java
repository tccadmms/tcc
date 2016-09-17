package com.admms.tcc.oasis.controller.rdc216;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.admms.tcc.oasis.R;

public class Rdc216Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdc216);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.iten_armazenamento_rdc216);
        ImageButton documentacao = (ImageButton) findViewById(R.id.iten_documentacao_rdc216);
        ImageButton edificacao = (ImageButton) findViewById(R.id.iten_edificacao_rdc216);
        ImageButton higiene = (ImageButton) findViewById(R.id.iten_higiene_rdc216);
        ImageButton ingredientes = (ImageButton) findViewById(R.id.iten_ingredientes_rdc216);
        ImageButton manipulador = (ImageButton) findViewById(R.id.iten_manipulador_rdc216);
        ImageButton vetores = (ImageButton) findViewById(R.id.iten_vetores_rdc216);
        ImageButton preparo = (ImageButton) findViewById(R.id.iten_preparo_rdc216);
        ImageButton residuos = (ImageButton) findViewById(R.id.iten_residuos_rdc216);
        ImageButton responsavel = (ImageButton) findViewById(R.id.iten_responsavel_rdc216);
        ImageButton saneamento = (ImageButton) findViewById(R.id.iten_saneamento_rdc216);


        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Rdc216Activity.this, Rdc216ArmazenamentoActivity.class);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Rdc216Activity.this, Rdc216DocumentacaoActivity.class);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Rdc216Activity.this, Rdc216EdificacaoActivity.class);
                startActivity(intentVaiPraEdificacao);
            }
        });
        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Rdc216Activity.this, Rdc216HigieneActivity.class);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Rdc216Activity.this, Rdc216IngredientesActivity.class);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Rdc216Activity.this, Rdc216ManipuladorActivity.class);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Rdc216Activity.this, Rdc216VetoresActivity.class);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Rdc216Activity.this, Rdc216PreparoActivity.class);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Rdc216Activity.this, Rdc216ResiduosActivity.class);
                startActivity(intentVaiPraResiduos);
            }
        });
        responsavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResponsavel = new Intent(Rdc216Activity.this, Rdc216ResponsavelActivity.class);
                startActivity(intentVaiPraResponsavel);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Rdc216Activity.this, Rdc216SaneamentoActivity.class);
                startActivity(intentVaiPraSaneamento);
            }
        });


    }
}

