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
import com.admms.tcc.oasis.controller.principal.ArquivoHandler;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.ItemAvaliacao;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Rdc216HigieneActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int REQUEST_IMAGE_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_higiene_rdc216);

        Bundle bundle = getIntent().getExtras();
        final int codigoPlanoAcao = bundle.getInt("codigoPlanoAcao");

        itemAvaliacao = ItemAvaliacaoController.criaItemAvaliacao(codigoPlanoAcao, itemAvaliacao, Constantes.AREA_AVALIADA_HIGIENE,this);

        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.higiene_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p1_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p1_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p1_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p1);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p1);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta1);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.higiene_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p2_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p2_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p2_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p2);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p2);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta2);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.higiene_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p3_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p3_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p3_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p3);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p3);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta3);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.higiene_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p4_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p4_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p4_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p4);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p4);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta4);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.higiene_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p5_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p5_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p5_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p5);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p5);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta5);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.higiene_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p6_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p6_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p6_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p6);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p6);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta6);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.higiene_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p7_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p7_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p7_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p7);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p7);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta7);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.higiene_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p8_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p8_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p8_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p8);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p8);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta8);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p9 = (RadioGroup) findViewById(R.id.higiene_p9);


        r_p9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p9_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p9_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p9_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p9);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p9);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta9);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p10 = (RadioGroup) findViewById(R.id.higiene_p10);


        r_p10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p10_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p10_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p10_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p10);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p10);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta10);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p11 = (RadioGroup) findViewById(R.id.higiene_p11);


        r_p11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p11_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p11_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p11_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p11);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p11);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta11);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p12 = (RadioGroup) findViewById(R.id.higiene_p12);


        r_p12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p12_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p12_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p12_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p12);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p12);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta12);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p13 = (RadioGroup) findViewById(R.id.higiene_p13);


        r_p13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p13_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p13_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p13_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p13);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p13);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta13);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p14 = (RadioGroup) findViewById(R.id.higiene_p14);


        r_p14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p14_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p14_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p14_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p14);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p14);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta14);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p15 = (RadioGroup) findViewById(R.id.higiene_p15);


        r_p15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p15_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p15_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p15_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p15);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p15);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta15);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p16 = (RadioGroup) findViewById(R.id.higiene_p16);


        r_p16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p16_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p16_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p16_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p16);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p16);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta16);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        RadioGroup r_p17 = (RadioGroup) findViewById(R.id.higiene_p17);


        r_p17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.higiene_p17_na);
                RadioButton ad = (RadioButton) findViewById(R.id.higiene_p17_ad);
                RadioButton in = (RadioButton) findViewById(R.id.higiene_p17_in);

                ImageButton foto = (ImageButton) findViewById(R.id.higiene_foto_p17);
                ImageButton descricao = (ImageButton) findViewById(R.id.higiene_descricao_p17);


                TextView pergunta = (TextView) findViewById(R.id.higiene_pergunta17);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }
        });

        ImageButton higieneSalvar = (ImageButton) findViewById(R.id.higiene_btnSalvar);
        higieneSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProHigiene = new Intent(Rdc216HigieneActivity.this, Rdc216Activity.class);
                intentVaiProHigiene.putExtra("codigoPlanoAcao",codigoPlanoAcao);
                startActivity(intentVaiProHigiene);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
            }

        } catch (Exception e) {
            Log.i("fail", "creating photofile failed for " + fileName + "path " + image.getAbsolutePath());
        }
    }

    protected void mostraJanelaDescricao(final ItemAvaliacao itemAvaliacao) {

        LayoutInflater layoutInflater = LayoutInflater.from(Rdc216HigieneActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Rdc216HigieneActivity.this);
        alertDialogBuilder.setTitle("Descrição");
        alertDialogBuilder.setIcon(R.drawable.ic_logo);
        alertDialogBuilder.setView(promptView);


        final EditText descricao = (EditText) promptView.findViewById(R.id.descricao);

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        itemAvaliacao.setDescricao(descricao.getText().toString());
                        ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216HigieneActivity.this);
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
