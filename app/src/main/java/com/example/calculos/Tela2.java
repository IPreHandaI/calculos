package com.example.calculos;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Tela2 extends AppCompatActivity {

    private EditText editText1, editText2, editText3;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        editText1 = findViewById(R.id.valor1);
        editText2 = findViewById(R.id.valor2);
        editText3 = findViewById(R.id.valor3);
        btnResult = findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Obtém os valores dos campos de texto
                int valor1 = Integer.parseInt(editText1.getText().toString());
                int valor2 = Integer.parseInt(editText2.getText().toString());
                int valor3 = Integer.parseInt(editText3.getText().toString());

                // Realiza a soma dos valores
                int resultado = valor1 + valor2 + valor3;

                // Exibe o resultado em um Toast
                Toast.makeText(Tela2.this, "O resultado da soma é: " + resultado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
