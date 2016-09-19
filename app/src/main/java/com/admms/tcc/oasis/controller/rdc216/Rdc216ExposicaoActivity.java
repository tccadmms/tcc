package com.admms.tcc.oasis.controller.rdc216;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.admms.tcc.oasis.R;

public class Rdc216ExposicaoActivity extends Activity {

    private static final int REQUEST_IMAGE_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exposicao_rdc216);


        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.exposicao_p1);

        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p1 = (RadioButton) findViewById(R.id.exposicao_p1_na);
                RadioButton ad_p1 = (RadioButton) findViewById(R.id.exposicao_p1_ad);
                RadioButton in_p1 = (RadioButton) findViewById(R.id.exposicao_p1_in);

                ImageButton foto_p1 = (ImageButton) findViewById(R.id.exposicao_foto_p1);
                ImageButton descricao_p1 = (ImageButton) findViewById(R.id.exposicao_descricao_p1);


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

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.exposicao_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p2 = (RadioButton) findViewById(R.id.exposicao_p2_na);
                RadioButton ad_p2 = (RadioButton) findViewById(R.id.exposicao_p2_ad);
                RadioButton in_p2 = (RadioButton) findViewById(R.id.exposicao_p2_in);

                ImageButton foto_p2 = (ImageButton) findViewById(R.id.exposicao_foto_p2);
                ImageButton descricao_p2 = (ImageButton) findViewById(R.id.exposicao_descricao_p2);


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

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.exposicao_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p3 = (RadioButton) findViewById(R.id.exposicao_p3_na);
                RadioButton ad_p3 = (RadioButton) findViewById(R.id.exposicao_p3_ad);
                RadioButton in_p3 = (RadioButton) findViewById(R.id.exposicao_p3_in);

                ImageButton foto_p3 = (ImageButton) findViewById(R.id.exposicao_foto_p3);
                ImageButton descricao_p3 = (ImageButton) findViewById(R.id.exposicao_descricao_p3);


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

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.exposicao_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p4 = (RadioButton) findViewById(R.id.exposicao_p4_na);
                RadioButton ad_p4 = (RadioButton) findViewById(R.id.exposicao_p4_ad);
                RadioButton in_p4 = (RadioButton) findViewById(R.id.exposicao_p4_in);

                ImageButton foto_p4 = (ImageButton) findViewById(R.id.exposicao_foto_p4);
                ImageButton descricao_p4 = (ImageButton) findViewById(R.id.exposicao_descricao_p4);


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

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.exposicao_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p5 = (RadioButton) findViewById(R.id.exposicao_p5_na);
                RadioButton ad_p5 = (RadioButton) findViewById(R.id.exposicao_p5_ad);
                RadioButton in_p5 = (RadioButton) findViewById(R.id.exposicao_p5_in);

                ImageButton foto_p5 = (ImageButton) findViewById(R.id.exposicao_foto_p5);
                ImageButton descricao_p5 = (ImageButton) findViewById(R.id.exposicao_descricao_p5);


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

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.exposicao_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p6 = (RadioButton) findViewById(R.id.exposicao_p6_na);
                RadioButton ad_p6 = (RadioButton) findViewById(R.id.exposicao_p6_ad);
                RadioButton in_p6 = (RadioButton) findViewById(R.id.exposicao_p6_in);

                ImageButton foto_p6 = (ImageButton) findViewById(R.id.exposicao_foto_p6);
                ImageButton descricao_p6 = (ImageButton) findViewById(R.id.exposicao_descricao_p6);


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

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.exposicao_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p7 = (RadioButton) findViewById(R.id.exposicao_p7_na);
                RadioButton ad_p7 = (RadioButton) findViewById(R.id.exposicao_p7_ad);
                RadioButton in_p7 = (RadioButton) findViewById(R.id.exposicao_p7_in);

                ImageButton foto_p7 = (ImageButton) findViewById(R.id.exposicao_foto_p7);
                ImageButton descricao_p7 = (ImageButton) findViewById(R.id.exposicao_descricao_p7);


                if (in_p7.isChecked()) {
                    foto_p7.setVisibility(View.VISIBLE);
                    descricao_p7.setVisibility(View.VISIBLE);
                    foto_p7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p7.isChecked()) {
                    foto_p7.setVisibility(View.INVISIBLE);
                    descricao_p7.setVisibility(View.INVISIBLE);
                } else {
                    foto_p7.setVisibility(View.INVISIBLE);
                    descricao_p7.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.exposicao_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p8 = (RadioButton) findViewById(R.id.exposicao_p8_na);
                RadioButton ad_p8 = (RadioButton) findViewById(R.id.exposicao_p8_ad);
                RadioButton in_p8 = (RadioButton) findViewById(R.id.exposicao_p8_in);

                ImageButton foto_p8 = (ImageButton) findViewById(R.id.exposicao_foto_p8);
                ImageButton descricao_p8 = (ImageButton) findViewById(R.id.exposicao_descricao_p8);


                if (in_p8.isChecked()) {
                    foto_p8.setVisibility(View.VISIBLE);
                    descricao_p8.setVisibility(View.VISIBLE);
                    foto_p8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p8.isChecked()) {
                    foto_p8.setVisibility(View.INVISIBLE);
                    descricao_p8.setVisibility(View.INVISIBLE);
                } else {
                    foto_p8.setVisibility(View.INVISIBLE);
                    descricao_p8.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p9 = (RadioGroup) findViewById(R.id.exposicao_p9);


        r_p9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p9 = (RadioButton) findViewById(R.id.exposicao_p9_na);
                RadioButton ad_p9 = (RadioButton) findViewById(R.id.exposicao_p9_ad);
                RadioButton in_p9 = (RadioButton) findViewById(R.id.exposicao_p9_in);

                ImageButton foto_p9 = (ImageButton) findViewById(R.id.exposicao_foto_p9);
                ImageButton descricao_p9 = (ImageButton) findViewById(R.id.exposicao_descricao_p9);


                if (in_p9.isChecked()) {
                    foto_p9.setVisibility(View.VISIBLE);
                    descricao_p9.setVisibility(View.VISIBLE);
                    foto_p9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p9.isChecked()) {
                    foto_p9.setVisibility(View.INVISIBLE);
                    descricao_p9.setVisibility(View.INVISIBLE);
                } else {
                    foto_p9.setVisibility(View.INVISIBLE);
                    descricao_p9.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p10 = (RadioGroup) findViewById(R.id.exposicao_p10);


        r_p10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p10 = (RadioButton) findViewById(R.id.exposicao_p10_na);
                RadioButton ad_p10= (RadioButton) findViewById(R.id.exposicao_p10_ad);
                RadioButton in_p10 = (RadioButton) findViewById(R.id.exposicao_p10_in);

                ImageButton foto_p10 = (ImageButton) findViewById(R.id.exposicao_foto_p10);
                ImageButton descricao_p10 = (ImageButton) findViewById(R.id.exposicao_descricao_p10);


                if (in_p10.isChecked()) {
                    foto_p10.setVisibility(View.VISIBLE);
                    descricao_p10.setVisibility(View.VISIBLE);
                    foto_p10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p10.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p10.isChecked()) {
                    foto_p10.setVisibility(View.INVISIBLE);
                    descricao_p10.setVisibility(View.INVISIBLE);
                } else {
                    foto_p10.setVisibility(View.INVISIBLE);
                    descricao_p10.setVisibility(View.INVISIBLE);
                }
            }
        });


        ImageButton exposicaoSalvar = (ImageButton) findViewById(R.id.exposicao_btnSalvar);
        exposicaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProExposicao = new Intent(Rdc216ExposicaoActivity.this, Rdc216Activity.class);
                startActivity(intentVaiProExposicao);
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
