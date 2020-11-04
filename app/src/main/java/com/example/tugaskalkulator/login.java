package com.example.tugaskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class login extends AppCompatActivity {

    Button btn1;
    EditText edttxt1, edttxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn1 = findViewById(R.id.btn1);
        edttxt1 = findViewById(R.id.edttxt1);
        edttxt2 = findViewById(R.id.edttxt2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edttxt1.getText().toString().equals("richa") && edttxt2.getText().toString().equals("1234")){
                    Intent intent = new Intent(login.this, MainActivity.class);
                    String username = edttxt1.getText().toString();
                    String password = edttxt2.getText().toString();
                    intent.putExtra("username",edttxt1.getText().toString());
                    intent.putExtra("password",edttxt2.getText().toString());
                    startActivity(intent);
                }else{
                    edttxt1.setError("Username salah");
                    edttxt2.setError("Password tidak sesuai");
                }
            }
        });
    }
}
