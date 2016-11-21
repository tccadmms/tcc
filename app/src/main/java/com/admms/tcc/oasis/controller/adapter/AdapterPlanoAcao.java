package com.admms.tcc.oasis.controller.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.admms.tcc.oasis.R;
import com.admms.tcc.oasis.entity.Estabelecimento;
import com.admms.tcc.oasis.entity.PlanoAcao;

import java.util.List;

/**
 * Created by DemonHide-RB on 10/28/2016.
 */
public class AdapterPlanoAcao extends ArrayAdapter<PlanoAcao> {

    private Activity activity;
    private List<PlanoAcao> listaPlanoAcao;
    private static LayoutInflater inflater = null;

    public AdapterPlanoAcao(Activity activity, int resource, int textViewResourceId, List<PlanoAcao> _listaPlanoAcao) {
        super(activity, resource, textViewResourceId, _listaPlanoAcao);
        try {
            this.activity = activity;
            this.listaPlanoAcao = _listaPlanoAcao;

            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        } catch (Exception e) {

        }
    }

    public int getCount() {
        return listaPlanoAcao.size();
    }

    public PlanoAcao getItem(PlanoAcao position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        public TextView display_name;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        final ViewHolder holder;

        try {
            if (convertView == null) {
                vi = inflater.inflate(R.layout.simple_row, null);
                holder = new ViewHolder();

                holder.display_name = (TextView) vi.findViewById(R.id.rowTextView);

                vi.setTag(holder);
            } else {
                holder = (ViewHolder) vi.getTag();
            }

            holder.display_name.setText(listaPlanoAcao.get(position).getNomeArquivo());
        } catch (Exception e) {
        }

        return vi;
    }
}
