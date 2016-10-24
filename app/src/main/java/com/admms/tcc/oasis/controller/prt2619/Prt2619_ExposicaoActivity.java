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
import com.admms.tcc.oasis.controller.principal.ArquivoHandler;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.ItemAvaliacao;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prt2619_ExposicaoActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int REQUEST_IMAGE_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt2619__exposicao);

        Bundle bundle = getIntent().getExtras();
        final int codigoPlanoAcao = bundle.getInt("codigoPlanoAcao");

        itemAvaliacao = ItemAvaliacaoController.criaItemAvaliacao(codigoPlanoAcao, itemAvaliacao, Constantes.AREA_AVALIADA_EXPOSICAO,this);

        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.exposicao_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p1_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p1_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p1_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p1);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p1);

                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta1);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.exposicao_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p2_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p2_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p2_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p2);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p2);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta2);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.exposicao_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p3_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p3_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p3_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p3);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p3);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta3);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.exposicao_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p4_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p4_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p4_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p4);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p4);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta4);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.exposicao_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p5_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p5_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p5_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p5);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p5);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta5);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.exposicao_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p6_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p6_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p6_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p6);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p6);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta6);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.exposicao_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p7_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p7_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p7_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p7);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p7);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta7);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.exposicao_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p8_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p8_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p8_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p8);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p8);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta8);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p9 = (RadioGroup) findViewById(R.id.exposicao_p9);


        r_p9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p9_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p9_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p9_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p9);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p9);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta9);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p10 = (RadioGroup) findViewById(R.id.exposicao_p10);


        r_p10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p10_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p10_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p10_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p10);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p10);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta10);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p11 = (RadioGroup) findViewById(R.id.exposicao_p11);


        r_p11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p11_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p11_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p11_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p11);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p11);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta11);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p12 = (RadioGroup) findViewById(R.id.exposicao_p12);


        r_p12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p12_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p12_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p12_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p12);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p12);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta12);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p13 = (RadioGroup) findViewById(R.id.exposicao_p13);


        r_p13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p13_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p13_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p13_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p13);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p13);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta13);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p14 = (RadioGroup) findViewById(R.id.exposicao_p14);


        r_p14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p14_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p14_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p14_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p14);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p14);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta14);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p15 = (RadioGroup) findViewById(R.id.exposicao_p15);


        r_p15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p15_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p15_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p15_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p15);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p15);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta15);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p16 = (RadioGroup) findViewById(R.id.exposicao_p16);


        r_p16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p16_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p16_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p16_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p16);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p16);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta16);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p17 = (RadioGroup) findViewById(R.id.exposicao_p17);


        r_p17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p17_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p17_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p17_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p17);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p17);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta17);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p18 = (RadioGroup) findViewById(R.id.exposicao_p18);


        r_p18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p18_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p18_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p18_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p18);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p18);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta18);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });


        RadioGroup r_p19 = (RadioGroup) findViewById(R.id.exposicao_p19);


        r_p19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p19_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p19_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p19_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p19);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p19);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta19);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p20 = (RadioGroup) findViewById(R.id.exposicao_p20);


        r_p20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p20_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p20_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p20_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p20);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p20);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta20);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p21 = (RadioGroup) findViewById(R.id.exposicao_p21);


        r_p21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p21_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p21_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p21_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p21);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p21);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta21);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p22 = (RadioGroup) findViewById(R.id.exposicao_p22);


        r_p22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p22_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p22_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p22_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p22);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p22);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta22);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p23 = (RadioGroup) findViewById(R.id.exposicao_p23);


        r_p23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p23_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p23_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p23_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p23);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p23);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta23);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p24 = (RadioGroup) findViewById(R.id.exposicao_p24);


        r_p24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p24_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p24_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p24_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p24);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p24);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta24);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p25 = (RadioGroup) findViewById(R.id.exposicao_p25);


        r_p25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p25_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p25_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p25_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p25);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p25);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta25);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p26 = (RadioGroup) findViewById(R.id.exposicao_p26);


        r_p26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p26_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p26_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p26_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p26);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p26);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta26);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p27 = (RadioGroup) findViewById(R.id.exposicao_p27);


        r_p27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p27_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p27_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p27_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p27);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p27);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta27);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p28 = (RadioGroup) findViewById(R.id.exposicao_p28);


        r_p28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p28_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p28_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p28_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p28);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p28);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta28);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p29 = (RadioGroup) findViewById(R.id.exposicao_p29);


        r_p29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p29_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p29_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p29_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p29);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p29);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta29);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p30 = (RadioGroup) findViewById(R.id.exposicao_p30);


        r_p30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p30_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p30_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p30_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p30);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p30);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta30);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p31 = (RadioGroup) findViewById(R.id.exposicao_p31);


        r_p31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p31_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p31_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p31_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p31);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p31);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta31);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p32 = (RadioGroup) findViewById(R.id.exposicao_p32);


        r_p32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p32_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p32_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p32_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p32);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p32);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta32);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p33 = (RadioGroup) findViewById(R.id.exposicao_p33);


        r_p33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p33_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p33_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p33_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p33);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p33);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta33);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p34 = (RadioGroup) findViewById(R.id.exposicao_p34);


        r_p34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p34_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p34_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p34_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p34);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p34);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta34);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p35 = (RadioGroup) findViewById(R.id.exposicao_p35);


        r_p35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p35_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p35_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p35_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p35);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p35);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta35);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p36 = (RadioGroup) findViewById(R.id.exposicao_p36);


        r_p36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p36_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p36_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p36_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p36);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p36);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta36);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p37 = (RadioGroup) findViewById(R.id.exposicao_p37);


        r_p37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p37_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p37_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p37_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p37);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p37);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta37);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p38 = (RadioGroup) findViewById(R.id.exposicao_p38);


        r_p38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p38_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p38_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p38_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p38);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p38);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta38);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });

        RadioGroup r_p39 = (RadioGroup) findViewById(R.id.exposicao_p39);


        r_p39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.exposicao_p39_na);
                RadioButton ad = (RadioButton) findViewById(R.id.exposicao_p39_ad);
                RadioButton in = (RadioButton) findViewById(R.id.exposicao_p39_in);

                ImageButton foto = (ImageButton) findViewById(R.id.exposicao_foto_p39);
                ImageButton descricao = (ImageButton) findViewById(R.id.exposicao_descricao_p39);


                TextView pergunta = (TextView) findViewById(R.id.exposicao_pergunta39);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }
        });


        ImageButton exposicaoSalvar = (ImageButton) findViewById(R.id.exposicao_btnSalvar);
        exposicaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProExposicao = new Intent(Prt2619_ExposicaoActivity.this, Prt2619Activity.class);
                intentVaiProExposicao.putExtra("codigoPlanoAcao",codigoPlanoAcao);
                startActivity(intentVaiProExposicao);
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
        File imagesFolder = ArquivoHandler.criaPastaFotos();

        File image = new File(imagesFolder, fileName);
        try {
            image.createNewFile();
            Uri uriSavedImage = Uri.fromFile(image);

            vaiPraCamera.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);

            if (vaiPraCamera.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(vaiPraCamera, REQUEST_IMAGE_PICTURE);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
            }

        } catch (Exception e) {
            Log.i("fail", "creating photofile failed for " + fileName + "path " + image.getAbsolutePath());
        }
    }

    protected void mostraJanelaDescricao(final ItemAvaliacao itemAvaliacao) {

        LayoutInflater layoutInflater = LayoutInflater.from(Prt2619_ExposicaoActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Prt2619_ExposicaoActivity.this);
        alertDialogBuilder.setTitle("Descrição");
        alertDialogBuilder.setIcon(R.drawable.ic_logo);
        alertDialogBuilder.setView(promptView);


        final EditText descricao = (EditText) promptView.findViewById(R.id.descricao);

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        itemAvaliacao.setDescricao(descricao.getText().toString());
                        ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ExposicaoActivity.this);
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





