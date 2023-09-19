package com.example.calculos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        Button btnCalcularBaskhara;
        TextView tlA, tlB, tlC;

        tlA = findViewById(R.id.a);
        tlB = findViewById(R.id.b);
        tlC = findViewById(R.id.c);
        btnCalcularBaskhara = findViewById(R.id.btnCalcularBaskhara);

        btnCalcularBaskhara.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Double A = Double.parseDouble(tlA.getText().toString());
                Double B = Double.parseDouble(tlB.getText().toString());
                Double C = Double.parseDouble(tlC.getText().toString());

                Double delta = (B*B) - (4*A*C);
                Double X1 = (-B + Math.sqrt(delta))/(2*A);
                Double X2 = (-B - Math.sqrt(delta))/(2*A);

                TextView txtBaskhara = findViewById(R.id.txtBaskhara);
                txtBaskhara.setText("X1: " + X1 + "\nX2: " + X2);
            }

        });

    }
}
