package com.admms.tcc.oasis.controller.principal;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.admms.tcc.oasis.R;

public class SlideAjudaActivity extends Activity {

    ViewPager viewPager;
    AjudaActivity ajudaActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_ajuda);
        Toast.makeText(SlideAjudaActivity.this, "<--------- Deslize para mais informações!!!!", Toast.LENGTH_LONG).show();
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ajudaActivity = new AjudaActivity(this);
        viewPager.setAdapter(ajudaActivity);

    }
}
