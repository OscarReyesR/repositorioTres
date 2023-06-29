package com.example.aplicaciondos;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private Button btnPrueba;
    private TextView txt1;
    private CheckBox check;
    private int contador = 0;
    /* private ListView list;
     ListAdapter mAdapter;
     private List<Modelo> datos = new ArrayList<>();*/
    private Button btn2;
    private TextView textVBtn;
    private RadioGroup radioGroup;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //datos.add(new Modelo("hola"));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activuty);
/*
        list.findViewById(R.id.list);
        mAdapter=new AdapterList(this,R.layout.item_lista,datos);
        list.setAdapter(mAdapter);

 */
        btnPrueba = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btnP);
        txt1 = findViewById(R.id.txt2);
        textVBtn = findViewById(R.id.tvButton);
        txt1.setText(String.valueOf(contador));
        check = findViewById(R.id.chcBtn);
        img=findViewById(R.id.imageV);
        radioGroup=findViewById(R.id.radioGroup);
        btnPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = contador + 1;
                txt1.setText(String.valueOf(contador));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textVBtn.setText("uwu");
                Log.i("debuger", "uwu");
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            private Integer status = 0;

            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                if (check.isChecked() && radioGroup.getCheckedRadioButtonId()==2131231237)
                    img.setVisibility(view.VISIBLE);
                else
                    img.setVisibility(view.INVISIBLE);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

              if(radioGroup.getCheckedRadioButtonId()==2131231237)
                  btn2.setEnabled(true);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "segundo activity! :D", Toast.LENGTH_LONG).show();
    }


}