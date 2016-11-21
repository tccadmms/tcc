package com.admms.tcc.oasis.controller.rdc216;

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

public class Rdc216IngredientesActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int NUMERO_PERGUNTAS = 12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredientes_rdc216);

        final Context context = Rdc216IngredientesActivity.this;

        final Bundle bundle = getIntent().getExtras();
        final int codigoPlanoAcao = bundle.getInt("codigoPlanoAcao");

        itemAvaliacao = ItemAvaliacaoController.criaItemAvaliacao(codigoPlanoAcao, itemAvaliacao, Constantes.AREA_AVALIADA_INGREDIENTES,this);
        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.ingredientes_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p1_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p1_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p1_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p1);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p1);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta1);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.ingredientes_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p2_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p2_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p2_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p2);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p2);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta2);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.ingredientes_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p3_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p3_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p3_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p3);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p3);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta3);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.ingredientes_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p4_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p4_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p4_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p4);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p4);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta4);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.ingredientes_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p5_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p5_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p5_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p5);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p5);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta5);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.ingredientes_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p6_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p6_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p6_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p6);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p6);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta6);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.ingredientes_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p7_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p7_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p7_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p7);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p7);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta7);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.ingredientes_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p8_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p8_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p8_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p8);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p8);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta8);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p9 = (RadioGroup) findViewById(R.id.ingredientes_p9);


        r_p9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p9_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p9_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p9_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p9);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p9);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta9);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p10 = (RadioGroup) findViewById(R.id.ingredientes_p10);


        r_p10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p10_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p10_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p10_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p10);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p10);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta10);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p11 = (RadioGroup) findViewById(R.id.ingredientes_p11);


        r_p11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p11_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p11_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p11_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p11);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p11);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta11);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p12 = (RadioGroup) findViewById(R.id.ingredientes_p12);


        r_p12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.ingredientes_p12_na);
                RadioButton ad = (RadioButton) findViewById(R.id.ingredientes_p12_ad);
                RadioButton in = (RadioButton) findViewById(R.id.ingredientes_p12_in);

                ImageButton foto = (ImageButton) findViewById(R.id.ingredientes_foto_p12);
                ImageButton descricao = (ImageButton) findViewById(R.id.ingredientes_descricao_p12);


                TextView pergunta = (TextView) findViewById(R.id.ingredientes_pergunta12);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        ImageButton ingredientesSalvar = (ImageButton) findViewById(R.id.ingredientes_btnSalvar);
        ingredientesSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcao planoAcao = new PlanoAcao();
                planoAcao.setCodigo(codigoPlanoAcao);

                List<ItemAvaliacao> listaItens = ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao,Constantes.AREA_AVALIADA_INGREDIENTES, context);

                if (NUMERO_PERGUNTAS != listaItens.size()) {
                    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case DialogInterface.BUTTON_POSITIVE:
                                    Intent intentVaiProIngredientes = new Intent(context, Rdc216Activity.class);
                                    intentVaiProIngredientes.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                                    intentVaiProIngredientes.putExtras(bundle);
                                    startActivity(intentVaiProIngredientes);
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
                    Intent intentVaiProIngredientes = new Intent(context, Rdc216Activity.class);
                    intentVaiProIngredientes.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                    intentVaiProIngredientes.putExtras(bundle);
                    startActivity(intentVaiProIngredientes);
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        final Context context = Rdc216IngredientesActivity.this;

        int contRadioButton = 0, contImageButton = 0, contTextView = 0;

        List<RadioButton> listaRadioButtons = new ArrayList<RadioButton>();
        List<ImageButton> listaImageButtons = new ArrayList<ImageButton>();
        List<TextView> listaTextViews = new ArrayList<TextView>();

        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p1_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p1_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p1_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p2_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p2_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p2_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p3_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p3_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p3_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p4_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p4_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p4_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p5_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p5_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p5_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p6_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p6_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p6_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p7_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p7_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p7_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p8_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p8_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p8_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p9_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p9_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p9_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p10_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p10_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p10_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p11_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p11_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p11_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p12_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p12_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.ingredientes_p12_in));

        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p1));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p1));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p2));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p2));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p3));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p3));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p4));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p4));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p5));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p5));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p6));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p6));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p7));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p7));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p8));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p8));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p9));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p9));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p10));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p10));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p11));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p11));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_foto_p12));
        listaImageButtons.add((ImageButton) findViewById(R.id.ingredientes_descricao_p12));

        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta1));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta2));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta3));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta4));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta5));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta6));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta7));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta8));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta9));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta10));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta11));
        listaTextViews.add((TextView) findViewById(R.id.ingredientes_pergunta12));

        for (int i = 0; i < NUMERO_PERGUNTAS; i++) {
            itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
            itemAvaliacao.setPergunta(listaTextViews.get(contTextView++).getText().toString());
            UserInterfaceController.radioButtonPopulate(listaRadioButtons.get(contRadioButton), listaRadioButtons.get(contRadioButton + 1),listaRadioButtons.get(contRadioButton + 2),
                    listaImageButtons.get(contImageButton),listaImageButtons.get(contImageButton + 1),itemAvaliacao, context);
            contRadioButton = contRadioButton + 3;
            contImageButton = contImageButton + 2;
        }
    }
}
