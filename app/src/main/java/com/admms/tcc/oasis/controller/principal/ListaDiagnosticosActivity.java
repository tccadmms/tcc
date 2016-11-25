package com.admms.tcc.oasis.controller.principal;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.LegislacaoController;
import com.admms.tcc.oasis.controller.PlanoAcaoController;
import com.admms.tcc.oasis.controller.adapter.AdapterPlanoAcao;
import com.admms.tcc.oasis.controller.cvs5.Cvs5Activity;
import com.admms.tcc.oasis.controller.in04.In04Activity;
import com.admms.tcc.oasis.controller.prt2619.Prt2619Activity;
import com.admms.tcc.oasis.controller.prt78_325.Prt78_325Activity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216Activity;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListaDiagnosticosActivity extends Activity {

    AdapterPlanoAcao adapter;
    List<String> lista = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_diagnosticos);

        ListView listaDiagnosticos = (ListView) findViewById(R.id.ListaDiagnosticos);
        Bundle bundle = getIntent().getExtras();
        Estabelecimento estabelecimento = new Estabelecimento();

        estabelecimento.setCodigo(bundle.getInt("codigoEstabelecimento"));
        List<PlanoAcao> listPlanoAcao = PlanoAcaoController.listarPlanoAcaoEstabelecimento(estabelecimento, this);

        adapter = new AdapterPlanoAcao(ListaDiagnosticosActivity.this, R.layout.simple_row, R.id.rowTextView,listPlanoAcao);
        listaDiagnosticos.setAdapter(adapter);

        listaDiagnosticos.setOnItemClickListener(onClickListener);
    }

    private AdapterView.OnItemClickListener onClickListener = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            final PlanoAcao planoAcao = (PlanoAcao) parent.getItemAtPosition(position);

            DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    switch (which){
                        case DialogInterface.BUTTON_POSITIVE:
                            Legislacao legislacao = planoAcao.getLegislacao();
                            legislacao = LegislacaoController.buscarLegislacaoPorID(legislacao, ListaDiagnosticosActivity.this);

                            if (legislacao.getNome().equals(Constantes.LEGISLACAO_CVS5)) {
                                Intent vaiPraDiagnostico = new Intent(ListaDiagnosticosActivity.this, Cvs5Activity.class);
                                vaiPraDiagnostico.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
                                startActivity(vaiPraDiagnostico);
                            } else if (legislacao.getNome().equals(Constantes.LEGISLACAO_IN04)) {
                                Intent vaiPraDiagnostico = new Intent(ListaDiagnosticosActivity.this, In04Activity.class);
                                vaiPraDiagnostico.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
                                startActivity(vaiPraDiagnostico);
                            } else if (legislacao.getNome().equals(Constantes.LEGISLACAO_PRT78)) {
                                Intent vaiPraDiagnostico = new Intent(ListaDiagnosticosActivity.this, Prt78_325Activity.class);
                                vaiPraDiagnostico.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
                                startActivity(vaiPraDiagnostico);
                            } else if (legislacao.getNome().equals(Constantes.LEGISLACAO_PRT2619)) {
                                Intent vaiPraDiagnostico = new Intent(ListaDiagnosticosActivity.this, Prt2619Activity.class);
                                vaiPraDiagnostico.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
                                startActivity(vaiPraDiagnostico);
                            } else if (legislacao.getNome().equals(Constantes.LEGISLACAO_RDC216)) {
                                Intent vaiPraDiagnostico = new Intent(ListaDiagnosticosActivity.this, Rdc216Activity.class);
                                vaiPraDiagnostico.putExtra("codigoPlanoAcao",planoAcao.getCodigo());
                                startActivity(vaiPraDiagnostico);
                            }
                            break;

                        case DialogInterface.BUTTON_NEGATIVE:
                            File arquivo = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), planoAcao.getNomeArquivo());
                            Intent intent = new Intent(Intent.ACTION_VIEW);
                            intent.setDataAndType(Uri.fromFile(arquivo),"application/pdf");
                            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                            startActivity(intent);
                            break;
                    }
                }
            };

            AlertDialog.Builder builder = new AlertDialog.Builder(ListaDiagnosticosActivity.this);
            builder.setMessage("Você deseja visualizar o PDF ou continuar o diagnóstico no aplicativo?").setPositiveButton("Continuar", dialogClickListener)
                    .setNegativeButton("PDF", dialogClickListener).show();
        }
    };
}
