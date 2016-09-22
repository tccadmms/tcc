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

public class Prt2619_ManipuladoresActivity extends Activity {

    private static final int REQUEST_IMAGE_PICTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prt2619__manipuladores);


        RadioGroup r_p1 = (RadioGroup) findViewById(R.id.manipuladores_p1);


        r_p1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p1 = (RadioButton) findViewById(R.id.manipuladores_p1_na);
                RadioButton ad_p1 = (RadioButton) findViewById(R.id.manipuladores_p1_ad);
                RadioButton in_p1 = (RadioButton) findViewById(R.id.manipuladores_p1_in);

                ImageButton foto_p1 = (ImageButton) findViewById(R.id.manipuladores_foto_p1);
                ImageButton descricao_p1 = (ImageButton) findViewById(R.id.manipuladores_descricao_p1);


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

        RadioGroup r_p2 = (RadioGroup) findViewById(R.id.manipuladores_p2);


        r_p2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p2 = (RadioButton) findViewById(R.id.manipuladores_p2_na);
                RadioButton ad_p2 = (RadioButton) findViewById(R.id.manipuladores_p2_ad);
                RadioButton in_p2 = (RadioButton) findViewById(R.id.manipuladores_p2_in);

                ImageButton foto_p2 = (ImageButton) findViewById(R.id.manipuladores_foto_p2);
                ImageButton descricao_p2 = (ImageButton) findViewById(R.id.manipuladores_descricao_p2);


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

        RadioGroup r_p3 = (RadioGroup) findViewById(R.id.manipuladores_p3);


        r_p3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p3 = (RadioButton) findViewById(R.id.manipuladores_p3_na);
                RadioButton ad_p3 = (RadioButton) findViewById(R.id.manipuladores_p3_ad);
                RadioButton in_p3 = (RadioButton) findViewById(R.id.manipuladores_p3_in);

                ImageButton foto_p3 = (ImageButton) findViewById(R.id.manipuladores_foto_p3);
                ImageButton descricao_p3 = (ImageButton) findViewById(R.id.manipuladores_descricao_p3);


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

        RadioGroup r_p4 = (RadioGroup) findViewById(R.id.manipuladores_p4);


        r_p4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p4 = (RadioButton) findViewById(R.id.manipuladores_p4_na);
                RadioButton ad_p4 = (RadioButton) findViewById(R.id.manipuladores_p4_ad);
                RadioButton in_p4 = (RadioButton) findViewById(R.id.manipuladores_p4_in);

                ImageButton foto_p4 = (ImageButton) findViewById(R.id.manipuladores_foto_p4);
                ImageButton descricao_p4 = (ImageButton) findViewById(R.id.manipuladores_descricao_p4);


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

        RadioGroup r_p5 = (RadioGroup) findViewById(R.id.manipuladores_p5);


        r_p5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p5 = (RadioButton) findViewById(R.id.manipuladores_p5_na);
                RadioButton ad_p5 = (RadioButton) findViewById(R.id.manipuladores_p5_ad);
                RadioButton in_p5 = (RadioButton) findViewById(R.id.manipuladores_p5_in);

                ImageButton foto_p5 = (ImageButton) findViewById(R.id.manipuladores_foto_p5);
                ImageButton descricao_p5 = (ImageButton) findViewById(R.id.manipuladores_descricao_p5);


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

        RadioGroup r_p6 = (RadioGroup) findViewById(R.id.manipuladores_p6);


        r_p6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p6 = (RadioButton) findViewById(R.id.manipuladores_p6_na);
                RadioButton ad_p6 = (RadioButton) findViewById(R.id.manipuladores_p6_ad);
                RadioButton in_p6 = (RadioButton) findViewById(R.id.manipuladores_p6_in);

                ImageButton foto_p6 = (ImageButton) findViewById(R.id.manipuladores_foto_p6);
                ImageButton descricao_p6 = (ImageButton) findViewById(R.id.manipuladores_descricao_p6);


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

        RadioGroup r_p7 = (RadioGroup) findViewById(R.id.manipuladores_p7);


        r_p7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p7 = (RadioButton) findViewById(R.id.manipuladores_p7_na);
                RadioButton ad_p7 = (RadioButton) findViewById(R.id.manipuladores_p7_ad);
                RadioButton in_p7 = (RadioButton) findViewById(R.id.manipuladores_p7_in);

                ImageButton foto_p7 = (ImageButton) findViewById(R.id.manipuladores_foto_p7);
                ImageButton descricao_p7 = (ImageButton) findViewById(R.id.manipuladores_descricao_p7);


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

        RadioGroup r_p8 = (RadioGroup) findViewById(R.id.manipuladores_p8);


        r_p8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p8 = (RadioButton) findViewById(R.id.manipuladores_p8_na);
                RadioButton ad_p8 = (RadioButton) findViewById(R.id.manipuladores_p8_ad);
                RadioButton in_p8 = (RadioButton) findViewById(R.id.manipuladores_p8_in);

                ImageButton foto_p8 = (ImageButton) findViewById(R.id.manipuladores_foto_p8);
                ImageButton descricao_p8 = (ImageButton) findViewById(R.id.manipuladores_descricao_p8);


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

        RadioGroup r_p9 = (RadioGroup) findViewById(R.id.manipuladores_p9);


        r_p9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p9 = (RadioButton) findViewById(R.id.manipuladores_p9_na);
                RadioButton ad_p9 = (RadioButton) findViewById(R.id.manipuladores_p9_ad);
                RadioButton in_p9 = (RadioButton) findViewById(R.id.manipuladores_p9_in);

                ImageButton foto_p9 = (ImageButton) findViewById(R.id.manipuladores_foto_p9);
                ImageButton descricao_p9 = (ImageButton) findViewById(R.id.manipuladores_descricao_p9);


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

        RadioGroup r_p10 = (RadioGroup) findViewById(R.id.manipuladores_p10);


        r_p10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p10 = (RadioButton) findViewById(R.id.manipuladores_p10_na);
                RadioButton ad_p10= (RadioButton) findViewById(R.id.manipuladores_p10_ad);
                RadioButton in_p10 = (RadioButton) findViewById(R.id.manipuladores_p10_in);

                ImageButton foto_p10 = (ImageButton) findViewById(R.id.manipuladores_foto_p10);
                ImageButton descricao_p10 = (ImageButton) findViewById(R.id.manipuladores_descricao_p10);


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

        RadioGroup r_p11 = (RadioGroup) findViewById(R.id.manipuladores_p11);


        r_p11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p11 = (RadioButton) findViewById(R.id.manipuladores_p11_na);
                RadioButton ad_p11 = (RadioButton) findViewById(R.id.manipuladores_p11_ad);
                RadioButton in_p11 = (RadioButton) findViewById(R.id.manipuladores_p11_in);

                ImageButton foto_p11 = (ImageButton) findViewById(R.id.manipuladores_foto_p11);
                ImageButton descricao_p11 = (ImageButton) findViewById(R.id.manipuladores_descricao_p11);


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

        RadioGroup r_p12 = (RadioGroup) findViewById(R.id.manipuladores_p12);


        r_p12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p12 = (RadioButton) findViewById(R.id.manipuladores_p12_na);
                RadioButton ad_p12 = (RadioButton) findViewById(R.id.manipuladores_p12_ad);
                RadioButton in_p12 = (RadioButton) findViewById(R.id.manipuladores_p12_in);

                ImageButton foto_p12 = (ImageButton) findViewById(R.id.manipuladores_foto_p12);
                ImageButton descricao_p12 = (ImageButton) findViewById(R.id.manipuladores_descricao_p12);


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

        RadioGroup r_p13 = (RadioGroup) findViewById(R.id.manipuladores_p13);


        r_p13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p13 = (RadioButton) findViewById(R.id.manipuladores_p13_na);
                RadioButton ad_p13 = (RadioButton) findViewById(R.id.manipuladores_p13_ad);
                RadioButton in_p13 = (RadioButton) findViewById(R.id.manipuladores_p13_in);

                ImageButton foto_p13 = (ImageButton) findViewById(R.id.manipuladores_foto_p13);
                ImageButton descricao_p13 = (ImageButton) findViewById(R.id.manipuladores_descricao_p13);


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

        RadioGroup r_p14 = (RadioGroup) findViewById(R.id.manipuladores_p14);


        r_p14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p14 = (RadioButton) findViewById(R.id.manipuladores_p14_na);
                RadioButton ad_p14 = (RadioButton) findViewById(R.id.manipuladores_p14_ad);
                RadioButton in_p14 = (RadioButton) findViewById(R.id.manipuladores_p14_in);

                ImageButton foto_p14 = (ImageButton) findViewById(R.id.manipuladores_foto_p14);
                ImageButton descricao_p14 = (ImageButton) findViewById(R.id.manipuladores_descricao_p14);


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

        RadioGroup r_p15 = (RadioGroup) findViewById(R.id.manipuladores_p15);


        r_p15.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p15 = (RadioButton) findViewById(R.id.manipuladores_p15_na);
                RadioButton ad_p15 = (RadioButton) findViewById(R.id.manipuladores_p15_ad);
                RadioButton in_p15 = (RadioButton) findViewById(R.id.manipuladores_p15_in);

                ImageButton foto_p15 = (ImageButton) findViewById(R.id.manipuladores_foto_p15);
                ImageButton descricao_p15 = (ImageButton) findViewById(R.id.manipuladores_descricao_p15);


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

        RadioGroup r_p16 = (RadioGroup) findViewById(R.id.manipuladores_p16);


        r_p16.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p16 = (RadioButton) findViewById(R.id.manipuladores_p16_na);
                RadioButton ad_p16 = (RadioButton) findViewById(R.id.manipuladores_p16_ad);
                RadioButton in_p16 = (RadioButton) findViewById(R.id.manipuladores_p16_in);

                ImageButton foto_p16 = (ImageButton) findViewById(R.id.manipuladores_foto_p16);
                ImageButton descricao_p16 = (ImageButton) findViewById(R.id.manipuladores_descricao_p16);


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

        RadioGroup r_p17 = (RadioGroup) findViewById(R.id.manipuladores_p17);


        r_p17.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p17 = (RadioButton) findViewById(R.id.manipuladores_p17_na);
                RadioButton ad_p17 = (RadioButton) findViewById(R.id.manipuladores_p17_ad);
                RadioButton in_p17 = (RadioButton) findViewById(R.id.manipuladores_p17_in);

                ImageButton foto_p17 = (ImageButton) findViewById(R.id.manipuladores_foto_p17);
                ImageButton descricao_p17 = (ImageButton) findViewById(R.id.manipuladores_descricao_p17);


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

        RadioGroup r_p18 = (RadioGroup) findViewById(R.id.manipuladores_p18);


        r_p18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p18 = (RadioButton) findViewById(R.id.manipuladores_p18_na);
                RadioButton ad_p18 = (RadioButton) findViewById(R.id.manipuladores_p18_ad);
                RadioButton in_p18 = (RadioButton) findViewById(R.id.manipuladores_p18_in);

                ImageButton foto_p18 = (ImageButton) findViewById(R.id.manipuladores_foto_p18);
                ImageButton descricao_p18 = (ImageButton) findViewById(R.id.manipuladores_descricao_p18);


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


        RadioGroup r_p19 = (RadioGroup) findViewById(R.id.manipuladores_p19);


        r_p19.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p19 = (RadioButton) findViewById(R.id.manipuladores_p19_na);
                RadioButton ad_p19 = (RadioButton) findViewById(R.id.manipuladores_p19_ad);
                RadioButton in_p19 = (RadioButton) findViewById(R.id.manipuladores_p19_in);

                ImageButton foto_p19 = (ImageButton) findViewById(R.id.manipuladores_foto_p19);
                ImageButton descricao_p19 = (ImageButton) findViewById(R.id.manipuladores_descricao_p19);


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

        RadioGroup r_p20 = (RadioGroup) findViewById(R.id.manipuladores_p20);


        r_p20.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p20 = (RadioButton) findViewById(R.id.manipuladores_p20_na);
                RadioButton ad_p20 = (RadioButton) findViewById(R.id.manipuladores_p20_ad);
                RadioButton in_p20 = (RadioButton) findViewById(R.id.manipuladores_p20_in);

                ImageButton foto_p20 = (ImageButton) findViewById(R.id.manipuladores_foto_p20);
                ImageButton descricao_p20 = (ImageButton) findViewById(R.id.manipuladores_descricao_p20);


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

        RadioGroup r_p21 = (RadioGroup) findViewById(R.id.manipuladores_p21);


        r_p21.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p21 = (RadioButton) findViewById(R.id.manipuladores_p21_na);
                RadioButton ad_p21 = (RadioButton) findViewById(R.id.manipuladores_p21_ad);
                RadioButton in_p21 = (RadioButton) findViewById(R.id.manipuladores_p21_in);

                ImageButton foto_p21 = (ImageButton) findViewById(R.id.manipuladores_foto_p21);
                ImageButton descricao_p21 = (ImageButton) findViewById(R.id.manipuladores_descricao_p21);


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

        RadioGroup r_p22 = (RadioGroup) findViewById(R.id.manipuladores_p22);


        r_p22.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p22 = (RadioButton) findViewById(R.id.manipuladores_p22_na);
                RadioButton ad_p22 = (RadioButton) findViewById(R.id.manipuladores_p22_ad);
                RadioButton in_p22 = (RadioButton) findViewById(R.id.manipuladores_p22_in);

                ImageButton foto_p22 = (ImageButton) findViewById(R.id.manipuladores_foto_p22);
                ImageButton descricao_p22 = (ImageButton) findViewById(R.id.manipuladores_descricao_p22);


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

        RadioGroup r_p23 = (RadioGroup) findViewById(R.id.manipuladores_p23);


        r_p23.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p23 = (RadioButton) findViewById(R.id.manipuladores_p23_na);
                RadioButton ad_p23 = (RadioButton) findViewById(R.id.manipuladores_p23_ad);
                RadioButton in_p23 = (RadioButton) findViewById(R.id.manipuladores_p23_in);

                ImageButton foto_p23 = (ImageButton) findViewById(R.id.manipuladores_foto_p23);
                ImageButton descricao_p23 = (ImageButton) findViewById(R.id.manipuladores_descricao_p23);


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

        RadioGroup r_p24 = (RadioGroup) findViewById(R.id.manipuladores_p24);


        r_p24.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p24 = (RadioButton) findViewById(R.id.manipuladores_p24_na);
                RadioButton ad_p24 = (RadioButton) findViewById(R.id.manipuladores_p24_ad);
                RadioButton in_p24 = (RadioButton) findViewById(R.id.manipuladores_p24_in);

                ImageButton foto_p24 = (ImageButton) findViewById(R.id.manipuladores_foto_p24);
                ImageButton descricao_p24 = (ImageButton) findViewById(R.id.manipuladores_descricao_p24);


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

        RadioGroup r_p25 = (RadioGroup) findViewById(R.id.manipuladores_p25);


        r_p25.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p25 = (RadioButton) findViewById(R.id.manipuladores_p25_na);
                RadioButton ad_p25 = (RadioButton) findViewById(R.id.manipuladores_p25_ad);
                RadioButton in_p25 = (RadioButton) findViewById(R.id.manipuladores_p25_in);

                ImageButton foto_p25 = (ImageButton) findViewById(R.id.manipuladores_foto_p25);
                ImageButton descricao_p25 = (ImageButton) findViewById(R.id.manipuladores_descricao_p25);


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

        RadioGroup r_p26 = (RadioGroup) findViewById(R.id.manipuladores_p26);


        r_p26.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p26 = (RadioButton) findViewById(R.id.manipuladores_p26_na);
                RadioButton ad_p26 = (RadioButton) findViewById(R.id.manipuladores_p26_ad);
                RadioButton in_p26 = (RadioButton) findViewById(R.id.manipuladores_p26_in);

                ImageButton foto_p26 = (ImageButton) findViewById(R.id.manipuladores_foto_p26);
                ImageButton descricao_p26 = (ImageButton) findViewById(R.id.manipuladores_descricao_p26);


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

        RadioGroup r_p27 = (RadioGroup) findViewById(R.id.manipuladores_p27);


        r_p27.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p27 = (RadioButton) findViewById(R.id.manipuladores_p27_na);
                RadioButton ad_p27 = (RadioButton) findViewById(R.id.manipuladores_p27_ad);
                RadioButton in_p27 = (RadioButton) findViewById(R.id.manipuladores_p27_in);

                ImageButton foto_p27 = (ImageButton) findViewById(R.id.manipuladores_foto_p27);
                ImageButton descricao_p27 = (ImageButton) findViewById(R.id.manipuladores_descricao_p27);


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

        RadioGroup r_p28 = (RadioGroup) findViewById(R.id.manipuladores_p28);


        r_p28.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p28 = (RadioButton) findViewById(R.id.manipuladores_p28_na);
                RadioButton ad_p28 = (RadioButton) findViewById(R.id.manipuladores_p28_ad);
                RadioButton in_p28 = (RadioButton) findViewById(R.id.manipuladores_p28_in);

                ImageButton foto_p28 = (ImageButton) findViewById(R.id.manipuladores_foto_p28);
                ImageButton descricao_p28 = (ImageButton) findViewById(R.id.manipuladores_descricao_p28);


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

        RadioGroup r_p29 = (RadioGroup) findViewById(R.id.manipuladores_p29);


        r_p29.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p29 = (RadioButton) findViewById(R.id.manipuladores_p29_na);
                RadioButton ad_p29 = (RadioButton) findViewById(R.id.manipuladores_p29_ad);
                RadioButton in_p29 = (RadioButton) findViewById(R.id.manipuladores_p29_in);

                ImageButton foto_p29 = (ImageButton) findViewById(R.id.manipuladores_foto_p29);
                ImageButton descricao_p29 = (ImageButton) findViewById(R.id.manipuladores_descricao_p29);


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

        RadioGroup r_p30 = (RadioGroup) findViewById(R.id.manipuladores_p30);


        r_p30.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p30 = (RadioButton) findViewById(R.id.manipuladores_p30_na);
                RadioButton ad_p30 = (RadioButton) findViewById(R.id.manipuladores_p30_ad);
                RadioButton in_p30 = (RadioButton) findViewById(R.id.manipuladores_p30_in);

                ImageButton foto_p30 = (ImageButton) findViewById(R.id.manipuladores_foto_p30);
                ImageButton descricao_p30 = (ImageButton) findViewById(R.id.manipuladores_descricao_p30);


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

        RadioGroup r_p31 = (RadioGroup) findViewById(R.id.manipuladores_p31);


        r_p31.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p31 = (RadioButton) findViewById(R.id.manipuladores_p31_na);
                RadioButton ad_p31 = (RadioButton) findViewById(R.id.manipuladores_p31_ad);
                RadioButton in_p31 = (RadioButton) findViewById(R.id.manipuladores_p31_in);

                ImageButton foto_p31 = (ImageButton) findViewById(R.id.manipuladores_foto_p31);
                ImageButton descricao_p31 = (ImageButton) findViewById(R.id.manipuladores_descricao_p31);


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

        RadioGroup r_p32 = (RadioGroup) findViewById(R.id.manipuladores_p32);


        r_p32.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p32 = (RadioButton) findViewById(R.id.manipuladores_p32_na);
                RadioButton ad_p32 = (RadioButton) findViewById(R.id.manipuladores_p32_ad);
                RadioButton in_p32 = (RadioButton) findViewById(R.id.manipuladores_p32_in);

                ImageButton foto_p32 = (ImageButton) findViewById(R.id.manipuladores_foto_p32);
                ImageButton descricao_p32 = (ImageButton) findViewById(R.id.manipuladores_descricao_p32);


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

        RadioGroup r_p33 = (RadioGroup) findViewById(R.id.manipuladores_p33);


        r_p33.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p33 = (RadioButton) findViewById(R.id.manipuladores_p33_na);
                RadioButton ad_p33 = (RadioButton) findViewById(R.id.manipuladores_p33_ad);
                RadioButton in_p33 = (RadioButton) findViewById(R.id.manipuladores_p33_in);

                ImageButton foto_p33 = (ImageButton) findViewById(R.id.manipuladores_foto_p33);
                ImageButton descricao_p33 = (ImageButton) findViewById(R.id.manipuladores_descricao_p33);


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

        RadioGroup r_p34 = (RadioGroup) findViewById(R.id.manipuladores_p34);


        r_p34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p34 = (RadioButton) findViewById(R.id.manipuladores_p34_na);
                RadioButton ad_p34 = (RadioButton) findViewById(R.id.manipuladores_p34_ad);
                RadioButton in_p34 = (RadioButton) findViewById(R.id.manipuladores_p34_in);

                ImageButton foto_p34 = (ImageButton) findViewById(R.id.manipuladores_foto_p34);
                ImageButton descricao_p34 = (ImageButton) findViewById(R.id.manipuladores_descricao_p34);


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

        RadioGroup r_p35 = (RadioGroup) findViewById(R.id.manipuladores_p35);


        r_p35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p35 = (RadioButton) findViewById(R.id.manipuladores_p35_na);
                RadioButton ad_p35 = (RadioButton) findViewById(R.id.manipuladores_p35_ad);
                RadioButton in_p35 = (RadioButton) findViewById(R.id.manipuladores_p35_in);

                ImageButton foto_p35 = (ImageButton) findViewById(R.id.manipuladores_foto_p35);
                ImageButton descricao_p35 = (ImageButton) findViewById(R.id.manipuladores_descricao_p35);


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

        RadioGroup r_p36 = (RadioGroup) findViewById(R.id.manipuladores_p36);


        r_p36.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p36 = (RadioButton) findViewById(R.id.manipuladores_p36_na);
                RadioButton ad_p36 = (RadioButton) findViewById(R.id.manipuladores_p36_ad);
                RadioButton in_p36 = (RadioButton) findViewById(R.id.manipuladores_p36_in);

                ImageButton foto_p36 = (ImageButton) findViewById(R.id.manipuladores_foto_p36);
                ImageButton descricao_p36 = (ImageButton) findViewById(R.id.manipuladores_descricao_p36);


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

        RadioGroup r_p37 = (RadioGroup) findViewById(R.id.manipuladores_p37);


        r_p37.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p37 = (RadioButton) findViewById(R.id.manipuladores_p37_na);
                RadioButton ad_p37 = (RadioButton) findViewById(R.id.manipuladores_p37_ad);
                RadioButton in_p37 = (RadioButton) findViewById(R.id.manipuladores_p37_in);

                ImageButton foto_p37 = (ImageButton) findViewById(R.id.manipuladores_foto_p37);
                ImageButton descricao_p37 = (ImageButton) findViewById(R.id.manipuladores_descricao_p37);


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

        RadioGroup r_p38 = (RadioGroup) findViewById(R.id.manipuladores_p38);


        r_p38.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p38 = (RadioButton) findViewById(R.id.manipuladores_p38_na);
                RadioButton ad_p38 = (RadioButton) findViewById(R.id.manipuladores_p38_ad);
                RadioButton in_p38 = (RadioButton) findViewById(R.id.manipuladores_p38_in);

                ImageButton foto_p38 = (ImageButton) findViewById(R.id.manipuladores_foto_p38);
                ImageButton descricao_p38 = (ImageButton) findViewById(R.id.manipuladores_descricao_p38);


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

        RadioGroup r_p39 = (RadioGroup) findViewById(R.id.manipuladores_p39);


        r_p39.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p39 = (RadioButton) findViewById(R.id.manipuladores_p39_na);
                RadioButton ad_p39 = (RadioButton) findViewById(R.id.manipuladores_p39_ad);
                RadioButton in_p39 = (RadioButton) findViewById(R.id.manipuladores_p39_in);

                ImageButton foto_p39 = (ImageButton) findViewById(R.id.manipuladores_foto_p39);
                ImageButton descricao_p39 = (ImageButton) findViewById(R.id.manipuladores_descricao_p39);


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

        RadioGroup r_p40 = (RadioGroup) findViewById(R.id.manipuladores_p40);


        r_p40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p40 = (RadioButton) findViewById(R.id.manipuladores_p40_na);
                RadioButton ad_p40 = (RadioButton) findViewById(R.id.manipuladores_p40_ad);
                RadioButton in_p40 = (RadioButton) findViewById(R.id.manipuladores_p40_in);

                ImageButton foto_p40 = (ImageButton) findViewById(R.id.manipuladores_foto_p40);
                ImageButton descricao_p40 = (ImageButton) findViewById(R.id.manipuladores_descricao_p40);


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

        RadioGroup r_p41 = (RadioGroup) findViewById(R.id.manipuladores_p41);


        r_p41.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p41 = (RadioButton) findViewById(R.id.manipuladores_p41_na);
                RadioButton ad_p41 = (RadioButton) findViewById(R.id.manipuladores_p41_ad);
                RadioButton in_p41 = (RadioButton) findViewById(R.id.manipuladores_p41_in);

                ImageButton foto_p41 = (ImageButton) findViewById(R.id.manipuladores_foto_p41);
                ImageButton descricao_p41 = (ImageButton) findViewById(R.id.manipuladores_descricao_p41);


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

        RadioGroup r_p42 = (RadioGroup) findViewById(R.id.manipuladores_p42);


        r_p42.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p42 = (RadioButton) findViewById(R.id.manipuladores_p42_na);
                RadioButton ad_p42 = (RadioButton) findViewById(R.id.manipuladores_p42_ad);
                RadioButton in_p42 = (RadioButton) findViewById(R.id.manipuladores_p42_in);

                ImageButton foto_p42 = (ImageButton) findViewById(R.id.manipuladores_foto_p42);
                ImageButton descricao_p42 = (ImageButton) findViewById(R.id.manipuladores_descricao_p42);


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

        RadioGroup r_p43 = (RadioGroup) findViewById(R.id.manipuladores_p43);


        r_p43.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p43 = (RadioButton) findViewById(R.id.manipuladores_p43_na);
                RadioButton ad_p43 = (RadioButton) findViewById(R.id.manipuladores_p43_ad);
                RadioButton in_p43 = (RadioButton) findViewById(R.id.manipuladores_p43_in);

                ImageButton foto_p43 = (ImageButton) findViewById(R.id.manipuladores_foto_p43);
                ImageButton descricao_p43 = (ImageButton) findViewById(R.id.manipuladores_descricao_p43);


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

        RadioGroup r_p44 = (RadioGroup) findViewById(R.id.manipuladores_p44);


        r_p44.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p44 = (RadioButton) findViewById(R.id.manipuladores_p44_na);
                RadioButton ad_p44 = (RadioButton) findViewById(R.id.manipuladores_p44_ad);
                RadioButton in_p44 = (RadioButton) findViewById(R.id.manipuladores_p44_in);

                ImageButton foto_p44 = (ImageButton) findViewById(R.id.manipuladores_foto_p44);
                ImageButton descricao_p44 = (ImageButton) findViewById(R.id.manipuladores_descricao_p44);


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

        RadioGroup r_p45 = (RadioGroup) findViewById(R.id.manipuladores_p45);


        r_p45.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p45 = (RadioButton) findViewById(R.id.manipuladores_p45_na);
                RadioButton ad_p45 = (RadioButton) findViewById(R.id.manipuladores_p45_ad);
                RadioButton in_p45 = (RadioButton) findViewById(R.id.manipuladores_p45_in);

                ImageButton foto_p45 = (ImageButton) findViewById(R.id.manipuladores_foto_p45);
                ImageButton descricao_p45 = (ImageButton) findViewById(R.id.manipuladores_descricao_p45);


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

        RadioGroup r_p46 = (RadioGroup) findViewById(R.id.manipuladores_p46);


        r_p46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p46 = (RadioButton) findViewById(R.id.manipuladores_p46_na);
                RadioButton ad_p46 = (RadioButton) findViewById(R.id.manipuladores_p46_ad);
                RadioButton in_p46 = (RadioButton) findViewById(R.id.manipuladores_p46_in);

                ImageButton foto_p46 = (ImageButton) findViewById(R.id.manipuladores_foto_p46);
                ImageButton descricao_p46 = (ImageButton) findViewById(R.id.manipuladores_descricao_p46);


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

        RadioGroup r_p47 = (RadioGroup) findViewById(R.id.manipuladores_p47);


        r_p47.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p47 = (RadioButton) findViewById(R.id.manipuladores_p47_na);
                RadioButton ad_p47 = (RadioButton) findViewById(R.id.manipuladores_p47_ad);
                RadioButton in_p47 = (RadioButton) findViewById(R.id.manipuladores_p47_in);

                ImageButton foto_p47 = (ImageButton) findViewById(R.id.manipuladores_foto_p47);
                ImageButton descricao_p47 = (ImageButton) findViewById(R.id.manipuladores_descricao_p47);


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

        RadioGroup r_p48 = (RadioGroup) findViewById(R.id.manipuladores_p48);


        r_p48.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p48 = (RadioButton) findViewById(R.id.manipuladores_p48_na);
                RadioButton ad_p48 = (RadioButton) findViewById(R.id.manipuladores_p48_ad);
                RadioButton in_p48 = (RadioButton) findViewById(R.id.manipuladores_p48_in);

                ImageButton foto_p48 = (ImageButton) findViewById(R.id.manipuladores_foto_p48);
                ImageButton descricao_p48 = (ImageButton) findViewById(R.id.manipuladores_descricao_p48);


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

        RadioGroup r_p49 = (RadioGroup) findViewById(R.id.manipuladores_p49);


        r_p49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p49 = (RadioButton) findViewById(R.id.manipuladores_p49_na);
                RadioButton ad_p49 = (RadioButton) findViewById(R.id.manipuladores_p49_ad);
                RadioButton in_p49 = (RadioButton) findViewById(R.id.manipuladores_p49_in);

                ImageButton foto_p49 = (ImageButton) findViewById(R.id.manipuladores_foto_p49);
                ImageButton descricao_p49 = (ImageButton) findViewById(R.id.manipuladores_descricao_p49);


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

        RadioGroup r_p50 = (RadioGroup) findViewById(R.id.manipuladores_p50);


        r_p50.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p50 = (RadioButton) findViewById(R.id.manipuladores_p50_na);
                RadioButton ad_p50 = (RadioButton) findViewById(R.id.manipuladores_p50_ad);
                RadioButton in_p50 = (RadioButton) findViewById(R.id.manipuladores_p50_in);

                ImageButton foto_p50 = (ImageButton) findViewById(R.id.manipuladores_foto_p50);
                ImageButton descricao_p50 = (ImageButton) findViewById(R.id.manipuladores_descricao_p50);


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

        RadioGroup r_p51 = (RadioGroup) findViewById(R.id.manipuladores_p51);


        r_p51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p51 = (RadioButton) findViewById(R.id.manipuladores_p51_na);
                RadioButton ad_p51 = (RadioButton) findViewById(R.id.manipuladores_p51_ad);
                RadioButton in_p51 = (RadioButton) findViewById(R.id.manipuladores_p51_in);

                ImageButton foto_p51 = (ImageButton) findViewById(R.id.manipuladores_foto_p51);
                ImageButton descricao_p51 = (ImageButton) findViewById(R.id.manipuladores_descricao_p51);


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

        RadioGroup r_p52 = (RadioGroup) findViewById(R.id.manipuladores_p52);


        r_p52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p52 = (RadioButton) findViewById(R.id.manipuladores_p52_na);
                RadioButton ad_p52 = (RadioButton) findViewById(R.id.manipuladores_p52_ad);
                RadioButton in_p52 = (RadioButton) findViewById(R.id.manipuladores_p52_in);

                ImageButton foto_p52 = (ImageButton) findViewById(R.id.manipuladores_foto_p52);
                ImageButton descricao_p52 = (ImageButton) findViewById(R.id.manipuladores_descricao_p52);


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

        RadioGroup r_p53 = (RadioGroup) findViewById(R.id.manipuladores_p53);


        r_p53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton na_p53 = (RadioButton) findViewById(R.id.manipuladores_p53_na);
                RadioButton ad_p53 = (RadioButton) findViewById(R.id.manipuladores_p53_ad);
                RadioButton in_p53 = (RadioButton) findViewById(R.id.manipuladores_p53_in);

                ImageButton foto_p53 = (ImageButton) findViewById(R.id.manipuladores_foto_p53);
                ImageButton descricao_p53 = (ImageButton) findViewById(R.id.manipuladores_descricao_p53);


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



        ImageButton manipuladoresSalvar = (ImageButton) findViewById(R.id.manipuladores_btnSalvar);
        manipuladoresSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVaiProManipuladores = new Intent(Prt2619_ManipuladoresActivity.this, Prt2619Activity.class);
                startActivity(intentVaiProManipuladores);
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


        LayoutInflater layoutInflater = LayoutInflater.from(Prt2619_ManipuladoresActivity.this);
        View promptView = layoutInflater.inflate(R.layout.activity_pop_up, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Prt2619_ManipuladoresActivity.this);
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



