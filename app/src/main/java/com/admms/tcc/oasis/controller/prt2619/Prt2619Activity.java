package com.admms.tcc.oasis.controller.prt2619;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.in04.In04_ArmazenamentoActivity;
import com.admms.tcc.oasis.controller.in04.In04_DocumentacaoActivity;
import com.admms.tcc.oasis.controller.in04.In04_EdificacaoActivity;
import com.admms.tcc.oasis.controller.in04.In04_ExposicaoActivity;
import com.admms.tcc.oasis.controller.in04.In04_HigieneActivity;
import com.admms.tcc.oasis.controller.in04.In04_IngredientesActivity;
import com.admms.tcc.oasis.controller.in04.In04_ManipuladoresActivity;
import com.admms.tcc.oasis.controller.in04.In04_PreparoActivity;
import com.admms.tcc.oasis.controller.in04.In04_ResiduosActivity;
import com.admms.tcc.oasis.controller.in04.In04_SaneamentoActivity;
import com.admms.tcc.oasis.controller.in04.In04_VetoresActivity;


public class Prt2619Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt2619);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.prt2619_armazenamento_prt2619);
        ImageButton documentacao = (ImageButton) findViewById(R.id.prt2619_documentacao_prt2619);
        ImageButton edificacao = (ImageButton) findViewById(R.id.prt2619_edificacao_prt2619);
        ImageButton exposicao = (ImageButton) findViewById(R.id.prt2619_exposicao_prt2619);
        ImageButton higiene = (ImageButton) findViewById(R.id.prt2619_higiene_prt2619);
        ImageButton ingredientes = (ImageButton) findViewById(R.id.prt2619_ingredientes_prt2619);
        ImageButton manipulador = (ImageButton) findViewById(R.id.prt2619_manipulador_prt2619);
        ImageButton vetores = (ImageButton) findViewById(R.id.prt2619_vetores_prt2619);
        ImageButton preparo = (ImageButton) findViewById(R.id.prt2619_preparo_prt2619);
        ImageButton residuos = (ImageButton) findViewById(R.id.prt2619_residuos_prt2619);
        ImageButton saneamento = (ImageButton) findViewById(R.id.prt2619_saneamento_prt2619);


        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Prt2619Activity.this, In04_ArmazenamentoActivity.class);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Prt2619Activity.this, In04_DocumentacaoActivity.class);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Prt2619Activity.this, In04_EdificacaoActivity.class);
                startActivity(intentVaiPraEdificacao);
            }
        });

        exposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraExposicao = new Intent(Prt2619Activity.this, In04_ExposicaoActivity.class);
                startActivity(intentVaiPraExposicao);
            }
        });

        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Prt2619Activity.this, In04_HigieneActivity.class);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Prt2619Activity.this, In04_IngredientesActivity.class);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Prt2619Activity.this, In04_ManipuladoresActivity.class);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Prt2619Activity.this, In04_VetoresActivity.class);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Prt2619Activity.this, In04_PreparoActivity.class);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Prt2619Activity.this, In04_ResiduosActivity.class);
                startActivity(intentVaiPraResiduos);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Prt2619Activity.this, In04_SaneamentoActivity.class);
                startActivity(intentVaiPraSaneamento);
            }
        });
    }
}
