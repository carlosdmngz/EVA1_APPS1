package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAnonClass, btnListener, btnClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnAnonClass = findViewById(R.id.btnAnonClass);
        btnClase = findViewById(R.id.btnClase);

        btnListener.setOnClickListener(this);
        btnClase.setOnClickListener(new MiClaseOnClick());

        MiClaseOnClick objClick = new MiClaseOnClick();
        objClick.setContext(this);
        btnClase.setOnClickListener(new MiClaseOnClick());

        btnAnonClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Contexto: recursos graficos de la actividad
                Toast.makeText(getApplicationContext(), "EVENTO POR CLASE ANONIMA", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void miClick(View arg) {
        Toast.makeText(this, "EVENTO POR ONCLICK XML", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "EVENTO POR LISTENER", Toast.LENGTH_LONG).show();
    }
}

