package com.admms.tcc.oasis.controller.prt78_325;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.rdc216.Rdc216DocumentacaoActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216EdificacaoActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216IngredientesActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216ManipuladorActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216PreparoActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216ArmazenamentoActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216HigieneActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216ResiduosActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216ResponsavelActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216SaneamentoActivity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216VetoresActivity;

public class Prt78_325Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt78_325);

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
                Intent intentVaiProArmazenamento = new Intent(Prt78_325Activity.this, Rdc216ArmazenamentoActivity.class);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Prt78_325Activity.this, Rdc216DocumentacaoActivity.class);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Prt78_325Activity.this, Rdc216EdificacaoActivity.class);
                startActivity(intentVaiPraEdificacao);
            }
        });
        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Prt78_325Activity.this, Rdc216HigieneActivity.class);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Prt78_325Activity.this, Rdc216IngredientesActivity.class);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Prt78_325Activity.this, Rdc216ManipuladorActivity.class);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Prt78_325Activity.this, Rdc216VetoresActivity.class);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Prt78_325Activity.this, Rdc216PreparoActivity.class);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Prt78_325Activity.this, Rdc216ResiduosActivity.class);
                startActivity(intentVaiPraResiduos);
            }
        });
        responsavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResponsavel = new Intent(Prt78_325Activity.this, Rdc216ResponsavelActivity.class);
                startActivity(intentVaiPraResponsavel);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Prt78_325Activity.this, Rdc216SaneamentoActivity.class);
                startActivity(intentVaiPraSaneamento);
            }
        });


    }
}

