package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Tela5_1 extends AppCompatActivity {

    TextView txtNome, txtSobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5_1);

        txtNome = (TextView)findViewById(R.id.txtNome);
        String valor = getIntent().getStringExtra("Chave");
        txtNome.setText(valor);

        txtSobrenome = (TextView)findViewById(R.id.txtSobrenome);
        String valor2 = getIntent().getStringExtra("Chave2");
        txtSobrenome.setText(valor2);

    }
}