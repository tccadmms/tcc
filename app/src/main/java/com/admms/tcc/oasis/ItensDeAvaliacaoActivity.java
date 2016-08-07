package com.admms.tcc.oasis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ItensDeAvaliacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itens_de_avaliacao);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.iten_armazenamento);
        ImageButton documentacao = (ImageButton) findViewById(R.id.iten_documentacao);
        ImageButton edificacao = (ImageButton) findViewById(R.id.iten_edificacao);

        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(ItensDeAvaliacaoActivity.this, ArmazenamentoActivity.class);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(ItensDeAvaliacaoActivity.this, DocumentacaoActivity.class);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(ItensDeAvaliacaoActivity.this, EdificacaoActivity.class);
                startActivity(intentVaiPraEdificacao);
            }
        });


    }
}
