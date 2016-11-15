package com.admms.tcc.oasis.controller.rdc216;

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

public class Rdc216ExposicaoActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int REQUEST_IMAGE_PICTURE = 1;
    private static final int NUMERO_PERGUNTAS = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exposicao_rdc216);

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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
            }
        });


        ImageButton exposicaoSalvar = (ImageButton) findViewById(R.id.exposicao_btnSalvar);
        exposicaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcao planoAcao = new PlanoAcao();
                planoAcao.setCodigo(codigoPlanoAcao);

                List<ItemAvaliacao> listaItens = ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao,Constantes.AREA_AVALIADA_EXPOSICAO, Rdc216ExposicaoActivity.this);

                if (NUMERO_PERGUNTAS != listaItens.size()) {
                    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case DialogInterface.BUTTON_POSITIVE:
                                    Intent intentVaiProExposicao = new Intent(Rdc216ExposicaoActivity.this, Rdc216Activity.class);
                                    intentVaiProExposicao.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                                    startActivity(intentVaiProExposicao);
                                    break;

                                case DialogInterface.BUTTON_NEGATIVE:
                                    //Nao faz nada
                                    break;
                            }
                        }
                    };

                    AlertDialog.Builder builder = new AlertDialog.Builder(Rdc216ExposicaoActivity.this);
                    builder.setMessage("Você ainda não respondeu todas as perguntas. Deseja prosseguir?").setPositiveButton("Sim", dialogClickListener)
                            .setNegativeButton("Voltar", dialogClickListener).show();
                } else {
                    Intent intentVaiProExposicao = new Intent(Rdc216ExposicaoActivity.this, Rdc216Activity.class);
                    intentVaiProExposicao.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                    startActivity(intentVaiProExposicao);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
            }

        } catch (Exception e) {
            Log.i("fail", "creating photofile failed for " + fileName + "path " + image.getAbsolutePath());
        }
    }

    protected void mostraJanelaDescricao(final ItemAvaliacao itemAvaliacao) {

        LayoutInflater layoutInflater = LayoutInflater.from(Rdc216ExposicaoActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Rdc216ExposicaoActivity.this);
        alertDialogBuilder.setTitle("Descrição");
        alertDialogBuilder.setIcon(R.drawable.ic_logo);
        alertDialogBuilder.setView(promptView);


        final EditText descricao = (EditText) promptView.findViewById(R.id.descricao);

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        itemAvaliacao.setDescricao(descricao.getText().toString());
                        ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216ExposicaoActivity.this);
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
