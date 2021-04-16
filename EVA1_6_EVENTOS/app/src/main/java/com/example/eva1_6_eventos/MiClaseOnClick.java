package com.example.eva1_6_eventos;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MiClaseOnClick implements View.OnClickListener {

    Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(context, "EVENTO POR CLASE", Toast.LENGTH_LONG).show();
        Log.wtf("APP", "EVENTO POR CLASE");
    }
}
