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

public class Rdc216ResponsavelActivity extends Activity {

    private ItemAvaliacao itemAvaliacao;
    private static final int NUMERO_PERGUNTAS = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responsavel_rdc216);

        final Context context = Rdc216ResponsavelActivity.this;

        final Bundle bundle = getIntent().getExtras();
        final int codigoPlanoAcao = bundle.getInt("codigoPlanoAcao");

        itemAvaliacao = ItemAvaliacaoController.criaItemAvaliacao(codigoPlanoAcao, itemAvaliacao, Constantes.AREA_AVALIADA_RESPONSAVEL,this);

        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.responsavel_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.responsavel_p1_na);
                RadioButton ad = (RadioButton) findViewById(R.id.responsavel_p1_ad);
                RadioButton in = (RadioButton) findViewById(R.id.responsavel_p1_in);

                ImageButton foto = (ImageButton) findViewById(R.id.responsavel_foto_p1);
                ImageButton descricao = (ImageButton) findViewById(R.id.responsavel_descricao_p1);


                TextView pergunta = (TextView) findViewById(R.id.responsavel_pergunta1);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.responsavel_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.responsavel_p2_na);
                RadioButton ad = (RadioButton) findViewById(R.id.responsavel_p2_ad);
                RadioButton in = (RadioButton) findViewById(R.id.responsavel_p2_in);

                ImageButton foto = (ImageButton) findViewById(R.id.responsavel_foto_p2);
                ImageButton descricao = (ImageButton) findViewById(R.id.responsavel_descricao_p2);


                TextView pergunta = (TextView) findViewById(R.id.responsavel_pergunta2);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.responsavel_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                itemAvaliacao = ItemAvaliacaoController.limpaItemAvaliacao(itemAvaliacao, context);
                RadioButton na = (RadioButton) findViewById(R.id.responsavel_p3_na);
                RadioButton ad = (RadioButton) findViewById(R.id.responsavel_p3_ad);
                RadioButton in = (RadioButton) findViewById(R.id.responsavel_p3_in);

                ImageButton foto = (ImageButton) findViewById(R.id.responsavel_foto_p3);
                ImageButton descricao = (ImageButton) findViewById(R.id.responsavel_descricao_p3);


                TextView pergunta = (TextView) findViewById(R.id.responsavel_pergunta3);
                itemAvaliacao.setPergunta(pergunta.getText().toString());
                UserInterfaceController.radioButtonHandler(na, ad, in, foto, descricao, itemAvaliacao, context);
                ItemAvaliacaoController.salvarItemAvaliacao(itemAvaliacao, context);
            }
        });

        ImageButton responsavelSalvar = (ImageButton) findViewById(R.id.responsavel_btnSalvar);
        responsavelSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PlanoAcao planoAcao = new PlanoAcao();
                planoAcao.setCodigo(codigoPlanoAcao);

                List<ItemAvaliacao> listaItens = ItemAvaliacaoController.buscaItemAvaliacaoPorAreaAvaliada(planoAcao,Constantes.AREA_AVALIADA_RESPONSAVEL, context);

                if (NUMERO_PERGUNTAS != listaItens.size()) {
                    DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which){
                                case DialogInterface.BUTTON_POSITIVE:
                                    Intent intentVaiProResponsavel = new Intent(context, Rdc216Activity.class);
                                    intentVaiProResponsavel.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                                    intentVaiProResponsavel.putExtras(bundle);
                                    startActivity(intentVaiProResponsavel);
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
                    Intent intentVaiProResponsavel = new Intent(context, Rdc216Activity.class);
                    intentVaiProResponsavel.putExtra("codigoPlanoAcao", codigoPlanoAcao);
                    intentVaiProResponsavel.putExtras(bundle);
                    startActivity(intentVaiProResponsavel);
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

        listaRadioButtons.add((RadioButton) findViewById(R.id.responsavel_p1_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.responsavel_p1_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.responsavel_p1_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.responsavel_p2_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.responsavel_p2_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.responsavel_p2_in));
        listaRadioButtons.add((RadioButton) findViewById(R.id.responsavel_p3_na));
        listaRadioButtons.add((RadioButton) findViewById(R.id.responsavel_p3_ad));
        listaRadioButtons.add((RadioButton) findViewById(R.id.responsavel_p3_in));

        listaImageButtons.add((ImageButton) findViewById(R.id.responsavel_foto_p1));
        listaImageButtons.add((ImageButton) findViewById(R.id.responsavel_descricao_p1));
        listaImageButtons.add((ImageButton) findViewById(R.id.responsavel_foto_p2));
        listaImageButtons.add((ImageButton) findViewById(R.id.responsavel_descricao_p2));
        listaImageButtons.add((ImageButton) findViewById(R.id.responsavel_foto_p3));
        listaImageButtons.add((ImageButton) findViewById(R.id.responsavel_descricao_p3));

        listaTextViews.add((TextView) findViewById(R.id.responsavel_pergunta1));
        listaTextViews.add((TextView) findViewById(R.id.responsavel_pergunta2));
        listaTextViews.add((TextView) findViewById(R.id.responsavel_pergunta3));

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
