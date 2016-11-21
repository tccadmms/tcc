package com.admms.tcc.oasis.controller.cvs5;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.ArquivoController;
import com.admms.tcc.oasis.controller.ItemAvaliacaoController;
import com.admms.tcc.oasis.controller.LegislacaoController;
import com.admms.tcc.oasis.controller.PlanoAcaoController;
import com.admms.tcc.oasis.controller.in04.In04Activity;
import com.admms.tcc.oasis.controller.prt2619.Prt2619Activity;
import com.admms.tcc.oasis.controller.prt78_325.Prt78_325Activity;
import com.admms.tcc.oasis.controller.rdc216.Rdc216Activity;
import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
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

        PlanoAcao planoAcao = new PlanoAcao();
        planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
        planoAcao = PlanoAcaoController.buscarPlanoAcaoPorID(planoAcao, Cvs5Activity.this);

        Legislacao legislacao = new Legislacao();
        legislacao.setCodigo(planoAcao.getLegislacao().getCodigo());
        legislacao = LegislacaoController.buscarLegislacaoPorID(legislacao, Cvs5Activity.this);

        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_ARMAZENAMENTO,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasArmazenamento()) {
            armazenamento.setBackgroundResource(R.drawable.armazenamento_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_DOCUMENTACAO,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasDocumentacao()) {
            documentacao.setBackgroundResource(R.drawable.documentacao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_EDIFICACAO,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasEdificacao()) {
            edificacao.setBackgroundResource(R.drawable.edificacao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_EXPOSICAO,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasExposicao()) {
            exposicao.setBackgroundResource(R.drawable.exposicao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_HIGIENE,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasHigiene()) {
            higiene.setBackgroundResource(R.drawable.higiene_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_INGREDIENTES,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasIngredientes()) {
            ingredientes.setBackgroundResource(R.drawable.ingredientes_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_MANIPULADORES,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasManipuladores()) {
            manipulador.setBackgroundResource(R.drawable.manipulador_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_PREPARO,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasPreparo()) {
            preparo.setBackgroundResource(R.drawable.preparo_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_RESIDUOS,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasResiduos()) {
            residuos.setBackgroundResource(R.drawable.residuos_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_SANEAMENTO,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasSaneamento()) {
            saneamento.setBackgroundResource(R.drawable.saneamento_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_VETORES,Cvs5Activity.this).size() == legislacao.getNumeroPerguntasVetores()) {
            vetores.setBackgroundResource(R.drawable.vetores_check);
        }

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
                final Estabelecimento estabelecimento = new Estabelecimento();

                Bundle bundle = getIntent().getExtras();
                planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
                planoAcao = planoAcaoDAO.buscarPorID(planoAcao);
                final String nomeArquivo = planoAcao.getNomeArquivo();
                estabelecimento.setCodigo(planoAcao.getEstabelecimento().getCodigo());
                ArquivoController.criaPlanoAcaoPDF(Cvs5Activity.this, planoAcao);
                Toast.makeText(Cvs5Activity.this, "Documento gerado com sucesso", Toast.LENGTH_SHORT).show();

                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case DialogInterface.BUTTON_POSITIVE:
                                File arquivo = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), nomeArquivo);
                                Intent intent = new Intent(Intent.ACTION_VIEW);
                                intent.setDataAndType(Uri.fromFile(arquivo),"application/pdf");
                                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                                startActivity(intent);
                                break;

                            case DialogInterface.BUTTON_NEGATIVE:
                                File anexo = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), nomeArquivo);
                                Uri anexoUri = Uri.fromFile(anexo);
                                Intent mandarEmail = new Intent(Intent.ACTION_SENDTO);
                                mandarEmail.setType("text/plain");
                                if (estabelecimento.getEmail() != null) {
                                    mandarEmail.setData(Uri.parse("mailto:" + estabelecimento.getEmail()));
                                } else {
                                    mandarEmail.setData(Uri.parse("mailto:"));
                                }
                                mandarEmail.putExtra(Intent.EXTRA_STREAM, anexoUri);
                                startActivity(Intent.createChooser(mandarEmail, "Mandar email..."));
                                break;
                        }
                    }
                };

                AlertDialog.Builder builder = new AlertDialog.Builder(Cvs5Activity.this);
                builder.setMessage("Você deseja visualizar o relatório em PDF ou enviá-lo por email?").setPositiveButton("PDF", dialogClickListener)
                        .setNegativeButton("E-mail", dialogClickListener).show();

            }
        });
    }
}
