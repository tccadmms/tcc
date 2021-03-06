package com.admms.tcc.oasis.controller.principal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.EstabelecimentoController;
import com.admms.tcc.oasis.controller.LegislacaoController;
import com.admms.tcc.oasis.controller.PlanoAcaoController;
import com.admms.tcc.oasis.controller.adapter.AdapterEstabelecimento;
import com.admms.tcc.oasis.controller.cvs5.Cvs5Activity;
import com.admms.tcc.oasis.controller.in04.In04Activity;
import com.admms.tcc.oasis.controller.prt2619.Prt2619Activity;
import com.admms.tcc.oasis.controller.prt78_325.Prt78_325Activity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216Activity;
import com.admms.tcc.oasis.dao.LegislacaoDAO;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

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

        ListView ListaEmpresa = (ListView) findViewById(R.id.ListaEmpresas);

        List<Estabelecimento> listaEstabelecimentos = EstabelecimentoController.lista(context);

        adapter = new AdapterEstabelecimento(ListaEmpresasActivity.this, R.layout.edit_row, R.id.rowTextView, listaEstabelecimentos);
        ListaEmpresa.setAdapter(adapter);

        ListaEmpresa.setOnItemClickListener(onClickListener);
    }

    private AdapterView.OnItemClickListener onClickListener = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {

            long viewId = v.getId();
            final Estabelecimento estabelecimento = (Estabelecimento) parent.getItemAtPosition(position);

            if (viewId == R.id.ivImage) {
                final Intent intentVaiPraCadastro = new Intent(ListaEmpresasActivity.this, CadastroActivity.class);
                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1000);
                            intentVaiPraCadastro.putExtra("editarEstabelecimento",true);
                            intentVaiPraCadastro.putExtra("codigoEstabelecimento",estabelecimento.getCodigo());
                            startActivity(intentVaiPraCadastro);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                thread.start();
            }
            else {
                mostraOpcaoEstabelecimento(estabelecimento);

            }
        }
    };

    protected void mostraOpcaoEstabelecimento(final Estabelecimento estabelecimento) {

        LayoutInflater layoutInflater = LayoutInflater.from(ListaEmpresasActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_criar_visualizar_diag, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ListaEmpresasActivity.this);
        alertDialogBuilder.setTitle("Empresa: " + estabelecimento.getRazaoSocial());
        alertDialogBuilder.setView(promptView);

        ImageButton CriarNovoDiagnostico = (ImageButton) promptView.findViewById(R.id.btn_cria_diagnostico);
        ImageButton VisualizarDiagnostico = (ImageButton) promptView.findViewById(R.id.btn_visualiza_diagnostico);

        final Legislacao legislacao = LegislacaoController.buscarLegislacaoPorID(estabelecimento.getLegislacao(), ListaEmpresasActivity.this);

        CriarNovoDiagnostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final PlanoAcao planoAcao = criarPlanoAcao(legislacao, estabelecimento,ListaEmpresasActivity.this);

                if (legislacao.getNome().equals(Constantes.LEGISLACAO_RDC216)) {
                    final Intent intentVaiPraRdc216 = new Intent(ListaEmpresasActivity.this, Rdc216Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraRdc216.putExtra("codigoPlanoAcao", planoAcao.getCodigo());
                                startActivity(intentVaiPraRdc216);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                }

                if (legislacao.getNome().equals(Constantes.LEGISLACAO_PRT78)) {
                    final Intent intentVaiPraPrt78_325 = new Intent(ListaEmpresasActivity.this, Prt78_325Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraPrt78_325.putExtra("codigoPlanoAcao", planoAcao.getCodigo());
                                startActivity(intentVaiPraPrt78_325);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                }

                if (legislacao.getNome().equals(Constantes.LEGISLACAO_PRT2619)) {
                    final Intent intentVaiPraPrt2619 = new Intent(ListaEmpresasActivity.this, Prt2619Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraPrt2619.putExtra("codigoPlanoAcao", planoAcao.getCodigo());
                                startActivity(intentVaiPraPrt2619);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                }

                if (legislacao.getNome().equals(Constantes.LEGISLACAO_CVS5)) {
                    final Intent intentVaiPraCvs5 = new Intent(ListaEmpresasActivity.this, Cvs5Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraCvs5.putExtra("codigoPlanoAcao", planoAcao.getCodigo());
                                startActivity(intentVaiPraCvs5);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                }

                if (legislacao.getNome().equals(Constantes.LEGISLACAO_IN04)) {
                    final Intent intentVaiPraIn04 = new Intent(ListaEmpresasActivity.this, In04Activity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentVaiPraIn04.putExtra("codigoPlanoAcao", planoAcao.getCodigo());
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

        VisualizarDiagnostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(PlanoAcaoController.listarPlanoAcaoEstabelecimento(estabelecimento, ListaEmpresasActivity.this) != null) {
                    final Intent intentListarDiagnosticos = new Intent(ListaEmpresasActivity.this, ListaDiagnosticosActivity.class);
                    Thread thread = new Thread() {
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(1000);
                                intentListarDiagnosticos.putExtra("codigoEstabelecimento", estabelecimento.getCodigo());
                                startActivity(intentListarDiagnosticos);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    thread.start();
                } else {
                    Toast.makeText(ListaEmpresasActivity.this, "Estabelecimento não possui diagnósticos",Toast.LENGTH_LONG).show();
                }
            }
        });

        AlertDialog alert = alertDialogBuilder.create();
        alert.show();
    }
}
