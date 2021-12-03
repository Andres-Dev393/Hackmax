package com.example.madeee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class InicioSesion extends AppCompatActivity {

    Button btIngresar;
    ImageButton ibtRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        btIngresar = (Button) findViewById(R.id.btIngresar);
        ibtRegresar = (ImageButton) findViewById(R.id.ibtRegresar);

        btIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InicioSesion.this, Menu.class);
                startActivity(i);
                finish();

            }
        });

        ibtRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InicioSesion.this, Login.class);
                startActivity(i);
                finish();
            }
        });
    }
}