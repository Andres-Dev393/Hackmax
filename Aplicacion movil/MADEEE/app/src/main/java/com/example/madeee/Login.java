package com.example.madeee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Login extends AppCompatActivity {

    Button btEntrar, btRegistro, btSalir;
    ImageButton ibtRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btEntrar = (Button) findViewById(R.id.btEntrar);
        btRegistro = (Button) findViewById(R.id.btRegistro);
        btSalir = (Button) findViewById(R.id.btSalir);
        ibtRegresar = (ImageButton) findViewById(R.id.ibtRegresar);

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, InicioSesion.class);
                startActivity(i);
                finish();
            }
        });
        btRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Registro.class);
                startActivity(i);
                finish();
            }
        });
        btSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        ibtRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Menu.class);
                startActivity(i);
                finish();
            }
        });
    }
}