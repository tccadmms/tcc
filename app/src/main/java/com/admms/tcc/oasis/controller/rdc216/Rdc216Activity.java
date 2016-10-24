package com.admms.tcc.oasis.controller.rdc216;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.principal.ArquivoHandler;
import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.io.File;

public class Rdc216Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdc216);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.rdc216_armazenamento_rdc216);
        ImageButton documentacao = (ImageButton) findViewById(R.id.rdc216_documentacao_rdc216);
        ImageButton edificacao = (ImageButton) findViewById(R.id.rdc216_edificacao_rdc216);
        ImageButton higiene = (ImageButton) findViewById(R.id.rdc216_higiene_rdc216);
        ImageButton exposicao = (ImageButton) findViewById(R.id.rdc216_exposicao_rdc216);
        ImageButton ingredientes = (ImageButton) findViewById(R.id.rdc216_ingredientes_rdc216);
        ImageButton manipulador = (ImageButton) findViewById(R.id.rdc216_manipulador_rdc216);
        ImageButton vetores = (ImageButton) findViewById(R.id.rdc216_vetores_rdc216);
        ImageButton preparo = (ImageButton) findViewById(R.id.rdc216_preparo_rdc216);
        ImageButton residuos = (ImageButton) findViewById(R.id.rdc216_residuos_rdc216);
        ImageButton responsavel = (ImageButton) findViewById(R.id.rdc216_responsavel_rdc216);
        ImageButton saneamento = (ImageButton) findViewById(R.id.rdc216_saneamento_rdc216);
        ImageButton salvar = (ImageButton) findViewById(R.id.rdc216_gerarRelatorio_rdc216);

        Bundle bundle = getIntent().getExtras();
        final String codigoPlanoAcao = bundle.getString("codigoPlanoAcao");

        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Rdc216Activity.this, Rdc216ArmazenamentoActivity.class);
                intentVaiProArmazenamento.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Rdc216Activity.this, Rdc216DocumentacaoActivity.class);
                intentVaiPraDocumentacao.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Rdc216Activity.this, Rdc216EdificacaoActivity.class);
                intentVaiPraEdificacao.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraEdificacao);
            }
        });
        exposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraExposicao = new Intent(Rdc216Activity.this, Rdc216ExposicaoActivity.class);
                intentVaiPraExposicao.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraExposicao);
            }
        });
        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Rdc216Activity.this, Rdc216HigieneActivity.class);
                intentVaiPraHigiene.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Rdc216Activity.this, Rdc216IngredientesActivity.class);
                intentVaiPraIngredientes.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Rdc216Activity.this, Rdc216ManipuladorActivity.class);
                intentVaiPraManipulador.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Rdc216Activity.this, Rdc216VetoresActivity.class);
                intentVaiPraVetores.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Rdc216Activity.this, Rdc216PreparoActivity.class);
                intentVaiPraPreparo.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Rdc216Activity.this, Rdc216ResiduosActivity.class);
                intentVaiPraResiduos.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraResiduos);
            }
        });
        responsavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResponsavel = new Intent(Rdc216Activity.this, Rdc216ResponsavelActivity.class);
                intentVaiPraResponsavel.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraResponsavel);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Rdc216Activity.this, Rdc216SaneamentoActivity.class);
                intentVaiPraSaneamento.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                startActivity(intentVaiPraSaneamento);
            }
        });
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcaoDAO planoAcaoDAO = new PlanoAcaoDAO(Rdc216Activity.this);
                EstabelecimentoDAO estabelecimentoDAO = new EstabelecimentoDAO(Rdc216Activity.this);
                PlanoAcao planoAcao = new PlanoAcao();
                Estabelecimento estabelecimento = new Estabelecimento();

                Bundle bundle = getIntent().getExtras();
                planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
                planoAcao = planoAcaoDAO.buscar(planoAcao);
                estabelecimento.setCodigo(planoAcao.getEstabelecimento().getCodigo());
                String arquivo = ArquivoHandler.criaPlanoAcaoPDF(Rdc216Activity.this, planoAcao);
                Toast.makeText(Rdc216Activity.this, "Documento gerado com sucesso", Toast.LENGTH_SHORT).show();

                File anexo = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), arquivo);
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

