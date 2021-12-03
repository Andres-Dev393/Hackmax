package com.example.madeee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Joyeria extends AppCompatActivity {

    ImageButton ibtRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joyeria);

        ibtRegresar = (ImageButton) findViewById(R.id.ibtRegresar);

        ibtRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Joyeria.this, Menu.class);
                startActivity(i);
                finish();
            }
        });
    }
}