package com.admms.tcc.oasis.controller.prt78_325;

import android.app.Activity;
import android.content.Context;
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
import com.admms.tcc.oasis.controller.EstabelecimentoController;
import com.admms.tcc.oasis.controller.ItemAvaliacaoController;
import com.admms.tcc.oasis.controller.LegislacaoController;
import com.admms.tcc.oasis.controller.PlanoAcaoController;
import com.admms.tcc.oasis.controller.UserInterfaceController;
import com.admms.tcc.oasis.dao.EstabelecimentoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.Legislacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.io.File;

public class Prt78_325Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt78_325);

        final Context context = Prt78_325Activity.this;

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

        PlanoAcao planoAcao = new PlanoAcao();
        planoAcao.setCodigo(bundle.getInt("codigoPlanoAcao"));
        planoAcao = PlanoAcaoController.buscarPlanoAcaoPorID(planoAcao, context);

        Legislacao legislacao = new Legislacao();
        legislacao.setCodigo(planoAcao.getLegislacao().getCodigo());
        legislacao = LegislacaoController.buscarLegislacaoPorID(legislacao, context);

        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_ARMAZENAMENTO,context).size() == legislacao.getNumeroPerguntasArmazenamento()) {
            armazenamento.setBackgroundResource(R.drawable.armazenamento_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_DOCUMENTACAO,context).size() == legislacao.getNumeroPerguntasDocumentacao()) {
            documentacao.setBackgroundResource(R.drawable.documentacao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_EDIFICACAO,context).size() == legislacao.getNumeroPerguntasEdificacao()) {
            edificacao.setBackgroundResource(R.drawable.edificacao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_EXPOSICAO,context).size() == legislacao.getNumeroPerguntasExposicao()) {
            exposicao.setBackgroundResource(R.drawable.exposicao_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_HIGIENE,context).size() == legislacao.getNumeroPerguntasHigiene()) {
            higiene.setBackgroundResource(R.drawable.higiene_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_INGREDIENTES,context).size() == legislacao.getNumeroPerguntasIngredientes()) {
            ingredientes.setBackgroundResource(R.drawable.ingredientes_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_MANIPULADORES,context).size() == legislacao.getNumeroPerguntasManipuladores()) {
            manipulador.setBackgroundResource(R.drawable.manipulador_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_PREPARO,context).size() == legislacao.getNumeroPerguntasPreparo()) {
            preparo.setBackgroundResource(R.drawable.preparo_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_RESIDUOS,context).size() == legislacao.getNumeroPerguntasResiduos()) {
            residuos.setBackgroundResource(R.drawable.residuos_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_RESPONSAVEL,context).size() == legislacao.getNumeroPerguntasResponsavel()) {
            responsavel.setBackgroundResource(R.drawable.responsavel_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_SANEAMENTO,context).size() == legislacao.getNumeroPerguntasSaneamento()) {
            saneamento.setBackgroundResource(R.drawable.saneamento_check);
        }
        if (ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao, Constantes.AREA_AVALIADA_VETORES,context).size() == legislacao.getNumeroPerguntasVetores()) {
            vetores.setBackgroundResource(R.drawable.vetores_check);
        }

        armazenamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(context, Prt78_325_ArmazenamentoActivity.class);
                intentVaiProArmazenamento.putExtras(bundle);
                startActivity(intentVaiProArmazenamento);
            }
        });

        documentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraDocumentacao = new Intent(context, Prt78_325_DocumentacaoActivity.class);
                intentVaiPraDocumentacao.putExtras(bundle);
                startActivity(intentVaiPraDocumentacao);
            }
        });

        edificacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraEdificacao = new Intent(context, Prt78_325_EdificacaoActivity.class);
                intentVaiPraEdificacao.putExtras(bundle);
                startActivity(intentVaiPraEdificacao);
            }
        });

        exposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraExposicao = new Intent(context, Prt78_325_ExposicaoActivity.class);
                intentVaiPraExposicao.putExtras(bundle);
                startActivity(intentVaiPraExposicao);
            }
        });

        higiene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraHigiene = new Intent(context, Prt78_325_HigieneActivity.class);
                intentVaiPraHigiene.putExtras(bundle);
                startActivity(intentVaiPraHigiene);
            }
        });
        ingredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraIngredientes = new Intent(context, Prt78_325_IngredientesActivity.class);
                intentVaiPraIngredientes.putExtras(bundle);
                startActivity(intentVaiPraIngredientes);
            }
        });
        manipulador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraManipulador = new Intent(context, Prt78_325_ManipuladoresActivity.class);
                intentVaiPraManipulador.putExtras(bundle);
                startActivity(intentVaiPraManipulador);
            }
        });
        vetores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraVetores = new Intent(context, Prt78_325_VetoresActivity.class);
                intentVaiPraVetores.putExtras(bundle);
                startActivity(intentVaiPraVetores);
            }
        });
        preparo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraPreparo = new Intent(context, Prt78_325_PreparoActivity.class);
                intentVaiPraPreparo.putExtras(bundle);
                startActivity(intentVaiPraPreparo);
            }
        });
        residuos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResiduos = new Intent(context, Prt78_325_ResiduosActivity.class);
                intentVaiPraResiduos.putExtras(bundle);
                startActivity(intentVaiPraResiduos);
            }
        });
        responsavel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraResponsavel = new Intent(context, Prt78_325_ResponsavelActivity.class);
                intentVaiPraResponsavel.putExtras(bundle);
                startActivity(intentVaiPraResponsavel);
            }
        });
        saneamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiPraSaneamento = new Intent(context, Prt78_325_SaneamentoActivity.class);
                intentVaiPraSaneamento.putExtras(bundle);
                startActivity(intentVaiPraSaneamento);
            }
        });
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserInterfaceController.gerarRelatorio(bundle, context);
            }
        });

    }
}

