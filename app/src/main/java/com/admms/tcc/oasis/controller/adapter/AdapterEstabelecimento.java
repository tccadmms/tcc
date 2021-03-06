package com.admms.tcc.oasis.controller.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.entity.Estabelecimento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DemonHide-RB on 10/28/2016.
 */
public class AdapterEstabelecimento extends ArrayAdapter<Estabelecimento> {
    private Activity activity;
    private List<Estabelecimento> listaEstabelecimentos;
    private static LayoutInflater inflater = null;

    public AdapterEstabelecimento (Activity activity, int resource, int textViewResourceId, List<Estabelecimento> _listaEstabelecimento) {
        super(activity, resource, textViewResourceId, _listaEstabelecimento);
        try {
            this.activity = activity;
            this.listaEstabelecimentos = _listaEstabelecimento;

            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        } catch (Exception e) {

        }
    }

    public int getCount() {
        return listaEstabelecimentos.size();
    }

    public Estabelecimento getItem(Estabelecimento position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        public TextView display_name;
        public ImageView editar_estabelecimento;
    }

    public View getView(final int position, View convertView, final ViewGroup parent) {
        View vi = convertView;
        final ViewHolder holder;

        try {
            if (convertView == null) {
                vi = inflater.inflate(R.layout.edit_row, null);
                holder = new ViewHolder();

                holder.display_name = (TextView) vi.findViewById(R.id.editRowTextView);
                holder.editar_estabelecimento = (ImageView) vi.findViewById(R.id.ivImage);

                vi.setTag(holder);
            } else {
                holder = (ViewHolder) vi.getTag();
            }

            holder.editar_estabelecimento.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((ListView) parent).performItemClick(v, position, 0);
                }
            });
            holder.display_name.setText(listaEstabelecimentos.get(position).getRazaoSocial());
        } catch (Exception e) {
        }

        return vi;
    }
}
