package com.admms.tcc.oasis.controller.in04;

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

public class In04Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in04);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.in04_armazenamento_in04);
        ImageButton documentacao = (ImageButton) findViewById(R.id.in04_documentacao_in04);
        ImageButton edificacao = (ImageButton) findViewById(R.id.in04_edificacao_in04);
        ImageButton exposicao = (ImageButton) findViewById(R.id.in04_exposicao_in04);
        ImageButton higiene = (ImageButton) findViewById(R.id.in04_higiene_in04);
        ImageButton ingredientes = (ImageButton) findViewById(R.id.in04_ingredientes_in04);
        ImageButton manipulador = (ImageButton) findViewById(R.id.in04_manipulador_in04);
        ImageButton vetores = (ImageButton) findViewById(R.id.in04_vetores_in04);
        ImageButton preparo = (ImageButton) findViewById(R.id.in04_preparo_in04);
        ImageButton residuos = (ImageButton) findViewById(R.id.in04_residuos_in04);
        ImageButton saneamento = (ImageButton) findViewById(R.id.in04_saneamento_in04);


        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(In04Activity.this, In04_ArmazenamentoActivity.class);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(In04Activity.this, In04_DocumentacaoActivity.class);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(In04Activity.this, In04_EdificacaoActivity.class);
                startActivity(intentVaiPraEdificacao);
            }
        });

        exposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraExposicao = new Intent(In04Activity.this, In04_ExposicaoActivity.class);
                startActivity(intentVaiPraExposicao);
            }
        });

        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(In04Activity.this, In04_HigieneActivity.class);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(In04Activity.this, In04_IngredientesActivity.class);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(In04Activity.this, In04_ManipuladoresActivity.class);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(In04Activity.this, In04_VetoresActivity.class);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(In04Activity.this, In04_PreparoActivity.class);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(In04Activity.this, In04_ResiduosActivity.class);
                startActivity(intentVaiPraResiduos);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(In04Activity.this, In04_SaneamentoActivity.class);
                startActivity(intentVaiPraSaneamento);
            }
        });
    }
}
