package com.admms.tcc.oasis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Spinner estados = (Spinner)findViewById(R.id.cadastro_estados);
        Spinner legislacoes = (Spinner)findViewById(R.id.cadastro_legislacao);
        ArrayAdapter adapterEstados = ArrayAdapter.createFromResource(CadastroActivity.this,R.array.estado_array, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter adapterLegislacoes = ArrayAdapter.createFromResource(CadastroActivity.this,R.array.legislacao_array,android.R.layout.simple_spinner_dropdown_item);
        estados.setAdapter(adapterEstados);
        legislacoes.setAdapter(adapterLegislacoes);

        ImageButton botaoSalvar = (ImageButton) findViewById(R.id.cadastro_btnSalvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(CadastroActivity.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
                final Intent intentVaiProItens = new Intent(CadastroActivity.this, ItensDeAvaliacaoActivity.class);
                Thread thread = new Thread(){
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1000);
                            startActivity(intentVaiProItens);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                thread.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cadastro, menu);

        return super.onCreateOptionsMenu(menu);
    }
}
