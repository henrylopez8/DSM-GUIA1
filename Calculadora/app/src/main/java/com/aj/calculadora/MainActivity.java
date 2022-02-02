package com.aj.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtresultado;
    double num1, num2, resultado;
    String operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtresultado = findViewById(R.id.txtresultado);
    }

    public void uno(View view) {
        txtresultado.setText(txtresultado.getText().toString() + "1");
    }

    public void dos(View view) {
        txtresultado.setText(txtresultado.getText().toString() + "2");
    }

    public void tres(View view) {
        txtresultado.setText(txtresultado.getText().toString() + "3");
    }

    public void cuatro(View view) {
        txtresultado.setText(txtresultado.getText().toString() + "4");
    }

    public void cinco(View view) {
        txtresultado.setText(txtresultado.getText().toString() + "5");
    }

    public void seis(View view) {
        txtresultado.setText(txtresultado.getText().toString() + "6");
    }

    public void siete(View view) {
        txtresultado.setText(txtresultado.getText().toString() + "7");
    }

    public void ocho(View view) {
        txtresultado.setText(txtresultado.getText().toString() + "8");
    }

    public void nueve(View view) {
        txtresultado.setText(txtresultado.getText().toString() + "9");
    }

    public void sumar(View view) {
        num1 = Double.parseDouble(txtresultado.getText().toString());
        txtresultado.setText("");
        operacion = "+";
    }

    public void restar(View view) {
        num1 = Double.parseDouble(txtresultado.getText().toString());
        txtresultado.setText("");
        operacion = "-";
    }

    public void multiplicar(View view) {
        num1 = Double.parseDouble(txtresultado.getText().toString());
        txtresultado.setText("");
        operacion = "*";
    }

    public void dividir(View view) {
        num1 = Double.parseDouble(txtresultado.getText().toString());
        txtresultado.setText("");
        operacion = "/";
    }

    public void igual(View view) {

        num2 = Double.parseDouble(txtresultado.getText().toString());
        txtresultado.setText("");
        if (operacion == "+") {
            resultado = num1 + num2;

        } else if (operacion == "-") {
            resultado = num1 - num2;
        } else if (operacion == "/") {
            resultado = num1 / num2;
        } else if (operacion == "*") {
            resultado = num1 * num2;
        }
        txtresultado.setText("" + resultado);


    }
    public void limpiar(View view) {
        txtresultado.setText("");
        num1=0;
        num2=0;
        operacion="";
    }
}