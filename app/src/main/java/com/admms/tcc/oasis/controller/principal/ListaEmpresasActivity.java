package com.admms.tcc.oasis.controller.principal;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.EstabelecimentoController;
import com.admms.tcc.oasis.controller.ItemAvaliacaoController;
import com.admms.tcc.oasis.controller.adapter.AdapterEstabelecimento;
import com.admms.tcc.oasis.controller.cvs5.Cvs5Activity;
import com.admms.tcc.oasis.controller.cvs5.Cvs5DocumentacaoActivity;
import com.admms.tcc.oasis.controller.in04.In04Activity;
import com.admms.tcc.oasis.controller.prt2619.Prt2619Activity;
import com.admms.tcc.oasis.controller.prt78_325.Prt78_325Activity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216Activity;
import com.admms.tcc.oasis.dao.LegislacaoDAO;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.Legislacao;

import java.util.ArrayList;
import java.util.List;

import static com.admms.tcc.oasis.controller.PlanoAcaoController.criarPlanoAcao;

public class ListaEmpresasActivity extends Activity {

    AdapterEstabelecimento adapter;
    List<String> lista = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_empresas);

        final Context context = this;
        EstabelecimentoController estabelecimentoController = new EstabelecimentoController();

        ListView ListaEmpresa = (ListView) findViewById(R.id.ListaEmpresas);

        List<Estabelecimento> listaEstabelecimentos = estabelecimentoController.lista(context);

        adapter = new AdapterEstabelecimento(ListaEmpresasActivity.this, R.layout.simple_row, R.id.rowTextView, listaEstabelecimentos);
        ListaEmpresa.setAdapter(adapter);

        ListaEmpresa.setOnItemClickListener(onClickListener);
    }

    private AdapterView.OnItemClickListener onClickListener = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            Estabelecimento estabelecimento = (Estabelecimento) parent.getItemAtPosition(position);
            mostraJanelaDescricao(estabelecimento);
        }
    };

    protected void mostraJanelaDescricao(final Estabelecimento estabelecimento) {

        LayoutInflater layoutInflater = LayoutInflater.from(ListaEmpresasActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_criar_visualizar_diag, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ListaEmpresasActivity.this);
        alertDialogBuilder.setTitle("Empresa: " + estabelecimento.getRazaoSocial());
        alertDialogBuilder.setView(promptView);

        ImageButton CriarNovoDiagnostico = (ImageButton) promptView.findViewById(R.id.btn_cria_diagnostico);
        ImageButton VisualizarDiagnostico = (ImageButton) promptView.findViewById(R.id.btn_visualiza_diagnostico);

        final LegislacaoDAO legislacaoDAO = new LegislacaoDAO(ListaEmpresasActivity.this);
        final Legislacao legislacao = new Legislacao();
        legislacao.setNome(estabelecimento.getLegislacao());

        CriarNovoDiagnostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (estabelecimento.getLegislacao().equals(Constantes.LEGISLACAO_RDC216)) {
                    final Intent intentVaiPraRdc216 = new Intent(ListaEmpresasActivity.this, Rdc216Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraRdc216.putExtra("codigoPlanoAcao", criarPlanoAcao(legislacaoDAO.buscar(legislacao), estabelecimento, ListaEmpresasActivity.this));
                                startActivity(intentVaiPraRdc216);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                }

                if (estabelecimento.getLegislacao().equals(Constantes.LEGISLACAO_PRT78)) {
                    final Intent intentVaiPraPrt78_325 = new Intent(ListaEmpresasActivity.this, Prt78_325Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraPrt78_325.putExtra("codigoPlanoAcao", criarPlanoAcao(legislacaoDAO.buscar(legislacao), estabelecimento, ListaEmpresasActivity.this));
                                startActivity(intentVaiPraPrt78_325);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                }

                if (estabelecimento.getLegislacao().equals(Constantes.LEGISLACAO_PRT2619)) {
                    final Intent intentVaiPraPrt2619 = new Intent(ListaEmpresasActivity.this, Prt2619Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraPrt2619.putExtra("codigoPlanoAcao", criarPlanoAcao(legislacaoDAO.buscar(legislacao), estabelecimento, ListaEmpresasActivity.this));
                                startActivity(intentVaiPraPrt2619);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                }

                if (estabelecimento.getLegislacao().equals(Constantes.LEGISLACAO_CVS5)) {
                    final Intent intentVaiPraCvs5 = new Intent(ListaEmpresasActivity.this, Cvs5Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraCvs5.putExtra("codigoPlanoAcao", criarPlanoAcao(legislacaoDAO.buscar(legislacao), estabelecimento, ListaEmpresasActivity.this));
                                startActivity(intentVaiPraCvs5);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                }

                if (estabelecimento.getLegislacao().equals(Constantes.LEGISLACAO_IN04)) {
                    final Intent intentVaiPraIn04 = new Intent(ListaEmpresasActivity.this, In04Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraIn04.putExtra("codigoPlanoAcao", criarPlanoAcao(legislacaoDAO.buscar(legislacao), estabelecimento, ListaEmpresasActivity.this));
                                startActivity(intentVaiPraIn04);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                }
            }
        });

        AlertDialog alert = alertDialogBuilder.create();
        alert.show();

    }
}
