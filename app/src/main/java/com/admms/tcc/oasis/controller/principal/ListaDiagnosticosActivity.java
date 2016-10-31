package com.admms.tcc.oasis.controller.principal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.EstabelecimentoController;
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

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static com.admms.tcc.oasis.controller.PlanoAcaoController.criarPlanoAcao;

public class ListaDiagnosticosActivity extends Activity {

    ArrayAdapter<String> adapter;
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

        for (PlanoAcao plano: listPlanoAcao) {
            lista.add(plano.getNomeArquivo());
        }

        adapter = new ArrayAdapter<String>(ListaDiagnosticosActivity.this, R.layout.simple_row, R.id.rowTextView,lista);
        listaDiagnosticos.setAdapter(adapter);

        listaDiagnosticos.setOnItemClickListener(onClickListener);
    }

    private AdapterView.OnItemClickListener onClickListener = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            String arquivo = (String) parent.getItemAtPosition(position);

            File planoAcao = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), arquivo);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(Uri.fromFile(planoAcao),"application/pdf");
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(intent);
        }
    };
}
