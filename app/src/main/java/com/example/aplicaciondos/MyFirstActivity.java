package com.example.aplicaciondos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MyFirstActivity extends Activity implements AdapterView.OnItemClickListener{
    private ListView myListView;
    List<Modelo> myLista=new ArrayList<Modelo>();
    ListAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first);
        myListView=findViewById(R.id.ListV);
        myListView.setOnItemClickListener(this);
        myLista.add(new Modelo("Esto"));
        myLista.add(new Modelo("Es"));
        myLista.add(new Modelo("Una"));
        myLista.add(new Modelo("Prueba"));
        myLista.add(new Modelo("uwu"));
        myAdapter=new ListAdapter(this,R.layout.elemento_lista,myLista);
        myListView.setAdapter(myAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();/*
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://tenor.com/es/view/el-baile-del-troleo-shitposting-esqueleto-gif-18990991"));
        startActivity(intent);
        */

        /*TODO
        SEGUNDA ACTIVIDAD QUE TIENE LOS ELEMENTOS VISTOS DE imageView, checkbox y los inputs.
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
         */
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.i("debuger2",myLista.get(i).toString());
        Toast.makeText(this,"posición "+i+" valor: "+myAdapter.getItem(i).getCampo(),Toast.LENGTH_LONG).show();
    }
}
