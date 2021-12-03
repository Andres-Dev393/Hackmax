package com.example.madeee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Registro extends AppCompatActivity {

    Button btGuardar, btnRegresar;
    Spinner dropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btGuardar = (Button) findViewById(R.id.btIngresar);
        btnRegresar = (Button) findViewById(R.id.btRegresar);
        dropdown = (Spinner)findViewById(R.id.cmbSexo);

        String[] items = new String[]{"Masculino", "femenino", "Otro", "Prefiero no decirlo"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);

        dropdown.setAdapter(adapter);

        btGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registro.this, Menu.class);
                startActivity(i);
                finish();

            }
        });

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registro.this, Login.class);
                startActivity(i);
                finish();

            }
        });
    }
}