package com.example.appcourier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ingresar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);
    }
    public void irARegistroProducto(View view){
        Intent i = new Intent(this, RegistroProducto.class);
        startActivity(i);
    }
}