package com.example.formulario.formulario2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.formulario.R;
import com.example.formulario3.MainActivity3;

public class MainActivity2 extends AppCompatActivity {


    private Button enviar;
    private EditText nombre;
    private EditText apellido;
    private EditText fecha;
    private CheckBox hombre;
    private CheckBox mujer;

    public final static String MSG_BOTON_PULSADO = "com.example.formulario3.MainActivity3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        enviar = findViewById(R.id.enviar);
        nombre = findViewById(R.id.nombre);
        apellido = findViewById(R.id.apellido);
        fecha = findViewById(R.id.fecha);
        hombre = findViewById(R.id.hombre);
        mujer = findViewById(R.id.mujer);



        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("nombre",nombre.getText()+"");
                intent.putExtra("apellido",apellido.getText()+"");
                intent.putExtra("fecha",fecha.getText()+"");
                if(hombre.isChecked()){
                    intent.putExtra("sexo","hombre");
                }
                if(mujer.isChecked()) {
                    intent.putExtra("sexo", "mujer");
                }
                startActivity(intent);
            }
        });
    }
}