package com.example.eva1_7_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgCoffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdgCoffee = findViewById(R.id.rdgCoffee);

        rdgCoffee.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                /*switch (checkedId){
                    case R.id.radioButton:
                        Toast.makeText(getApplicationContext(), "AMERICANO", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(getApplicationContext(), "LATTE", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton3:
                        Toast.makeText(getApplicationContext(), "CORTADO", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton4:
                        Toast.makeText(getApplicationContext(), "FILTER", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.radioButton5:
                        Toast.makeText(getApplicationContext(), "ESPRESSO", Toast.LENGTH_LONG).show();
                        break;
                }*/
                RadioButton rdBtnSel;
                rdBtnSel = findViewById(checkedId);
                Toast.makeText(getApplicationContext(), rdBtnSel.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}