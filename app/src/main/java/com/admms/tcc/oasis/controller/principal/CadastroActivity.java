package com.admms.tcc.oasis.controller.principal;

import android.content.Context;
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
import com.admms.tcc.oasis.controller.in04.In04Activity;
import com.admms.tcc.oasis.controller.prt2619.Prt2619Activity;
import com.admms.tcc.oasis.controller.prt78_325.Prt78_325Activity;
import com.admms.tcc.oasis.controller.cvs5.Cvs5Activity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216Activity;
import com.admms.tcc.oasis.dao.DatabaseHelper;
import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.dao.LegislacaoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.PlanoAcao;
import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;

import java.util.Date;

public class CadastroActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;

    private EditText cnpj, razaoSocial, email, telefone, cidade, cep, ramoAtividade, proprietario;
    private Spinner estado, legislacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        //Preparando o db para salvar onClick
        final Context context = this;
        final EstabelecimentoDAO estabelecimentoDAO = new EstabelecimentoDAO(context);
        final LegislacaoDAO legislacaoDAO = new LegislacaoDAO(context);

        Spinner estados = (Spinner)findViewById(R.id.cadastro_estados);
        Spinner legislacoes = (Spinner)findViewById(R.id.cadastro_legislacao);
        ArrayAdapter adapterEstados = ArrayAdapter.createFromResource(CadastroActivity.this,R.array.estado_array, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter adapterLegislacoes = ArrayAdapter.createFromResource(CadastroActivity.this,R.array.legislacao_array,android.R.layout.simple_spinner_dropdown_item);
        estados.setAdapter(adapterEstados);
        legislacoes.setAdapter(adapterLegislacoes);
        cnpj = (EditText) findViewById(R.id.cadastro_cnpj);
        razaoSocial = (EditText) findViewById(R.id.cadastro_razaoSocial);
        email = (EditText) findViewById(R.id.cadastro_email);
        telefone = (EditText) findViewById(R.id.cadastro_telefone);
        cidade = (EditText) findViewById(R.id.cadastro_cidade);
        cep = (EditText) findViewById(R.id.cadastro_cep);
        ramoAtividade = (EditText) findViewById(R.id.cadastro_ramoDeAtividade);
        proprietario = (EditText) findViewById(R.id.cadastro_proprietarioDoEstabelecimento);
        estado = (Spinner) findViewById(R.id.cadastro_estados);
        legislacao = (Spinner) findViewById(R.id.cadastro_legislacao);

        ImageButton botaoSalvar = (ImageButton) findViewById(R.id.cadastro_btnSalvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (razaoSocial.getText().toString().length() == 0) {
                    razaoSocial.setError(getString(R.string.required_message));
                } else {
                    Estabelecimento estabelecimento = new Estabelecimento(String.valueOf(razaoSocial.getText()),
                            String.valueOf(email.getText()),
                            String.valueOf(cnpj.getText()),
                            String.valueOf(cep.getText()),
                            String.valueOf(cidade.getText()),
                            String.valueOf(estado.getSelectedItem().toString()),
                            String.valueOf(telefone.getText()),
                            String.valueOf(ramoAtividade.getText()),
                            String.valueOf(proprietario.getText()),
                            String.valueOf(legislacao.getSelectedItem().toString()));


                    estabelecimento = estabelecimentoDAO.inserir(estabelecimento);
                    Toast.makeText(CadastroActivity.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();

                    final Legislacao legislacaoPlanoAcao = new Legislacao();
                    final Estabelecimento estabelecimentoPlanoAcao = estabelecimentoDAO.buscar(estabelecimento);

                    if (legislacao.getSelectedItem().toString().equals("RDC nº:216/2004")) {
                        final Intent intentVaiPraRdc216 = new Intent(CadastroActivity.this, Rdc216Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    legislacaoPlanoAcao.setNome("RDC nº:216/2004");
                                    intentVaiPraRdc216.putExtra("codigoPlanoAcao",criarPlanoAcao(legislacaoDAO.buscar(legislacaoPlanoAcao), estabelecimentoPlanoAcao,context));
                                    startActivity(intentVaiPraRdc216);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        thread.start();
                    }

                    if (legislacao.getSelectedItem().toString().equals("PRT nº:78/2009 - 325/2010")) {
                        final Intent intentVaiPraPrt78_325 = new Intent(CadastroActivity.this, Prt78_325Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    startActivity(intentVaiPraPrt78_325);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        thread.start();
                    }

                    if (legislacao.getSelectedItem().toString().equals("PRT nº:2619/2011")) {
                        final Intent intentVaiPraPrt2619 = new Intent(CadastroActivity.this, Prt2619Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    startActivity(intentVaiPraPrt2619);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        thread.start();
                    }

                    if (legislacao.getSelectedItem().toString().equals("CVS nº:5/2013")) {
                        final Intent intentVaiPraCvs5 = new Intent(CadastroActivity.this, Cvs5Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    legislacaoPlanoAcao.setNome("CVS nº:5/2013");
                                    intentVaiPraCvs5.putExtra("codigoPlanoAcao",criarPlanoAcao(legislacaoDAO.buscar(legislacaoPlanoAcao), estabelecimentoPlanoAcao,context));
                                    startActivity(intentVaiPraCvs5);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        thread.start();
                    }

                    if (legislacao.getSelectedItem().toString().equals("IN nº:04/2014")) {
                        final Intent intentVaiPraIn04 = new Intent(CadastroActivity.this, In04Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    startActivity(intentVaiPraIn04);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        thread.start();
                    }
                }

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_cadastro, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public int criarPlanoAcao(Legislacao legislacao, Estabelecimento estabelecimento, Context context) {
        PlanoAcao planoAcao = new PlanoAcao();
        PlanoAcaoDAO planoAcaoDAO = new PlanoAcaoDAO(context);

        planoAcao.setLegislacao(legislacao);
        planoAcao.setData(new Date());
        planoAcao.setEstabelecimento(estabelecimento);
        planoAcaoDAO.inserir(planoAcao);

        return planoAcao.getCodigo();
    }



}
