package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.NumberPicker;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    EditText edMin, edMax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //seta os atributos
        edMin=findViewById(R.id.editTextNumber);
        edMax=findViewById(R.id.editTextNumber2);
        textView=findViewById(R.id.textView);




        //cria um listener pro botão
        button = findViewById(R.id.btnclick);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int minimo=Integer.parseInt(edMin.getText().toString());
                int maximo=Integer.parseInt(edMax.getText().toString());
                Random random=new Random();

                int valorSorteado=random.nextInt(maximo-minimo)+ minimo;
                textView.setText(Integer.toString(valorSorteado));

            }
        });

    }
}