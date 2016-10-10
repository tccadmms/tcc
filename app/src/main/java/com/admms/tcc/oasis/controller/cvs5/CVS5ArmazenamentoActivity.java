package com.admms.tcc.oasis.controller.cvs5;

import android.app.Activity;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
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
import com.admms.tcc.oasis.controller.principal.ArquivoHandler;
import com.admms.tcc.oasis.dao.ItemAvaliacaoDAO;
import com.admms.tcc.oasis.dao.PlanoAcaoDAO;
import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Cvs5ArmazenamentoActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private final ItemAvaliacaoDAO itemAvaliacaoDAO = new ItemAvaliacaoDAO(this);
    private static final int REQUEST_IMAGE_PICTURE = 1;
    private static final String AREA_AVALIADA = "Armazenamento";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvs5_armazenamento);

        Bundle bundle = getIntent().getExtras();
        final int codigoPlanoAcao = bundle.getInt("codigoPlanoAcao");

        criaItemAvaliacao(codigoPlanoAcao);

        final RadioGroup r_p1 = (RadioGroup) findViewById(R.id.armazenamento_p1);

        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p1 = (RadioButton) findViewById(R.id.armazenamento_p1_na);
                RadioButton ad_p1 = (RadioButton) findViewById(R.id.armazenamento_p1_ad);
                RadioButton in_p1 = (RadioButton) findViewById(R.id.armazenamento_p1_in);

                ImageButton foto_p1 = (ImageButton) findViewById(R.id.armazenamento_foto_p1);
                ImageButton descricao_p1 = (ImageButton) findViewById(R.id.armazenamento_descricao_p1);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta1);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p1, ad_p1, in_p1, foto_p1, descricao_p1, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.armazenamento_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p2 = (RadioButton) findViewById(R.id.armazenamento_p2_na);
                RadioButton ad_p2 = (RadioButton) findViewById(R.id.armazenamento_p2_ad);
                RadioButton in_p2 = (RadioButton) findViewById(R.id.armazenamento_p2_in);

                ImageButton foto_p2 = (ImageButton) findViewById(R.id.armazenamento_foto_p2);
                ImageButton descricao_p2 = (ImageButton) findViewById(R.id.armazenamento_descricao_p2);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta2);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p2, ad_p2, in_p2, foto_p2, descricao_p2, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);

            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.armazenamento_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p3 = (RadioButton) findViewById(R.id.armazenamento_p3_na);
                RadioButton ad_p3 = (RadioButton) findViewById(R.id.armazenamento_p3_ad);
                RadioButton in_p3 = (RadioButton) findViewById(R.id.armazenamento_p3_in);

                ImageButton foto_p3 = (ImageButton) findViewById(R.id.armazenamento_foto_p3);
                ImageButton descricao_p3 = (ImageButton) findViewById(R.id.armazenamento_descricao_p3);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta3);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p3, ad_p3, in_p3, foto_p3, descricao_p3, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.armazenamento_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p4 = (RadioButton) findViewById(R.id.armazenamento_p4_na);
                RadioButton ad_p4 = (RadioButton) findViewById(R.id.armazenamento_p4_ad);
                RadioButton in_p4 = (RadioButton) findViewById(R.id.armazenamento_p4_in);

                ImageButton foto_p4 = (ImageButton) findViewById(R.id.armazenamento_foto_p4);
                ImageButton descricao_p4 = (ImageButton) findViewById(R.id.armazenamento_descricao_p4);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta4);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p4, ad_p4, in_p4, foto_p4, descricao_p4, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.armazenamento_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p5 = (RadioButton) findViewById(R.id.armazenamento_p5_na);
                RadioButton ad_p5 = (RadioButton) findViewById(R.id.armazenamento_p5_ad);
                RadioButton in_p5 = (RadioButton) findViewById(R.id.armazenamento_p5_in);

                ImageButton foto_p5 = (ImageButton) findViewById(R.id.armazenamento_foto_p5);
                ImageButton descricao_p5 = (ImageButton) findViewById(R.id.armazenamento_descricao_p5);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta5);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p5, ad_p5, in_p5, foto_p5, descricao_p5, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.armazenamento_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p6 = (RadioButton) findViewById(R.id.armazenamento_p6_na);
                RadioButton ad_p6 = (RadioButton) findViewById(R.id.armazenamento_p6_ad);
                RadioButton in_p6 = (RadioButton) findViewById(R.id.armazenamento_p6_in);

                ImageButton foto_p6 = (ImageButton) findViewById(R.id.armazenamento_foto_p6);
                ImageButton descricao_p6 = (ImageButton) findViewById(R.id.armazenamento_descricao_p6);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta6);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p6, ad_p6, in_p6, foto_p6, descricao_p6, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.armazenamento_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p7 = (RadioButton) findViewById(R.id.armazenamento_p7_na);
                RadioButton ad_p7 = (RadioButton) findViewById(R.id.armazenamento_p7_ad);
                RadioButton in_p7 = (RadioButton) findViewById(R.id.armazenamento_p7_in);

                ImageButton foto_p7 = (ImageButton) findViewById(R.id.armazenamento_foto_p7);
                ImageButton descricao_p7 = (ImageButton) findViewById(R.id.armazenamento_descricao_p7);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta7);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p7, ad_p7, in_p7, foto_p7, descricao_p7, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.armazenamento_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p8 = (RadioButton) findViewById(R.id.armazenamento_p8_na);
                RadioButton ad_p8 = (RadioButton) findViewById(R.id.armazenamento_p8_ad);
                RadioButton in_p8 = (RadioButton) findViewById(R.id.armazenamento_p8_in);

                ImageButton foto_p8 = (ImageButton) findViewById(R.id.armazenamento_foto_p8);
                ImageButton descricao_p8 = (ImageButton) findViewById(R.id.armazenamento_descricao_p8);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta8);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p8, ad_p8, in_p8, foto_p8, descricao_p8, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p9 = (RadioGroup) findViewById(R.id.armazenamento_p9);


        r_p9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p9 = (RadioButton) findViewById(R.id.armazenamento_p9_na);
                RadioButton ad_p9 = (RadioButton) findViewById(R.id.armazenamento_p9_ad);
                RadioButton in_p9 = (RadioButton) findViewById(R.id.armazenamento_p9_in);

                ImageButton foto_p9 = (ImageButton) findViewById(R.id.armazenamento_foto_p9);
                ImageButton descricao_p9 = (ImageButton) findViewById(R.id.armazenamento_descricao_p9);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta9);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p9, ad_p9, in_p9, foto_p9, descricao_p9, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p10 = (RadioGroup) findViewById(R.id.armazenamento_p10);


        r_p10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p10 = (RadioButton) findViewById(R.id.armazenamento_p10_na);
                RadioButton ad_p10= (RadioButton) findViewById(R.id.armazenamento_p10_ad);
                RadioButton in_p10 = (RadioButton) findViewById(R.id.armazenamento_p10_in);

                ImageButton foto_p10 = (ImageButton) findViewById(R.id.armazenamento_foto_p10);
                ImageButton descricao_p10 = (ImageButton) findViewById(R.id.armazenamento_descricao_p10);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta10);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p10, ad_p10, in_p10, foto_p10, descricao_p10, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p11 = (RadioGroup) findViewById(R.id.armazenamento_p11);


        r_p11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p11 = (RadioButton) findViewById(R.id.armazenamento_p11_na);
                RadioButton ad_p11 = (RadioButton) findViewById(R.id.armazenamento_p11_ad);
                RadioButton in_p11 = (RadioButton) findViewById(R.id.armazenamento_p11_in);

                ImageButton foto_p11 = (ImageButton) findViewById(R.id.armazenamento_foto_p11);
                ImageButton descricao_p11 = (ImageButton) findViewById(R.id.armazenamento_descricao_p11);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta11);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p11, ad_p11, in_p11, foto_p11, descricao_p11, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p12 = (RadioGroup) findViewById(R.id.armazenamento_p12);


        r_p12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p12 = (RadioButton) findViewById(R.id.armazenamento_p12_na);
                RadioButton ad_p12 = (RadioButton) findViewById(R.id.armazenamento_p12_ad);
                RadioButton in_p12 = (RadioButton) findViewById(R.id.armazenamento_p12_in);

                ImageButton foto_p12 = (ImageButton) findViewById(R.id.armazenamento_foto_p12);
                ImageButton descricao_p12 = (ImageButton) findViewById(R.id.armazenamento_descricao_p12);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta12);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p12, ad_p12, in_p12, foto_p12, descricao_p12, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p13 = (RadioGroup) findViewById(R.id.armazenamento_p13);


        r_p13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p13 = (RadioButton) findViewById(R.id.armazenamento_p13_na);
                RadioButton ad_p13 = (RadioButton) findViewById(R.id.armazenamento_p13_ad);
                RadioButton in_p13 = (RadioButton) findViewById(R.id.armazenamento_p13_in);

                ImageButton foto_p13 = (ImageButton) findViewById(R.id.armazenamento_foto_p13);
                ImageButton descricao_p13 = (ImageButton) findViewById(R.id.armazenamento_descricao_p13);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta13);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p13, ad_p13, in_p13, foto_p13, descricao_p13, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p14 = (RadioGroup) findViewById(R.id.armazenamento_p14);


        r_p14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p14 = (RadioButton) findViewById(R.id.armazenamento_p14_na);
                RadioButton ad_p14 = (RadioButton) findViewById(R.id.armazenamento_p14_ad);
                RadioButton in_p14 = (RadioButton) findViewById(R.id.armazenamento_p14_in);

                ImageButton foto_p14 = (ImageButton) findViewById(R.id.armazenamento_foto_p14);
                ImageButton descricao_p14 = (ImageButton) findViewById(R.id.armazenamento_descricao_p14);


                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta14);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p14, ad_p14, in_p14, foto_p14, descricao_p14, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p15 = (RadioGroup) findViewById(R.id.armazenamento_p15);


        r_p15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p15 = (RadioButton) findViewById(R.id.armazenamento_p15_na);
                RadioButton ad_p15 = (RadioButton) findViewById(R.id.armazenamento_p15_ad);
                RadioButton in_p15 = (RadioButton) findViewById(R.id.armazenamento_p15_in);

                ImageButton foto_p15 = (ImageButton) findViewById(R.id.armazenamento_foto_p15);
                ImageButton descricao_p15 = (ImageButton) findViewById(R.id.armazenamento_descricao_p15);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta15);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p15, ad_p15, in_p15, foto_p15, descricao_p15, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p16 = (RadioGroup) findViewById(R.id.armazenamento_p16);


        r_p16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p16 = (RadioButton) findViewById(R.id.armazenamento_p16_na);
                RadioButton ad_p16 = (RadioButton) findViewById(R.id.armazenamento_p16_ad);
                RadioButton in_p16 = (RadioButton) findViewById(R.id.armazenamento_p16_in);

                ImageButton foto_p16 = (ImageButton) findViewById(R.id.armazenamento_foto_p16);
                ImageButton descricao_p16 = (ImageButton) findViewById(R.id.armazenamento_descricao_p16);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta16);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p16, ad_p16, in_p16, foto_p16, descricao_p16, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p17 = (RadioGroup) findViewById(R.id.armazenamento_p17);


        r_p17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p17 = (RadioButton) findViewById(R.id.armazenamento_p17_na);
                RadioButton ad_p17 = (RadioButton) findViewById(R.id.armazenamento_p17_ad);
                RadioButton in_p17 = (RadioButton) findViewById(R.id.armazenamento_p17_in);

                ImageButton foto_p17 = (ImageButton) findViewById(R.id.armazenamento_foto_p17);
                ImageButton descricao_p17 = (ImageButton) findViewById(R.id.armazenamento_descricao_p17);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta17);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p17, ad_p17, in_p17, foto_p17, descricao_p17, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p18 = (RadioGroup) findViewById(R.id.armazenamento_p18);


        r_p18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p18 = (RadioButton) findViewById(R.id.armazenamento_p18_na);
                RadioButton ad_p18 = (RadioButton) findViewById(R.id.armazenamento_p18_ad);
                RadioButton in_p18 = (RadioButton) findViewById(R.id.armazenamento_p18_in);

                ImageButton foto_p18 = (ImageButton) findViewById(R.id.armazenamento_foto_p18);
                ImageButton descricao_p18 = (ImageButton) findViewById(R.id.armazenamento_descricao_p18);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta18);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p18, ad_p18, in_p18, foto_p18, descricao_p18, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });


        RadioGroup r_p19 = (RadioGroup) findViewById(R.id.armazenamento_p19);


        r_p19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p19 = (RadioButton) findViewById(R.id.armazenamento_p19_na);
                RadioButton ad_p19 = (RadioButton) findViewById(R.id.armazenamento_p19_ad);
                RadioButton in_p19 = (RadioButton) findViewById(R.id.armazenamento_p19_in);

                ImageButton foto_p19 = (ImageButton) findViewById(R.id.armazenamento_foto_p19);
                ImageButton descricao_p19 = (ImageButton) findViewById(R.id.armazenamento_descricao_p19);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta19);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p19, ad_p19, in_p19, foto_p19, descricao_p19, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p20 = (RadioGroup) findViewById(R.id.armazenamento_p20);


        r_p20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p20 = (RadioButton) findViewById(R.id.armazenamento_p20_na);
                RadioButton ad_p20 = (RadioButton) findViewById(R.id.armazenamento_p20_ad);
                RadioButton in_p20 = (RadioButton) findViewById(R.id.armazenamento_p20_in);

                ImageButton foto_p20 = (ImageButton) findViewById(R.id.armazenamento_foto_p20);
                ImageButton descricao_p20 = (ImageButton) findViewById(R.id.armazenamento_descricao_p20);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta20);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p20, ad_p20, in_p20, foto_p20, descricao_p20, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p21 = (RadioGroup) findViewById(R.id.armazenamento_p21);


        r_p21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p21 = (RadioButton) findViewById(R.id.armazenamento_p21_na);
                RadioButton ad_p21 = (RadioButton) findViewById(R.id.armazenamento_p21_ad);
                RadioButton in_p21 = (RadioButton) findViewById(R.id.armazenamento_p21_in);

                ImageButton foto_p21 = (ImageButton) findViewById(R.id.armazenamento_foto_p21);
                ImageButton descricao_p21 = (ImageButton) findViewById(R.id.armazenamento_descricao_p21);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta21);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p21, ad_p21, in_p21, foto_p21, descricao_p21, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p22 = (RadioGroup) findViewById(R.id.armazenamento_p22);


        r_p22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p22 = (RadioButton) findViewById(R.id.armazenamento_p22_na);
                RadioButton ad_p22 = (RadioButton) findViewById(R.id.armazenamento_p22_ad);
                RadioButton in_p22 = (RadioButton) findViewById(R.id.armazenamento_p22_in);

                ImageButton foto_p22 = (ImageButton) findViewById(R.id.armazenamento_foto_p22);
                ImageButton descricao_p22 = (ImageButton) findViewById(R.id.armazenamento_descricao_p22);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta22);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p22, ad_p22, in_p22, foto_p22, descricao_p22, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p23 = (RadioGroup) findViewById(R.id.armazenamento_p23);


        r_p23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p23 = (RadioButton) findViewById(R.id.armazenamento_p23_na);
                RadioButton ad_p23 = (RadioButton) findViewById(R.id.armazenamento_p23_ad);
                RadioButton in_p23 = (RadioButton) findViewById(R.id.armazenamento_p23_in);

                ImageButton foto_p23 = (ImageButton) findViewById(R.id.armazenamento_foto_p23);
                ImageButton descricao_p23 = (ImageButton) findViewById(R.id.armazenamento_descricao_p23);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta23);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p23, ad_p23, in_p23, foto_p23, descricao_p23, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p24 = (RadioGroup) findViewById(R.id.armazenamento_p24);


        r_p24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p24 = (RadioButton) findViewById(R.id.armazenamento_p24_na);
                RadioButton ad_p24 = (RadioButton) findViewById(R.id.armazenamento_p24_ad);
                RadioButton in_p24 = (RadioButton) findViewById(R.id.armazenamento_p24_in);

                ImageButton foto_p24 = (ImageButton) findViewById(R.id.armazenamento_foto_p24);
                ImageButton descricao_p24 = (ImageButton) findViewById(R.id.armazenamento_descricao_p24);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta24);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p24, ad_p24, in_p24, foto_p24, descricao_p24, itemAvaliacao);
                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p25 = (RadioGroup) findViewById(R.id.armazenamento_p25);


        r_p25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p25 = (RadioButton) findViewById(R.id.armazenamento_p25_na);
                RadioButton ad_p25 = (RadioButton) findViewById(R.id.armazenamento_p25_ad);
                RadioButton in_p25 = (RadioButton) findViewById(R.id.armazenamento_p25_in);

                ImageButton foto_p25 = (ImageButton) findViewById(R.id.armazenamento_foto_p25);
                ImageButton descricao_p25 = (ImageButton) findViewById(R.id.armazenamento_descricao_p25);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta25);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p25, ad_p25, in_p25, foto_p25, descricao_p25, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p26 = (RadioGroup) findViewById(R.id.armazenamento_p26);


        r_p26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p26 = (RadioButton) findViewById(R.id.armazenamento_p26_na);
                RadioButton ad_p26 = (RadioButton) findViewById(R.id.armazenamento_p26_ad);
                RadioButton in_p26 = (RadioButton) findViewById(R.id.armazenamento_p26_in);

                ImageButton foto_p26 = (ImageButton) findViewById(R.id.armazenamento_foto_p26);
                ImageButton descricao_p26 = (ImageButton) findViewById(R.id.armazenamento_descricao_p26);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta26);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p26, ad_p26, in_p26, foto_p26, descricao_p26, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p27 = (RadioGroup) findViewById(R.id.armazenamento_p27);


        r_p27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p27 = (RadioButton) findViewById(R.id.armazenamento_p27_na);
                RadioButton ad_p27 = (RadioButton) findViewById(R.id.armazenamento_p27_ad);
                RadioButton in_p27 = (RadioButton) findViewById(R.id.armazenamento_p27_in);

                ImageButton foto_p27 = (ImageButton) findViewById(R.id.armazenamento_foto_p27);
                ImageButton descricao_p27 = (ImageButton) findViewById(R.id.armazenamento_descricao_p27);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta27);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p27, ad_p27, in_p27, foto_p27, descricao_p27, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p28 = (RadioGroup) findViewById(R.id.armazenamento_p28);


        r_p28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p28 = (RadioButton) findViewById(R.id.armazenamento_p28_na);
                RadioButton ad_p28 = (RadioButton) findViewById(R.id.armazenamento_p28_ad);
                RadioButton in_p28 = (RadioButton) findViewById(R.id.armazenamento_p28_in);

                ImageButton foto_p28 = (ImageButton) findViewById(R.id.armazenamento_foto_p28);
                ImageButton descricao_p28 = (ImageButton) findViewById(R.id.armazenamento_descricao_p28);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta28);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p28, ad_p28, in_p28, foto_p28, descricao_p28, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p29 = (RadioGroup) findViewById(R.id.armazenamento_p29);


        r_p29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p29 = (RadioButton) findViewById(R.id.armazenamento_p29_na);
                RadioButton ad_p29 = (RadioButton) findViewById(R.id.armazenamento_p29_ad);
                RadioButton in_p29 = (RadioButton) findViewById(R.id.armazenamento_p29_in);

                ImageButton foto_p29 = (ImageButton) findViewById(R.id.armazenamento_foto_p29);
                ImageButton descricao_p29 = (ImageButton) findViewById(R.id.armazenamento_descricao_p29);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta29);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p29, ad_p29, in_p29, foto_p29, descricao_p29, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p30 = (RadioGroup) findViewById(R.id.armazenamento_p30);


        r_p30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p30 = (RadioButton) findViewById(R.id.armazenamento_p30_na);
                RadioButton ad_p30 = (RadioButton) findViewById(R.id.armazenamento_p30_ad);
                RadioButton in_p30 = (RadioButton) findViewById(R.id.armazenamento_p30_in);

                ImageButton foto_p30 = (ImageButton) findViewById(R.id.armazenamento_foto_p30);
                ImageButton descricao_p30 = (ImageButton) findViewById(R.id.armazenamento_descricao_p30);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta30);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p30, ad_p30, in_p30, foto_p30, descricao_p30, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p31 = (RadioGroup) findViewById(R.id.armazenamento_p31);


        r_p31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p31 = (RadioButton) findViewById(R.id.armazenamento_p31_na);
                RadioButton ad_p31 = (RadioButton) findViewById(R.id.armazenamento_p31_ad);
                RadioButton in_p31 = (RadioButton) findViewById(R.id.armazenamento_p31_in);

                ImageButton foto_p31 = (ImageButton) findViewById(R.id.armazenamento_foto_p31);
                ImageButton descricao_p31 = (ImageButton) findViewById(R.id.armazenamento_descricao_p31);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta31);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p31, ad_p31, in_p31, foto_p31, descricao_p31, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p32 = (RadioGroup) findViewById(R.id.armazenamento_p32);


        r_p32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p32 = (RadioButton) findViewById(R.id.armazenamento_p32_na);
                RadioButton ad_p32 = (RadioButton) findViewById(R.id.armazenamento_p32_ad);
                RadioButton in_p32 = (RadioButton) findViewById(R.id.armazenamento_p32_in);

                ImageButton foto_p32 = (ImageButton) findViewById(R.id.armazenamento_foto_p32);
                ImageButton descricao_p32 = (ImageButton) findViewById(R.id.armazenamento_descricao_p32);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta32);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p32, ad_p32, in_p32, foto_p32, descricao_p32, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p33 = (RadioGroup) findViewById(R.id.armazenamento_p33);


        r_p33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p33 = (RadioButton) findViewById(R.id.armazenamento_p33_na);
                RadioButton ad_p33 = (RadioButton) findViewById(R.id.armazenamento_p33_ad);
                RadioButton in_p33 = (RadioButton) findViewById(R.id.armazenamento_p33_in);

                ImageButton foto_p33 = (ImageButton) findViewById(R.id.armazenamento_foto_p33);
                ImageButton descricao_p33 = (ImageButton) findViewById(R.id.armazenamento_descricao_p33);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta33);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p33, ad_p33, in_p33, foto_p33, descricao_p33, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p34 = (RadioGroup) findViewById(R.id.armazenamento_p34);


        r_p34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p34 = (RadioButton) findViewById(R.id.armazenamento_p34_na);
                RadioButton ad_p34 = (RadioButton) findViewById(R.id.armazenamento_p34_ad);
                RadioButton in_p34 = (RadioButton) findViewById(R.id.armazenamento_p34_in);

                ImageButton foto_p34 = (ImageButton) findViewById(R.id.armazenamento_foto_p34);
                ImageButton descricao_p34 = (ImageButton) findViewById(R.id.armazenamento_descricao_p34);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta34);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p34, ad_p34, in_p34, foto_p34, descricao_p34, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p35 = (RadioGroup) findViewById(R.id.armazenamento_p35);


        r_p35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p35 = (RadioButton) findViewById(R.id.armazenamento_p35_na);
                RadioButton ad_p35 = (RadioButton) findViewById(R.id.armazenamento_p35_ad);
                RadioButton in_p35 = (RadioButton) findViewById(R.id.armazenamento_p35_in);

                ImageButton foto_p35 = (ImageButton) findViewById(R.id.armazenamento_foto_p35);
                ImageButton descricao_p35 = (ImageButton) findViewById(R.id.armazenamento_descricao_p35);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta35);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p35, ad_p35, in_p35, foto_p35, descricao_p35, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p36 = (RadioGroup) findViewById(R.id.armazenamento_p36);


        r_p36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p36 = (RadioButton) findViewById(R.id.armazenamento_p36_na);
                RadioButton ad_p36 = (RadioButton) findViewById(R.id.armazenamento_p36_ad);
                RadioButton in_p36 = (RadioButton) findViewById(R.id.armazenamento_p36_in);

                ImageButton foto_p36 = (ImageButton) findViewById(R.id.armazenamento_foto_p36);
                ImageButton descricao_p36 = (ImageButton) findViewById(R.id.armazenamento_descricao_p36);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta36);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p36, ad_p36, in_p36, foto_p36, descricao_p36, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p37 = (RadioGroup) findViewById(R.id.armazenamento_p37);


        r_p37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p37 = (RadioButton) findViewById(R.id.armazenamento_p37_na);
                RadioButton ad_p37 = (RadioButton) findViewById(R.id.armazenamento_p37_ad);
                RadioButton in_p37 = (RadioButton) findViewById(R.id.armazenamento_p37_in);

                ImageButton foto_p37 = (ImageButton) findViewById(R.id.armazenamento_foto_p37);
                ImageButton descricao_p37 = (ImageButton) findViewById(R.id.armazenamento_descricao_p37);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta37);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p37, ad_p37, in_p37, foto_p37, descricao_p37, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p38 = (RadioGroup) findViewById(R.id.armazenamento_p38);


        r_p38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p38 = (RadioButton) findViewById(R.id.armazenamento_p38_na);
                RadioButton ad_p38 = (RadioButton) findViewById(R.id.armazenamento_p38_ad);
                RadioButton in_p38 = (RadioButton) findViewById(R.id.armazenamento_p38_in);

                ImageButton foto_p38 = (ImageButton) findViewById(R.id.armazenamento_foto_p38);
                ImageButton descricao_p38 = (ImageButton) findViewById(R.id.armazenamento_descricao_p38);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta38);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p38, ad_p38, in_p38, foto_p38, descricao_p38, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p39 = (RadioGroup) findViewById(R.id.armazenamento_p39);


        r_p39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p39 = (RadioButton) findViewById(R.id.armazenamento_p39_na);
                RadioButton ad_p39 = (RadioButton) findViewById(R.id.armazenamento_p39_ad);
                RadioButton in_p39 = (RadioButton) findViewById(R.id.armazenamento_p39_in);

                ImageButton foto_p39 = (ImageButton) findViewById(R.id.armazenamento_foto_p39);
                ImageButton descricao_p39 = (ImageButton) findViewById(R.id.armazenamento_descricao_p39);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta39);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p39, ad_p39, in_p39, foto_p39, descricao_p39, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p40 = (RadioGroup) findViewById(R.id.armazenamento_p40);


        r_p40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p40 = (RadioButton) findViewById(R.id.armazenamento_p40_na);
                RadioButton ad_p40 = (RadioButton) findViewById(R.id.armazenamento_p40_ad);
                RadioButton in_p40 = (RadioButton) findViewById(R.id.armazenamento_p40_in);

                ImageButton foto_p40 = (ImageButton) findViewById(R.id.armazenamento_foto_p40);
                ImageButton descricao_p40 = (ImageButton) findViewById(R.id.armazenamento_descricao_p40);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta40);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p40, ad_p40, in_p40, foto_p40, descricao_p40, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p41 = (RadioGroup) findViewById(R.id.armazenamento_p41);


        r_p41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p41 = (RadioButton) findViewById(R.id.armazenamento_p41_na);
                RadioButton ad_p41 = (RadioButton) findViewById(R.id.armazenamento_p41_ad);
                RadioButton in_p41 = (RadioButton) findViewById(R.id.armazenamento_p41_in);

                ImageButton foto_p41 = (ImageButton) findViewById(R.id.armazenamento_foto_p41);
                ImageButton descricao_p41 = (ImageButton) findViewById(R.id.armazenamento_descricao_p41);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta41);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p41, ad_p41, in_p41, foto_p41, descricao_p41, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p42 = (RadioGroup) findViewById(R.id.armazenamento_p42);


        r_p42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p42 = (RadioButton) findViewById(R.id.armazenamento_p42_na);
                RadioButton ad_p42 = (RadioButton) findViewById(R.id.armazenamento_p42_ad);
                RadioButton in_p42 = (RadioButton) findViewById(R.id.armazenamento_p42_in);

                ImageButton foto_p42 = (ImageButton) findViewById(R.id.armazenamento_foto_p42);
                ImageButton descricao_p42 = (ImageButton) findViewById(R.id.armazenamento_descricao_p42);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta42);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p42, ad_p42, in_p42, foto_p42, descricao_p42, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p43 = (RadioGroup) findViewById(R.id.armazenamento_p43);


        r_p43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p43 = (RadioButton) findViewById(R.id.armazenamento_p43_na);
                RadioButton ad_p43 = (RadioButton) findViewById(R.id.armazenamento_p43_ad);
                RadioButton in_p43 = (RadioButton) findViewById(R.id.armazenamento_p43_in);

                ImageButton foto_p43 = (ImageButton) findViewById(R.id.armazenamento_foto_p43);
                ImageButton descricao_p43 = (ImageButton) findViewById(R.id.armazenamento_descricao_p43);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta43);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p43, ad_p43, in_p43, foto_p43, descricao_p43, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p44 = (RadioGroup) findViewById(R.id.armazenamento_p44);


        r_p44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p44 = (RadioButton) findViewById(R.id.armazenamento_p44_na);
                RadioButton ad_p44 = (RadioButton) findViewById(R.id.armazenamento_p44_ad);
                RadioButton in_p44 = (RadioButton) findViewById(R.id.armazenamento_p44_in);

                ImageButton foto_p44 = (ImageButton) findViewById(R.id.armazenamento_foto_p44);
                ImageButton descricao_p44 = (ImageButton) findViewById(R.id.armazenamento_descricao_p44);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta44);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p44, ad_p44, in_p44, foto_p44, descricao_p44, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p45 = (RadioGroup) findViewById(R.id.armazenamento_p45);


        r_p45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p45 = (RadioButton) findViewById(R.id.armazenamento_p45_na);
                RadioButton ad_p45 = (RadioButton) findViewById(R.id.armazenamento_p45_ad);
                RadioButton in_p45 = (RadioButton) findViewById(R.id.armazenamento_p45_in);

                ImageButton foto_p45 = (ImageButton) findViewById(R.id.armazenamento_foto_p45);
                ImageButton descricao_p45 = (ImageButton) findViewById(R.id.armazenamento_descricao_p45);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta45);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p45, ad_p45, in_p45, foto_p45, descricao_p45, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p46 = (RadioGroup) findViewById(R.id.armazenamento_p46);


        r_p46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p46 = (RadioButton) findViewById(R.id.armazenamento_p46_na);
                RadioButton ad_p46 = (RadioButton) findViewById(R.id.armazenamento_p46_ad);
                RadioButton in_p46 = (RadioButton) findViewById(R.id.armazenamento_p46_in);

                ImageButton foto_p46 = (ImageButton) findViewById(R.id.armazenamento_foto_p46);
                ImageButton descricao_p46 = (ImageButton) findViewById(R.id.armazenamento_descricao_p46);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta46);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p46, ad_p46, in_p46, foto_p46, descricao_p46, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p47 = (RadioGroup) findViewById(R.id.armazenamento_p47);


        r_p47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p47 = (RadioButton) findViewById(R.id.armazenamento_p47_na);
                RadioButton ad_p47 = (RadioButton) findViewById(R.id.armazenamento_p47_ad);
                RadioButton in_p47 = (RadioButton) findViewById(R.id.armazenamento_p47_in);

                ImageButton foto_p47 = (ImageButton) findViewById(R.id.armazenamento_foto_p47);
                ImageButton descricao_p47 = (ImageButton) findViewById(R.id.armazenamento_descricao_p47);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta47);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p47, ad_p47, in_p47, foto_p47, descricao_p47, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p48 = (RadioGroup) findViewById(R.id.armazenamento_p48);


        r_p48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p48 = (RadioButton) findViewById(R.id.armazenamento_p48_na);
                RadioButton ad_p48 = (RadioButton) findViewById(R.id.armazenamento_p48_ad);
                RadioButton in_p48 = (RadioButton) findViewById(R.id.armazenamento_p48_in);

                ImageButton foto_p48 = (ImageButton) findViewById(R.id.armazenamento_foto_p48);
                ImageButton descricao_p48 = (ImageButton) findViewById(R.id.armazenamento_descricao_p48);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta48);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p48, ad_p48, in_p48, foto_p48, descricao_p48, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p49 = (RadioGroup) findViewById(R.id.armazenamento_p49);


        r_p49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p49 = (RadioButton) findViewById(R.id.armazenamento_p49_na);
                RadioButton ad_p49 = (RadioButton) findViewById(R.id.armazenamento_p49_ad);
                RadioButton in_p49 = (RadioButton) findViewById(R.id.armazenamento_p49_in);

                ImageButton foto_p49 = (ImageButton) findViewById(R.id.armazenamento_foto_p49);
                ImageButton descricao_p49 = (ImageButton) findViewById(R.id.armazenamento_descricao_p49);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta49);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p49, ad_p49, in_p49, foto_p49, descricao_p49, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p50 = (RadioGroup) findViewById(R.id.armazenamento_p50);


        r_p50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p50 = (RadioButton) findViewById(R.id.armazenamento_p50_na);
                RadioButton ad_p50 = (RadioButton) findViewById(R.id.armazenamento_p50_ad);
                RadioButton in_p50 = (RadioButton) findViewById(R.id.armazenamento_p50_in);

                ImageButton foto_p50 = (ImageButton) findViewById(R.id.armazenamento_foto_p50);
                ImageButton descricao_p50 = (ImageButton) findViewById(R.id.armazenamento_descricao_p50);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta50);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p50, ad_p50, in_p50, foto_p50, descricao_p50, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p51 = (RadioGroup) findViewById(R.id.armazenamento_p51);


        r_p51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p51 = (RadioButton) findViewById(R.id.armazenamento_p51_na);
                RadioButton ad_p51 = (RadioButton) findViewById(R.id.armazenamento_p51_ad);
                RadioButton in_p51 = (RadioButton) findViewById(R.id.armazenamento_p51_in);

                ImageButton foto_p51 = (ImageButton) findViewById(R.id.armazenamento_foto_p51);
                ImageButton descricao_p51 = (ImageButton) findViewById(R.id.armazenamento_descricao_p51);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta51);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p51, ad_p51, in_p51, foto_p51, descricao_p51, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p52 = (RadioGroup) findViewById(R.id.armazenamento_p52);


        r_p52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p52 = (RadioButton) findViewById(R.id.armazenamento_p52_na);
                RadioButton ad_p52 = (RadioButton) findViewById(R.id.armazenamento_p52_ad);
                RadioButton in_p52 = (RadioButton) findViewById(R.id.armazenamento_p52_in);

                ImageButton foto_p52 = (ImageButton) findViewById(R.id.armazenamento_foto_p52);
                ImageButton descricao_p52 = (ImageButton) findViewById(R.id.armazenamento_descricao_p52);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta52);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p52, ad_p52, in_p52, foto_p52, descricao_p52, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p53 = (RadioGroup) findViewById(R.id.armazenamento_p53);


        r_p53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p53 = (RadioButton) findViewById(R.id.armazenamento_p53_na);
                RadioButton ad_p53 = (RadioButton) findViewById(R.id.armazenamento_p53_ad);
                RadioButton in_p53 = (RadioButton) findViewById(R.id.armazenamento_p53_in);

                ImageButton foto_p53 = (ImageButton) findViewById(R.id.armazenamento_foto_p53);
                ImageButton descricao_p53 = (ImageButton) findViewById(R.id.armazenamento_descricao_p53);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta53);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p53, ad_p53, in_p53, foto_p53, descricao_p53, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p54 = (RadioGroup) findViewById(R.id.armazenamento_p54);


        r_p54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p54 = (RadioButton) findViewById(R.id.armazenamento_p54_na);
                RadioButton ad_p54 = (RadioButton) findViewById(R.id.armazenamento_p54_ad);
                RadioButton in_p54 = (RadioButton) findViewById(R.id.armazenamento_p54_in);

                ImageButton foto_p54 = (ImageButton) findViewById(R.id.armazenamento_foto_p54);
                ImageButton descricao_p54 = (ImageButton) findViewById(R.id.armazenamento_descricao_p54);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta54);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p54, ad_p54, in_p54, foto_p54, descricao_p54, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        RadioGroup r_p55 = (RadioGroup) findViewById(R.id.armazenamento_p55);


        r_p55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                limpaItemAvaliacao(itemAvaliacao);

                RadioButton na_p55 = (RadioButton) findViewById(R.id.armazenamento_p55_na);
                RadioButton ad_p55 = (RadioButton) findViewById(R.id.armazenamento_p55_ad);
                RadioButton in_p55 = (RadioButton) findViewById(R.id.armazenamento_p55_in);

                ImageButton foto_p55 = (ImageButton) findViewById(R.id.armazenamento_foto_p55);
                ImageButton descricao_p55 = (ImageButton) findViewById(R.id.armazenamento_descricao_p55);

                TextView pergunta = (TextView) findViewById(R.id.armazenamento_pergunta55);

                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na_p55, ad_p55, in_p55, foto_p55, descricao_p55, itemAvaliacao);

                salvarItemAvaliacao(itemAvaliacao);
            }
        });

        ImageButton armazenamentoSalvar = (ImageButton) findViewById(R.id.armazenamento_btnSalvar);
        armazenamentoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Cvs5ArmazenamentoActivity.this, Cvs5Activity.class);
                intentVaiProArmazenamento.putExtra("codigoPlanoAcao",codigoPlanoAcao);
                startActivity(intentVaiProArmazenamento);
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
                    tirarFotoIntent();
                }
            });
            descricao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mostraJanelaDescricaoComDados(itemAvaliacao);
                }
            });
            itemAvaliacao.setConformidade(Constantes.CONFORMIDADE_INADEQUADA);
        } else if (naoAplica.isChecked()) {
            foto.setVisibility(View.INVISIBLE);
            descricao.setVisibility(View.INVISIBLE);
            itemAvaliacao.setConformidade(Constantes.CONFORMIDADE_NA);
        } else if (adequado.isChecked()){
            foto.setVisibility(View.INVISIBLE);
            descricao.setVisibility(View.INVISIBLE);
            itemAvaliacao.setConformidade(Constantes.CONFORMIDADE_ADEQUADA);
        }
    }

    private void criaItemAvaliacao(int codigoPlanoAcao) {
        //Cria plano de Acao para busca
        PlanoAcao planoAcao = new PlanoAcao();
        PlanoAcaoDAO planoAcaoDAO = new PlanoAcaoDAO(this);

        planoAcao.setCodigo(codigoPlanoAcao);
        itemAvaliacao = new ItemAvaliacao();
        itemAvaliacao.setPlanoAcao(planoAcaoDAO.buscar(planoAcao));
        itemAvaliacao.setAreaAvaliada(AREA_AVALIADA);
    }

    private void limpaItemAvaliacao(ItemAvaliacao itemAvaliacao) {

        itemAvaliacao.setFoto(null);
        itemAvaliacao.setDescricao(null);
    }

    private void salvarItemAvaliacao(ItemAvaliacao itemAvaliacao) {
            itemAvaliacaoDAO.inserir(itemAvaliacao);
    }

    private void tirarFotoIntent() {
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

            vaiPraCamera.putExtra(MediaStore.EXTRA_OUTPUT,uriSavedImage);

            if (vaiPraCamera.resolveActivity(getPackageManager())!= null) {
                startActivityForResult(vaiPraCamera, REQUEST_IMAGE_PICTURE);
                salvarItemAvaliacao(itemAvaliacao);
            }

        } catch (Exception e) {
            Log.i("fail","creating photofile failed for " + fileName);
        }
    }

    protected void mostraJanelaDescricao() {


        LayoutInflater layoutInflater = LayoutInflater.from(Cvs5ArmazenamentoActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Cvs5ArmazenamentoActivity.this);
        alertDialogBuilder.setTitle("Descrição");
        alertDialogBuilder.setIcon(R.drawable.ic_logo);
        alertDialogBuilder.setView(promptView);


        final EditText descricao = (EditText) promptView.findViewById(R.id.descricao);

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {


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

    protected void mostraJanelaDescricaoComDados(final ItemAvaliacao itemAvaliacao) {


        LayoutInflater layoutInflater = LayoutInflater.from(Cvs5ArmazenamentoActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Cvs5ArmazenamentoActivity.this);
        alertDialogBuilder.setTitle("Descrição");
        alertDialogBuilder.setIcon(R.drawable.ic_logo);
        alertDialogBuilder.setView(promptView);


        final EditText descricao = (EditText) promptView.findViewById(R.id.descricao);

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        itemAvaliacao.setDescricao(descricao.getText().toString());
                        salvarItemAvaliacao(itemAvaliacao);
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
