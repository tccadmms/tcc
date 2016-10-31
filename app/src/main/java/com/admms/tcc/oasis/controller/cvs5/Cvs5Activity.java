package com.admms.tcc.oasis.controller.cvs5;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.principal.ArquivoController;
import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.io.File;

public class Cvs5Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvs5);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.cvs5_armazenamento_cvs5);
        ImageButton documentacao = (ImageButton) findViewById(R.id.cvs5_documentacao_cvs5);
        ImageButton edificacao = (ImageButton) findViewById(R.id.cvs5_edificacao_cvs5);
        ImageButton exposicao = (ImageButton) findViewById(R.id.cvs5_exposicao_cvs5);
        ImageButton higiene = (ImageButton) findViewById(R.id.cvs5_higiene_cvs5);
        ImageButton ingredientes = (ImageButton) findViewById(R.id.cvs5_ingredientes_cvs5);
        ImageButton manipulador = (ImageButton) findViewById(R.id.cvs5_manipulador_cvs5);
        ImageButton vetores = (ImageButton) findViewById(R.id.cvs5_vetores_cvs5);
        ImageButton preparo = (ImageButton) findViewById(R.id.cvs5_preparo_cvs5);
        ImageButton residuos = (ImageButton) findViewById(R.id.cvs5_residuos_cvs5);
        ImageButton saneamento = (ImageButton) findViewById(R.id.cvs5_saneamento_cvs5);
        ImageButton salvar = (ImageButton) findViewById(R.id.cvs5_gerarRelatorio_cvs5);

        final Bundle bundle = getIntent().getExtras();

        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Cvs5Activity.this, Cvs5ArmazenamentoActivity.class);
                intentVaiProArmazenamento.putExtras(bundle);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Cvs5Activity.this, Cvs5DocumentacaoActivity.class);
                intentVaiPraDocumentacao.putExtras(bundle);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Cvs5Activity.this, Cvs5EdificacaoActivity.class);
                intentVaiPraEdificacao.putExtras(bundle);
                startActivity(intentVaiPraEdificacao);
            }
        });

        exposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraExposicao = new Intent(Cvs5Activity.this, Cvs5ExposicaoActivity.class);
                intentVaiPraExposicao.putExtras(bundle);
                startActivity(intentVaiPraExposicao);
            }
        });

        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Cvs5Activity.this, Cvs5HigieneActivity.class);
                intentVaiPraHigiene.putExtras(bundle);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Cvs5Activity.this, Cvs5IngredientesActivity.class);
                intentVaiPraIngredientes.putExtras(bundle);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Cvs5Activity.this, Cvs5ManipuladoresActivity.class);
                intentVaiPraManipulador.putExtras(bundle);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Cvs5Activity.this, Cvs5VetoresActivity.class);
                intentVaiPraVetores.putExtras(bundle);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Cvs5Activity.this, Cvs5PreparoActivity.class);
                intentVaiPraPreparo.putExtras(bundle);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Cvs5Activity.this, Cvs5ResiduosActivity.class);
                intentVaiPraResiduos.putExtras(bundle);
                startActivity(intentVaiPraResiduos);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Cvs5Activity.this, Cvs5SaneamentoActivity.class);
                intentVaiPraSaneamento.putExtras(bundle);
                startActivity(intentVaiPraSaneamento);
            }
        });
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcaoDAO planoAcaoDAO = new PlanoAcaoDAO(Cvs5Activity.this);
                EstabelecimentoDAO estabelecimentoDAO = new EstabelecimentoDAO(Cvs5Activity.this);
                PlanoAcao planoAcao = new PlanoAcao();
                Estabelecimento estabelecimento = new Estabelecimento();

                Bundle bundle = getIntent().getExtras();
                planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
                planoAcao = planoAcaoDAO.buscarPorID(planoAcao);
                estabelecimento.setCodigo(planoAcao.getEstabelecimento().getCodigo());
                ArquivoController.criaPlanoAcaoPDF(Cvs5Activity.this, planoAcao);
                Toast.makeText(Cvs5Activity.this, "Documento gerado com sucesso", Toast.LENGTH_SHORT).show();

                File anexo = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), planoAcao.getNomeArquivo());
                Uri anexoUri = Uri.fromFile(anexo);
                Intent mandarEmail = new Intent(Intent.ACTION_SEND);
                mandarEmail.setType("text/plain");
                mandarEmail.putExtra(Intent.EXTRA_EMAIL,estabelecimento.getEmail());
                mandarEmail.putExtra(Intent.EXTRA_STREAM, anexoUri);
                startActivity(Intent.createChooser(mandarEmail, "Mandar email..."));

            }
        });
    }
}
