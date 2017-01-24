package com.admms.tcc.oasis.controller.prt2619;

import android.app.Activity;
import android.content.Context;
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
import com.admms.tcc.oasis.controller.ArquivoController;
import com.admms.tcc.oasis.controller.UserInterfaceController;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.ItemAvaliacao;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prt2619_ManipuladoresActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int NUMERO_PERGUNTAS = 53;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt2619__manipuladores);

        final Context context = Prt2619_ManipuladoresActivity.this;

        final Bundle bundle = getIntent().getExtras();
        final int codigoPlanoAcao = bundle.getInt("codigoPlanoAcao");

        itemAvaliacao = ItemAvaliacaoController.criaItemAvaliacao(codigoPlanoAcao, itemAvaliacao, Constantes.AREA_AVALIADA_MANIPULADORES,this);

        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.manipuladores_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p1_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p1_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p1_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p1);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p1);

                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta1);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.manipuladores_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p2_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p2_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p2_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p2);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p2);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta2);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.manipuladores_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p3_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p3_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p3_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p3);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p3);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta3);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.manipuladores_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p4_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p4_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p4_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p4);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p4);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta4);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.manipuladores_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p5_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p5_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p5_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p5);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p5);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta5);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.manipuladores_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p6_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p6_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p6_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p6);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p6);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta6);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.manipuladores_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p7_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p7_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p7_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p7);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p7);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta7);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.manipuladores_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p8_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p8_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p8_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p8);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p8);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta8);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p9 = (RadioGroup) findViewById(R.id.manipuladores_p9);


        r_p9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p9_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p9_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p9_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p9);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p9);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta9);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p10 = (RadioGroup) findViewById(R.id.manipuladores_p10);


        r_p10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p10_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p10_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p10_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p10);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p10);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta10);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p11 = (RadioGroup) findViewById(R.id.manipuladores_p11);


        r_p11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p11_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p11_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p11_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p11);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p11);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta11);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p12 = (RadioGroup) findViewById(R.id.manipuladores_p12);


        r_p12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p12_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p12_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p12_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p12);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p12);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta12);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p13 = (RadioGroup) findViewById(R.id.manipuladores_p13);


        r_p13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p13_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p13_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p13_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p13);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p13);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta13);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p14 = (RadioGroup) findViewById(R.id.manipuladores_p14);


        r_p14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p14_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p14_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p14_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p14);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p14);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta14);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p15 = (RadioGroup) findViewById(R.id.manipuladores_p15);


        r_p15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p15_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p15_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p15_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p15);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p15);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta15);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p16 = (RadioGroup) findViewById(R.id.manipuladores_p16);


        r_p16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p16_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p16_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p16_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p16);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p16);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta16);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p17 = (RadioGroup) findViewById(R.id.manipuladores_p17);


        r_p17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p17_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p17_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p17_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p17);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p17);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta17);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p18 = (RadioGroup) findViewById(R.id.manipuladores_p18);


        r_p18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p18_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p18_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p18_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p18);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p18);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta18);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });


        RadioGroup r_p19 = (RadioGroup) findViewById(R.id.manipuladores_p19);


        r_p19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p19_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p19_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p19_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p19);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p19);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta19);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p20 = (RadioGroup) findViewById(R.id.manipuladores_p20);


        r_p20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p20_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p20_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p20_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p20);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p20);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta20);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p21 = (RadioGroup) findViewById(R.id.manipuladores_p21);


        r_p21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p21_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p21_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p21_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p21);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p21);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta21);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p22 = (RadioGroup) findViewById(R.id.manipuladores_p22);


        r_p22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p22_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p22_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p22_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p22);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p22);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta22);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p23 = (RadioGroup) findViewById(R.id.manipuladores_p23);


        r_p23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p23_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p23_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p23_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p23);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p23);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta23);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p24 = (RadioGroup) findViewById(R.id.manipuladores_p24);


        r_p24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p24_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p24_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p24_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p24);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p24);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta24);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p25 = (RadioGroup) findViewById(R.id.manipuladores_p25);


        r_p25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p25_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p25_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p25_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p25);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p25);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta25);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p26 = (RadioGroup) findViewById(R.id.manipuladores_p26);


        r_p26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p26_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p26_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p26_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p26);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p26);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta26);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p27 = (RadioGroup) findViewById(R.id.manipuladores_p27);


        r_p27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p27_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p27_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p27_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p27);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p27);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta27);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p28 = (RadioGroup) findViewById(R.id.manipuladores_p28);


        r_p28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p28_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p28_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p28_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p28);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p28);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta28);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p29 = (RadioGroup) findViewById(R.id.manipuladores_p29);


        r_p29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p29_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p29_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p29_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p29);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p29);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta29);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p30 = (RadioGroup) findViewById(R.id.manipuladores_p30);


        r_p30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p30_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p30_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p30_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p30);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p30);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta30);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p31 = (RadioGroup) findViewById(R.id.manipuladores_p31);


        r_p31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p31_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p31_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p31_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p31);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p31);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta31);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p32 = (RadioGroup) findViewById(R.id.manipuladores_p32);


        r_p32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p32_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p32_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p32_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p32);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p32);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta32);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p33 = (RadioGroup) findViewById(R.id.manipuladores_p33);


        r_p33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p33_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p33_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p33_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p33);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p33);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta33);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p34 = (RadioGroup) findViewById(R.id.manipuladores_p34);


        r_p34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p34_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p34_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p34_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p34);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p34);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta34);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p35 = (RadioGroup) findViewById(R.id.manipuladores_p35);


        r_p35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p35_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p35_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p35_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p35);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p35);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta35);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p36 = (RadioGroup) findViewById(R.id.manipuladores_p36);


        r_p36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p36_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p36_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p36_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p36);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p36);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta36);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p37 = (RadioGroup) findViewById(R.id.manipuladores_p37);


        r_p37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p37_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p37_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p37_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p37);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p37);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta37);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p38 = (RadioGroup) findViewById(R.id.manipuladores_p38);


        r_p38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p38_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p38_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p38_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p38);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p38);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta38);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p39 = (RadioGroup) findViewById(R.id.manipuladores_p39);


        r_p39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p39_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p39_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p39_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p39);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p39);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta39);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p40 = (RadioGroup) findViewById(R.id.manipuladores_p40);


        r_p40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p40_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p40_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p40_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p40);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p40);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta40);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p41 = (RadioGroup) findViewById(R.id.manipuladores_p41);


        r_p41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p41_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p41_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p41_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p41);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p41);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta41);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p42 = (RadioGroup) findViewById(R.id.manipuladores_p42);


        r_p42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p42_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p42_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p42_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p42);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p42);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta42);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p43 = (RadioGroup) findViewById(R.id.manipuladores_p43);


        r_p43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p43_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p43_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p43_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p43);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p43);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta43);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p44 = (RadioGroup) findViewById(R.id.manipuladores_p44);


        r_p44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p44_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p44_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p44_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p44);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p44);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta44);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p45 = (RadioGroup) findViewById(R.id.manipuladores_p45);


        r_p45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p45_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p45_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p45_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p45);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p45);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta45);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p46 = (RadioGroup) findViewById(R.id.manipuladores_p46);


        r_p46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p46_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p46_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p46_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p46);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p46);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta46);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p47 = (RadioGroup) findViewById(R.id.manipuladores_p47);


        r_p47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p47_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p47_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p47_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p47);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p47);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta47);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p48 = (RadioGroup) findViewById(R.id.manipuladores_p48);


        r_p48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p48_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p48_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p48_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p48);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p48);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta48);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p49 = (RadioGroup) findViewById(R.id.manipuladores_p49);


        r_p49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p49_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p49_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p49_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p49);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p49);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta49);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p50 = (RadioGroup) findViewById(R.id.manipuladores_p50);


        r_p50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p50_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p50_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p50_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p50);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p50);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta50);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p51 = (RadioGroup) findViewById(R.id.manipuladores_p51);


        r_p51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p51_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p51_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p51_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p51);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p51);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta51);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p52 = (RadioGroup) findViewById(R.id.manipuladores_p52);


        r_p52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p52_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p52_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p52_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p52);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p52);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta52);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p53 = (RadioGroup) findViewById(R.id.manipuladores_p53);


        r_p53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.manipuladores_p53_na);
                RadioButton ad = (RadioButton) findViewById(R.id.manipuladores_p53_ad);
                RadioButton in = (RadioButton) findViewById(R.id.manipuladores_p53_in);

                ImageButton foto = (ImageButton) findViewById(R.id.manipuladores_foto_p53);
                ImageButton descricao = (ImageButton) findViewById(R.id.manipuladores_descricao_p53);


                TextView pergunta = (TextView) findViewById(R.id.manipuladores_pergunta53);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });


        ImageButton manipuladoresSalvar = (ImageButton) findViewById(R.id.manipuladores_btnSalvar);
        manipuladoresSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcao planoAcao = new PlanoAcao();
                planoAcao.setCodigo(codigoPlanoAcao);

                List<ItemAvaliacao> listaItens = ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao,Constantes.AREA_AVALIADA_MANIPULADORES, context);

                if (NUMERO_PERGUNTAS != listaItens.size()) {
                    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case DialogInterface.BUTTON_POSITIVE:
                                    Intent intentVaiProManipuladores = new Intent(context, Prt2619Activity.class);
                                    intentVaiProManipuladores.putExtra("codigoPlanoAcao",codigoPlanoAcao);
                                    intentVaiProManipuladores.putExtras(bundle);
                                    startActivity(intentVaiProManipuladores);
                                    break;

                                case DialogInterface.BUTTON_NEGATIVE:
                                    //Nao faz nada
                                    break;
                            }
                        }
                    };

                    AlertDialog.Builder builder = new AlertDialog.Builder(context);
                    builder.setMessage("Você ainda não respondeu todas as perguntas. Deseja prosseguir?").setPositiveButton("Sim", dialogClickListener)
                            .setNegativeButton("Voltar", dialogClickListener).show();
                } else {
                    Intent intentVaiProManipuladores = new Intent(context, Prt2619Activity.class);
                    intentVaiProManipuladores.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                    intentVaiProManipuladores.putExtras(bundle);
                    startActivity(intentVaiProManipuladores);
                }
            }
        });

        populateActivity(context);
    }

    private void populateActivity(Context context) {
        int contRadioButton = 0, contImageButton = 0, contTextView = 0;

        List<RadioButton> listaRadioButtons = new ArrayList<RadioButton>();
        List<ImageButton> listaImageButtons = new ArrayList<ImageButton>();
        List<TextView> listaTextViews = new ArrayList<TextView>();

        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p1_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p1_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p1_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p2_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p2_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p2_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p3_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p3_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p3_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p4_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p4_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p4_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p5_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p5_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p5_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p6_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p6_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p6_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p7_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p7_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p7_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p8_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p8_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p8_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p9_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p9_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p9_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p10_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p10_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p10_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p11_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p11_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p11_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p12_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p12_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p12_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p13_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p13_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p13_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p14_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p14_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p14_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p15_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p15_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p15_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p16_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p16_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p16_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p17_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p17_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p17_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p18_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p18_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p18_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p19_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p19_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p19_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p20_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p20_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p20_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p21_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p21_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p21_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p22_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p22_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p22_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p23_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p23_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p23_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p24_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p24_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p24_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p25_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p25_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p25_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p26_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p26_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p26_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p27_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p27_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p27_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p28_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p28_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p28_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p29_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p29_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p29_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p30_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p30_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p30_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p31_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p31_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p31_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p32_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p32_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p32_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p33_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p33_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p33_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p34_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p34_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p34_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p35_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p35_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p35_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p36_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p36_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p36_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p37_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p37_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p37_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p38_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p38_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p38_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p39_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p39_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p39_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p40_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p40_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p40_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p41_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p41_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p41_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p42_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p42_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p42_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p43_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p43_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p43_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p44_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p44_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p44_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p45_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p45_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p45_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p46_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p46_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p46_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p47_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p47_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p47_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p48_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p48_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p48_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p49_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p49_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p49_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p50_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p50_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p50_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p51_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p51_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p51_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p52_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p52_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p52_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p53_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p53_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.manipuladores_p53_in));

        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p1));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p1));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p2));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p2));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p3));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p3));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p4));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p4));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p5));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p5));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p6));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p6));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p7));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p7));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p8));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p8));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p9));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p9));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p10));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p10));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p11));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p11));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p12));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p12));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p13));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p13));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p14));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p14));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p15));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p15));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p16));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p16));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p17));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p17));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p18));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p18));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p19));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p19));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p20));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p20));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p21));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p21));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p22));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p22));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p23));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p23));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p24));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p24));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p25));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p25));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p26));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p26));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p27));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p27));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p28));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p28));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p29));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p29));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p30));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p30));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p31));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p31));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p32));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p32));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p33));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p33));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p34));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p34));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p35));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p35));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p36));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p36));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p37));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p37));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p38));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p38));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p39));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p39));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p40));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p40));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p41));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p41));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p42));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p42));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p43));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p43));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p44));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p44));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p45));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p45));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p46));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p46));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p47));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p47));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p48));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p48));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p49));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p49));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p50));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p50));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p51));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p51));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p52));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p52));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_foto_p53));
        listaImageButtons.add((ImageButton) findViewById(R.id.manipuladores_descricao_p53));

        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta1));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta2));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta3));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta4));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta5));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta6));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta7));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta8));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta9));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta10));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta11));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta12));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta13));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta14));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta15));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta16));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta17));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta18));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta19));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta20));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta21));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta22));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta23));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta24));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta25));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta26));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta27));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta28));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta29));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta30));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta31));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta32));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta33));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta34));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta35));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta36));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta37));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta38));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta39));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta40));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta41));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta42));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta43));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta44));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta45));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta46));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta47));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta48));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta49));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta50));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta51));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta52));
        listaTextViews.add((TextView) findViewById(R.id.manipuladores_pergunta53));

        for (int i = 0; i < NUMERO_PERGUNTAS; i++) {
            itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
            itemAvaliacao.setPergunta(listaTextViews.get(contTextView++).getText().toString());
            UserInterfaceController.radioButtonPopulate(listaRadioButtons.get(contRadioButton), listaRadioButtons.get(contRadioButton + 1),listaRadioButtons.get(contRadioButton + 2),
                    listaImageButtons.get(contImageButton),listaImageButtons.get(contImageButton + 1),itemAvaliacao, context);
            contRadioButton = contRadioButton + 3;
            contImageButton = contImageButton + 2;
        }
    }
}



