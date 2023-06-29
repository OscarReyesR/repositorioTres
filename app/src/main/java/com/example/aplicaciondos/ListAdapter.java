package com.example.aplicaciondos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Modelo> {
    private List<Modelo> myList;
    private Context myContext;
    private int myResource;
    public ListAdapter(@NonNull Context context, int resource, List<Modelo> objects) {
        super(context, resource, objects);
        this.myList=objects;
        this.myContext=context;
        this.myResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        if(view==null)
            view= LayoutInflater.from(myContext).inflate(myResource,null);

        Modelo modelo=myList.get(position);
        TextView textView=view.findViewById(R.id.textRowList);
        textView.setText(modelo.getCampo());
        return view;
    }

    @Override
    public Modelo getItem(int position){
        return myList.get(position);
    }
}
