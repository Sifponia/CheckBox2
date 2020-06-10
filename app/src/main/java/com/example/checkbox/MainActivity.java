package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1)Creamos object de la parte logica.
    private EditText valor1, valor2;
    private CheckBox cheSuma, cheResta;
    private TextView textResultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2)-Id ceramos de la parte grafica.
       valor1 = (EditText)findViewById(R.id.etNumero1);
       valor2 = (EditText)findViewById(R.id.etNumero2);
       cheSuma = (CheckBox)findViewById(R.id.checkSuma);
       cheResta= (CheckBox)findViewById(R.id.checkResta);
       textResultado = (TextView)findViewById(R.id.tvResultado);
    }


    public void CheckBox(View view){
        String srtValor1 = valor1.getText().toString();
        String srtValor2 = valor2.getText().toString();


        float floNumero1 = Float.parseFloat(srtValor1);
        float floNumero2 = Float.parseFloat(srtValor2);

       String srtResultado = " ";

       if(cheSuma.isChecked()==true){
           float floResultado1 = floNumero1 + floNumero2;
          srtResultado = "Suma " + floResultado1;

       }
       if(cheResta.isChecked() == true){
           float floResultado = floNumero1 - floNumero2;
           srtResultado += "/Resta " + floResultado;
       }

         textResultado.setText(srtResultado);


    }

}