package com.example.eva1_11_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lstVw;
    String[] aDatos = {
            "Espresso",
            "Americano",
            "Cortado",
            "Latte",
            "Capuccino",
            "Flat White",
            "Aeropress",
            "French Press",
            "V60",
            "Kalita Wave",
            "Stag x",
            "Origami Dripper",
            "Moka Pot",
            "Moka",
            "Batch Brewer",
            "Flower Dripper",
            "Orea",
            "Flair",
            "Clever Dripper",
            "Hario Switch",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVw = findViewById(R.id.lstVw);
        lstVw.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, aDatos));
        lstVw.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, aDatos[position], Toast.LENGTH_SHORT).show();
    }
}