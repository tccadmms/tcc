package com.admms.tcc.oasis.controller.rdc216;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.admms.tcc.oasis.R;

public class Rdc216ArmazenamentoActivity extends AppCompatActivity {

    private static final int REQUEST_IMAGE_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_armazenamento_rdc216);

        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.armazenamento_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p1 = (RadioButton) findViewById(R.id.armazenamento_p1_na);
                RadioButton ad_p1 = (RadioButton) findViewById(R.id.armazenamento_p1_ad);
                RadioButton in_p1 = (RadioButton) findViewById(R.id.armazenamento_p1_in);

                ImageButton foto_p1 = (ImageButton) findViewById(R.id.armazenamento_foto_p1);
                ImageButton descricao_p1 = (ImageButton) findViewById(R.id.armazenamento_descricao_p1);


                if (in_p1.isChecked()) {
                    foto_p1.setVisibility(View.VISIBLE);
                    descricao_p1.setVisibility(View.VISIBLE);
                    foto_p1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p1.isChecked()) {
                    foto_p1.setVisibility(View.INVISIBLE);
                    descricao_p1.setVisibility(View.INVISIBLE);
                } else {
                    foto_p1.setVisibility(View.INVISIBLE);
                    descricao_p1.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.armazenamento_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p2 = (RadioButton) findViewById(R.id.armazenamento_p2_na);
                RadioButton ad_p2 = (RadioButton) findViewById(R.id.armazenamento_p2_ad);
                RadioButton in_p2 = (RadioButton) findViewById(R.id.armazenamento_p2_in);

                ImageButton foto_p2 = (ImageButton) findViewById(R.id.armazenamento_foto_p2);
                ImageButton descricao_p2 = (ImageButton) findViewById(R.id.armazenamento_descricao_p2);


                if (in_p2.isChecked()) {
                    foto_p2.setVisibility(View.VISIBLE);
                    descricao_p2.setVisibility(View.VISIBLE);
                    foto_p2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p2.isChecked()) {
                    foto_p2.setVisibility(View.INVISIBLE);
                    descricao_p2.setVisibility(View.INVISIBLE);
                } else {
                    foto_p2.setVisibility(View.INVISIBLE);
                    descricao_p2.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.armazenamento_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p3 = (RadioButton) findViewById(R.id.armazenamento_p3_na);
                RadioButton ad_p3 = (RadioButton) findViewById(R.id.armazenamento_p3_ad);
                RadioButton in_p3 = (RadioButton) findViewById(R.id.armazenamento_p3_in);

                ImageButton foto_p3 = (ImageButton) findViewById(R.id.armazenamento_foto_p3);
                ImageButton descricao_p3 = (ImageButton) findViewById(R.id.armazenamento_descricao_p3);


                if (in_p3.isChecked()) {
                    foto_p3.setVisibility(View.VISIBLE);
                    descricao_p3.setVisibility(View.VISIBLE);
                    foto_p3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p3.isChecked()) {
                    foto_p3.setVisibility(View.INVISIBLE);
                    descricao_p3.setVisibility(View.INVISIBLE);
                } else {
                    foto_p3.setVisibility(View.INVISIBLE);
                    descricao_p3.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.armazenamento_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p4 = (RadioButton) findViewById(R.id.armazenamento_p4_na);
                RadioButton ad_p4 = (RadioButton) findViewById(R.id.armazenamento_p4_ad);
                RadioButton in_p4 = (RadioButton) findViewById(R.id.armazenamento_p4_in);

                ImageButton foto_p4 = (ImageButton) findViewById(R.id.armazenamento_foto_p4);
                ImageButton descricao_p4 = (ImageButton) findViewById(R.id.armazenamento_descricao_p4);


                if (in_p4.isChecked()) {
                    foto_p4.setVisibility(View.VISIBLE);
                    descricao_p4.setVisibility(View.VISIBLE);
                    foto_p4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p4.isChecked()) {
                    foto_p4.setVisibility(View.INVISIBLE);
                    descricao_p4.setVisibility(View.INVISIBLE);
                } else {
                    foto_p4.setVisibility(View.INVISIBLE);
                    descricao_p4.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.armazenamento_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p5 = (RadioButton) findViewById(R.id.armazenamento_p5_na);
                RadioButton ad_p5 = (RadioButton) findViewById(R.id.armazenamento_p5_ad);
                RadioButton in_p5 = (RadioButton) findViewById(R.id.armazenamento_p5_in);

                ImageButton foto_p5 = (ImageButton) findViewById(R.id.armazenamento_foto_p5);
                ImageButton descricao_p5 = (ImageButton) findViewById(R.id.armazenamento_descricao_p5);


                if (in_p5.isChecked()) {
                    foto_p5.setVisibility(View.VISIBLE);
                    descricao_p5.setVisibility(View.VISIBLE);
                    foto_p5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p5.isChecked()) {
                    foto_p5.setVisibility(View.INVISIBLE);
                    descricao_p5.setVisibility(View.INVISIBLE);
                } else {
                    foto_p5.setVisibility(View.INVISIBLE);
                    descricao_p5.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.armazenamento_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p6 = (RadioButton) findViewById(R.id.armazenamento_p6_na);
                RadioButton ad_p6 = (RadioButton) findViewById(R.id.armazenamento_p6_ad);
                RadioButton in_p6 = (RadioButton) findViewById(R.id.armazenamento_p6_in);

                ImageButton foto_p6 = (ImageButton) findViewById(R.id.armazenamento_foto_p6);
                ImageButton descricao_p6 = (ImageButton) findViewById(R.id.armazenamento_descricao_p6);


                if (in_p6.isChecked()) {
                    foto_p6.setVisibility(View.VISIBLE);
                    descricao_p6.setVisibility(View.VISIBLE);
                    foto_p6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p6.isChecked()) {
                    foto_p6.setVisibility(View.INVISIBLE);
                    descricao_p6.setVisibility(View.INVISIBLE);
                } else {
                    foto_p6.setVisibility(View.INVISIBLE);
                    descricao_p6.setVisibility(View.INVISIBLE);
                }
            }
        });

        ImageButton armazenamentoSalvar = (ImageButton) findViewById(R.id.armazenamento_btnSalvar);
        armazenamentoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProArmazenamento = new Intent(Rdc216ArmazenamentoActivity.this, Rdc216Activity.class);
                startActivity(intentVaiProArmazenamento);
            }
        });

    }

    private void tirarFotoIntent() {
        Intent vaiPraCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (vaiPraCamera.resolveActivity(getPackageManager())!= null) {
            startActivityForResult(vaiPraCamera, REQUEST_IMAGE_PICTURE);
        }
    }

    protected void mostraJanelaDescricao() {


        LayoutInflater layoutInflater = LayoutInflater.from(Rdc216ArmazenamentoActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Rdc216ArmazenamentoActivity.this);
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

}