package com.example.eva1_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Clima[] aClimaCd = {
            new Clima(R.drawable.sunny, "Chihuahua", 28, "Despejado con Viento"),
            new Clima(R.drawable.atmospher, "Delicias", 15, "Viento"),
            new Clima(R.drawable.cloudy, "Camargo", 22.3, "Nublado"),
            new Clima(R.drawable.light_rain, "Casas Grandes", 15, "Poca lluvia"),
            new Clima(R.drawable.rainy, "Parral", 11, "Lluvia"),
            new Clima(R.drawable.snow, "Batopilas", -3, "Nieve"),
            new Clima(R.drawable.thunderstorm, "Madera", 24, "Tormenta"),
            new Clima(R.drawable.tornado, "Guerrero", 17, "Vientos poderosos"),
            new Clima(R.drawable.sunny, "Creel", 12, "Despejado"),
            new Clima(R.drawable.light_rain, "Aldama", 13, "Poca lluvia"),
    };

    ListView lstVwClima;

    @Override
    protected void onStart() {
        super.onStart();
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new ClimaAdaptador(this, R.layout.mi_lista_clima, aClimaCd));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}