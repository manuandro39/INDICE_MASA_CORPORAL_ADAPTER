package com.example.mespada.idmc_calculo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Preparación de componentes de la MainActivity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignación de variables que representan los objetos componentes de la MainActivity
        final EditText editText = (EditText) findViewById(R.id.txtPeso);
        final EditText editText2 = (EditText) findViewById(R.id.txtAltura);
        Button btnCalculo = (Button) findViewById(R.id.btn_calculo);
        Button btnTablaValores = (Button) findViewById(R.id.btn_tablavalores);

        //Llamada al Listener al pulsar el botón para calcular el IMC
        btnCalculo.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                //Código que se encarga de enviar los datos introducidos a la ResultActivity.
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("peso", editText.getText().toString() + "");
                intent.putExtra("altura", editText2.getText().toString() + "");
                startActivity(intent);
            }
        });

        //Llamada al Listener al pulsar el botón para mostrar los rangos del IMC con su estado nutricional correspondiente
        btnTablaValores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Código que se encarga de enviar los datos introducidos a la Activity que muestra una tabla con los valores de IMC
                //y el estado nutricional
                Intent intent = new Intent(MainActivity.this, TableActivity.class);
                startActivity(intent);

            }
        });
    }
}
