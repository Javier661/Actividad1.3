package com.example.actividad11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etEnviar;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEnviar = findViewById(R.id.editText1);
        btnEnviar = findViewById(R.id.button1);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle enviarDatos = new Bundle();
                enviarDatos.putString("keydatos",etEnviar.getText().toString());

                Intent intent = new Intent(MainActivity.this,MensajeActivity.class);
                intent.putExtras(enviarDatos);
                startActivity(intent);
            }
        });
    }

}