package com.admms.tcc.oasis.controller.principal;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ListView;

import com.admms.tcc.oasis.R;

public class ListaEmpresasActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_empresas);

        ListView ListaEmpresa = (ListView) findViewById(R.id.ListaEmpresas);
        ImageButton CriarNovoDiagnostico = (ImageButton) findViewById(R.id.btn_cria_diagnostico);
        ImageButton VisualizarDiagnostico = (ImageButton) findViewById(R.id.btn_visualiza_diagnostico);


    }
}
