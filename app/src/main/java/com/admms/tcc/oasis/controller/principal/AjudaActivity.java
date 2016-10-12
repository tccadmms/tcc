package com.admms.tcc.oasis.controller.principal;


import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.admms.tcc.oasis.R;

public class AjudaActivity extends PagerAdapter {
    private int[] imageResources = {R.drawable.armazenamento, R.drawable.documentacao};
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
