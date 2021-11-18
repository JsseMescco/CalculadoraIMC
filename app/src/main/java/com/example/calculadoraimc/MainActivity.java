package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnOperaciones, btninterfazSalud;
    Button btnsalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOperaciones = (Button) findViewById(R.id.btnCalculadora);
        btninterfazSalud = (Button) findViewById(R.id.btnSalud);
        btnsalir = (Button) findViewById(R.id.btnSalir);

        btnOperaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Operaciones();
            }
        });
        btninterfazSalud.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salud();
            }
        }));
        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salir();
            }
        });

    }
    public void Operaciones(){
        Intent vOperaciones = new Intent(MainActivity.this, Calculadora1.class);
        startActivity(vOperaciones);
    }
    public void salud(){
        Intent isalud = new Intent(MainActivity.this, Salud1.class);
        startActivity(isalud);
    }
    public void salir(){
        finish();
    }

}