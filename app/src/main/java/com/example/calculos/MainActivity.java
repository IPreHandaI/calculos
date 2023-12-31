package com.example.calculos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSimples = findViewById(R.id.btnSimples);
        btnSimples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(getApplicationContext(), Tela2.class);
                startActivity(tela2);
            }
        });

        Button btnImc = findViewById(R.id.btnImc);
        btnImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela3 = new Intent(getApplicationContext(), Tela3.class);
                startActivity(tela3);
            }
        });

        Button btnNomeSobrenomeOutraTela = findViewById(R.id.btnNomeSobrenomeOutraTela);
        btnNomeSobrenomeOutraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela5 = new Intent(getApplicationContext(), Tela5.class);
                startActivity(tela5);
            }
        });
    }
}