package com.admms.tcc.oasis.controller.prt2619;

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
import com.admms.tcc.oasis.controller.prt78_325.Prt78_325_ExposicaoActivity;
import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.io.File;


public class Prt2619Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt2619);

        ImageButton armazenamento = (ImageButton) findViewById(R.id.prt2619_armazenamento_prt2619);
        ImageButton documentacao = (ImageButton) findViewById(R.id.prt2619_documentacao_prt2619);
        ImageButton edificacao = (ImageButton) findViewById(R.id.prt2619_edificacao_prt2619);
        ImageButton exposicao = (ImageButton) findViewById(R.id.prt2619_exposicao_prt2619);
        ImageButton higiene = (ImageButton) findViewById(R.id.prt2619_higiene_prt2619);
        ImageButton ingredientes = (ImageButton) findViewById(R.id.prt2619_ingredientes_prt2619);
        ImageButton manipulador = (ImageButton) findViewById(R.id.prt2619_manipulador_prt2619);
        ImageButton vetores = (ImageButton) findViewById(R.id.prt2619_vetores_prt2619);
        ImageButton preparo = (ImageButton) findViewById(R.id.prt2619_preparo_prt2619);
        ImageButton residuos = (ImageButton) findViewById(R.id.prt2619_residuos_prt2619);
        ImageButton responsavel = (ImageButton) findViewById(R.id.prt2619_responsavel_prt2619);
        ImageButton saneamento = (ImageButton) findViewById(R.id.prt2619_saneamento_prt2619);
        ImageButton qualidade = (ImageButton) findViewById(R.id.prt2619_qualidade_prt2619);
        ImageButton salvar = (ImageButton) findViewById(R.id.prt2619_gerarRelatorio_prt2619);

        final Bundle bundle = getIntent().getExtras();

        PlanoAcao planoAcao = new PlanoAcao();
        planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
        planoAcao = PlanoAcaoController.buscarPlanoAcaoPorID(planoAcao, Prt2619Activity.this);

        Legislacao legislacao = new Legislacao();
        legislacao.setCodigo(planoAcao.getLegislacao().getCodigo());
        legislacao = LegislacaoController.buscarLegislacaoPorID(legislacao, Prt2619Activity.this);

        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_ARMAZENAMENTO,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasArmazenamento()) {
            armazenamento.setBackgroundResource(R.drawable.armazenamento_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_DOCUMENTACAO,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasDocumentacao()) {
            documentacao.setBackgroundResource(R.drawable.documentacao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_EDIFICACAO,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasEdificacao()) {
            edificacao.setBackgroundResource(R.drawable.edificacao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_EXPOSICAO,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasExposicao()) {
            exposicao.setBackgroundResource(R.drawable.exposicao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_HIGIENE,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasHigiene()) {
            higiene.setBackgroundResource(R.drawable.higiene_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_INGREDIENTES,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasIngredientes()) {
            ingredientes.setBackgroundResource(R.drawable.ingredientes_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_MANIPULADORES,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasManipuladores()) {
            manipulador.setBackgroundResource(R.drawable.manipulador_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_PREPARO,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasPreparo()) {
            preparo.setBackgroundResource(R.drawable.preparo_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_QUALIDADE,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasQualidade()) {
            qualidade.setBackgroundResource(R.drawable.qualidade_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_RESIDUOS,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasResiduos()) {
            residuos.setBackgroundResource(R.drawable.residuos_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_RESPONSAVEL,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasResponsavel()) {
            responsavel.setBackgroundResource(R.drawable.responsavel_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_SANEAMENTO,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasSaneamento()) {
            saneamento.setBackgroundResource(R.drawable.saneamento_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_VETORES,Prt2619Activity.this).size() == legislacao.getNumeroPerguntasVetores()) {
            vetores.setBackgroundResource(R.drawable.vetores_check);
        }

        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Prt2619Activity.this, Prt2619_ArmazenamentoActivity.class);
                intentVaiProArmazenamento.putExtras(bundle);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(Prt2619Activity.this, Prt2619_DocumentacaoActivity.class);
                intentVaiPraDocumentacao.putExtras(bundle);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(Prt2619Activity.this, Prt2619_EdificacaoActivity.class);
                intentVaiPraEdificacao.putExtras(bundle);
                startActivity(intentVaiPraEdificacao);
            }
        });

        exposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraExposicao = new Intent(Prt2619Activity.this, Prt78_325_ExposicaoActivity.class);
                intentVaiPraExposicao.putExtras(bundle);
                startActivity(intentVaiPraExposicao);
            }
        });

        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(Prt2619Activity.this, Prt2619_HigieneActivity.class);
                intentVaiPraHigiene.putExtras(bundle);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(Prt2619Activity.this, Prt2619_IngredientesActivity.class);
                intentVaiPraIngredientes.putExtras(bundle);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(Prt2619Activity.this, Prt2619_ManipuladoresActivity.class);
                intentVaiPraManipulador.putExtras(bundle);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(Prt2619Activity.this, Prt2619_VetoresActivity.class);
                intentVaiPraVetores.putExtras(bundle);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(Prt2619Activity.this, Prt2619_PreparoActivity.class);
                intentVaiPraPreparo.putExtras(bundle);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(Prt2619Activity.this, Prt2619_ResiduosActivity.class);
                intentVaiPraResiduos.putExtras(bundle);
                startActivity(intentVaiPraResiduos);
            }
        });

        responsavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResponsavel = new Intent(Prt2619Activity.this, Prt2619_ResponsavelActivity.class);
                intentVaiPraResponsavel.putExtras(bundle);
                startActivity(intentVaiPraResponsavel);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(Prt2619Activity.this, Prt2619_SaneamentoActivity.class);
                intentVaiPraSaneamento.putExtras(bundle);
                startActivity(intentVaiPraSaneamento);
            }
        });

        qualidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraQualidade = new Intent(Prt2619Activity.this, Prt2619_QualidadeActivity.class);
                intentVaiPraQualidade.putExtras(bundle);
                startActivity(intentVaiPraQualidade);
            }
        });
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcaoDAO planoAcaoDAO = new PlanoAcaoDAO(Prt2619Activity.this);
                EstabelecimentoDAO estabelecimentoDAO = new EstabelecimentoDAO(Prt2619Activity.this);
                PlanoAcao planoAcao = new PlanoAcao();
                final Estabelecimento estabelecimento = new Estabelecimento();

                Bundle bundle = getIntent().getExtras();
                planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
                planoAcao = planoAcaoDAO.buscarPorID(planoAcao);
                final String nomeArquivo = planoAcao.getNomeArquivo();
                estabelecimento.setCodigo(planoAcao.getEstabelecimento().getCodigo());
                ArquivoController.criaPlanoAcaoPDF(Prt2619Activity.this, planoAcao);
                Toast.makeText(Prt2619Activity.this, "Documento gerado com sucesso", Toast.LENGTH_SHORT).show();

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

                AlertDialog.Builder builder = new AlertDialog.Builder(Prt2619Activity.this);
                builder.setMessage("Você deseja visualizar o relatório em PDF ou enviá-lo por email?").setPositiveButton("PDF", dialogClickListener)
                        .setNegativeButton("E-mail", dialogClickListener).show();


            }
        });
    }
}
