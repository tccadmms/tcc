package com.admms.tcc.oasis.controller.cvs5;

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

public class Cvs5ManipuladoresActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int NUMERO_PERGUNTAS = 33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvs5_manipuladores);

        final Context context = Cvs5ManipuladoresActivity.this;

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
                                    Intent intentVaiProManipuladores = new Intent(context, Cvs5Activity.class);
                                    intentVaiProManipuladores.putExtra("codigoPlanoAcao", codigoPlanoAcao);
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
                    Intent intentVaiProManipuladores = new Intent(context, Cvs5Activity.class);
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

