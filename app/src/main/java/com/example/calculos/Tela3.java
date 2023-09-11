package com.example.calculos;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Double;
import android.widget.Toast;

public class Tela3 extends AppCompatActivity {

    private EditText editIdade, editAltura, editPeso, editNome;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        editIdade = findViewById(R.id.editIdade);
        editAltura = findViewById(R.id.editAltura);
        editPeso = findViewById(R.id.editPeso);
        editNome = findViewById(R.id.editNome);
        btnCalcular = findViewById(R.id.btnCalcular);


//PESO * ALTURA(2)

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valorIdade = Integer.parseInt(editIdade.getText().toString());
                int valorAltura = Integer.parseInt(editAltura.getText().toString());
                int valorPeso = Integer.parseInt(editPeso.getText().toString());
                String valorNome = editNome.getText().toString();


                double resultado = valorPeso/(valorAltura * valorAltura);

                if(resultado < 18.5){
                    TextView situacao = findViewById(R.id.situacao);
                    situacao.setText("Sua situação é: Abaixo do peso");
                }else if(resultado < 24.9){
                    TextView situacao = findViewById(R.id.situacao);
                    situacao.setText("Sua situação é: Abaixo do peso");
                }else if(resultado < 29.9){
                    TextView situacao = findViewById(R.id.situacao);
                    situacao.setText("Sua situação é: Acima do peso");
                }else if(resultado < 34.9){
                    TextView situacao = findViewById(R.id.situacao);
                    situacao.setText("Sua situação é: Obesidade grau 1");
                }else if(resultado < 39.9){
                    TextView situacao = findViewById(R.id.situacao);
                    situacao.setText("Sua situação é: Obesidade grau 2");
                }else{
                    TextView situacao = findViewById(R.id.situacao);
                    situacao.setText("Sua situação é: Obesidade Mórbida");
                }

                // Exibe o resultado em um Toast
                TextView txtCalcular = findViewById(R.id.txtCalcular);
                txtCalcular.setText("Seu nome é: " + valorNome + ". Seu IMC é: " + resultado + "A sua idade é: " + valorIdade);


                //Toast.makeText(Tela3.this, "O resultado do IMC é: " + resultado, Toast.LENGTH_SHORT).show();
            }
        });



        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(MainActivity);
            }
        });
    }
}