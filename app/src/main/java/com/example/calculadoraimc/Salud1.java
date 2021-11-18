package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Salud1 extends AppCompatActivity {
    EditText etPeso, etAltura;
    Button btnaceptar, btndiagnostico;
    TextView txtResultado;
     private static Salud1 instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud2);
        instance = this;

        etPeso = (EditText) findViewById(R.id.etPeso);
        etAltura = (EditText) findViewById(R.id.etAltura);
        btnaceptar = (Button) findViewById(R.id.btnAceptar);
        btndiagnostico = (Button) findViewById(R.id.btnDiagnostico);
        txtResultado = (TextView) findViewById(R.id.tvResultadosalud);

        btnaceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResultado.setText("Resultado : Su IMC es de : "+CalcularIMC());
            }
        });
        btndiagnostico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Diagnostico();
            }
        });
    }
    public void Diagnostico(){
        Intent vdiagnostico = new Intent(Salud1.this, Diagnostico.class);
        startActivity(vdiagnostico);
    }
    public static Salud1 getInstance() {
        return instance;
    }

    public Double CalcularIMC() {
        Double altura = Double.valueOf(etAltura.getText().toString());
        Double peso = Double.valueOf(etPeso.getText().toString());
        double IMC = peso / Math.pow(altura, 2);
        return IMC;
    }
}