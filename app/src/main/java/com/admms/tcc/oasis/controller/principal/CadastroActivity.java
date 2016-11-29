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
import com.admms.tcc.oasis.controller.EstabelecimentoController;
import com.admms.tcc.oasis.controller.LegislacaoController;
import com.admms.tcc.oasis.controller.UserInterfaceController;
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
import com.admms.tcc.oasis.entity.PlanoAcao;

import static com.admms.tcc.oasis.controller.PlanoAcaoController.criarPlanoAcao;

public class CadastroActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    private EditText cnpj, razaoSocial, email, telefone, cidade, cep, ramoAtividade, proprietario;
    private Spinner estado, legislacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        UserInterfaceController.pedirPermissoes(this);

        final Bundle bundle = getIntent().getExtras();
        final Context context = this;

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

        if((bundle != null) && (bundle.getBoolean("editarEstabelecimento"))) {
            final LegislacaoDAO legislacaoDAO = new LegislacaoDAO(context);
            Estabelecimento estabelecimento = new Estabelecimento();
            estabelecimento.setCodigo(bundle.getInt("codigoEstabelecimento"));
            estabelecimento = EstabelecimentoController.buscarPorID(estabelecimento, CadastroActivity.this);

            if (estabelecimento.getNumCNPJ() != null) {
                cnpj.setText(estabelecimento.getNumCNPJ());
            }
            if (estabelecimento.getRazaoSocial() != null) {
                razaoSocial.setText(estabelecimento.getRazaoSocial());
            }
            if (estabelecimento.getEmail() != null) {
                email.setText(estabelecimento.getEmail());
            }
            if (estabelecimento.getTelefone() != null) {
                telefone.setText(estabelecimento.getTelefone());
            }
            if (estabelecimento.getCidade() != null) {
                cidade.setText(estabelecimento.getCidade());
            }
            if (estabelecimento.getNumCEP() != null) {
                cep.setText(estabelecimento.getNumCEP());
            }
            if (estabelecimento.getRamo() != null) {
                ramoAtividade.setText(estabelecimento.getRamo());
            }

            ImageButton botaoSalvar = (ImageButton) findViewById(R.id.cadastro_btnSalvar);
            botaoSalvar.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    if (razaoSocial.getText().toString().length() == 0) {
                        razaoSocial.setError(getString(R.string.required_message));
                    } else {
                        alterarEstabelecimento(legislacaoDAO, bundle.getInt("codigoEstabelecimento"), context);
                    }
                }

            });

        } else {
            //Preparando o db para salvar onClick
            final EstabelecimentoDAO estabelecimentoDAO = new EstabelecimentoDAO(context);
            final LegislacaoDAO legislacaoDAO = new LegislacaoDAO(context);

            ImageButton botaoSalvar = (ImageButton) findViewById(R.id.cadastro_btnSalvar);
            botaoSalvar.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    if (razaoSocial.getText().toString().length() == 0) {
                        razaoSocial.setError(getString(R.string.required_message));
                    } else {
                        cadastrarEstabelecimento(context);
                    }

                }

            });
        }
    }




    private void alterarEstabelecimento(LegislacaoDAO legislacaoDAO, int codigoEstabelecimento, Context context) {
        Legislacao legislacaoPlanoAcao = new Legislacao();

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
        estabelecimento.setCodigo(codigoEstabelecimento);

        EstabelecimentoController.alterar(estabelecimento, context);

        iniciarDiagnostico(context, legislacaoPlanoAcao, estabelecimento);
    }

    private void cadastrarEstabelecimento(final Context context) {
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
                LegislacaoController.buscarLegislacaoPorNome(legislacaoPlanoAcao, context));


        estabelecimento = EstabelecimentoController.salvar(estabelecimento, context);
        Toast.makeText(CadastroActivity.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();


        final Estabelecimento estabelecimentoPlanoAcao = EstabelecimentoController.buscarPorID(estabelecimento, context);

        iniciarDiagnostico(context, legislacaoPlanoAcao, estabelecimentoPlanoAcao);
    }

    private void iniciarDiagnostico(final Context context, final Legislacao legislacaoPlanoAcao, final Estabelecimento estabelecimentoPlanoAcao) {
        final PlanoAcao planoAcao = criarPlanoAcao(LegislacaoController.buscarLegislacaoPorNome(legislacaoPlanoAcao, context), estabelecimentoPlanoAcao,context);

        if (legislacao.getSelectedItem().toString().equals(Constantes.LEGISLACAO_RDC216)) {
            final Intent intentVaiPraRdc216 = new Intent(CadastroActivity.this, Rdc216Activity.class);
            Thread thread = new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                        intentVaiPraRdc216.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
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
                        intentVaiPraPrt78_325.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
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
                        intentVaiPraPrt2619.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
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
                        intentVaiPraCvs5.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
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
                        intentVaiPraIn04.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
                        startActivity(intentVaiPraIn04);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            thread.start();
        }
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
            case Constantes.REQUEST_WRITE_STORAGE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    //reload my activity with permission granted or use the features what required the permission
                    finish();
                    startActivity(getIntent());
                } else
                {
                    Toast.makeText(this, "Aplicativo não têm permissão para gravar na memória, de modo que não pode funcionar corretamente.", Toast.LENGTH_LONG).show();
                }
            }
            case Constantes.REQUEST_CAMERA_ACCESS: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    //reload my activity with permission granted or use the features what required the permission
                    finish();
                    startActivity(getIntent());
                } else
                {
                    Toast.makeText(this, "Aplicativo não têm permissão para usar a câmera, de modo que não pode funcionar corretamente.", Toast.LENGTH_LONG).show();
                }
            }
            case Constantes.REQUEST_READ_STORAGE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
                {
                    //reload my activity with permission granted or use the features what required the permission
                    finish();
                    startActivity(getIntent());
                } else
                {
                    Toast.makeText(this, "Aplicativo não têm permissão para acessar a memória, de modo que não pode funcionar corretamente.", Toast.LENGTH_LONG).show();
                }
            }
        }

    }

}
