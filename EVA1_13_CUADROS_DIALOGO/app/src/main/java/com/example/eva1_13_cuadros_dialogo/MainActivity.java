package com.example.eva1_13_cuadros_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCDSistema(View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de Dialogo de Android")
                .setMessage("Hello World")
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton Ok", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton NO", Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNeutralButton("CANCEL",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Boton CANCEL", Toast.LENGTH_SHORT).show();
                            }
                        })
                .show();
    }

    public void onClickCDCustom(View v){
        Dialog dlgCuadro = new Dialog(this);
        //ASIGNAR LAYOUT
        dlgCuadro.setContentView(R.layout.cuadro_dialogo);
        //VINCULAR COMPONENTES
        TextView txtVwTitulo;
        EditText edtTxt;
        Button btnAccion;

        txtVwTitulo = dlgCuadro.findViewById(R.id.txtVwTitulo);
        edtTxt = dlgCuadro.findViewById(R.id.edtTxt);
        btnAccion = dlgCuadro.findViewById(R.id.btnAccion);

        txtVwTitulo.setText("CUADRO DIALOGO PERSONALIZADO");
        btnAccion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), edtTxt.getText().toString(),
                                Toast.LENGTH_SHORT).show();
                        dlgCuadro.dismiss();
                    }
                }
        );
        dlgCuadro.show();
    }
}