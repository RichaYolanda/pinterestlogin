package com.example.tugaskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //List
    EditText txtangka1;
    EditText txtangka2;
    Button btntambah;
    Button btnkurang;
    Button btnkali;
    Button btnbagi;
    TextView tvhasil;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        txtangka1=findViewById(R.id.txtagka1);
        txtangka2=findViewById(R.id.txtangka2);
        btntambah=findViewById(R.id.btntambah);
        btnkurang=findViewById(R.id.btnkurang);
        btnkali=findViewById(R.id.btnkali);
        btnbagi=findViewById(R.id.btnbagi);
        tvhasil=findViewById(R.id.tvhasil);
        btntambah.setOnClickListener(this);
        btnkurang.setOnClickListener(this);
        btnkali.setOnClickListener(this);
        btnbagi.setOnClickListener(this);

    }

    @Override
    public void onClick (View view) {
        Toast.makeText(this, "hasil", Toast.LENGTH_SHORT).show();
        double a=Double.parseDouble(txtangka1.getText().toString());
        double b=Double.parseDouble(txtangka2.getText().toString());
        double c=0;
        switch (view.getId()){
            case R.id.btntambah:
            c=a+b;
            break;
            case R.id.btnkurang:
            c=a-b;
            break;
            case R.id.btnkali:
            c=a*b;
            break;
            case R.id.btnbagi:
            c=a/b;
            break;
            default:
                break;
        }
        tvhasil.setText("hasil : "+Double.toString(c));

    }
}


