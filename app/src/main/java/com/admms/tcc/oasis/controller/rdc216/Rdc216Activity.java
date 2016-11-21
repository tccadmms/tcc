package com.admms.tcc.oasis.controller.rdc216;

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
import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
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

        final Bundle bundle = getIntent().getExtras();

        PlanoAcao planoAcao = new PlanoAcao();
        planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
        planoAcao = PlanoAcaoController.buscarPlanoAcaoPorID(planoAcao, Rdc216Activity.this);

        Legislacao legislacao = new Legislacao();
        legislacao.setCodigo(planoAcao.getLegislacao().getCodigo());
        legislacao = LegislacaoController.buscarLegislacaoPorID(legislacao, Rdc216Activity.this);

        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_ARMAZENAMENTO,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasArmazenamento()) {
            armazenamento.setBackgroundResource(R.drawable.armazenamento_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_DOCUMENTACAO,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasDocumentacao()) {
            documentacao.setBackgroundResource(R.drawable.documentacao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_EDIFICACAO,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasEdificacao()) {
            edificacao.setBackgroundResource(R.drawable.edificacao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_EXPOSICAO,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasExposicao()) {
            exposicao.setBackgroundResource(R.drawable.exposicao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_HIGIENE,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasHigiene()) {
            higiene.setBackgroundResource(R.drawable.higiene_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_INGREDIENTES,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasIngredientes()) {
            ingredientes.setBackgroundResource(R.drawable.ingredientes_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_MANIPULADORES,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasManipuladores()) {
            manipulador.setBackgroundResource(R.drawable.manipulador_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_PREPARO,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasPreparo()) {
            preparo.setBackgroundResource(R.drawable.preparo_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_RESIDUOS,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasResiduos()) {
            residuos.setBackgroundResource(R.drawable.residuos_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_RESPONSAVEL,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasResponsavel()) {
            responsavel.setBackgroundResource(R.drawable.responsavel_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_SANEAMENTO,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasSaneamento()) {
            saneamento.setBackgroundResource(R.drawable.saneamento_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_VETORES,Rdc216Activity.this).size() == legislacao.getNumeroPerguntasVetores()) {
            vetores.setBackgroundResource(R.drawable.vetores_check);
        }

        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Rdc216Activity.this, Rdc216ArmazenamentoActivity.class);
                intentVaiProArmazenamento.putExtras(bundle);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Rdc216Activity.this, Rdc216DocumentacaoActivity.class);
                intentVaiPraDocumentacao.putExtras(bundle);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Rdc216Activity.this, Rdc216EdificacaoActivity.class);
                intentVaiPraEdificacao.putExtras(bundle);
                startActivity(intentVaiPraEdificacao);
            }
        });
        exposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraExposicao = new Intent(Rdc216Activity.this, Rdc216ExposicaoActivity.class);
                intentVaiPraExposicao.putExtras(bundle);
                startActivity(intentVaiPraExposicao);
            }
        });
        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Rdc216Activity.this, Rdc216HigieneActivity.class);
                intentVaiPraHigiene.putExtras(bundle);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Rdc216Activity.this, Rdc216IngredientesActivity.class);
                intentVaiPraIngredientes.putExtras(bundle);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Rdc216Activity.this, Rdc216ManipuladorActivity.class);
                intentVaiPraManipulador.putExtras(bundle);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Rdc216Activity.this, Rdc216VetoresActivity.class);
                intentVaiPraVetores.putExtras(bundle);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Rdc216Activity.this, Rdc216PreparoActivity.class);
                intentVaiPraPreparo.putExtras(bundle);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Rdc216Activity.this, Rdc216ResiduosActivity.class);
                intentVaiPraResiduos.putExtras(bundle);
                startActivity(intentVaiPraResiduos);
            }
        });
        responsavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResponsavel = new Intent(Rdc216Activity.this, Rdc216ResponsavelActivity.class);
                intentVaiPraResponsavel.putExtras(bundle);
                startActivity(intentVaiPraResponsavel);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Rdc216Activity.this, Rdc216SaneamentoActivity.class);
                intentVaiPraSaneamento.putExtras(bundle);
                startActivity(intentVaiPraSaneamento);
            }
        });
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcaoDAO planoAcaoDAO = new PlanoAcaoDAO(Rdc216Activity.this);
                EstabelecimentoDAO estabelecimentoDAO = new EstabelecimentoDAO(Rdc216Activity.this);
                PlanoAcao planoAcao = new PlanoAcao();
                final Estabelecimento estabelecimento = new Estabelecimento();

                Bundle bundle = getIntent().getExtras();
                planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
                planoAcao = planoAcaoDAO.buscarPorID(planoAcao);
                final String nomeArquivo = planoAcao.getNomeArquivo();
                estabelecimento.setCodigo(planoAcao.getEstabelecimento().getCodigo());
                ArquivoController.criaPlanoAcaoPDF(Rdc216Activity.this, planoAcao);
                Toast.makeText(Rdc216Activity.this, "Documento gerado com sucesso", Toast.LENGTH_SHORT).show();

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

                AlertDialog.Builder builder = new AlertDialog.Builder(Rdc216Activity.this);
                builder.setMessage("Você deseja visualizar o relatório em PDF ou enviá-lo por email?").setPositiveButton("PDF", dialogClickListener)
                        .setNegativeButton("E-mail", dialogClickListener).show();


            }
        });

    }
}

