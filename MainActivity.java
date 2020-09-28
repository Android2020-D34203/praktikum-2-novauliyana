package com.example.kalkulatorsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText1, editText2, editText3;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.hitung);
        editText1 = findViewById(R.id.angka1);
        editText2 = findViewById(R.id.angka2);
        editText3 = findViewById(R.id.operator);
        textView = findViewById(R.id.hasil);
    }

    public void hitung(View view){


        double angka1 = Double.parseDouble(editText1.getText().toString());
        double angka2 = Double.parseDouble(editText2.getText().toString());
        String operator = editText3.getText().toString();
        double hasil;
        if (operator.equals("+")){
            hasil = angka1+angka2;
            textView.setText("Hasil Operasi adalah "+hasil);
        }
        else if(operator.equals("-")){
            hasil = angka1-angka2;
            textView.setText("Hasil Operasi adalah "+hasil);
        }
        else if(operator.equals("*")){
            hasil = angka1*angka2;
            textView.setText("Hasil Operasi adalah "+hasil);
        }
        else if(operator.equals("/")){
            hasil = angka1/angka2;
            textView.setText("Hasil Operasi adalah "+hasil);
        }
        else{
            textView.setText("OPERASI ARITMATIK TIDAK SESUAI");
        }
    }
}