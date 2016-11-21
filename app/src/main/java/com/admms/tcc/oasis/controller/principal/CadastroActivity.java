package com.admms.tcc.oasis.controller.principal;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.Constantes;

import static com.admms.tcc.oasis.controller.PlanoAcaoController.criarPlanoAcao;

public class CadastroActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    private static final int REQUEST_WRITE_STORAGE = 112;
    private static final int REQUEST_CAMERA_ACCESS = 1888;
    private static final int REQUEST_READ_STORAGE= 87;
    private EditText cnpj, razaoSocial, email, telefone, cidade, cep, ramoAtividade, proprietario;
    private Spinner estado, legislacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        boolean hasPermissionWriteStorage = (ContextCompat.checkSelfPermission(this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED);
        boolean hasPermissionCamera = (ContextCompat.checkSelfPermission(this,
                Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED);
        boolean hasPermissionReadStorage = (ContextCompat.checkSelfPermission(this,
                Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED);
        if (!hasPermissionCamera) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CAMERA},
                    REQUEST_CAMERA_ACCESS);
        } else if (!hasPermissionWriteStorage) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    REQUEST_WRITE_STORAGE);
        } else if (!hasPermissionReadStorage) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                    REQUEST_WRITE_STORAGE);
        }

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
                    final Legislacao legislacaoPlanoAcao = new Legislacao();
                    legislacaoPlanoAcao.setNome(legislacao.getSelectedItem().toString());
                    Estabelecimento estabelecimento = new Estabelecimento(String.valueOf(razaoSocial.getText()),
                            String.valueOf(email.getText()),
                            String.valueOf(cnpj.getText()),
                            String.valueOf(cep.getText()),
                            String.valueOf(cidade.getText()),
                            String.valueOf(estado.getSelectedItem().toString()),
                            String.valueOf(telefone.getText()),
                            String.valueOf(ramoAtividade.getText()),
                            String.valueOf(proprietario.getText()),
                            legislacaoDAO.buscarPorNome(legislacaoPlanoAcao));


                    estabelecimento = estabelecimentoDAO.inserir(estabelecimento);
                    Toast.makeText(CadastroActivity.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();


                    final Estabelecimento estabelecimentoPlanoAcao = estabelecimentoDAO.buscarPorID(estabelecimento);

                    if (legislacao.getSelectedItem().toString().equals(Constantes.LEGISLACAO_RDC216)) {
                        final Intent intentVaiPraRdc216 = new Intent(CadastroActivity.this, Rdc216Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    intentVaiPraRdc216.putExtra("codigoPlanoAcao",criarPlanoAcao(legislacaoDAO.buscarPorNome(legislacaoPlanoAcao), estabelecimentoPlanoAcao,context));
                                    startActivity(intentVaiPraRdc216);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        thread.start();
                    }

                    if (legislacao.getSelectedItem().toString().equals(Constantes.LEGISLACAO_PRT78)) {
                        final Intent intentVaiPraPrt78_325 = new Intent(CadastroActivity.this, Prt78_325Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    intentVaiPraPrt78_325.putExtra("codigoPlanoAcao",criarPlanoAcao(legislacaoDAO.buscarPorNome(legislacaoPlanoAcao), estabelecimentoPlanoAcao,context));
                                    startActivity(intentVaiPraPrt78_325);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        thread.start();
                    }

                    if (legislacao.getSelectedItem().toString().equals(Constantes.LEGISLACAO_PRT2619)) {
                        final Intent intentVaiPraPrt2619 = new Intent(CadastroActivity.this, Prt2619Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    intentVaiPraPrt2619.putExtra("codigoPlanoAcao",criarPlanoAcao(legislacaoDAO.buscarPorNome(legislacaoPlanoAcao), estabelecimentoPlanoAcao,context));
                                    startActivity(intentVaiPraPrt2619);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        thread.start();
                    }

                    if (legislacao.getSelectedItem().toString().equals(Constantes.LEGISLACAO_CVS5)) {
                        final Intent intentVaiPraCvs5 = new Intent(CadastroActivity.this, Cvs5Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    intentVaiPraCvs5.putExtra("codigoPlanoAcao",criarPlanoAcao(legislacaoDAO.buscarPorNome(legislacaoPlanoAcao), estabelecimentoPlanoAcao,context));
                                    startActivity(intentVaiPraCvs5);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        thread.start();
                    }

                    if (legislacao.getSelectedItem().toString().equals(Constantes.LEGISLACAO_IN04)) {
                        final Intent intentVaiPraIn04 = new Intent(CadastroActivity.this, In04Activity.class);
                        Thread thread = new Thread() {
                            @Override
                            public void run() {
                                try {
                                    Thread.sleep(1000);
                                    intentVaiPraIn04.putExtra("codigoPlanoAcao",criarPlanoAcao(legislacaoDAO.buscarPorNome(legislacaoPlanoAcao), estabelecimentoPlanoAcao,context));
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intentListaEmpresas = new Intent(CadastroActivity.this, ListaEmpresasActivity.class);
        startActivity(intentListaEmpresas);

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode)
        {
            case REQUEST_WRITE_STORAGE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    //reload my activity with permission granted or use the features what required the permission
                    finish();
                    startActivity(getIntent());
                } else
                {
                    Toast.makeText(this, "The app was not allowed to write to your storage. Hence, it cannot function properly. Please consider granting it this permission", Toast.LENGTH_LONG).show();
                }
            }
        }

    }

}
