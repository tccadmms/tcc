package com.admms.tcc.oasis.controller.prt2619;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.controller.ItemAvaliacaoController;
import com.admms.tcc.oasis.controller.principal.ArquivoController;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Prt2619_EdificacaoActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int REQUEST_IMAGE_PICTURE = 1;
    private static final int NUMERO_PERGUNTAS = 88;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt2619__edificacao);

        Bundle bundle = getIntent().getExtras();
        final int codigoPlanoAcao = bundle.getInt("codigoPlanoAcao");

        itemAvaliacao = ItemAvaliacaoController.criaItemAvaliacao(codigoPlanoAcao, itemAvaliacao, Constantes.AREA_AVALIADA_EDIFICACAO,this);

        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.edificacao_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p1_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p1_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p1_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p1);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p1);

                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta1);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.edificacao_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p2_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p2_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p2_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p2);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p2);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta2);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.edificacao_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p3_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p3_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p3_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p3);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p3);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta3);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.edificacao_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p4_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p4_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p4_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p4);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p4);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta4);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.edificacao_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p5_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p5_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p5_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p5);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p5);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta5);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.edificacao_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p6_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p6_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p6_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p6);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p6);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta6);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.edificacao_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p7_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p7_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p7_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p7);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p7);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta7);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.edificacao_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p8_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p8_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p8_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p8);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p8);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta8);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p9 = (RadioGroup) findViewById(R.id.edificacao_p9);


        r_p9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p9_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p9_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p9_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p9);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p9);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta9);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p10 = (RadioGroup) findViewById(R.id.edificacao_p10);


        r_p10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p10_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p10_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p10_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p10);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p10);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta10);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p11 = (RadioGroup) findViewById(R.id.edificacao_p11);


        r_p11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p11_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p11_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p11_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p11);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p11);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta11);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p12 = (RadioGroup) findViewById(R.id.edificacao_p12);


        r_p12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p12_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p12_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p12_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p12);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p12);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta12);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p13 = (RadioGroup) findViewById(R.id.edificacao_p13);


        r_p13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p13_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p13_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p13_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p13);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p13);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta13);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p14 = (RadioGroup) findViewById(R.id.edificacao_p14);


        r_p14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p14_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p14_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p14_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p14);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p14);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta14);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p15 = (RadioGroup) findViewById(R.id.edificacao_p15);


        r_p15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p15_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p15_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p15_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p15);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p15);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta15);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p16 = (RadioGroup) findViewById(R.id.edificacao_p16);


        r_p16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p16_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p16_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p16_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p16);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p16);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta16);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p17 = (RadioGroup) findViewById(R.id.edificacao_p17);


        r_p17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p17_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p17_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p17_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p17);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p17);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta17);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p18 = (RadioGroup) findViewById(R.id.edificacao_p18);


        r_p18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p18_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p18_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p18_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p18);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p18);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta18);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });


        RadioGroup r_p19 = (RadioGroup) findViewById(R.id.edificacao_p19);


        r_p19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p19_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p19_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p19_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p19);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p19);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta19);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p20 = (RadioGroup) findViewById(R.id.edificacao_p20);


        r_p20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p20_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p20_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p20_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p20);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p20);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta20);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p21 = (RadioGroup) findViewById(R.id.edificacao_p21);


        r_p21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p21_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p21_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p21_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p21);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p21);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta21);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p22 = (RadioGroup) findViewById(R.id.edificacao_p22);


        r_p22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p22_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p22_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p22_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p22);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p22);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta22);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p23 = (RadioGroup) findViewById(R.id.edificacao_p23);


        r_p23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p23_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p23_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p23_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p23);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p23);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta23);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p24 = (RadioGroup) findViewById(R.id.edificacao_p24);


        r_p24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p24_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p24_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p24_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p24);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p24);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta24);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p25 = (RadioGroup) findViewById(R.id.edificacao_p25);


        r_p25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p25_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p25_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p25_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p25);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p25);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta25);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p26 = (RadioGroup) findViewById(R.id.edificacao_p26);


        r_p26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p26_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p26_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p26_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p26);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p26);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta26);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p27 = (RadioGroup) findViewById(R.id.edificacao_p27);


        r_p27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p27_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p27_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p27_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p27);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p27);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta27);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p28 = (RadioGroup) findViewById(R.id.edificacao_p28);


        r_p28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p28_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p28_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p28_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p28);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p28);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta28);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p29 = (RadioGroup) findViewById(R.id.edificacao_p29);


        r_p29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p29_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p29_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p29_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p29);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p29);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta29);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p30 = (RadioGroup) findViewById(R.id.edificacao_p30);


        r_p30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p30_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p30_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p30_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p30);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p30);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta30);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p31 = (RadioGroup) findViewById(R.id.edificacao_p31);


        r_p31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p31_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p31_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p31_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p31);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p31);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta31);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p32 = (RadioGroup) findViewById(R.id.edificacao_p32);


        r_p32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p32_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p32_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p32_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p32);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p32);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta32);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p33 = (RadioGroup) findViewById(R.id.edificacao_p33);


        r_p33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p33_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p33_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p33_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p33);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p33);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta33);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p34 = (RadioGroup) findViewById(R.id.edificacao_p34);


        r_p34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p34_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p34_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p34_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p34);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p34);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta34);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p35 = (RadioGroup) findViewById(R.id.edificacao_p35);


        r_p35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p35_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p35_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p35_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p35);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p35);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta35);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p36 = (RadioGroup) findViewById(R.id.edificacao_p36);


        r_p36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p36_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p36_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p36_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p36);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p36);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta36);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p37 = (RadioGroup) findViewById(R.id.edificacao_p37);


        r_p37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p37_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p37_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p37_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p37);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p37);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta37);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p38 = (RadioGroup) findViewById(R.id.edificacao_p38);


        r_p38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p38_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p38_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p38_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p38);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p38);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta38);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p39 = (RadioGroup) findViewById(R.id.edificacao_p39);


        r_p39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p39_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p39_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p39_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p39);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p39);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta39);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p40 = (RadioGroup) findViewById(R.id.edificacao_p40);


        r_p40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p40_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p40_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p40_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p40);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p40);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta40);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p41 = (RadioGroup) findViewById(R.id.edificacao_p41);


        r_p41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p41_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p41_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p41_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p41);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p41);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta41);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p42 = (RadioGroup) findViewById(R.id.edificacao_p42);


        r_p42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p42_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p42_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p42_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p42);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p42);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta42);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p43 = (RadioGroup) findViewById(R.id.edificacao_p43);


        r_p43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p43_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p43_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p43_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p43);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p43);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta43);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p44 = (RadioGroup) findViewById(R.id.edificacao_p44);


        r_p44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p44_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p44_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p44_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p44);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p44);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta44);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p45 = (RadioGroup) findViewById(R.id.edificacao_p45);


        r_p45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p45_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p45_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p45_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p45);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p45);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta45);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p46 = (RadioGroup) findViewById(R.id.edificacao_p46);


        r_p46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p46_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p46_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p46_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p46);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p46);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta46);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p47 = (RadioGroup) findViewById(R.id.edificacao_p47);


        r_p47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p47_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p47_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p47_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p47);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p47);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta47);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p48 = (RadioGroup) findViewById(R.id.edificacao_p48);


        r_p48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p48_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p48_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p48_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p48);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p48);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta48);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p49 = (RadioGroup) findViewById(R.id.edificacao_p49);


        r_p49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p49_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p49_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p49_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p49);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p49);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta49);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p50 = (RadioGroup) findViewById(R.id.edificacao_p50);


        r_p50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p50_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p50_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p50_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p50);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p50);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta50);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p51 = (RadioGroup) findViewById(R.id.edificacao_p51);


        r_p51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p51_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p51_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p51_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p51);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p51);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta51);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p52 = (RadioGroup) findViewById(R.id.edificacao_p52);


        r_p52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p52_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p52_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p52_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p52);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p52);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta52);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p53 = (RadioGroup) findViewById(R.id.edificacao_p53);


        r_p53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p53_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p53_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p53_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p53);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p53);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta53);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p54 = (RadioGroup) findViewById(R.id.edificacao_p54);


        r_p54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p54_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p54_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p54_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p54);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p54);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta54);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p55 = (RadioGroup) findViewById(R.id.edificacao_p55);


        r_p55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p55_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p55_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p55_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p55);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p55);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta55);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p56 = (RadioGroup) findViewById(R.id.edificacao_p56);


        r_p56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p56_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p56_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p56_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p56);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p56);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta56);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p57 = (RadioGroup) findViewById(R.id.edificacao_p57);


        r_p57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p57_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p57_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p57_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p57);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p57);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta57);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p58 = (RadioGroup) findViewById(R.id.edificacao_p58);


        r_p58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p58_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p58_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p58_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p58);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p58);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta58);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p59 = (RadioGroup) findViewById(R.id.edificacao_p59);


        r_p59.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p59_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p59_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p59_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p59);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p59);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta59);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p60 = (RadioGroup) findViewById(R.id.edificacao_p60);


        r_p60.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p60_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p60_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p60_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p60);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p60);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta60);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });


        RadioGroup r_p61 = (RadioGroup) findViewById(R.id.edificacao_p61);


        r_p61.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p61_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p61_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p61_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p61);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p61);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta61);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p62 = (RadioGroup) findViewById(R.id.edificacao_p62);


        r_p62.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p62_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p62_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p62_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p62);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p62);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta62);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p63 = (RadioGroup) findViewById(R.id.edificacao_p63);


        r_p63.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p63_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p63_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p63_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p63);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p63);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta63);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p64 = (RadioGroup) findViewById(R.id.edificacao_p64);


        r_p64.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p64_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p64_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p64_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p64);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p64);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta64);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p65 = (RadioGroup) findViewById(R.id.edificacao_p65);


        r_p65.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p65_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p65_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p65_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p65);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p65);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta65);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p66 = (RadioGroup) findViewById(R.id.edificacao_p66);


        r_p66.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p66_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p66_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p66_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p66);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p66);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta66);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p67 = (RadioGroup) findViewById(R.id.edificacao_p67);


        r_p67.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p67_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p67_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p67_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p67);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p67);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta67);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p68 = (RadioGroup) findViewById(R.id.edificacao_p68);


        r_p68.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p68_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p68_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p68_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p68);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p68);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta68);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p69 = (RadioGroup) findViewById(R.id.edificacao_p69);


        r_p69.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p69_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p69_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p69_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p69);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p69);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta69);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p70 = (RadioGroup) findViewById(R.id.edificacao_p70);


        r_p70.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p70_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p70_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p70_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p70);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p70);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta70);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p71 = (RadioGroup) findViewById(R.id.edificacao_p71);


        r_p71.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p71_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p71_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p71_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p71);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p71);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta71);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p72 = (RadioGroup) findViewById(R.id.edificacao_p72);


        r_p72.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p72_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p72_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p72_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p72);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p72);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta72);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p73 = (RadioGroup) findViewById(R.id.edificacao_p73);


        r_p73.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p73_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p73_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p73_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p73);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p73);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta73);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p74 = (RadioGroup) findViewById(R.id.edificacao_p74);


        r_p74.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p74_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p74_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p74_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p74);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p74);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta74);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p75 = (RadioGroup) findViewById(R.id.edificacao_p75);


        r_p75.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p75_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p75_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p75_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p75);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p75);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta75);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p76 = (RadioGroup) findViewById(R.id.edificacao_p76);


        r_p76.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p76_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p76_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p76_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p76);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p76);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta76);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p77 = (RadioGroup) findViewById(R.id.edificacao_p77);


        r_p77.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p77_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p77_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p77_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p77);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p77);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta77);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p78 = (RadioGroup) findViewById(R.id.edificacao_p78);


        r_p78.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p78_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p78_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p78_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p78);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p78);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta78);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p79 = (RadioGroup) findViewById(R.id.edificacao_p79);


        r_p79.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p79_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p79_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p79_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p79);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p79);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta79);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p80 = (RadioGroup) findViewById(R.id.edificacao_p80);


        r_p80.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p80_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p80_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p80_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p80);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p80);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta80);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p81 = (RadioGroup) findViewById(R.id.edificacao_p81);


        r_p81.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p81_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p81_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p81_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p81);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p81);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta81);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p82 = (RadioGroup) findViewById(R.id.edificacao_p82);


        r_p82.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p82_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p82_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p82_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p82);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p82);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta82);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p83 = (RadioGroup) findViewById(R.id.edificacao_p83);


        r_p83.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p83_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p83_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p83_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p83);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p83);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta83);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p84 = (RadioGroup) findViewById(R.id.edificacao_p84);


        r_p84.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p84_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p84_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p84_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p84);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p84);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta84);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p85 = (RadioGroup) findViewById(R.id.edificacao_p85);


        r_p85.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p85_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p85_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p85_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p85);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p85);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta85);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p86 = (RadioGroup) findViewById(R.id.edificacao_p86);


        r_p86.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p86_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p86_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p86_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p86);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p86);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta86);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p87 = (RadioGroup) findViewById(R.id.edificacao_p87);


        r_p87.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p87_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p87_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p87_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p87);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p87);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta87);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        RadioGroup r_p88 = (RadioGroup) findViewById(R.id.edificacao_p88);


        r_p88.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.edificacao_p88_na);
                RadioButton ad = (RadioButton) findViewById(R.id.edificacao_p88_ad);
                RadioButton in = (RadioButton) findViewById(R.id.edificacao_p88_in);

                ImageButton foto = (ImageButton) findViewById(R.id.edificacao_foto_p88);
                ImageButton descricao = (ImageButton) findViewById(R.id.edificacao_descricao_p88);


                TextView pergunta = (TextView) findViewById(R.id.edificacao_pergunta88);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }
        });

        ImageButton edificacaoSalvar = (ImageButton) findViewById(R.id.edificacao_btnSalvar);
        edificacaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcao planoAcao = new PlanoAcao();
                planoAcao.setCodigo(codigoPlanoAcao);

                List<ItemAvaliacao> listaItens = ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao,Constantes.AREA_AVALIADA_EDIFICACAO, Prt2619_EdificacaoActivity.this);

                if (NUMERO_PERGUNTAS != listaItens.size()) {
                    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case DialogInterface.BUTTON_POSITIVE:
                                    Intent intentVaiProEdificacao = new Intent(Prt2619_EdificacaoActivity.this, Prt2619Activity.class);
                                    intentVaiProEdificacao.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                                    startActivity(intentVaiProEdificacao);
                                    break;

                                case DialogInterface.BUTTON_NEGATIVE:
                                    //Nao faz nada
                                    break;
                            }
                        }
                    };

                    AlertDialog.Builder builder = new AlertDialog.Builder(Prt2619_EdificacaoActivity.this);
                    builder.setMessage("Você ainda não respondeu todas as perguntas. Deseja prosseguir?").setPositiveButton("Sim", dialogClickListener)
                            .setNegativeButton("Voltar", dialogClickListener).show();
                } else {
                    Intent intentVaiProEdificacao = new Intent(Prt2619_EdificacaoActivity.this, Prt2619Activity.class);
                    intentVaiProEdificacao.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                    startActivity(intentVaiProEdificacao);
                }
            }
        });
    }

    private void radioButtonHandler(RadioButton naoAplica, RadioButton adequado, RadioButton inadequado, ImageButton foto, ImageButton descricao, final ItemAvaliacao itemAvaliacao) {

        if (inadequado.isChecked()) {
            foto.setVisibility(View.VISIBLE);
            descricao.setVisibility(View.VISIBLE);
            foto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tirarFotoIntent(itemAvaliacao);
                }
            });
            descricao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mostraJanelaDescricao(itemAvaliacao);
                }
            });
            itemAvaliacao.setConformidade(Constantes.CONFORMIDADE_INADEQUADA);
        } else if (naoAplica.isChecked()) {
            foto.setVisibility(View.INVISIBLE);
            descricao.setVisibility(View.INVISIBLE);
            itemAvaliacao.setConformidade(Constantes.CONFORMIDADE_NA);
        } else if (adequado.isChecked()) {
            foto.setVisibility(View.INVISIBLE);
            descricao.setVisibility(View.INVISIBLE);
            itemAvaliacao.setConformidade(Constantes.CONFORMIDADE_ADEQUADA);
        }
    }

    private void tirarFotoIntent(ItemAvaliacao itemAvaliacao) {
        Intent vaiPraCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = "DBP_" + timeStamp + ".png";
        itemAvaliacao.setFoto(fileName);

        //Criação de Pasta
        File imagesFolder = ArquivoController.criaPastaFotos();

        File image = new File(imagesFolder, fileName);
        try {
            image.createNewFile();
            Uri uriSavedImage = Uri.fromFile(image);

            vaiPraCamera.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);

            if (vaiPraCamera.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(vaiPraCamera, REQUEST_IMAGE_PICTURE);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
            }

        } catch (Exception e) {
            Log.i("fail", "creating photofile failed for " + fileName + "path " + image.getAbsolutePath());
        }
    }

    protected void mostraJanelaDescricao(final ItemAvaliacao itemAvaliacao) {

        LayoutInflater layoutInflater = LayoutInflater.from(Prt2619_EdificacaoActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Prt2619_EdificacaoActivity.this);
        alertDialogBuilder.setTitle("Descrição");
        alertDialogBuilder.setIcon(R.drawable.ic_logo);
        alertDialogBuilder.setView(promptView);


        final EditText descricao = (EditText) promptView.findViewById(R.id.descricao);

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        itemAvaliacao.setDescricao(descricao.getText().toString());
                        ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_EdificacaoActivity.this);
                    }
                })
                .setNegativeButton("Cancelar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });


        AlertDialog alert = alertDialogBuilder.create();
        alert.show();

    }

}



