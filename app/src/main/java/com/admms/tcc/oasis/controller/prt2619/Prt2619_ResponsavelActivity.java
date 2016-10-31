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

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prt2619_ResponsavelActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int REQUEST_IMAGE_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt2619__responsavel);

        Bundle bundle = getIntent().getExtras();
        final int codigoPlanoAcao = bundle.getInt("codigoPlanoAcao");

        itemAvaliacao = ItemAvaliacaoController.criaItemAvaliacao(codigoPlanoAcao, itemAvaliacao, Constantes.AREA_AVALIADA_RESPONSAVEL,this);
        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.responsavel_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.responsavel_p1_na);
                RadioButton ad = (RadioButton) findViewById(R.id.responsavel_p1_ad);
                RadioButton in = (RadioButton) findViewById(R.id.responsavel_p1_in);

                ImageButton foto = (ImageButton) findViewById(R.id.responsavel_foto_p1);
                ImageButton descricao = (ImageButton) findViewById(R.id.responsavel_descricao_p1);


                TextView pergunta = (TextView) findViewById(R.id.responsavel_pergunta1);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ResponsavelActivity.this);
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.responsavel_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.responsavel_p2_na);
                RadioButton ad = (RadioButton) findViewById(R.id.responsavel_p2_ad);
                RadioButton in = (RadioButton) findViewById(R.id.responsavel_p2_in);

                ImageButton foto = (ImageButton) findViewById(R.id.responsavel_foto_p2);
                ImageButton descricao = (ImageButton) findViewById(R.id.responsavel_descricao_p2);


                TextView pergunta = (TextView) findViewById(R.id.responsavel_pergunta2);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ResponsavelActivity.this);
            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.responsavel_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.responsavel_p3_na);
                RadioButton ad = (RadioButton) findViewById(R.id.responsavel_p3_ad);
                RadioButton in = (RadioButton) findViewById(R.id.responsavel_p3_in);

                ImageButton foto = (ImageButton) findViewById(R.id.responsavel_foto_p3);
                ImageButton descricao = (ImageButton) findViewById(R.id.responsavel_descricao_p3);


                TextView pergunta = (TextView) findViewById(R.id.responsavel_pergunta3);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ResponsavelActivity.this);
            }
        });

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.responsavel_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.responsavel_p4_na);
                RadioButton ad = (RadioButton) findViewById(R.id.responsavel_p4_ad);
                RadioButton in = (RadioButton) findViewById(R.id.responsavel_p4_in);

                ImageButton foto = (ImageButton) findViewById(R.id.responsavel_foto_p4);
                ImageButton descricao = (ImageButton) findViewById(R.id.responsavel_descricao_p4);


                TextView pergunta = (TextView) findViewById(R.id.responsavel_pergunta4);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ResponsavelActivity.this);
            }
        });

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.responsavel_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.responsavel_p5_na);
                RadioButton ad = (RadioButton) findViewById(R.id.responsavel_p5_ad);
                RadioButton in = (RadioButton) findViewById(R.id.responsavel_p5_in);

                ImageButton foto = (ImageButton) findViewById(R.id.responsavel_foto_p5);
                ImageButton descricao = (ImageButton) findViewById(R.id.responsavel_descricao_p5);


                TextView pergunta = (TextView) findViewById(R.id.responsavel_pergunta5);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ResponsavelActivity.this);
            }
        });


        ImageButton responsavelSalvar = (ImageButton) findViewById(R.id.responsavel_btnSalvar);
        responsavelSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProResponsavel = new Intent(Prt2619_ResponsavelActivity.this, Prt2619Activity.class);
                intentVaiProResponsavel.putExtra("codigoPlanoAcao",codigoPlanoAcao);
                startActivity(intentVaiProResponsavel);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ResponsavelActivity.this);
            }

        } catch (Exception e) {
            Log.i("fail", "creating photofile failed for " + fileName + "path " + image.getAbsolutePath());
        }
    }

    protected void mostraJanelaDescricao(final ItemAvaliacao itemAvaliacao) {

        LayoutInflater layoutInflater = LayoutInflater.from(Prt2619_ResponsavelActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Prt2619_ResponsavelActivity.this);
        alertDialogBuilder.setTitle("Descrição");
        alertDialogBuilder.setIcon(R.drawable.ic_logo);
        alertDialogBuilder.setView(promptView);


        final EditText descricao = (EditText) promptView.findViewById(R.id.descricao);

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        itemAvaliacao.setDescricao(descricao.getText().toString());
                        ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Prt2619_ResponsavelActivity.this);
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

