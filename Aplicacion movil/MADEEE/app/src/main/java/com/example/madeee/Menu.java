package com.example.madeee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    ImageButton ibtPromocion, ibtMapa, ibtOpciones;
    Button btJoyeria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ibtPromocion = (ImageButton) findViewById(R.id.btPromociones);
        ibtMapa = (ImageButton) findViewById(R.id.btMapa);
        ibtOpciones = (ImageButton) findViewById(R.id.btOpciones);
        btJoyeria = (Button) findViewById(R.id.btJoyeria);

        ibtPromocion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, Promociones.class);
                startActivity(i);
                finish();
            }
        });
        ibtMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent i = new Intent(Menu.this, Promociones.class);
                startActivity(i);
                finish();*/
            }
        });
        ibtOpciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, Login.class);
                startActivity(i);
                finish();
            }
        });
        btJoyeria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Menu.this, Joyeria.class);
                startActivity(i);
                finish();
            }
        });
    }
}