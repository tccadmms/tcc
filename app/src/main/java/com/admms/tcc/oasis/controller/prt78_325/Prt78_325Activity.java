package com.admms.tcc.oasis.controller.prt78_325;

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

public class Prt78_325Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt78_325);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.prt78_325_armazenamento_prt78_325);
        ImageButton documentacao = (ImageButton) findViewById(R.id.prt78_325_documentacao_prt78_325);
        ImageButton edificacao = (ImageButton) findViewById(R.id.prt78_325_edificacao_prt78_325);
        ImageButton exposicao = (ImageButton) findViewById(R.id.prt78_325_exposicao_prt78_325);
        ImageButton higiene = (ImageButton) findViewById(R.id.prt78_325_higiene_prt78_325);
        ImageButton ingredientes = (ImageButton) findViewById(R.id.prt78_325_ingredientes_prt78_325);
        ImageButton manipulador = (ImageButton) findViewById(R.id.prt78_325_manipulador_prt78_325);
        ImageButton vetores = (ImageButton) findViewById(R.id.prt78_325_vetores_prt78_325);
        ImageButton preparo = (ImageButton) findViewById(R.id.prt78_325_preparo_prt78_325);
        ImageButton residuos = (ImageButton) findViewById(R.id.prt78_325_residuos_prt78_325);
        ImageButton responsavel = (ImageButton) findViewById(R.id.prt78_325_responsavel_prt78_325);
        ImageButton saneamento = (ImageButton) findViewById(R.id.prt78_325_saneamento_prt78_325);
        ImageButton salvar = (ImageButton) findViewById(R.id.prt78_325_gerarRelatorio_prt78_325);

        final Bundle bundle = getIntent().getExtras();

        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Prt78_325Activity.this, Prt78_325_ArmazenamentoActivity.class);
                intentVaiProArmazenamento.putExtras(bundle);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Prt78_325Activity.this, Prt78_325_DocumentacaoActivity.class);
                intentVaiPraDocumentacao.putExtras(bundle);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Prt78_325Activity.this, Prt78_325_EdificacaoActivity.class);
                intentVaiPraEdificacao.putExtras(bundle);
                startActivity(intentVaiPraEdificacao);
            }
        });

        exposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraExposicao = new Intent(Prt78_325Activity.this, Prt78_325_ExposicaoActivity.class);
                intentVaiPraExposicao.putExtras(bundle);
                startActivity(intentVaiPraExposicao);
            }
        });

        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Prt78_325Activity.this, Prt78_325_HigieneActivity.class);
                intentVaiPraHigiene.putExtras(bundle);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Prt78_325Activity.this, Prt78_325_IngredientesActivity.class);
                intentVaiPraIngredientes.putExtras(bundle);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Prt78_325Activity.this, Prt78_325_ManipuladoresActivity.class);
                intentVaiPraManipulador.putExtras(bundle);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Prt78_325Activity.this, Prt78_325_VetoresActivity.class);
                intentVaiPraVetores.putExtras(bundle);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Prt78_325Activity.this, Prt78_325_PreparoActivity.class);
                intentVaiPraPreparo.putExtras(bundle);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Prt78_325Activity.this, Prt78_325_ResiduosActivity.class);
                intentVaiPraResiduos.putExtras(bundle);
                startActivity(intentVaiPraResiduos);
            }
        });
        responsavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResponsavel = new Intent(Prt78_325Activity.this, Prt78_325_ResponsavelActivity.class);
                intentVaiPraResponsavel.putExtras(bundle);
                startActivity(intentVaiPraResponsavel);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Prt78_325Activity.this, Prt78_325_SaneamentoActivity.class);
                intentVaiPraSaneamento.putExtras(bundle);
                startActivity(intentVaiPraSaneamento);
            }
        });
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcaoDAO planoAcaoDAO = new PlanoAcaoDAO(Prt78_325Activity.this);
                EstabelecimentoDAO estabelecimentoDAO = new EstabelecimentoDAO(Prt78_325Activity.this);
                PlanoAcao planoAcao = new PlanoAcao();
                Estabelecimento estabelecimento = new Estabelecimento();

                Bundle bundle = getIntent().getExtras();
                planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
                planoAcao = planoAcaoDAO.buscarPorID(planoAcao);
                estabelecimento.setCodigo(planoAcao.getEstabelecimento().getCodigo());
                ArquivoController.criaPlanoAcaoPDF(Prt78_325Activity.this, planoAcao);
                Toast.makeText(Prt78_325Activity.this, "Documento gerado com sucesso", Toast.LENGTH_SHORT).show();

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

