package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora1 extends AppCompatActivity {
    private Button btn0;
    private Button btval1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnIgual;
    private Button btnDecimal;
    private Button btnMasmenos;
    private Button btnLimpiar;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;
    private TextView tvSalida;
    public String operador= "";
    public Double val1;
    public Double val2;
    public Double Resultado;
    public int Resultado1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2);
        tvSalida = (TextView) findViewById(R.id.tvResultado);
        btval1 = (Button) findViewById(R.id.btnUno);
        btn2 = (Button) findViewById(R.id.btnDos);
        btn3 = (Button) findViewById(R.id.btnTres);
        btn4 = (Button) findViewById(R.id.btnCuatro);
        btn5 = (Button) findViewById(R.id.btnCinco);
        btn6 = (Button) findViewById(R.id.btnSeis);
        btn7 = (Button) findViewById(R.id.btnSiete);
        btn8 = (Button) findViewById(R.id.btnOcho);
        btn9 = (Button) findViewById(R.id.btnNueve);
        btn0 = (Button) findViewById(R.id.btnCero);
        btnIgual = (Button) findViewById(R.id.btnSignoIgual);
        btnDecimal = (Button) findViewById(R.id.btnSignoPunto);
        btnLimpiar = (Button) findViewById(R.id.btnAC);
        btnSumar = (Button) findViewById(R.id.btnSignoSuma);
        btnRestar = (Button) findViewById(R.id.btnSignoResta);
        btnMultiplicar = (Button) findViewById(R.id.btnSignoMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnSignoDividir);
    }
    public void clickRaiz(View view) {
        val1 = Double.parseDouble(tvSalida.getText().toString());
        Resultado= Math.sqrt(val1);
        Validar(Resultado);
    }

    public void clickSumar(View view) {
        operador="+";
        CapturaNum1(view);
    }
    public void Validar(Double nro){
        if(nro % 1 ==0){
            Resultado1 = (int) Math.round(nro);
            tvSalida.setText(String.valueOf(Resultado1));
        }
        else{
            tvSalida.setText(String.valueOf(Resultado));
        }
    }
    public void clickIgual(View view) {
        val2 = Double.parseDouble(tvSalida.getText().toString());
        if (operador.equals("+")) {
            Resultado = val1+val2;
        } else if (operador.equals("-")) {
            Resultado = val1-val2;
        } else if (operador.equals("*")) {
            Resultado = val1*val2;
        } else if (operador.equals("/")) {
            Resultado = val1/val2;
        } else if (operador.equals("PotN")) {
            val2 = Double.parseDouble(tvSalida.getText().toString());
            tvSalida.setText("");
            Resultado = Math.pow(val1,val2);
        }
        Validar(Resultado);
    }
    public void clickPunto(View view) {
        tvSalida.setText(tvSalida.getText()+".");
    }

    public void clickRestar(View view) {
        operador="-";
        CapturaNum1(view);
    }
    public void clickCero(View view) {
        tvSalida.setText(tvSalida.getText()+"0");
    }

    public void clickUno(View view) {
        tvSalida.setText(tvSalida.getText()+"1");
    }
    public void clickDos(View view) {
        tvSalida.setText(tvSalida.getText()+"2");
    }
    public void clickTres(View view) {
        tvSalida.setText(tvSalida.getText()+"3");
    }
    public void clickCuatro(View view) {
        tvSalida.setText(tvSalida.getText()+"4");
    }
    public void clickCinco(View view) {
        tvSalida.setText(tvSalida.getText()+"5");
    }
    public void clickSeis(View view) {
        tvSalida.setText(tvSalida.getText()+"6");
    }
    public void clickSiete(View view) {
        tvSalida.setText(tvSalida.getText()+"7");
    }

    public void clickOcho(View view) {
        tvSalida.setText(tvSalida.getText()+"8");
    }
    public void clickNueve(View view) {
        tvSalida.setText(tvSalida.getText()+"9");
    }
    public void clickMultiplicar(View view) {
        operador = "*";
        CapturaNum1(view);
    }

    public void clickDividir(View view) {
        operador = "/";
        CapturaNum1(view);
    }
    public void clickTangente(View view) {
        val1 = Double.parseDouble(tvSalida.getText().toString());
        Resultado = Math.tan(Math.toRadians(val1));
        Validar(Resultado);
    }
    public void clickCoseno(View view) {
        val1 = Double.parseDouble(tvSalida.getText().toString());
        Resultado = Math.cos(Math.toRadians(val1));
        Validar(Resultado);
    }

    public void clickSin(View view) {
        val1 = Double.parseDouble(tvSalida.getText().toString());
        Resultado = Math.sin(Math.toRadians(val1));
        Validar(Resultado);
    }
    public void clickPotencia3(View view) {
        val1 = Double.parseDouble(tvSalida.getText().toString());
        Resultado = Math.pow(val1,3);
        Validar(Resultado);
    }
    public void clickPotencia2(View view) {
        val1 = Double.parseDouble(tvSalida.getText().toString());
        Resultado = Math.pow(val1,2);
        Validar(Resultado);
    }
    public void CapturaNum1(View view){
        val1 = Double.parseDouble(tvSalida.getText().toString());
        tvSalida.setText(" ");
    }
    public void clickPotenciaN(View view) {
        operador="PotN";
        CapturaNum1(view);
    }

    public void clickFactorial(View view) {
        val1 = Double.parseDouble(tvSalida.getText().toString());
        Resultado= Factorial(val1);
        Validar(Resultado);
    }
    public Double Factorial(Double nro){
        if (nro==0)
            return 1.0;
        else
            return (nro * Factorial(nro-1));
    }
    public void Limpiar(){
        tvSalida.setText("");
    }
    public void clickLimpiar(View view) {
        Limpiar();
    }

    public void clickBorrarUno(View view) {
        if (tvSalida.getText().length() > 0) {
            CharSequence name = tvSalida.getText().toString();
            tvSalida.setText(name.subSequence(0, name.length() - 1));
        } else {
            val1 = Double.NaN;
            val2 = Double.NaN;
            tvSalida.setText("");
        }
    }
    public void clickSalir(View view) {
        finish();
    }

    public void clickMasMenos(View view) {
        val1 = Double.parseDouble(tvSalida.getText().toString())*-1;
        tvSalida.setText(String.valueOf(val1));
    }
}