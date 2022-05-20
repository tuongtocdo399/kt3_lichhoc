package com.example.bt3_lich_hoc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class adapter extends ArrayAdapter<Lich> {
    Context context;
    int res;
    ArrayList<Lich> listlich;
    public adapter(@NonNull Context context, int resource, @NonNull ArrayList<Lich> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.listlich = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null)
            convertView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        TextView lop = convertView.findViewById(R.id.lop);
        TextView ca = convertView.findViewById(R.id.ca);
        Lich lich = listlich.get(position);

        lop.setText(lich.getLop());
        ca.setText(lich.getCa());




        return  convertView;

    }
}
