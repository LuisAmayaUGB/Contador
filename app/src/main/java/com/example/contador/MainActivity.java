package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Contador contador;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        texto = (TextView) findViewById(R.id.txt);
        contador = new Contador(10000,1000);
// se ejecuta cada segundo durante 20 segundos

        
        contador.start ();


    }
    public void fin(){
        texto.setText(texto.getText() + "FIN");
    }


    public void hola(){
        texto.setText(texto.getText() + "Hola\n");
    }



public class Contador extends CountDownTimer {

    public Contador(long millisInFuture, long countDownInterval) {
        super(millisInFuture, countDownInterval);
    }

    @Override
    public void onFinish() {
        fin();
    }

    @Override
    public void onTick(long millisUntilFinished) {
        hola();
    }

}}