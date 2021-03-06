package com.admms.tcc.oasis.controller.principal;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.admms.tcc.oasis.R;

public class AjudaActivity extends PagerAdapter {
    private int[] imageResources = {R.drawable.ajuda_1,  R.drawable.ajuda_2, R.drawable.ajuda_3, R.drawable.ajuda_4, R.drawable.ajuda_5, R.drawable.ajuda_6, R.drawable.ajuda_7, R.drawable.ajuda_8, R.drawable.ajuda_9, R.drawable.ajuda_10, R.drawable.ajuda_11, R.drawable.ajuda_12};
    private Context ctx;
    private LayoutInflater layoutInflater;


    public AjudaActivity(Context c) {

        ctx=c;
    }

    @Override
    public int getCount() {

        return imageResources.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater= (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = layoutInflater.inflate(R.layout.activity_ajuda, container,false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.img_ajuda);
        imageView.setImageResource(imageResources[position]);
        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return (view == object);
    }
}
