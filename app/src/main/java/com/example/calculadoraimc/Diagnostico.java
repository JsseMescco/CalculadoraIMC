package com.example.calculadoraimc;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.calculadoraimc.Salud1;
import androidx.appcompat.app.AppCompatActivity;

public class Diagnostico extends AppCompatActivity {

    TextView txtDiagnostico, txtRecomendaciones;
    Button btnRecomend;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostico);

        btnRecomend = (Button) findViewById(R.id.btnRecocmendaciones);
        txtDiagnostico = (TextView) findViewById(R.id.tvdiagnostico);
        txtRecomendaciones = (TextView) findViewById(R.id.tvRecomendaciones);
        imagen = (ImageView) findViewById(R.id.imgDiagnostico);
        Diagnostico();
        btnRecomend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Recomendaciones();
            }
        });
    }
    Double IMC=Salud1.getInstance().CalcularIMC();
    private void Diagnostico(){
        if(IMC < 16){
            txtDiagnostico.setText("Usted tiene un Bajo peso muy grave con un IMC de :"+IMC);
            imagen.setImageResource(R.drawable.imc1);
        }else if(IMC>=16 & IMC<17){
            txtDiagnostico.setText("Usted tiene un Bajo peso grave con un IMC de :"+IMC);
            imagen.setImageResource(R.drawable.imc2);
        }else if(IMC>=17 & IMC<18.50){
            txtDiagnostico.setText("Usted tiene un Bajo peso con un IMC de :"+IMC);
            imagen.setImageResource(R.drawable.imc3);
        }else if(IMC>=18.50 & IMC<25){
            txtDiagnostico.setText("Usted tiene un Peso Normal con un IMC de :"+IMC);
            imagen.setImageResource(R.drawable.imc4);
        }else if(IMC>=25 & IMC<30){
            txtDiagnostico.setText("Usted tiene Sobrepeso con un IMC de :"+IMC);
            imagen.setImageResource(R.drawable.imc5);
        }else if(IMC>=30 & IMC<35){
            txtDiagnostico.setText("Usted tiene Obesidad grado 1 con un IMC de :"+IMC);
            imagen.setImageResource(R.drawable.imc6);
        }else if(IMC>=35 & IMC<40){
            txtDiagnostico.setText("Usted tiene Obesidad grado 2 con un IMC de :"+IMC);
            imagen.setImageResource(R.drawable.imc7);
        }else if(IMC>40){
            txtDiagnostico.setText("Usted tiene Obesidad grado 3 (Obesidad Morbida) con un IMC de :"+IMC);
            imagen.setImageResource(R.drawable.gordo2);
        }
    }
    private void Recomendaciones(){
        if(IMC < 16){
            txtRecomendaciones.setText("Realice 30 minutos de ejercicio aeróbico 5 veces por semana*\n" +
                    "Logre un equilibrio entre su consumo de calorías y su actividad física\n" +
                    "Limite las grasas saturadas a no más del 5 % de sus calorías totales\n" +
                    "Disfrute de una alimentación con bajo contenido de colesterol comiendo carnes magras, frutas, vegetales y cereales integrales\n" +
                    "Limite el consumo de tabaco y el consumo de alcohol\n" +
                    "Ingiera 1.5 litros de agua");
        }else if(IMC>=16 & IMC<17){
            txtRecomendaciones.setText("Realice 30 minutos de ejercicio aeróbico 5 veces por semana*\n" +
                    "Logre un equilibrio entre su consumo de calorías y su actividad física\n" +
                    "Limite las grasas saturadas a no más del 5 % de sus calorías totales\n" +
                    "Disfrute de una alimentación con bajo contenido de colesterol comiendo carnes magras, frutas, vegetales y cereales integrales\n" +
                    "Limite el consumo de tabaco y el consumo de alcohol\n" +
                    "Ingiera 1.5 litros de agua");
        }else if(IMC>=17 & IMC<18.50){
            txtRecomendaciones.setText("Realice 30 minutos de ejercicio aeróbico 5 veces por semana*\n" +
                    "Logre un equilibrio entre su consumo de calorías y su actividad física\n" +
                    "Limite las grasas saturadas a no más del 5 % de sus calorías totales\n" +
                    "Disfrute de una alimentación con bajo contenido de colesterol comiendo carnes magras, frutas, vegetales y cereales integrales\n" +
                    "Limite el consumo de tabaco y el consumo de alcohol\n" +
                    "Ingiera 1.5 litros de agua");
        }else if(IMC>=18.50 & IMC<25){
            txtRecomendaciones.setText("Realice 30 minutos de ejercicio aeróbico 5 veces por semana*\n" +
                    "Logre un equilibrio entre su consumo de calorías y su actividad física\n" +
                    "Limite las grasas saturadas a no más del 5 % de sus calorías totales\n" +
                    "Disfrute de una alimentación con bajo contenido de colesterol comiendo carnes magras, frutas, vegetales y cereales integrales\n" +
                    "Limite el consumo de tabaco y el consumo de alcohol\n" +
                    "Ingiera 1.5 litros de agua");
        }else if(IMC>=25 & IMC<30){
            txtRecomendaciones.setText("Realice 30 minutos de ejercicio aeróbico 5 veces por semana*\n" +
                    "Logre un equilibrio entre su consumo de calorías y su actividad física\n" +
                    "Limite las grasas saturadas a no más del 5 % de sus calorías totales\n" +
                    "Disfrute de una alimentación con bajo contenido de colesterol comiendo carnes magras, frutas, vegetales y cereales integrales\n" +
                    "Limite el consumo de carne roja y de alimentos y bebidas con azúcar\n" +
                    "Evite el tabaco y limite el consumo de alcohol\n" +
                    "Fíjese metas pequeñas y alcanzables para la pérdida de peso\n" +
                    "Controle atentamente el tamaño de las porciones\n" +
                    "Ingiera 1.8 litros de agua");
        }else if(IMC>=30 & IMC<35){
            txtRecomendaciones.setText("Realice 25 minutos de ejercicio aeróbico 5 veces por semana*\n" +
                    "Logre un equilibrio entre su consumo de calorías y su actividad física\n" +
                    "Limite las grasas saturadas a no más del 5 % de sus calorías totales\n" +
                    "Disfrute de una alimentación con bajo contenido de colesterol comiendo carnes magras, frutas, vegetales y cereales integrales\n" +
                    "Limite el consumo de carne roja y de alimentos y bebidas con azúcar\n" +
                    "Evite el tabaco y limite el consumo de alcohol\n" +
                    "Fíjese metas pequeñas y alcanzables para la pérdida de peso\n" +
                    "Controle atentamente el tamaño de las porciones\n" +
                    "Ingiera 1.8 litros de agua");
        }else if(IMC>=35 & IMC<40){
            txtRecomendaciones.setText("Realice 30 minutos de ejercicio aeróbico 5 veces por semana*\n" +
                    "Logre un equilibrio entre su consumo de calorías y su actividad física\n" +
                    "Limite las grasas saturadas a no más del 5 % de sus calorías totales\n" +
                    "Disfrute de una alimentación con bajo contenido de colesterol comiendo carnes magras, frutas, vegetales y cereales integrales\n" +
                    "Limite el consumo de carne roja y de alimentos y bebidas con azúcar\n" +
                    "Evite el tabaco y limite el consumo de alcohol\n" +
                    "Fíjese metas pequeñas y alcanzables para la pérdida de peso\n" +
                    "Controle atentamente el tamaño de las porciones\n" +
                    "Ingiera 1.8 litros de agua");
        }else if(IMC>40){
            txtRecomendaciones.setText("Realice 30 minutos de ejercicio aeróbico 5 veces por semana*\n" +
                    "Logre un equilibrio entre su consumo de calorías y su actividad física\n" +
                    "Limite las grasas saturadas a no más del 7 % de sus calorías totales\n" +
                    "Disfrute de una alimentación con bajo contenido de colesterol comiendo carnes magras, frutas, vegetales y cereales integrales\n" +
                    "Limite el consumo de carne roja y de alimentos y bebidas con azúcar\n" +
                    "Evite el tabaco y limite el consumo de alcohol\n" +
                    "Ingiera menos calorias de las que consume\n" +
                    "Fíjese metas pequeñas y alcanzables para la pérdida de peso\n" +
                    "Controle atentamente el tamaño de las porciones\n" +
                    "Ingiera 2 litros de agua");
        }
    }
}