package com.example.formulario3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.formulario.R;


public class MainActivity3 extends AppCompatActivity {


    private TextView nombre;
    private TextView apellido;
    private TextView fecha;
    private TextView sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = this.getIntent();
        Bundle extra = intent.getExtras();

        nombre = findViewById(R.id.nombreV);
        apellido = findViewById(R.id.apellidoV);
        fecha = findViewById(R.id.fechaV);
        sexo = findViewById(R.id.sexoV);

        String nombre2 = getIntent().getStringExtra("nombre");
        String apellido2 = getIntent().getStringExtra("apellido");
        String fecha2 = getIntent().getStringExtra("fecha");
        String sexo2 = getIntent().getStringExtra("sexo");

        nombre.setText(nombre2);
        apellido.setText(apellido2);
        fecha.setText(fecha2);
        sexo.setText(sexo2);


    }
}