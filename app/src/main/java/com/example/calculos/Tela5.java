package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);

        EditText editTxtNome;
        EditText editTxtSobrenome;
        Button btnEnvia;

        editTxtNome = (EditText)findViewById(R.id.editTxtNome);
        editTxtSobrenome = (EditText)findViewById(R.id.editTxtSobrenome);
        btnEnvia = (Button)findViewById(R.id.btnEnvia);

        btnEnvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela5.this, Tela5_1.class);
                intent.putExtra("Chave", editTxtNome.getText().toString());
                intent.putExtra("Chave2", editTxtSobrenome.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}