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

public class Rdc216SaneamentoActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int REQUEST_IMAGE_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saneamento_rdc2016);

        Bundle bundle = getIntent().getExtras();
        final int codigoPlanoAcao = bundle.getInt("codigoPlanoAcao");

        itemAvaliacao = ItemAvaliacaoController.criaItemAvaliacao(codigoPlanoAcao, itemAvaliacao, Constantes.AREA_AVALIADA_SANEAMENTO,this);

        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.saneamento_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.saneamento_p1_na);
                RadioButton ad = (RadioButton) findViewById(R.id.saneamento_p1_ad);
                RadioButton in = (RadioButton) findViewById(R.id.saneamento_p1_in);

                ImageButton foto = (ImageButton) findViewById(R.id.saneamento_foto_p1);
                ImageButton descricao = (ImageButton) findViewById(R.id.saneamento_descricao_p1);


                TextView pergunta = (TextView) findViewById(R.id.saneamento_pergunta1);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.saneamento_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.saneamento_p2_na);
                RadioButton ad = (RadioButton) findViewById(R.id.saneamento_p2_ad);
                RadioButton in = (RadioButton) findViewById(R.id.saneamento_p2_in);

                ImageButton foto = (ImageButton) findViewById(R.id.saneamento_foto_p2);
                ImageButton descricao = (ImageButton) findViewById(R.id.saneamento_descricao_p2);


                TextView pergunta = (TextView) findViewById(R.id.saneamento_pergunta2);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.saneamento_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.saneamento_p3_na);
                RadioButton ad = (RadioButton) findViewById(R.id.saneamento_p3_ad);
                RadioButton in = (RadioButton) findViewById(R.id.saneamento_p3_in);

                ImageButton foto = (ImageButton) findViewById(R.id.saneamento_foto_p3);
                ImageButton descricao = (ImageButton) findViewById(R.id.saneamento_descricao_p3);


                TextView pergunta = (TextView) findViewById(R.id.saneamento_pergunta3);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
            }
        });

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.saneamento_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.saneamento_p4_na);
                RadioButton ad = (RadioButton) findViewById(R.id.saneamento_p4_ad);
                RadioButton in = (RadioButton) findViewById(R.id.saneamento_p4_in);

                ImageButton foto = (ImageButton) findViewById(R.id.saneamento_foto_p4);
                ImageButton descricao = (ImageButton) findViewById(R.id.saneamento_descricao_p4);


                TextView pergunta = (TextView) findViewById(R.id.saneamento_pergunta4);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
            }
        });

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.saneamento_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.saneamento_p5_na);
                RadioButton ad = (RadioButton) findViewById(R.id.saneamento_p5_ad);
                RadioButton in = (RadioButton) findViewById(R.id.saneamento_p5_in);

                ImageButton foto = (ImageButton) findViewById(R.id.saneamento_foto_p5);
                ImageButton descricao = (ImageButton) findViewById(R.id.saneamento_descricao_p5);


                TextView pergunta = (TextView) findViewById(R.id.saneamento_pergunta5);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
            }
        });

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.saneamento_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.saneamento_p6_na);
                RadioButton ad = (RadioButton) findViewById(R.id.saneamento_p6_ad);
                RadioButton in = (RadioButton) findViewById(R.id.saneamento_p6_in);

                ImageButton foto = (ImageButton) findViewById(R.id.saneamento_foto_p6);
                ImageButton descricao = (ImageButton) findViewById(R.id.saneamento_descricao_p6);


                TextView pergunta = (TextView) findViewById(R.id.saneamento_pergunta6);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
            }
        });

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.saneamento_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.saneamento_p7_na);
                RadioButton ad = (RadioButton) findViewById(R.id.saneamento_p7_ad);
                RadioButton in = (RadioButton) findViewById(R.id.saneamento_p7_in);

                ImageButton foto = (ImageButton) findViewById(R.id.saneamento_foto_p7);
                ImageButton descricao = (ImageButton) findViewById(R.id.saneamento_descricao_p7);


                TextView pergunta = (TextView) findViewById(R.id.saneamento_pergunta7);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
            }
        });

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.saneamento_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao);
                RadioButton na = (RadioButton) findViewById(R.id.saneamento_p8_na);
                RadioButton ad = (RadioButton) findViewById(R.id.saneamento_p8_ad);
                RadioButton in = (RadioButton) findViewById(R.id.saneamento_p8_in);

                ImageButton foto = (ImageButton) findViewById(R.id.saneamento_foto_p8);
                ImageButton descricao = (ImageButton) findViewById(R.id.saneamento_descricao_p8);


                TextView pergunta = (TextView) findViewById(R.id.saneamento_pergunta8);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
            }
        });

        ImageButton saneamentoSalvar = (ImageButton) findViewById(R.id.saneamento_btnSalvar);
        saneamentoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProSaneamento = new Intent(Rdc216SaneamentoActivity.this, Rdc216Activity.class);
                intentVaiProSaneamento.putExtra("codigoPlanoAcao",codigoPlanoAcao);
                startActivity(intentVaiProSaneamento);
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
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
            }

        } catch (Exception e) {
            Log.i("fail", "creating photofile failed for " + fileName + "path " + image.getAbsolutePath());
        }
    }

    protected void mostraJanelaDescricao(final ItemAvaliacao itemAvaliacao) {

        LayoutInflater layoutInflater = LayoutInflater.from(Rdc216SaneamentoActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Rdc216SaneamentoActivity.this);
        alertDialogBuilder.setTitle("Descrição");
        alertDialogBuilder.setIcon(R.drawable.ic_logo);
        alertDialogBuilder.setView(promptView);


        final EditText descricao = (EditText) promptView.findViewById(R.id.descricao);

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        itemAvaliacao.setDescricao(descricao.getText().toString());
                        ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, Rdc216SaneamentoActivity.this);
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
