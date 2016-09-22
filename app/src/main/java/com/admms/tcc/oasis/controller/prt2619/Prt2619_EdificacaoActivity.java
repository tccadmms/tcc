package com.admms.tcc.oasis.controller.prt2619;

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
import com.admms.tcc.oasis.controller.rdc216.Rdc216Activity;

public class Prt2619_EdificacaoActivity extends Activity {

    private static final int REQUEST_IMAGE_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt2619__edificacao);



        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.edificacao_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p1 = (RadioButton) findViewById(R.id.edificacao_p1_na);
                RadioButton ad_p1 = (RadioButton) findViewById(R.id.edificacao_p1_ad);
                RadioButton in_p1 = (RadioButton) findViewById(R.id.edificacao_p1_in);

                ImageButton foto_p1 = (ImageButton) findViewById(R.id.edificacao_foto_p1);
                ImageButton descricao_p1 = (ImageButton) findViewById(R.id.edificacao_descricao_p1);


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

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.edificacao_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p2 = (RadioButton) findViewById(R.id.edificacao_p2_na);
                RadioButton ad_p2 = (RadioButton) findViewById(R.id.edificacao_p2_ad);
                RadioButton in_p2 = (RadioButton) findViewById(R.id.edificacao_p2_in);

                ImageButton foto_p2 = (ImageButton) findViewById(R.id.edificacao_foto_p2);
                ImageButton descricao_p2 = (ImageButton) findViewById(R.id.edificacao_descricao_p2);


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

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.edificacao_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p3 = (RadioButton) findViewById(R.id.edificacao_p3_na);
                RadioButton ad_p3 = (RadioButton) findViewById(R.id.edificacao_p3_ad);
                RadioButton in_p3 = (RadioButton) findViewById(R.id.edificacao_p3_in);

                ImageButton foto_p3 = (ImageButton) findViewById(R.id.edificacao_foto_p3);
                ImageButton descricao_p3 = (ImageButton) findViewById(R.id.edificacao_descricao_p3);


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

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.edificacao_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p4 = (RadioButton) findViewById(R.id.edificacao_p4_na);
                RadioButton ad_p4 = (RadioButton) findViewById(R.id.edificacao_p4_ad);
                RadioButton in_p4 = (RadioButton) findViewById(R.id.edificacao_p4_in);

                ImageButton foto_p4 = (ImageButton) findViewById(R.id.edificacao_foto_p4);
                ImageButton descricao_p4 = (ImageButton) findViewById(R.id.edificacao_descricao_p4);


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

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.edificacao_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p5 = (RadioButton) findViewById(R.id.edificacao_p5_na);
                RadioButton ad_p5 = (RadioButton) findViewById(R.id.edificacao_p5_ad);
                RadioButton in_p5 = (RadioButton) findViewById(R.id.edificacao_p5_in);

                ImageButton foto_p5 = (ImageButton) findViewById(R.id.edificacao_foto_p5);
                ImageButton descricao_p5 = (ImageButton) findViewById(R.id.edificacao_descricao_p5);


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

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.edificacao_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p6 = (RadioButton) findViewById(R.id.edificacao_p6_na);
                RadioButton ad_p6 = (RadioButton) findViewById(R.id.edificacao_p6_ad);
                RadioButton in_p6 = (RadioButton) findViewById(R.id.edificacao_p6_in);

                ImageButton foto_p6 = (ImageButton) findViewById(R.id.edificacao_foto_p6);
                ImageButton descricao_p6 = (ImageButton) findViewById(R.id.edificacao_descricao_p6);


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

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.edificacao_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p7 = (RadioButton) findViewById(R.id.edificacao_p7_na);
                RadioButton ad_p7 = (RadioButton) findViewById(R.id.edificacao_p7_ad);
                RadioButton in_p7 = (RadioButton) findViewById(R.id.edificacao_p7_in);

                ImageButton foto_p7 = (ImageButton) findViewById(R.id.edificacao_foto_p7);
                ImageButton descricao_p7 = (ImageButton) findViewById(R.id.edificacao_descricao_p7);


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

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.edificacao_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p8 = (RadioButton) findViewById(R.id.edificacao_p8_na);
                RadioButton ad_p8 = (RadioButton) findViewById(R.id.edificacao_p8_ad);
                RadioButton in_p8 = (RadioButton) findViewById(R.id.edificacao_p8_in);

                ImageButton foto_p8 = (ImageButton) findViewById(R.id.edificacao_foto_p8);
                ImageButton descricao_p8 = (ImageButton) findViewById(R.id.edificacao_descricao_p8);


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

        RadioGroup r_p9 = (RadioGroup) findViewById(R.id.edificacao_p9);


        r_p9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p9 = (RadioButton) findViewById(R.id.edificacao_p9_na);
                RadioButton ad_p9 = (RadioButton) findViewById(R.id.edificacao_p9_ad);
                RadioButton in_p9 = (RadioButton) findViewById(R.id.edificacao_p9_in);

                ImageButton foto_p9 = (ImageButton) findViewById(R.id.edificacao_foto_p9);
                ImageButton descricao_p9 = (ImageButton) findViewById(R.id.edificacao_descricao_p9);


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

        RadioGroup r_p10 = (RadioGroup) findViewById(R.id.edificacao_p10);


        r_p10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p10 = (RadioButton) findViewById(R.id.edificacao_p10_na);
                RadioButton ad_p10= (RadioButton) findViewById(R.id.edificacao_p10_ad);
                RadioButton in_p10 = (RadioButton) findViewById(R.id.edificacao_p10_in);

                ImageButton foto_p10 = (ImageButton) findViewById(R.id.edificacao_foto_p10);
                ImageButton descricao_p10 = (ImageButton) findViewById(R.id.edificacao_descricao_p10);


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

        RadioGroup r_p11 = (RadioGroup) findViewById(R.id.edificacao_p11);


        r_p11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p11 = (RadioButton) findViewById(R.id.edificacao_p11_na);
                RadioButton ad_p11 = (RadioButton) findViewById(R.id.edificacao_p11_ad);
                RadioButton in_p11 = (RadioButton) findViewById(R.id.edificacao_p11_in);

                ImageButton foto_p11 = (ImageButton) findViewById(R.id.edificacao_foto_p11);
                ImageButton descricao_p11 = (ImageButton) findViewById(R.id.edificacao_descricao_p11);


                if (in_p11.isChecked()) {
                    foto_p11.setVisibility(View.VISIBLE);
                    descricao_p11.setVisibility(View.VISIBLE);
                    foto_p11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p11.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p11.isChecked()) {
                    foto_p11.setVisibility(View.INVISIBLE);
                    descricao_p11.setVisibility(View.INVISIBLE);
                } else {
                    foto_p11.setVisibility(View.INVISIBLE);
                    descricao_p11.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p12 = (RadioGroup) findViewById(R.id.edificacao_p12);


        r_p12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p12 = (RadioButton) findViewById(R.id.edificacao_p12_na);
                RadioButton ad_p12 = (RadioButton) findViewById(R.id.edificacao_p12_ad);
                RadioButton in_p12 = (RadioButton) findViewById(R.id.edificacao_p12_in);

                ImageButton foto_p12 = (ImageButton) findViewById(R.id.edificacao_foto_p12);
                ImageButton descricao_p12 = (ImageButton) findViewById(R.id.edificacao_descricao_p12);


                if (in_p12.isChecked()) {
                    foto_p12.setVisibility(View.VISIBLE);
                    descricao_p12.setVisibility(View.VISIBLE);
                    foto_p12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p12.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p12.isChecked()) {
                    foto_p12.setVisibility(View.INVISIBLE);
                    descricao_p12.setVisibility(View.INVISIBLE);
                } else {
                    foto_p12.setVisibility(View.INVISIBLE);
                    descricao_p12.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p13 = (RadioGroup) findViewById(R.id.edificacao_p13);


        r_p13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p13 = (RadioButton) findViewById(R.id.edificacao_p13_na);
                RadioButton ad_p13 = (RadioButton) findViewById(R.id.edificacao_p13_ad);
                RadioButton in_p13 = (RadioButton) findViewById(R.id.edificacao_p13_in);

                ImageButton foto_p13 = (ImageButton) findViewById(R.id.edificacao_foto_p13);
                ImageButton descricao_p13 = (ImageButton) findViewById(R.id.edificacao_descricao_p13);


                if (in_p13.isChecked()) {
                    foto_p13.setVisibility(View.VISIBLE);
                    descricao_p13.setVisibility(View.VISIBLE);
                    foto_p13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p13.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p13.isChecked()) {
                    foto_p13.setVisibility(View.INVISIBLE);
                    descricao_p13.setVisibility(View.INVISIBLE);
                } else {
                    foto_p13.setVisibility(View.INVISIBLE);
                    descricao_p13.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p14 = (RadioGroup) findViewById(R.id.edificacao_p14);


        r_p14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p14 = (RadioButton) findViewById(R.id.edificacao_p14_na);
                RadioButton ad_p14 = (RadioButton) findViewById(R.id.edificacao_p14_ad);
                RadioButton in_p14 = (RadioButton) findViewById(R.id.edificacao_p14_in);

                ImageButton foto_p14 = (ImageButton) findViewById(R.id.edificacao_foto_p14);
                ImageButton descricao_p14 = (ImageButton) findViewById(R.id.edificacao_descricao_p14);


                if (in_p14.isChecked()) {
                    foto_p14.setVisibility(View.VISIBLE);
                    descricao_p14.setVisibility(View.VISIBLE);
                    foto_p14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p14.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p14.isChecked()) {
                    foto_p14.setVisibility(View.INVISIBLE);
                    descricao_p14.setVisibility(View.INVISIBLE);
                } else {
                    foto_p14.setVisibility(View.INVISIBLE);
                    descricao_p14.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p15 = (RadioGroup) findViewById(R.id.edificacao_p15);


        r_p15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p15 = (RadioButton) findViewById(R.id.edificacao_p15_na);
                RadioButton ad_p15 = (RadioButton) findViewById(R.id.edificacao_p15_ad);
                RadioButton in_p15 = (RadioButton) findViewById(R.id.edificacao_p15_in);

                ImageButton foto_p15 = (ImageButton) findViewById(R.id.edificacao_foto_p15);
                ImageButton descricao_p15 = (ImageButton) findViewById(R.id.edificacao_descricao_p15);


                if (in_p15.isChecked()) {
                    foto_p15.setVisibility(View.VISIBLE);
                    descricao_p15.setVisibility(View.VISIBLE);
                    foto_p15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p15.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p15.isChecked()) {
                    foto_p15.setVisibility(View.INVISIBLE);
                    descricao_p15.setVisibility(View.INVISIBLE);
                } else {
                    foto_p15.setVisibility(View.INVISIBLE);
                    descricao_p15.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p16 = (RadioGroup) findViewById(R.id.edificacao_p16);


        r_p16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p16 = (RadioButton) findViewById(R.id.edificacao_p16_na);
                RadioButton ad_p16 = (RadioButton) findViewById(R.id.edificacao_p16_ad);
                RadioButton in_p16 = (RadioButton) findViewById(R.id.edificacao_p16_in);

                ImageButton foto_p16 = (ImageButton) findViewById(R.id.edificacao_foto_p16);
                ImageButton descricao_p16 = (ImageButton) findViewById(R.id.edificacao_descricao_p16);


                if (in_p16.isChecked()) {
                    foto_p16.setVisibility(View.VISIBLE);
                    descricao_p16.setVisibility(View.VISIBLE);
                    foto_p16.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p16.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p16.isChecked()) {
                    foto_p16.setVisibility(View.INVISIBLE);
                    descricao_p16.setVisibility(View.INVISIBLE);
                } else {
                    foto_p16.setVisibility(View.INVISIBLE);
                    descricao_p16.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p17 = (RadioGroup) findViewById(R.id.edificacao_p17);


        r_p17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p17 = (RadioButton) findViewById(R.id.edificacao_p17_na);
                RadioButton ad_p17 = (RadioButton) findViewById(R.id.edificacao_p17_ad);
                RadioButton in_p17 = (RadioButton) findViewById(R.id.edificacao_p17_in);

                ImageButton foto_p17 = (ImageButton) findViewById(R.id.edificacao_foto_p17);
                ImageButton descricao_p17 = (ImageButton) findViewById(R.id.edificacao_descricao_p17);


                if (in_p17.isChecked()) {
                    foto_p17.setVisibility(View.VISIBLE);
                    descricao_p17.setVisibility(View.VISIBLE);
                    foto_p17.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p17.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p17.isChecked()) {
                    foto_p17.setVisibility(View.INVISIBLE);
                    descricao_p17.setVisibility(View.INVISIBLE);
                } else {
                    foto_p17.setVisibility(View.INVISIBLE);
                    descricao_p17.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p18 = (RadioGroup) findViewById(R.id.edificacao_p18);


        r_p18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p18 = (RadioButton) findViewById(R.id.edificacao_p18_na);
                RadioButton ad_p18 = (RadioButton) findViewById(R.id.edificacao_p18_ad);
                RadioButton in_p18 = (RadioButton) findViewById(R.id.edificacao_p18_in);

                ImageButton foto_p18 = (ImageButton) findViewById(R.id.edificacao_foto_p18);
                ImageButton descricao_p18 = (ImageButton) findViewById(R.id.edificacao_descricao_p18);


                if (in_p18.isChecked()) {
                    foto_p18.setVisibility(View.VISIBLE);
                    descricao_p18.setVisibility(View.VISIBLE);
                    foto_p18.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p18.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p18.isChecked()) {
                    foto_p18.setVisibility(View.INVISIBLE);
                    descricao_p18.setVisibility(View.INVISIBLE);
                } else {
                    foto_p18.setVisibility(View.INVISIBLE);
                    descricao_p18.setVisibility(View.INVISIBLE);
                }
            }
        });


        RadioGroup r_p19 = (RadioGroup) findViewById(R.id.edificacao_p19);


        r_p19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p19 = (RadioButton) findViewById(R.id.edificacao_p19_na);
                RadioButton ad_p19 = (RadioButton) findViewById(R.id.edificacao_p19_ad);
                RadioButton in_p19 = (RadioButton) findViewById(R.id.edificacao_p19_in);

                ImageButton foto_p19 = (ImageButton) findViewById(R.id.edificacao_foto_p19);
                ImageButton descricao_p19 = (ImageButton) findViewById(R.id.edificacao_descricao_p19);


                if (in_p19.isChecked()) {
                    foto_p19.setVisibility(View.VISIBLE);
                    descricao_p19.setVisibility(View.VISIBLE);
                    foto_p19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p19.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p19.isChecked()) {
                    foto_p19.setVisibility(View.INVISIBLE);
                    descricao_p19.setVisibility(View.INVISIBLE);
                } else {
                    foto_p19.setVisibility(View.INVISIBLE);
                    descricao_p19.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p20 = (RadioGroup) findViewById(R.id.edificacao_p20);


        r_p20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p20 = (RadioButton) findViewById(R.id.edificacao_p20_na);
                RadioButton ad_p20 = (RadioButton) findViewById(R.id.edificacao_p20_ad);
                RadioButton in_p20 = (RadioButton) findViewById(R.id.edificacao_p20_in);

                ImageButton foto_p20 = (ImageButton) findViewById(R.id.edificacao_foto_p20);
                ImageButton descricao_p20 = (ImageButton) findViewById(R.id.edificacao_descricao_p20);


                if (in_p20.isChecked()) {
                    foto_p20.setVisibility(View.VISIBLE);
                    descricao_p20.setVisibility(View.VISIBLE);
                    foto_p20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p20.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p20.isChecked()) {
                    foto_p20.setVisibility(View.INVISIBLE);
                    descricao_p20.setVisibility(View.INVISIBLE);
                } else {
                    foto_p20.setVisibility(View.INVISIBLE);
                    descricao_p20.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p21 = (RadioGroup) findViewById(R.id.edificacao_p21);


        r_p21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p21 = (RadioButton) findViewById(R.id.edificacao_p21_na);
                RadioButton ad_p21 = (RadioButton) findViewById(R.id.edificacao_p21_ad);
                RadioButton in_p21 = (RadioButton) findViewById(R.id.edificacao_p21_in);

                ImageButton foto_p21 = (ImageButton) findViewById(R.id.edificacao_foto_p21);
                ImageButton descricao_p21 = (ImageButton) findViewById(R.id.edificacao_descricao_p21);


                if (in_p21.isChecked()) {
                    foto_p21.setVisibility(View.VISIBLE);
                    descricao_p21.setVisibility(View.VISIBLE);
                    foto_p21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p21.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p21.isChecked()) {
                    foto_p21.setVisibility(View.INVISIBLE);
                    descricao_p21.setVisibility(View.INVISIBLE);
                } else {
                    foto_p21.setVisibility(View.INVISIBLE);
                    descricao_p21.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p22 = (RadioGroup) findViewById(R.id.edificacao_p22);


        r_p22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p22 = (RadioButton) findViewById(R.id.edificacao_p22_na);
                RadioButton ad_p22 = (RadioButton) findViewById(R.id.edificacao_p22_ad);
                RadioButton in_p22 = (RadioButton) findViewById(R.id.edificacao_p22_in);

                ImageButton foto_p22 = (ImageButton) findViewById(R.id.edificacao_foto_p22);
                ImageButton descricao_p22 = (ImageButton) findViewById(R.id.edificacao_descricao_p22);


                if (in_p22.isChecked()) {
                    foto_p22.setVisibility(View.VISIBLE);
                    descricao_p22.setVisibility(View.VISIBLE);
                    foto_p22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p22.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p22.isChecked()) {
                    foto_p22.setVisibility(View.INVISIBLE);
                    descricao_p22.setVisibility(View.INVISIBLE);
                } else {
                    foto_p22.setVisibility(View.INVISIBLE);
                    descricao_p22.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p23 = (RadioGroup) findViewById(R.id.edificacao_p23);


        r_p23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p23 = (RadioButton) findViewById(R.id.edificacao_p23_na);
                RadioButton ad_p23 = (RadioButton) findViewById(R.id.edificacao_p23_ad);
                RadioButton in_p23 = (RadioButton) findViewById(R.id.edificacao_p23_in);

                ImageButton foto_p23 = (ImageButton) findViewById(R.id.edificacao_foto_p23);
                ImageButton descricao_p23 = (ImageButton) findViewById(R.id.edificacao_descricao_p23);


                if (in_p23.isChecked()) {
                    foto_p23.setVisibility(View.VISIBLE);
                    descricao_p23.setVisibility(View.VISIBLE);
                    foto_p23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p23.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p23.isChecked()) {
                    foto_p23.setVisibility(View.INVISIBLE);
                    descricao_p23.setVisibility(View.INVISIBLE);
                } else {
                    foto_p23.setVisibility(View.INVISIBLE);
                    descricao_p23.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p24 = (RadioGroup) findViewById(R.id.edificacao_p24);


        r_p24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p24 = (RadioButton) findViewById(R.id.edificacao_p24_na);
                RadioButton ad_p24 = (RadioButton) findViewById(R.id.edificacao_p24_ad);
                RadioButton in_p24 = (RadioButton) findViewById(R.id.edificacao_p24_in);

                ImageButton foto_p24 = (ImageButton) findViewById(R.id.edificacao_foto_p24);
                ImageButton descricao_p24 = (ImageButton) findViewById(R.id.edificacao_descricao_p24);


                if (in_p24.isChecked()) {
                    foto_p24.setVisibility(View.VISIBLE);
                    descricao_p24.setVisibility(View.VISIBLE);
                    foto_p24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p24.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p24.isChecked()) {
                    foto_p24.setVisibility(View.INVISIBLE);
                    descricao_p24.setVisibility(View.INVISIBLE);
                } else {
                    foto_p24.setVisibility(View.INVISIBLE);
                    descricao_p24.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p25 = (RadioGroup) findViewById(R.id.edificacao_p25);


        r_p25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p25 = (RadioButton) findViewById(R.id.edificacao_p25_na);
                RadioButton ad_p25 = (RadioButton) findViewById(R.id.edificacao_p25_ad);
                RadioButton in_p25 = (RadioButton) findViewById(R.id.edificacao_p25_in);

                ImageButton foto_p25 = (ImageButton) findViewById(R.id.edificacao_foto_p25);
                ImageButton descricao_p25 = (ImageButton) findViewById(R.id.edificacao_descricao_p25);


                if (in_p25.isChecked()) {
                    foto_p25.setVisibility(View.VISIBLE);
                    descricao_p25.setVisibility(View.VISIBLE);
                    foto_p25.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p25.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p25.isChecked()) {
                    foto_p25.setVisibility(View.INVISIBLE);
                    descricao_p25.setVisibility(View.INVISIBLE);
                } else {
                    foto_p25.setVisibility(View.INVISIBLE);
                    descricao_p25.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p26 = (RadioGroup) findViewById(R.id.edificacao_p26);


        r_p26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p26 = (RadioButton) findViewById(R.id.edificacao_p26_na);
                RadioButton ad_p26 = (RadioButton) findViewById(R.id.edificacao_p26_ad);
                RadioButton in_p26 = (RadioButton) findViewById(R.id.edificacao_p26_in);

                ImageButton foto_p26 = (ImageButton) findViewById(R.id.edificacao_foto_p26);
                ImageButton descricao_p26 = (ImageButton) findViewById(R.id.edificacao_descricao_p26);


                if (in_p26.isChecked()) {
                    foto_p26.setVisibility(View.VISIBLE);
                    descricao_p26.setVisibility(View.VISIBLE);
                    foto_p26.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p26.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p26.isChecked()) {
                    foto_p26.setVisibility(View.INVISIBLE);
                    descricao_p26.setVisibility(View.INVISIBLE);
                } else {
                    foto_p26.setVisibility(View.INVISIBLE);
                    descricao_p26.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p27 = (RadioGroup) findViewById(R.id.edificacao_p27);


        r_p27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p27 = (RadioButton) findViewById(R.id.edificacao_p27_na);
                RadioButton ad_p27 = (RadioButton) findViewById(R.id.edificacao_p27_ad);
                RadioButton in_p27 = (RadioButton) findViewById(R.id.edificacao_p27_in);

                ImageButton foto_p27 = (ImageButton) findViewById(R.id.edificacao_foto_p27);
                ImageButton descricao_p27 = (ImageButton) findViewById(R.id.edificacao_descricao_p27);


                if (in_p27.isChecked()) {
                    foto_p27.setVisibility(View.VISIBLE);
                    descricao_p27.setVisibility(View.VISIBLE);
                    foto_p27.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p27.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p27.isChecked()) {
                    foto_p27.setVisibility(View.INVISIBLE);
                    descricao_p27.setVisibility(View.INVISIBLE);
                } else {
                    foto_p27.setVisibility(View.INVISIBLE);
                    descricao_p27.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p28 = (RadioGroup) findViewById(R.id.edificacao_p28);


        r_p28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p28 = (RadioButton) findViewById(R.id.edificacao_p28_na);
                RadioButton ad_p28 = (RadioButton) findViewById(R.id.edificacao_p28_ad);
                RadioButton in_p28 = (RadioButton) findViewById(R.id.edificacao_p28_in);

                ImageButton foto_p28 = (ImageButton) findViewById(R.id.edificacao_foto_p28);
                ImageButton descricao_p28 = (ImageButton) findViewById(R.id.edificacao_descricao_p28);


                if (in_p28.isChecked()) {
                    foto_p28.setVisibility(View.VISIBLE);
                    descricao_p28.setVisibility(View.VISIBLE);
                    foto_p28.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p28.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p28.isChecked()) {
                    foto_p28.setVisibility(View.INVISIBLE);
                    descricao_p28.setVisibility(View.INVISIBLE);
                } else {
                    foto_p28.setVisibility(View.INVISIBLE);
                    descricao_p28.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p29 = (RadioGroup) findViewById(R.id.edificacao_p29);


        r_p29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p29 = (RadioButton) findViewById(R.id.edificacao_p29_na);
                RadioButton ad_p29 = (RadioButton) findViewById(R.id.edificacao_p29_ad);
                RadioButton in_p29 = (RadioButton) findViewById(R.id.edificacao_p29_in);

                ImageButton foto_p29 = (ImageButton) findViewById(R.id.edificacao_foto_p29);
                ImageButton descricao_p29 = (ImageButton) findViewById(R.id.edificacao_descricao_p29);


                if (in_p29.isChecked()) {
                    foto_p29.setVisibility(View.VISIBLE);
                    descricao_p29.setVisibility(View.VISIBLE);
                    foto_p29.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p29.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p29.isChecked()) {
                    foto_p29.setVisibility(View.INVISIBLE);
                    descricao_p29.setVisibility(View.INVISIBLE);
                } else {
                    foto_p29.setVisibility(View.INVISIBLE);
                    descricao_p29.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p30 = (RadioGroup) findViewById(R.id.edificacao_p30);


        r_p30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p30 = (RadioButton) findViewById(R.id.edificacao_p30_na);
                RadioButton ad_p30 = (RadioButton) findViewById(R.id.edificacao_p30_ad);
                RadioButton in_p30 = (RadioButton) findViewById(R.id.edificacao_p30_in);

                ImageButton foto_p30 = (ImageButton) findViewById(R.id.edificacao_foto_p30);
                ImageButton descricao_p30 = (ImageButton) findViewById(R.id.edificacao_descricao_p30);


                if (in_p30.isChecked()) {
                    foto_p30.setVisibility(View.VISIBLE);
                    descricao_p30.setVisibility(View.VISIBLE);
                    foto_p30.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p30.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p30.isChecked()) {
                    foto_p30.setVisibility(View.INVISIBLE);
                    descricao_p30.setVisibility(View.INVISIBLE);
                } else {
                    foto_p30.setVisibility(View.INVISIBLE);
                    descricao_p30.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p31 = (RadioGroup) findViewById(R.id.edificacao_p31);


        r_p31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p31 = (RadioButton) findViewById(R.id.edificacao_p31_na);
                RadioButton ad_p31 = (RadioButton) findViewById(R.id.edificacao_p31_ad);
                RadioButton in_p31 = (RadioButton) findViewById(R.id.edificacao_p31_in);

                ImageButton foto_p31 = (ImageButton) findViewById(R.id.edificacao_foto_p31);
                ImageButton descricao_p31 = (ImageButton) findViewById(R.id.edificacao_descricao_p31);


                if (in_p31.isChecked()) {
                    foto_p31.setVisibility(View.VISIBLE);
                    descricao_p31.setVisibility(View.VISIBLE);
                    foto_p31.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p31.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p31.isChecked()) {
                    foto_p31.setVisibility(View.INVISIBLE);
                    descricao_p31.setVisibility(View.INVISIBLE);
                } else {
                    foto_p31.setVisibility(View.INVISIBLE);
                    descricao_p31.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p32 = (RadioGroup) findViewById(R.id.edificacao_p32);


        r_p32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p32 = (RadioButton) findViewById(R.id.edificacao_p32_na);
                RadioButton ad_p32 = (RadioButton) findViewById(R.id.edificacao_p32_ad);
                RadioButton in_p32 = (RadioButton) findViewById(R.id.edificacao_p32_in);

                ImageButton foto_p32 = (ImageButton) findViewById(R.id.edificacao_foto_p32);
                ImageButton descricao_p32 = (ImageButton) findViewById(R.id.edificacao_descricao_p32);


                if (in_p32.isChecked()) {
                    foto_p32.setVisibility(View.VISIBLE);
                    descricao_p32.setVisibility(View.VISIBLE);
                    foto_p32.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p32.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p32.isChecked()) {
                    foto_p32.setVisibility(View.INVISIBLE);
                    descricao_p32.setVisibility(View.INVISIBLE);
                } else {
                    foto_p32.setVisibility(View.INVISIBLE);
                    descricao_p32.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p33 = (RadioGroup) findViewById(R.id.edificacao_p33);


        r_p33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p33 = (RadioButton) findViewById(R.id.edificacao_p33_na);
                RadioButton ad_p33 = (RadioButton) findViewById(R.id.edificacao_p33_ad);
                RadioButton in_p33 = (RadioButton) findViewById(R.id.edificacao_p33_in);

                ImageButton foto_p33 = (ImageButton) findViewById(R.id.edificacao_foto_p33);
                ImageButton descricao_p33 = (ImageButton) findViewById(R.id.edificacao_descricao_p33);


                if (in_p33.isChecked()) {
                    foto_p33.setVisibility(View.VISIBLE);
                    descricao_p33.setVisibility(View.VISIBLE);
                    foto_p33.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p33.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p33.isChecked()) {
                    foto_p33.setVisibility(View.INVISIBLE);
                    descricao_p33.setVisibility(View.INVISIBLE);
                } else {
                    foto_p33.setVisibility(View.INVISIBLE);
                    descricao_p33.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p34 = (RadioGroup) findViewById(R.id.edificacao_p34);


        r_p34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p34 = (RadioButton) findViewById(R.id.edificacao_p34_na);
                RadioButton ad_p34 = (RadioButton) findViewById(R.id.edificacao_p34_ad);
                RadioButton in_p34 = (RadioButton) findViewById(R.id.edificacao_p34_in);

                ImageButton foto_p34 = (ImageButton) findViewById(R.id.edificacao_foto_p34);
                ImageButton descricao_p34 = (ImageButton) findViewById(R.id.edificacao_descricao_p34);


                if (in_p34.isChecked()) {
                    foto_p34.setVisibility(View.VISIBLE);
                    descricao_p34.setVisibility(View.VISIBLE);
                    foto_p34.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p34.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p34.isChecked()) {
                    foto_p34.setVisibility(View.INVISIBLE);
                    descricao_p34.setVisibility(View.INVISIBLE);
                } else {
                    foto_p34.setVisibility(View.INVISIBLE);
                    descricao_p34.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p35 = (RadioGroup) findViewById(R.id.edificacao_p35);


        r_p35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p35 = (RadioButton) findViewById(R.id.edificacao_p35_na);
                RadioButton ad_p35 = (RadioButton) findViewById(R.id.edificacao_p35_ad);
                RadioButton in_p35 = (RadioButton) findViewById(R.id.edificacao_p35_in);

                ImageButton foto_p35 = (ImageButton) findViewById(R.id.edificacao_foto_p35);
                ImageButton descricao_p35 = (ImageButton) findViewById(R.id.edificacao_descricao_p35);


                if (in_p35.isChecked()) {
                    foto_p35.setVisibility(View.VISIBLE);
                    descricao_p35.setVisibility(View.VISIBLE);
                    foto_p35.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p35.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p35.isChecked()) {
                    foto_p35.setVisibility(View.INVISIBLE);
                    descricao_p35.setVisibility(View.INVISIBLE);
                } else {
                    foto_p35.setVisibility(View.INVISIBLE);
                    descricao_p35.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p36 = (RadioGroup) findViewById(R.id.edificacao_p36);


        r_p36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p36 = (RadioButton) findViewById(R.id.edificacao_p36_na);
                RadioButton ad_p36 = (RadioButton) findViewById(R.id.edificacao_p36_ad);
                RadioButton in_p36 = (RadioButton) findViewById(R.id.edificacao_p36_in);

                ImageButton foto_p36 = (ImageButton) findViewById(R.id.edificacao_foto_p36);
                ImageButton descricao_p36 = (ImageButton) findViewById(R.id.edificacao_descricao_p36);


                if (in_p36.isChecked()) {
                    foto_p36.setVisibility(View.VISIBLE);
                    descricao_p36.setVisibility(View.VISIBLE);
                    foto_p36.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p36.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p36.isChecked()) {
                    foto_p36.setVisibility(View.INVISIBLE);
                    descricao_p36.setVisibility(View.INVISIBLE);
                } else {
                    foto_p36.setVisibility(View.INVISIBLE);
                    descricao_p36.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p37 = (RadioGroup) findViewById(R.id.edificacao_p37);


        r_p37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p37 = (RadioButton) findViewById(R.id.edificacao_p37_na);
                RadioButton ad_p37 = (RadioButton) findViewById(R.id.edificacao_p37_ad);
                RadioButton in_p37 = (RadioButton) findViewById(R.id.edificacao_p37_in);

                ImageButton foto_p37 = (ImageButton) findViewById(R.id.edificacao_foto_p37);
                ImageButton descricao_p37 = (ImageButton) findViewById(R.id.edificacao_descricao_p37);


                if (in_p37.isChecked()) {
                    foto_p37.setVisibility(View.VISIBLE);
                    descricao_p37.setVisibility(View.VISIBLE);
                    foto_p37.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p37.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p37.isChecked()) {
                    foto_p37.setVisibility(View.INVISIBLE);
                    descricao_p37.setVisibility(View.INVISIBLE);
                } else {
                    foto_p37.setVisibility(View.INVISIBLE);
                    descricao_p37.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p38 = (RadioGroup) findViewById(R.id.edificacao_p38);


        r_p38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p38 = (RadioButton) findViewById(R.id.edificacao_p38_na);
                RadioButton ad_p38 = (RadioButton) findViewById(R.id.edificacao_p38_ad);
                RadioButton in_p38 = (RadioButton) findViewById(R.id.edificacao_p38_in);

                ImageButton foto_p38 = (ImageButton) findViewById(R.id.edificacao_foto_p38);
                ImageButton descricao_p38 = (ImageButton) findViewById(R.id.edificacao_descricao_p38);


                if (in_p38.isChecked()) {
                    foto_p38.setVisibility(View.VISIBLE);
                    descricao_p38.setVisibility(View.VISIBLE);
                    foto_p38.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p38.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p38.isChecked()) {
                    foto_p38.setVisibility(View.INVISIBLE);
                    descricao_p38.setVisibility(View.INVISIBLE);
                } else {
                    foto_p38.setVisibility(View.INVISIBLE);
                    descricao_p38.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p39 = (RadioGroup) findViewById(R.id.edificacao_p39);


        r_p39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p39 = (RadioButton) findViewById(R.id.edificacao_p39_na);
                RadioButton ad_p39 = (RadioButton) findViewById(R.id.edificacao_p39_ad);
                RadioButton in_p39 = (RadioButton) findViewById(R.id.edificacao_p39_in);

                ImageButton foto_p39 = (ImageButton) findViewById(R.id.edificacao_foto_p39);
                ImageButton descricao_p39 = (ImageButton) findViewById(R.id.edificacao_descricao_p39);


                if (in_p39.isChecked()) {
                    foto_p39.setVisibility(View.VISIBLE);
                    descricao_p39.setVisibility(View.VISIBLE);
                    foto_p39.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p39.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p39.isChecked()) {
                    foto_p39.setVisibility(View.INVISIBLE);
                    descricao_p39.setVisibility(View.INVISIBLE);
                } else {
                    foto_p39.setVisibility(View.INVISIBLE);
                    descricao_p39.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p40 = (RadioGroup) findViewById(R.id.edificacao_p40);


        r_p40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p40 = (RadioButton) findViewById(R.id.edificacao_p40_na);
                RadioButton ad_p40 = (RadioButton) findViewById(R.id.edificacao_p40_ad);
                RadioButton in_p40 = (RadioButton) findViewById(R.id.edificacao_p40_in);

                ImageButton foto_p40 = (ImageButton) findViewById(R.id.edificacao_foto_p40);
                ImageButton descricao_p40 = (ImageButton) findViewById(R.id.edificacao_descricao_p40);


                if (in_p40.isChecked()) {
                    foto_p40.setVisibility(View.VISIBLE);
                    descricao_p40.setVisibility(View.VISIBLE);
                    foto_p40.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p40.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p40.isChecked()) {
                    foto_p40.setVisibility(View.INVISIBLE);
                    descricao_p40.setVisibility(View.INVISIBLE);
                } else {
                    foto_p40.setVisibility(View.INVISIBLE);
                    descricao_p40.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p41 = (RadioGroup) findViewById(R.id.edificacao_p41);


        r_p41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p41 = (RadioButton) findViewById(R.id.edificacao_p41_na);
                RadioButton ad_p41 = (RadioButton) findViewById(R.id.edificacao_p41_ad);
                RadioButton in_p41 = (RadioButton) findViewById(R.id.edificacao_p41_in);

                ImageButton foto_p41 = (ImageButton) findViewById(R.id.edificacao_foto_p41);
                ImageButton descricao_p41 = (ImageButton) findViewById(R.id.edificacao_descricao_p41);


                if (in_p41.isChecked()) {
                    foto_p41.setVisibility(View.VISIBLE);
                    descricao_p41.setVisibility(View.VISIBLE);
                    foto_p41.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p41.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p41.isChecked()) {
                    foto_p41.setVisibility(View.INVISIBLE);
                    descricao_p41.setVisibility(View.INVISIBLE);
                } else {
                    foto_p41.setVisibility(View.INVISIBLE);
                    descricao_p41.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p42 = (RadioGroup) findViewById(R.id.edificacao_p42);


        r_p42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p42 = (RadioButton) findViewById(R.id.edificacao_p42_na);
                RadioButton ad_p42 = (RadioButton) findViewById(R.id.edificacao_p42_ad);
                RadioButton in_p42 = (RadioButton) findViewById(R.id.edificacao_p42_in);

                ImageButton foto_p42 = (ImageButton) findViewById(R.id.edificacao_foto_p42);
                ImageButton descricao_p42 = (ImageButton) findViewById(R.id.edificacao_descricao_p42);


                if (in_p42.isChecked()) {
                    foto_p42.setVisibility(View.VISIBLE);
                    descricao_p42.setVisibility(View.VISIBLE);
                    foto_p42.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p42.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p42.isChecked()) {
                    foto_p42.setVisibility(View.INVISIBLE);
                    descricao_p42.setVisibility(View.INVISIBLE);
                } else {
                    foto_p42.setVisibility(View.INVISIBLE);
                    descricao_p42.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p43 = (RadioGroup) findViewById(R.id.edificacao_p43);


        r_p43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p43 = (RadioButton) findViewById(R.id.edificacao_p43_na);
                RadioButton ad_p43 = (RadioButton) findViewById(R.id.edificacao_p43_ad);
                RadioButton in_p43 = (RadioButton) findViewById(R.id.edificacao_p43_in);

                ImageButton foto_p43 = (ImageButton) findViewById(R.id.edificacao_foto_p43);
                ImageButton descricao_p43 = (ImageButton) findViewById(R.id.edificacao_descricao_p43);


                if (in_p43.isChecked()) {
                    foto_p43.setVisibility(View.VISIBLE);
                    descricao_p43.setVisibility(View.VISIBLE);
                    foto_p43.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p43.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p43.isChecked()) {
                    foto_p43.setVisibility(View.INVISIBLE);
                    descricao_p43.setVisibility(View.INVISIBLE);
                } else {
                    foto_p43.setVisibility(View.INVISIBLE);
                    descricao_p43.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p44 = (RadioGroup) findViewById(R.id.edificacao_p44);


        r_p44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p44 = (RadioButton) findViewById(R.id.edificacao_p44_na);
                RadioButton ad_p44 = (RadioButton) findViewById(R.id.edificacao_p44_ad);
                RadioButton in_p44 = (RadioButton) findViewById(R.id.edificacao_p44_in);

                ImageButton foto_p44 = (ImageButton) findViewById(R.id.edificacao_foto_p44);
                ImageButton descricao_p44 = (ImageButton) findViewById(R.id.edificacao_descricao_p44);


                if (in_p44.isChecked()) {
                    foto_p44.setVisibility(View.VISIBLE);
                    descricao_p44.setVisibility(View.VISIBLE);
                    foto_p44.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p44.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p44.isChecked()) {
                    foto_p44.setVisibility(View.INVISIBLE);
                    descricao_p44.setVisibility(View.INVISIBLE);
                } else {
                    foto_p44.setVisibility(View.INVISIBLE);
                    descricao_p44.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p45 = (RadioGroup) findViewById(R.id.edificacao_p45);


        r_p45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p45 = (RadioButton) findViewById(R.id.edificacao_p45_na);
                RadioButton ad_p45 = (RadioButton) findViewById(R.id.edificacao_p45_ad);
                RadioButton in_p45 = (RadioButton) findViewById(R.id.edificacao_p45_in);

                ImageButton foto_p45 = (ImageButton) findViewById(R.id.edificacao_foto_p45);
                ImageButton descricao_p45 = (ImageButton) findViewById(R.id.edificacao_descricao_p45);


                if (in_p45.isChecked()) {
                    foto_p45.setVisibility(View.VISIBLE);
                    descricao_p45.setVisibility(View.VISIBLE);
                    foto_p45.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p45.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p45.isChecked()) {
                    foto_p45.setVisibility(View.INVISIBLE);
                    descricao_p45.setVisibility(View.INVISIBLE);
                } else {
                    foto_p45.setVisibility(View.INVISIBLE);
                    descricao_p45.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p46 = (RadioGroup) findViewById(R.id.edificacao_p46);


        r_p46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p46 = (RadioButton) findViewById(R.id.edificacao_p46_na);
                RadioButton ad_p46 = (RadioButton) findViewById(R.id.edificacao_p46_ad);
                RadioButton in_p46 = (RadioButton) findViewById(R.id.edificacao_p46_in);

                ImageButton foto_p46 = (ImageButton) findViewById(R.id.edificacao_foto_p46);
                ImageButton descricao_p46 = (ImageButton) findViewById(R.id.edificacao_descricao_p46);


                if (in_p46.isChecked()) {
                    foto_p46.setVisibility(View.VISIBLE);
                    descricao_p46.setVisibility(View.VISIBLE);
                    foto_p46.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p46.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p46.isChecked()) {
                    foto_p46.setVisibility(View.INVISIBLE);
                    descricao_p46.setVisibility(View.INVISIBLE);
                } else {
                    foto_p46.setVisibility(View.INVISIBLE);
                    descricao_p46.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p47 = (RadioGroup) findViewById(R.id.edificacao_p47);


        r_p47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p47 = (RadioButton) findViewById(R.id.edificacao_p47_na);
                RadioButton ad_p47 = (RadioButton) findViewById(R.id.edificacao_p47_ad);
                RadioButton in_p47 = (RadioButton) findViewById(R.id.edificacao_p47_in);

                ImageButton foto_p47 = (ImageButton) findViewById(R.id.edificacao_foto_p47);
                ImageButton descricao_p47 = (ImageButton) findViewById(R.id.edificacao_descricao_p47);


                if (in_p47.isChecked()) {
                    foto_p47.setVisibility(View.VISIBLE);
                    descricao_p47.setVisibility(View.VISIBLE);
                    foto_p47.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p47.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p47.isChecked()) {
                    foto_p47.setVisibility(View.INVISIBLE);
                    descricao_p47.setVisibility(View.INVISIBLE);
                } else {
                    foto_p47.setVisibility(View.INVISIBLE);
                    descricao_p47.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p48 = (RadioGroup) findViewById(R.id.edificacao_p48);


        r_p48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p48 = (RadioButton) findViewById(R.id.edificacao_p48_na);
                RadioButton ad_p48 = (RadioButton) findViewById(R.id.edificacao_p48_ad);
                RadioButton in_p48 = (RadioButton) findViewById(R.id.edificacao_p48_in);

                ImageButton foto_p48 = (ImageButton) findViewById(R.id.edificacao_foto_p48);
                ImageButton descricao_p48 = (ImageButton) findViewById(R.id.edificacao_descricao_p48);


                if (in_p48.isChecked()) {
                    foto_p48.setVisibility(View.VISIBLE);
                    descricao_p48.setVisibility(View.VISIBLE);
                    foto_p48.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p48.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p48.isChecked()) {
                    foto_p48.setVisibility(View.INVISIBLE);
                    descricao_p48.setVisibility(View.INVISIBLE);
                } else {
                    foto_p48.setVisibility(View.INVISIBLE);
                    descricao_p48.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p49 = (RadioGroup) findViewById(R.id.edificacao_p49);


        r_p49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p49 = (RadioButton) findViewById(R.id.edificacao_p49_na);
                RadioButton ad_p49 = (RadioButton) findViewById(R.id.edificacao_p49_ad);
                RadioButton in_p49 = (RadioButton) findViewById(R.id.edificacao_p49_in);

                ImageButton foto_p49 = (ImageButton) findViewById(R.id.edificacao_foto_p49);
                ImageButton descricao_p49 = (ImageButton) findViewById(R.id.edificacao_descricao_p49);


                if (in_p49.isChecked()) {
                    foto_p49.setVisibility(View.VISIBLE);
                    descricao_p49.setVisibility(View.VISIBLE);
                    foto_p49.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p49.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p49.isChecked()) {
                    foto_p49.setVisibility(View.INVISIBLE);
                    descricao_p49.setVisibility(View.INVISIBLE);
                } else {
                    foto_p49.setVisibility(View.INVISIBLE);
                    descricao_p49.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p50 = (RadioGroup) findViewById(R.id.edificacao_p50);


        r_p50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p50 = (RadioButton) findViewById(R.id.edificacao_p50_na);
                RadioButton ad_p50 = (RadioButton) findViewById(R.id.edificacao_p50_ad);
                RadioButton in_p50 = (RadioButton) findViewById(R.id.edificacao_p50_in);

                ImageButton foto_p50 = (ImageButton) findViewById(R.id.edificacao_foto_p50);
                ImageButton descricao_p50 = (ImageButton) findViewById(R.id.edificacao_descricao_p50);


                if (in_p50.isChecked()) {
                    foto_p50.setVisibility(View.VISIBLE);
                    descricao_p50.setVisibility(View.VISIBLE);
                    foto_p50.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p50.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p50.isChecked()) {
                    foto_p50.setVisibility(View.INVISIBLE);
                    descricao_p50.setVisibility(View.INVISIBLE);
                } else {
                    foto_p50.setVisibility(View.INVISIBLE);
                    descricao_p50.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p51 = (RadioGroup) findViewById(R.id.edificacao_p51);


        r_p51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p51 = (RadioButton) findViewById(R.id.edificacao_p51_na);
                RadioButton ad_p51 = (RadioButton) findViewById(R.id.edificacao_p51_ad);
                RadioButton in_p51 = (RadioButton) findViewById(R.id.edificacao_p51_in);

                ImageButton foto_p51 = (ImageButton) findViewById(R.id.edificacao_foto_p51);
                ImageButton descricao_p51 = (ImageButton) findViewById(R.id.edificacao_descricao_p51);


                if (in_p51.isChecked()) {
                    foto_p51.setVisibility(View.VISIBLE);
                    descricao_p51.setVisibility(View.VISIBLE);
                    foto_p51.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p51.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p51.isChecked()) {
                    foto_p51.setVisibility(View.INVISIBLE);
                    descricao_p51.setVisibility(View.INVISIBLE);
                } else {
                    foto_p51.setVisibility(View.INVISIBLE);
                    descricao_p51.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p52 = (RadioGroup) findViewById(R.id.edificacao_p52);


        r_p52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p52 = (RadioButton) findViewById(R.id.edificacao_p52_na);
                RadioButton ad_p52 = (RadioButton) findViewById(R.id.edificacao_p52_ad);
                RadioButton in_p52 = (RadioButton) findViewById(R.id.edificacao_p52_in);

                ImageButton foto_p52 = (ImageButton) findViewById(R.id.edificacao_foto_p52);
                ImageButton descricao_p52 = (ImageButton) findViewById(R.id.edificacao_descricao_p52);


                if (in_p52.isChecked()) {
                    foto_p52.setVisibility(View.VISIBLE);
                    descricao_p52.setVisibility(View.VISIBLE);
                    foto_p52.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p52.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p52.isChecked()) {
                    foto_p52.setVisibility(View.INVISIBLE);
                    descricao_p52.setVisibility(View.INVISIBLE);
                } else {
                    foto_p52.setVisibility(View.INVISIBLE);
                    descricao_p52.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p53 = (RadioGroup) findViewById(R.id.edificacao_p53);


        r_p53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p53 = (RadioButton) findViewById(R.id.edificacao_p53_na);
                RadioButton ad_p53 = (RadioButton) findViewById(R.id.edificacao_p53_ad);
                RadioButton in_p53 = (RadioButton) findViewById(R.id.edificacao_p53_in);

                ImageButton foto_p53 = (ImageButton) findViewById(R.id.edificacao_foto_p53);
                ImageButton descricao_p53 = (ImageButton) findViewById(R.id.edificacao_descricao_p53);


                if (in_p53.isChecked()) {
                    foto_p53.setVisibility(View.VISIBLE);
                    descricao_p53.setVisibility(View.VISIBLE);
                    foto_p53.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p53.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p53.isChecked()) {
                    foto_p53.setVisibility(View.INVISIBLE);
                    descricao_p53.setVisibility(View.INVISIBLE);
                } else {
                    foto_p53.setVisibility(View.INVISIBLE);
                    descricao_p53.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p54 = (RadioGroup) findViewById(R.id.edificacao_p54);


        r_p54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p54 = (RadioButton) findViewById(R.id.edificacao_p54_na);
                RadioButton ad_p54 = (RadioButton) findViewById(R.id.edificacao_p54_ad);
                RadioButton in_p54 = (RadioButton) findViewById(R.id.edificacao_p54_in);

                ImageButton foto_p54 = (ImageButton) findViewById(R.id.edificacao_foto_p54);
                ImageButton descricao_p54 = (ImageButton) findViewById(R.id.edificacao_descricao_p54);


                if (in_p54.isChecked()) {
                    foto_p54.setVisibility(View.VISIBLE);
                    descricao_p54.setVisibility(View.VISIBLE);
                    foto_p54.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p54.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p54.isChecked()) {
                    foto_p54.setVisibility(View.INVISIBLE);
                    descricao_p54.setVisibility(View.INVISIBLE);
                } else {
                    foto_p54.setVisibility(View.INVISIBLE);
                    descricao_p54.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p55 = (RadioGroup) findViewById(R.id.edificacao_p55);


        r_p55.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p55 = (RadioButton) findViewById(R.id.edificacao_p55_na);
                RadioButton ad_p55 = (RadioButton) findViewById(R.id.edificacao_p55_ad);
                RadioButton in_p55 = (RadioButton) findViewById(R.id.edificacao_p55_in);

                ImageButton foto_p55 = (ImageButton) findViewById(R.id.edificacao_foto_p55);
                ImageButton descricao_p55 = (ImageButton) findViewById(R.id.edificacao_descricao_p55);


                if (in_p55.isChecked()) {
                    foto_p55.setVisibility(View.VISIBLE);
                    descricao_p55.setVisibility(View.VISIBLE);
                    foto_p55.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p55.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p55.isChecked()) {
                    foto_p55.setVisibility(View.INVISIBLE);
                    descricao_p55.setVisibility(View.INVISIBLE);
                } else {
                    foto_p55.setVisibility(View.INVISIBLE);
                    descricao_p55.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p56 = (RadioGroup) findViewById(R.id.edificacao_p56);


        r_p56.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p56 = (RadioButton) findViewById(R.id.edificacao_p56_na);
                RadioButton ad_p56 = (RadioButton) findViewById(R.id.edificacao_p56_ad);
                RadioButton in_p56 = (RadioButton) findViewById(R.id.edificacao_p56_in);

                ImageButton foto_p56 = (ImageButton) findViewById(R.id.edificacao_foto_p56);
                ImageButton descricao_p56 = (ImageButton) findViewById(R.id.edificacao_descricao_p56);


                if (in_p56.isChecked()) {
                    foto_p56.setVisibility(View.VISIBLE);
                    descricao_p56.setVisibility(View.VISIBLE);
                    foto_p56.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p56.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p56.isChecked()) {
                    foto_p56.setVisibility(View.INVISIBLE);
                    descricao_p56.setVisibility(View.INVISIBLE);
                } else {
                    foto_p56.setVisibility(View.INVISIBLE);
                    descricao_p56.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p57 = (RadioGroup) findViewById(R.id.edificacao_p57);


        r_p57.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p57 = (RadioButton) findViewById(R.id.edificacao_p57_na);
                RadioButton ad_p57 = (RadioButton) findViewById(R.id.edificacao_p57_ad);
                RadioButton in_p57 = (RadioButton) findViewById(R.id.edificacao_p57_in);

                ImageButton foto_p57 = (ImageButton) findViewById(R.id.edificacao_foto_p57);
                ImageButton descricao_p57 = (ImageButton) findViewById(R.id.edificacao_descricao_p57);


                if (in_p57.isChecked()) {
                    foto_p57.setVisibility(View.VISIBLE);
                    descricao_p57.setVisibility(View.VISIBLE);
                    foto_p57.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p57.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p57.isChecked()) {
                    foto_p57.setVisibility(View.INVISIBLE);
                    descricao_p57.setVisibility(View.INVISIBLE);
                } else {
                    foto_p57.setVisibility(View.INVISIBLE);
                    descricao_p57.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p58 = (RadioGroup) findViewById(R.id.edificacao_p58);


        r_p58.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p58 = (RadioButton) findViewById(R.id.edificacao_p58_na);
                RadioButton ad_p58 = (RadioButton) findViewById(R.id.edificacao_p58_ad);
                RadioButton in_p58 = (RadioButton) findViewById(R.id.edificacao_p58_in);

                ImageButton foto_p58 = (ImageButton) findViewById(R.id.edificacao_foto_p58);
                ImageButton descricao_p58 = (ImageButton) findViewById(R.id.edificacao_descricao_p58);


                if (in_p58.isChecked()) {
                    foto_p58.setVisibility(View.VISIBLE);
                    descricao_p58.setVisibility(View.VISIBLE);
                    foto_p58.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p58.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p58.isChecked()) {
                    foto_p58.setVisibility(View.INVISIBLE);
                    descricao_p58.setVisibility(View.INVISIBLE);
                } else {
                    foto_p58.setVisibility(View.INVISIBLE);
                    descricao_p58.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p59 = (RadioGroup) findViewById(R.id.edificacao_p59);


        r_p59.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p59 = (RadioButton) findViewById(R.id.edificacao_p59_na);
                RadioButton ad_p59 = (RadioButton) findViewById(R.id.edificacao_p59_ad);
                RadioButton in_p59 = (RadioButton) findViewById(R.id.edificacao_p59_in);

                ImageButton foto_p59 = (ImageButton) findViewById(R.id.edificacao_foto_p59);
                ImageButton descricao_p59 = (ImageButton) findViewById(R.id.edificacao_descricao_p59);


                if (in_p59.isChecked()) {
                    foto_p59.setVisibility(View.VISIBLE);
                    descricao_p59.setVisibility(View.VISIBLE);
                    foto_p59.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p59.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p59.isChecked()) {
                    foto_p59.setVisibility(View.INVISIBLE);
                    descricao_p59.setVisibility(View.INVISIBLE);
                } else {
                    foto_p59.setVisibility(View.INVISIBLE);
                    descricao_p59.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p60 = (RadioGroup) findViewById(R.id.edificacao_p60);


        r_p60.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p60 = (RadioButton) findViewById(R.id.edificacao_p60_na);
                RadioButton ad_p60 = (RadioButton) findViewById(R.id.edificacao_p60_ad);
                RadioButton in_p60 = (RadioButton) findViewById(R.id.edificacao_p60_in);

                ImageButton foto_p60 = (ImageButton) findViewById(R.id.edificacao_foto_p60);
                ImageButton descricao_p60 = (ImageButton) findViewById(R.id.edificacao_descricao_p60);


                if (in_p60.isChecked()) {
                    foto_p60.setVisibility(View.VISIBLE);
                    descricao_p60.setVisibility(View.VISIBLE);
                    foto_p60.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p60.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p60.isChecked()) {
                    foto_p60.setVisibility(View.INVISIBLE);
                    descricao_p60.setVisibility(View.INVISIBLE);
                } else {
                    foto_p60.setVisibility(View.INVISIBLE);
                    descricao_p60.setVisibility(View.INVISIBLE);
                }
            }
        });


        RadioGroup r_p61 = (RadioGroup) findViewById(R.id.edificacao_p61);


        r_p61.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p61 = (RadioButton) findViewById(R.id.edificacao_p61_na);
                RadioButton ad_p61 = (RadioButton) findViewById(R.id.edificacao_p61_ad);
                RadioButton in_p61 = (RadioButton) findViewById(R.id.edificacao_p61_in);

                ImageButton foto_p61 = (ImageButton) findViewById(R.id.edificacao_foto_p61);
                ImageButton descricao_p61 = (ImageButton) findViewById(R.id.edificacao_descricao_p61);


                if (in_p61.isChecked()) {
                    foto_p61.setVisibility(View.VISIBLE);
                    descricao_p61.setVisibility(View.VISIBLE);
                    foto_p61.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p61.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p61.isChecked()) {
                    foto_p61.setVisibility(View.INVISIBLE);
                    descricao_p61.setVisibility(View.INVISIBLE);
                } else {
                    foto_p61.setVisibility(View.INVISIBLE);
                    descricao_p61.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p62 = (RadioGroup) findViewById(R.id.edificacao_p62);


        r_p62.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p62 = (RadioButton) findViewById(R.id.edificacao_p62_na);
                RadioButton ad_p62 = (RadioButton) findViewById(R.id.edificacao_p62_ad);
                RadioButton in_p62 = (RadioButton) findViewById(R.id.edificacao_p62_in);

                ImageButton foto_p62 = (ImageButton) findViewById(R.id.edificacao_foto_p62);
                ImageButton descricao_p62 = (ImageButton) findViewById(R.id.edificacao_descricao_p62);


                if (in_p62.isChecked()) {
                    foto_p62.setVisibility(View.VISIBLE);
                    descricao_p62.setVisibility(View.VISIBLE);
                    foto_p62.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p62.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p62.isChecked()) {
                    foto_p62.setVisibility(View.INVISIBLE);
                    descricao_p62.setVisibility(View.INVISIBLE);
                } else {
                    foto_p62.setVisibility(View.INVISIBLE);
                    descricao_p62.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p63 = (RadioGroup) findViewById(R.id.edificacao_p63);


        r_p63.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p63 = (RadioButton) findViewById(R.id.edificacao_p63_na);
                RadioButton ad_p63 = (RadioButton) findViewById(R.id.edificacao_p63_ad);
                RadioButton in_p63 = (RadioButton) findViewById(R.id.edificacao_p63_in);

                ImageButton foto_p63 = (ImageButton) findViewById(R.id.edificacao_foto_p63);
                ImageButton descricao_p63 = (ImageButton) findViewById(R.id.edificacao_descricao_p63);


                if (in_p63.isChecked()) {
                    foto_p63.setVisibility(View.VISIBLE);
                    descricao_p63.setVisibility(View.VISIBLE);
                    foto_p63.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p63.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p63.isChecked()) {
                    foto_p63.setVisibility(View.INVISIBLE);
                    descricao_p63.setVisibility(View.INVISIBLE);
                } else {
                    foto_p63.setVisibility(View.INVISIBLE);
                    descricao_p63.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p64 = (RadioGroup) findViewById(R.id.edificacao_p64);


        r_p64.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p64 = (RadioButton) findViewById(R.id.edificacao_p64_na);
                RadioButton ad_p64 = (RadioButton) findViewById(R.id.edificacao_p64_ad);
                RadioButton in_p64 = (RadioButton) findViewById(R.id.edificacao_p64_in);

                ImageButton foto_p64 = (ImageButton) findViewById(R.id.edificacao_foto_p64);
                ImageButton descricao_p64 = (ImageButton) findViewById(R.id.edificacao_descricao_p64);


                if (in_p64.isChecked()) {
                    foto_p64.setVisibility(View.VISIBLE);
                    descricao_p64.setVisibility(View.VISIBLE);
                    foto_p64.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p64.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p64.isChecked()) {
                    foto_p64.setVisibility(View.INVISIBLE);
                    descricao_p64.setVisibility(View.INVISIBLE);
                } else {
                    foto_p64.setVisibility(View.INVISIBLE);
                    descricao_p64.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p65 = (RadioGroup) findViewById(R.id.edificacao_p65);


        r_p65.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p65 = (RadioButton) findViewById(R.id.edificacao_p65_na);
                RadioButton ad_p65 = (RadioButton) findViewById(R.id.edificacao_p65_ad);
                RadioButton in_p65 = (RadioButton) findViewById(R.id.edificacao_p65_in);

                ImageButton foto_p65 = (ImageButton) findViewById(R.id.edificacao_foto_p65);
                ImageButton descricao_p65 = (ImageButton) findViewById(R.id.edificacao_descricao_p65);


                if (in_p65.isChecked()) {
                    foto_p65.setVisibility(View.VISIBLE);
                    descricao_p65.setVisibility(View.VISIBLE);
                    foto_p65.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p65.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p65.isChecked()) {
                    foto_p65.setVisibility(View.INVISIBLE);
                    descricao_p65.setVisibility(View.INVISIBLE);
                } else {
                    foto_p65.setVisibility(View.INVISIBLE);
                    descricao_p65.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p66 = (RadioGroup) findViewById(R.id.edificacao_p66);


        r_p66.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p66 = (RadioButton) findViewById(R.id.edificacao_p66_na);
                RadioButton ad_p66 = (RadioButton) findViewById(R.id.edificacao_p66_ad);
                RadioButton in_p66 = (RadioButton) findViewById(R.id.edificacao_p66_in);

                ImageButton foto_p66 = (ImageButton) findViewById(R.id.edificacao_foto_p66);
                ImageButton descricao_p66 = (ImageButton) findViewById(R.id.edificacao_descricao_p66);


                if (in_p66.isChecked()) {
                    foto_p66.setVisibility(View.VISIBLE);
                    descricao_p66.setVisibility(View.VISIBLE);
                    foto_p66.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p66.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p66.isChecked()) {
                    foto_p66.setVisibility(View.INVISIBLE);
                    descricao_p66.setVisibility(View.INVISIBLE);
                } else {
                    foto_p66.setVisibility(View.INVISIBLE);
                    descricao_p66.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p67 = (RadioGroup) findViewById(R.id.edificacao_p67);


        r_p67.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p67 = (RadioButton) findViewById(R.id.edificacao_p67_na);
                RadioButton ad_p67 = (RadioButton) findViewById(R.id.edificacao_p67_ad);
                RadioButton in_p67 = (RadioButton) findViewById(R.id.edificacao_p67_in);

                ImageButton foto_p67 = (ImageButton) findViewById(R.id.edificacao_foto_p67);
                ImageButton descricao_p67 = (ImageButton) findViewById(R.id.edificacao_descricao_p67);


                if (in_p67.isChecked()) {
                    foto_p67.setVisibility(View.VISIBLE);
                    descricao_p67.setVisibility(View.VISIBLE);
                    foto_p67.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p67.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p67.isChecked()) {
                    foto_p67.setVisibility(View.INVISIBLE);
                    descricao_p67.setVisibility(View.INVISIBLE);
                } else {
                    foto_p67.setVisibility(View.INVISIBLE);
                    descricao_p67.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p68 = (RadioGroup) findViewById(R.id.edificacao_p68);


        r_p68.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p68 = (RadioButton) findViewById(R.id.edificacao_p68_na);
                RadioButton ad_p68 = (RadioButton) findViewById(R.id.edificacao_p68_ad);
                RadioButton in_p68 = (RadioButton) findViewById(R.id.edificacao_p68_in);

                ImageButton foto_p68 = (ImageButton) findViewById(R.id.edificacao_foto_p68);
                ImageButton descricao_p68 = (ImageButton) findViewById(R.id.edificacao_descricao_p68);


                if (in_p68.isChecked()) {
                    foto_p68.setVisibility(View.VISIBLE);
                    descricao_p68.setVisibility(View.VISIBLE);
                    foto_p68.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p68.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p68.isChecked()) {
                    foto_p68.setVisibility(View.INVISIBLE);
                    descricao_p68.setVisibility(View.INVISIBLE);
                } else {
                    foto_p68.setVisibility(View.INVISIBLE);
                    descricao_p68.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p69 = (RadioGroup) findViewById(R.id.edificacao_p69);


        r_p69.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p69 = (RadioButton) findViewById(R.id.edificacao_p69_na);
                RadioButton ad_p69 = (RadioButton) findViewById(R.id.edificacao_p69_ad);
                RadioButton in_p69 = (RadioButton) findViewById(R.id.edificacao_p69_in);

                ImageButton foto_p69 = (ImageButton) findViewById(R.id.edificacao_foto_p69);
                ImageButton descricao_p69 = (ImageButton) findViewById(R.id.edificacao_descricao_p69);


                if (in_p69.isChecked()) {
                    foto_p69.setVisibility(View.VISIBLE);
                    descricao_p69.setVisibility(View.VISIBLE);
                    foto_p69.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p69.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p69.isChecked()) {
                    foto_p69.setVisibility(View.INVISIBLE);
                    descricao_p69.setVisibility(View.INVISIBLE);
                } else {
                    foto_p69.setVisibility(View.INVISIBLE);
                    descricao_p69.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p70 = (RadioGroup) findViewById(R.id.edificacao_p70);


        r_p70.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p70 = (RadioButton) findViewById(R.id.edificacao_p70_na);
                RadioButton ad_p70 = (RadioButton) findViewById(R.id.edificacao_p70_ad);
                RadioButton in_p70 = (RadioButton) findViewById(R.id.edificacao_p70_in);

                ImageButton foto_p70 = (ImageButton) findViewById(R.id.edificacao_foto_p70);
                ImageButton descricao_p70 = (ImageButton) findViewById(R.id.edificacao_descricao_p70);


                if (in_p70.isChecked()) {
                    foto_p70.setVisibility(View.VISIBLE);
                    descricao_p70.setVisibility(View.VISIBLE);
                    foto_p70.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p70.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p70.isChecked()) {
                    foto_p70.setVisibility(View.INVISIBLE);
                    descricao_p70.setVisibility(View.INVISIBLE);
                } else {
                    foto_p70.setVisibility(View.INVISIBLE);
                    descricao_p70.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p71 = (RadioGroup) findViewById(R.id.edificacao_p71);


        r_p71.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p71 = (RadioButton) findViewById(R.id.edificacao_p71_na);
                RadioButton ad_p71 = (RadioButton) findViewById(R.id.edificacao_p71_ad);
                RadioButton in_p71 = (RadioButton) findViewById(R.id.edificacao_p71_in);

                ImageButton foto_p71 = (ImageButton) findViewById(R.id.edificacao_foto_p71);
                ImageButton descricao_p71 = (ImageButton) findViewById(R.id.edificacao_descricao_p71);


                if (in_p71.isChecked()) {
                    foto_p71.setVisibility(View.VISIBLE);
                    descricao_p71.setVisibility(View.VISIBLE);
                    foto_p71.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p71.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p71.isChecked()) {
                    foto_p71.setVisibility(View.INVISIBLE);
                    descricao_p71.setVisibility(View.INVISIBLE);
                } else {
                    foto_p71.setVisibility(View.INVISIBLE);
                    descricao_p71.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p72 = (RadioGroup) findViewById(R.id.edificacao_p72);


        r_p72.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p72 = (RadioButton) findViewById(R.id.edificacao_p72_na);
                RadioButton ad_p72 = (RadioButton) findViewById(R.id.edificacao_p72_ad);
                RadioButton in_p72 = (RadioButton) findViewById(R.id.edificacao_p72_in);

                ImageButton foto_p72 = (ImageButton) findViewById(R.id.edificacao_foto_p72);
                ImageButton descricao_p72 = (ImageButton) findViewById(R.id.edificacao_descricao_p72);


                if (in_p72.isChecked()) {
                    foto_p72.setVisibility(View.VISIBLE);
                    descricao_p72.setVisibility(View.VISIBLE);
                    foto_p72.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p72.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p72.isChecked()) {
                    foto_p72.setVisibility(View.INVISIBLE);
                    descricao_p72.setVisibility(View.INVISIBLE);
                } else {
                    foto_p72.setVisibility(View.INVISIBLE);
                    descricao_p72.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p73 = (RadioGroup) findViewById(R.id.edificacao_p73);


        r_p73.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p73 = (RadioButton) findViewById(R.id.edificacao_p73_na);
                RadioButton ad_p73 = (RadioButton) findViewById(R.id.edificacao_p73_ad);
                RadioButton in_p73 = (RadioButton) findViewById(R.id.edificacao_p73_in);

                ImageButton foto_p73 = (ImageButton) findViewById(R.id.edificacao_foto_p73);
                ImageButton descricao_p73 = (ImageButton) findViewById(R.id.edificacao_descricao_p73);


                if (in_p73.isChecked()) {
                    foto_p73.setVisibility(View.VISIBLE);
                    descricao_p73.setVisibility(View.VISIBLE);
                    foto_p73.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p73.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p73.isChecked()) {
                    foto_p73.setVisibility(View.INVISIBLE);
                    descricao_p73.setVisibility(View.INVISIBLE);
                } else {
                    foto_p73.setVisibility(View.INVISIBLE);
                    descricao_p73.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p74 = (RadioGroup) findViewById(R.id.edificacao_p74);


        r_p74.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p74 = (RadioButton) findViewById(R.id.edificacao_p74_na);
                RadioButton ad_p74 = (RadioButton) findViewById(R.id.edificacao_p74_ad);
                RadioButton in_p74 = (RadioButton) findViewById(R.id.edificacao_p74_in);

                ImageButton foto_p74 = (ImageButton) findViewById(R.id.edificacao_foto_p74);
                ImageButton descricao_p74 = (ImageButton) findViewById(R.id.edificacao_descricao_p74);


                if (in_p74.isChecked()) {
                    foto_p74.setVisibility(View.VISIBLE);
                    descricao_p74.setVisibility(View.VISIBLE);
                    foto_p74.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p74.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p74.isChecked()) {
                    foto_p74.setVisibility(View.INVISIBLE);
                    descricao_p74.setVisibility(View.INVISIBLE);
                } else {
                    foto_p74.setVisibility(View.INVISIBLE);
                    descricao_p74.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p75 = (RadioGroup) findViewById(R.id.edificacao_p75);


        r_p75.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p75 = (RadioButton) findViewById(R.id.edificacao_p75_na);
                RadioButton ad_p75 = (RadioButton) findViewById(R.id.edificacao_p75_ad);
                RadioButton in_p75 = (RadioButton) findViewById(R.id.edificacao_p75_in);

                ImageButton foto_p75 = (ImageButton) findViewById(R.id.edificacao_foto_p75);
                ImageButton descricao_p75 = (ImageButton) findViewById(R.id.edificacao_descricao_p75);


                if (in_p75.isChecked()) {
                    foto_p75.setVisibility(View.VISIBLE);
                    descricao_p75.setVisibility(View.VISIBLE);
                    foto_p75.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p75.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p75.isChecked()) {
                    foto_p75.setVisibility(View.INVISIBLE);
                    descricao_p75.setVisibility(View.INVISIBLE);
                } else {
                    foto_p75.setVisibility(View.INVISIBLE);
                    descricao_p75.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p76 = (RadioGroup) findViewById(R.id.edificacao_p76);


        r_p76.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p76 = (RadioButton) findViewById(R.id.edificacao_p76_na);
                RadioButton ad_p76 = (RadioButton) findViewById(R.id.edificacao_p76_ad);
                RadioButton in_p76 = (RadioButton) findViewById(R.id.edificacao_p76_in);

                ImageButton foto_p76 = (ImageButton) findViewById(R.id.edificacao_foto_p76);
                ImageButton descricao_p76 = (ImageButton) findViewById(R.id.edificacao_descricao_p76);


                if (in_p76.isChecked()) {
                    foto_p76.setVisibility(View.VISIBLE);
                    descricao_p76.setVisibility(View.VISIBLE);
                    foto_p76.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p76.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p76.isChecked()) {
                    foto_p76.setVisibility(View.INVISIBLE);
                    descricao_p76.setVisibility(View.INVISIBLE);
                } else {
                    foto_p76.setVisibility(View.INVISIBLE);
                    descricao_p76.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p77 = (RadioGroup) findViewById(R.id.edificacao_p77);


        r_p77.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p77 = (RadioButton) findViewById(R.id.edificacao_p77_na);
                RadioButton ad_p77 = (RadioButton) findViewById(R.id.edificacao_p77_ad);
                RadioButton in_p77 = (RadioButton) findViewById(R.id.edificacao_p77_in);

                ImageButton foto_p77 = (ImageButton) findViewById(R.id.edificacao_foto_p77);
                ImageButton descricao_p77 = (ImageButton) findViewById(R.id.edificacao_descricao_p77);


                if (in_p77.isChecked()) {
                    foto_p77.setVisibility(View.VISIBLE);
                    descricao_p77.setVisibility(View.VISIBLE);
                    foto_p77.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p77.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p77.isChecked()) {
                    foto_p77.setVisibility(View.INVISIBLE);
                    descricao_p77.setVisibility(View.INVISIBLE);
                } else {
                    foto_p77.setVisibility(View.INVISIBLE);
                    descricao_p77.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p78 = (RadioGroup) findViewById(R.id.edificacao_p78);


        r_p78.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p78 = (RadioButton) findViewById(R.id.edificacao_p78_na);
                RadioButton ad_p78 = (RadioButton) findViewById(R.id.edificacao_p78_ad);
                RadioButton in_p78 = (RadioButton) findViewById(R.id.edificacao_p78_in);

                ImageButton foto_p78 = (ImageButton) findViewById(R.id.edificacao_foto_p78);
                ImageButton descricao_p78 = (ImageButton) findViewById(R.id.edificacao_descricao_p78);


                if (in_p78.isChecked()) {
                    foto_p78.setVisibility(View.VISIBLE);
                    descricao_p78.setVisibility(View.VISIBLE);
                    foto_p78.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p78.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p78.isChecked()) {
                    foto_p78.setVisibility(View.INVISIBLE);
                    descricao_p78.setVisibility(View.INVISIBLE);
                } else {
                    foto_p78.setVisibility(View.INVISIBLE);
                    descricao_p78.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p79 = (RadioGroup) findViewById(R.id.edificacao_p79);


        r_p79.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p79 = (RadioButton) findViewById(R.id.edificacao_p79_na);
                RadioButton ad_p79 = (RadioButton) findViewById(R.id.edificacao_p79_ad);
                RadioButton in_p79 = (RadioButton) findViewById(R.id.edificacao_p79_in);

                ImageButton foto_p79 = (ImageButton) findViewById(R.id.edificacao_foto_p79);
                ImageButton descricao_p79 = (ImageButton) findViewById(R.id.edificacao_descricao_p79);


                if (in_p79.isChecked()) {
                    foto_p79.setVisibility(View.VISIBLE);
                    descricao_p79.setVisibility(View.VISIBLE);
                    foto_p79.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p79.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p79.isChecked()) {
                    foto_p79.setVisibility(View.INVISIBLE);
                    descricao_p79.setVisibility(View.INVISIBLE);
                } else {
                    foto_p79.setVisibility(View.INVISIBLE);
                    descricao_p79.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p80 = (RadioGroup) findViewById(R.id.edificacao_p80);


        r_p80.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p80 = (RadioButton) findViewById(R.id.edificacao_p80_na);
                RadioButton ad_p80 = (RadioButton) findViewById(R.id.edificacao_p80_ad);
                RadioButton in_p80 = (RadioButton) findViewById(R.id.edificacao_p80_in);

                ImageButton foto_p80 = (ImageButton) findViewById(R.id.edificacao_foto_p80);
                ImageButton descricao_p80 = (ImageButton) findViewById(R.id.edificacao_descricao_p80);


                if (in_p80.isChecked()) {
                    foto_p80.setVisibility(View.VISIBLE);
                    descricao_p80.setVisibility(View.VISIBLE);
                    foto_p80.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p80.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p80.isChecked()) {
                    foto_p80.setVisibility(View.INVISIBLE);
                    descricao_p80.setVisibility(View.INVISIBLE);
                } else {
                    foto_p80.setVisibility(View.INVISIBLE);
                    descricao_p80.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p81 = (RadioGroup) findViewById(R.id.edificacao_p81);


        r_p81.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p81 = (RadioButton) findViewById(R.id.edificacao_p81_na);
                RadioButton ad_p81 = (RadioButton) findViewById(R.id.edificacao_p81_ad);
                RadioButton in_p81 = (RadioButton) findViewById(R.id.edificacao_p81_in);

                ImageButton foto_p81 = (ImageButton) findViewById(R.id.edificacao_foto_p81);
                ImageButton descricao_p81 = (ImageButton) findViewById(R.id.edificacao_descricao_p81);


                if (in_p81.isChecked()) {
                    foto_p81.setVisibility(View.VISIBLE);
                    descricao_p81.setVisibility(View.VISIBLE);
                    foto_p81.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p81.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p81.isChecked()) {
                    foto_p81.setVisibility(View.INVISIBLE);
                    descricao_p81.setVisibility(View.INVISIBLE);
                } else {
                    foto_p81.setVisibility(View.INVISIBLE);
                    descricao_p81.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p82 = (RadioGroup) findViewById(R.id.edificacao_p82);


        r_p82.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p82 = (RadioButton) findViewById(R.id.edificacao_p82_na);
                RadioButton ad_p82 = (RadioButton) findViewById(R.id.edificacao_p82_ad);
                RadioButton in_p82 = (RadioButton) findViewById(R.id.edificacao_p82_in);

                ImageButton foto_p82 = (ImageButton) findViewById(R.id.edificacao_foto_p82);
                ImageButton descricao_p82 = (ImageButton) findViewById(R.id.edificacao_descricao_p82);


                if (in_p82.isChecked()) {
                    foto_p82.setVisibility(View.VISIBLE);
                    descricao_p82.setVisibility(View.VISIBLE);
                    foto_p82.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p82.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p82.isChecked()) {
                    foto_p82.setVisibility(View.INVISIBLE);
                    descricao_p82.setVisibility(View.INVISIBLE);
                } else {
                    foto_p82.setVisibility(View.INVISIBLE);
                    descricao_p82.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p83 = (RadioGroup) findViewById(R.id.edificacao_p83);


        r_p83.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p83 = (RadioButton) findViewById(R.id.edificacao_p83_na);
                RadioButton ad_p83 = (RadioButton) findViewById(R.id.edificacao_p83_ad);
                RadioButton in_p83 = (RadioButton) findViewById(R.id.edificacao_p83_in);

                ImageButton foto_p83 = (ImageButton) findViewById(R.id.edificacao_foto_p83);
                ImageButton descricao_p83 = (ImageButton) findViewById(R.id.edificacao_descricao_p83);


                if (in_p83.isChecked()) {
                    foto_p83.setVisibility(View.VISIBLE);
                    descricao_p83.setVisibility(View.VISIBLE);
                    foto_p83.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p83.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p83.isChecked()) {
                    foto_p83.setVisibility(View.INVISIBLE);
                    descricao_p83.setVisibility(View.INVISIBLE);
                } else {
                    foto_p83.setVisibility(View.INVISIBLE);
                    descricao_p83.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p84 = (RadioGroup) findViewById(R.id.edificacao_p84);


        r_p84.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p84 = (RadioButton) findViewById(R.id.edificacao_p84_na);
                RadioButton ad_p84 = (RadioButton) findViewById(R.id.edificacao_p84_ad);
                RadioButton in_p84 = (RadioButton) findViewById(R.id.edificacao_p84_in);

                ImageButton foto_p84 = (ImageButton) findViewById(R.id.edificacao_foto_p84);
                ImageButton descricao_p84 = (ImageButton) findViewById(R.id.edificacao_descricao_p84);


                if (in_p84.isChecked()) {
                    foto_p84.setVisibility(View.VISIBLE);
                    descricao_p84.setVisibility(View.VISIBLE);
                    foto_p84.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p84.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p84.isChecked()) {
                    foto_p84.setVisibility(View.INVISIBLE);
                    descricao_p84.setVisibility(View.INVISIBLE);
                } else {
                    foto_p84.setVisibility(View.INVISIBLE);
                    descricao_p84.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p85 = (RadioGroup) findViewById(R.id.edificacao_p85);


        r_p85.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p85 = (RadioButton) findViewById(R.id.edificacao_p85_na);
                RadioButton ad_p85 = (RadioButton) findViewById(R.id.edificacao_p85_ad);
                RadioButton in_p85 = (RadioButton) findViewById(R.id.edificacao_p85_in);

                ImageButton foto_p85 = (ImageButton) findViewById(R.id.edificacao_foto_p85);
                ImageButton descricao_p85 = (ImageButton) findViewById(R.id.edificacao_descricao_p85);


                if (in_p85.isChecked()) {
                    foto_p85.setVisibility(View.VISIBLE);
                    descricao_p85.setVisibility(View.VISIBLE);
                    foto_p85.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p85.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p85.isChecked()) {
                    foto_p85.setVisibility(View.INVISIBLE);
                    descricao_p85.setVisibility(View.INVISIBLE);
                } else {
                    foto_p85.setVisibility(View.INVISIBLE);
                    descricao_p85.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p86 = (RadioGroup) findViewById(R.id.edificacao_p86);


        r_p86.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p86 = (RadioButton) findViewById(R.id.edificacao_p86_na);
                RadioButton ad_p86 = (RadioButton) findViewById(R.id.edificacao_p86_ad);
                RadioButton in_p86 = (RadioButton) findViewById(R.id.edificacao_p86_in);

                ImageButton foto_p86 = (ImageButton) findViewById(R.id.edificacao_foto_p86);
                ImageButton descricao_p86 = (ImageButton) findViewById(R.id.edificacao_descricao_p86);


                if (in_p86.isChecked()) {
                    foto_p86.setVisibility(View.VISIBLE);
                    descricao_p86.setVisibility(View.VISIBLE);
                    foto_p86.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p86.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p86.isChecked()) {
                    foto_p86.setVisibility(View.INVISIBLE);
                    descricao_p86.setVisibility(View.INVISIBLE);
                } else {
                    foto_p86.setVisibility(View.INVISIBLE);
                    descricao_p86.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p87 = (RadioGroup) findViewById(R.id.edificacao_p87);


        r_p87.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p87 = (RadioButton) findViewById(R.id.edificacao_p87_na);
                RadioButton ad_p87 = (RadioButton) findViewById(R.id.edificacao_p87_ad);
                RadioButton in_p87 = (RadioButton) findViewById(R.id.edificacao_p87_in);

                ImageButton foto_p87 = (ImageButton) findViewById(R.id.edificacao_foto_p87);
                ImageButton descricao_p87 = (ImageButton) findViewById(R.id.edificacao_descricao_p87);


                if (in_p87.isChecked()) {
                    foto_p87.setVisibility(View.VISIBLE);
                    descricao_p87.setVisibility(View.VISIBLE);
                    foto_p87.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p87.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p87.isChecked()) {
                    foto_p87.setVisibility(View.INVISIBLE);
                    descricao_p87.setVisibility(View.INVISIBLE);
                } else {
                    foto_p87.setVisibility(View.INVISIBLE);
                    descricao_p87.setVisibility(View.INVISIBLE);
                }
            }
        });

        RadioGroup r_p88 = (RadioGroup) findViewById(R.id.edificacao_p88);


        r_p88.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p88 = (RadioButton) findViewById(R.id.edificacao_p88_na);
                RadioButton ad_p88 = (RadioButton) findViewById(R.id.edificacao_p88_ad);
                RadioButton in_p88 = (RadioButton) findViewById(R.id.edificacao_p88_in);

                ImageButton foto_p88 = (ImageButton) findViewById(R.id.edificacao_foto_p88);
                ImageButton descricao_p88 = (ImageButton) findViewById(R.id.edificacao_descricao_p88);


                if (in_p88.isChecked()) {
                    foto_p88.setVisibility(View.VISIBLE);
                    descricao_p88.setVisibility(View.VISIBLE);
                    foto_p88.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tirarFotoIntent();
                        }
                    });
                    descricao_p88.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mostraJanelaDescricao();
                        }
                    });

                } else if (na_p88.isChecked()) {
                    foto_p88.setVisibility(View.INVISIBLE);
                    descricao_p88.setVisibility(View.INVISIBLE);
                } else {
                    foto_p88.setVisibility(View.INVISIBLE);
                    descricao_p88.setVisibility(View.INVISIBLE);
                }
            }
        });

        ImageButton edificacaoSalvar = (ImageButton) findViewById(R.id.edificacao_btnSalvar);
        edificacaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProEdificacao = new Intent(Prt2619_EdificacaoActivity.this, Prt2619Activity.class);
                startActivity(intentVaiProEdificacao);
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


        LayoutInflater layoutInflater = LayoutInflater.from(Prt2619_EdificacaoActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Prt2619_EdificacaoActivity.this);
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



