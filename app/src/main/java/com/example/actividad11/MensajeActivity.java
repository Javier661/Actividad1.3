package com.example.actividad11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MensajeActivity extends AppCompatActivity {

    TextView tvDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensaje);

        tvDatos = findViewById(R.id.textView3);

        Bundle recibeDatos = getIntent().getExtras();
        String info = recibeDatos.getString("keydatos");

        tvDatos.setText(info);


    }
    public void onclick(View view){
        finish();
    }
}