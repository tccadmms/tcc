package com.admms.tcc.oasis.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.dao.DatabaseHelper;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;

public class CadastroActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;

    private EditText cnpj, razaoSocial, email, telefone, cidade, cep, ramoAtividade, proprietario;
    private Spinner estado, legislacao;

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

        //Preparando o db para salvar onClick
        databaseHelper = OpenHelperManager.getHelper(this, DatabaseHelper.class);
        final RuntimeExceptionDao<Estabelecimento, Integer> estabelecimentoDao = databaseHelper.getEstabelecimentoRuntimeExceptionDao();

        ImageButton botaoSalvar = (ImageButton) findViewById(R.id.cadastro_btnSalvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                cnpj = (EditText) findViewById(R.id.cadastro_cnpj);
                razaoSocial = (EditText) findViewById(R.id.cadastro_razaoSocial);
                email = (EditText) findViewById(R.id.cadastro_email);
                telefone = (EditText) findViewById(R.id.cadastro_telefone);
                cidade = (EditText) findViewById(R.id.cadastro_cidade);
                estado = (Spinner) findViewById(R.id.cadastro_estados);
                cep = (EditText) findViewById(R.id.cadastro_cep);
                ramoAtividade = (EditText) findViewById(R.id.cadastro_ramoDeAtividade);
                proprietario = (EditText) findViewById(R.id.cadastro_proprietarioDoEstabelecimento);
                legislacao = (Spinner) findViewById(R.id.cadastro_legislacao);

                estabelecimentoDao.create(new Estabelecimento(String.valueOf(razaoSocial.getText()),
                                                              String.valueOf(email.getText()),
                                                              String.valueOf(cnpj.getText()),
                                                              String.valueOf(cep.getText()),
                                                              String.valueOf(cidade.getText()),
                                                              String.valueOf(estado.getSelectedItem().toString()),
                                                              String.valueOf(ramoAtividade.getText()),
                                                              String.valueOf(proprietario.getText()),
                                                              String.valueOf(legislacao.getSelectedItem().toString())));
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
