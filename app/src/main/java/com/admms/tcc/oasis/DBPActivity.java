package com.admms.tcc.oasis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class DBPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbp);

        final ImageView abertura = (ImageView) findViewById(R.id.dbp_abertura);
        final Animation dbp_animacao = AnimationUtils.loadAnimation(getBaseContext(),R.anim.dbp_apresentacao);
        final Animation dbp_animacao2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);


        abertura.startAnimation(dbp_animacao);
        dbp_animacao.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                abertura.startAnimation(dbp_animacao2);
                finish();
                Intent vaiPraMain = new Intent(DBPActivity.this,MainActivity.class);
                startActivity(vaiPraMain);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
