package com.example.madeee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Promociones extends AppCompatActivity {

    ImageButton ibtMenu, ibtMapa, ibtOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promociones);

        ibtMenu = (ImageButton) findViewById(R.id.btHome);
        ibtMapa = (ImageButton) findViewById(R.id.btMapa);
        ibtOpciones = (ImageButton) findViewById(R.id.btOpciones);

        ibtMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Promociones.this, Menu.class);
                startActivity(i);
                finish();
            }
        });
        ibtMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent i = new Intent(Promociones.this, Menu.class);
                startActivity(i);
                finish();*/
            }
        });
        ibtOpciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Promociones.this, Login.class);
                startActivity(i);
                finish();
            }
        });
    }
}