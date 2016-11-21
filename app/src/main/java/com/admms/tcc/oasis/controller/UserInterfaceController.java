package com.admms.tcc.oasis.controller;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.entity.Constantes;
import com.admms.tcc.oasis.entity.ItemAvaliacao;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by DemonHide-RB on 11/19/2016.
 */
public class UserInterfaceController {

    private static final int REQUEST_IMAGE_PICTURE = 1;

    private static void mostraJanelaDescricao(final ItemAvaliacao itemAvaliacao, final Context context) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle("Descrição");
        alertDialogBuilder.setIcon(R.drawable.ic_logo);
        alertDialogBuilder.setView(promptView);


        final EditText descricao = (EditText) promptView.findViewById(R.id.descricao);

        if (itemAvaliacao.getDescricao() != null) {
            descricao.setText(itemAvaliacao.getDescricao());
        } else {
            descricao.setText("");
        }

        alertDialogBuilder.setCancelable(false)
                .setPositiveButton("Salvar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        itemAvaliacao.setDescricao(descricao.getText().toString());
                        ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
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

    private static void tirarFotoIntent(ItemAvaliacao itemAvaliacao, Context context) {
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

            vaiPraCamera.putExtra(MediaStore.EXTRA_OUTPUT,uriSavedImage);

            if (vaiPraCamera.resolveActivity(context.getPackageManager())!= null) {
                ((Activity) context).startActivityForResult(vaiPraCamera, REQUEST_IMAGE_PICTURE);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }

        } catch (Exception e) {
            Log.i("fail","creating photofile failed for " + fileName + "path " + image.getAbsolutePath());
        }
    }

    public static ItemAvaliacao radioButtonHandler(RadioButton naoAplica, RadioButton adequado, RadioButton inadequado, ImageButton foto, ImageButton descricao, final ItemAvaliacao itemAvaliacao,
                                    final Context context) {

        if (inadequado.isChecked()) {
            foto.setVisibility(View.VISIBLE);
            descricao.setVisibility(View.VISIBLE);
            foto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    tirarFotoIntent(itemAvaliacao, context);
                }
            });
            descricao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mostraJanelaDescricao(itemAvaliacao, context);
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

        return itemAvaliacao;
    }

    public static void radioButtonPopulate(RadioButton naoAplica, RadioButton adequado, RadioButton inadequado, ImageButton foto, ImageButton descricao, ItemAvaliacao itemAvaliacao, Context context) {

        itemAvaliacao =  ItemAvaliacaoController.buscarItemAvaliacao(itemAvaliacao, context);
        if ((itemAvaliacao != null) && (itemAvaliacao.getConformidade() != null)) {
            if (itemAvaliacao.getConformidade().equals(Constantes.CONFORMIDADE_INADEQUADA)) {
                inadequado.setChecked(true);
                foto.setVisibility(View.VISIBLE);
                descricao.setVisibility(View.VISIBLE);
            } else if (itemAvaliacao.getConformidade().equals(Constantes.CONFORMIDADE_NA)) {
                naoAplica.setChecked(true);
                foto.setVisibility(View.INVISIBLE);
                descricao.setVisibility(View.INVISIBLE);
            } else if (itemAvaliacao.getConformidade().equals(Constantes.CONFORMIDADE_ADEQUADA)) {
                adequado.setChecked(true);
                foto.setVisibility(View.INVISIBLE);
                descricao.setVisibility(View.INVISIBLE);
            }
        }
    }

}
