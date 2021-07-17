package com.example.formulario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.formulario.formulario2.MainActivity2;

public class MainActivity extends AppCompatActivity {


    private Button cargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cargar = findViewById(R.id.cargar);

        cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(siguiente);
            }
        });


    }
}