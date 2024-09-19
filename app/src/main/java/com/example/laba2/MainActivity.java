package com.example.laba2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView textRes;
    private TextView textError;
    private TextView znak;
    private EditText inputFirst;
    private EditText inputSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textRes = findViewById(R.id.textRes);
        znak = findViewById(R.id.textZnak);
        textError = findViewById(R.id.textError);
        inputFirst = findViewById(R.id.InputFirst);
        inputSecond = findViewById(R.id.InputSecond);
    }

    public void btnSum(View view) {
        Number result;
        textError.setText("");
        if (!inputFirst.getText().toString().equals("") && !inputSecond.getText().toString().equals("")) {
            result = Double.parseDouble(inputFirst.getText().toString()) + Double.parseDouble(inputSecond.getText().toString());
            textRes.setText(result.toString());
            znak.setText("+");
        } else {
            textError.setText("Введите числа");
        }
    }

    public void btnMin(View view) {
        Number result;
        textError.setText("");
        if (!inputFirst.getText().toString().equals("") && !inputSecond.getText().toString().equals("")) {
            result = Double.parseDouble(inputFirst.getText().toString()) - Double.parseDouble(inputSecond.getText().toString());
            textRes.setText(result.toString());
            znak.setText("-");
        } else {
            textError.setText("Введите числа");
        }
    }

    public void btnDel(View view) {
        Number result;
        textError.setText("");
        if (!inputFirst.getText().toString().equals("") && !inputSecond.getText().toString().equals("")) {
            if (!inputSecond.getText().toString().equals("")) {
            result = Double.parseDouble(inputFirst.getText().toString()) / Double.parseDouble(inputSecond.getText().toString());
            String result_d = String.format("%.3f",result);
            textRes.setText(result_d);
            znak.setText("/");} else {
                textError.setText("На ноль делить нельзя");
            }
        } else {
            textError.setText("Введите числа");
        }
    }

    public void btnMult(View view) {
        Number result;
        textError.setText("");
        if (!inputFirst.getText().toString().equals("") && !inputSecond.getText().toString().equals("")) {
            result = Double.parseDouble(inputFirst.getText().toString()) * Double.parseDouble(inputSecond.getText().toString());
            textRes.setText(result.toString());
            znak.setText("*");
        } else {
            textError.setText("Введите числа");
        }
    }

    public void btnResFunc(View view) {
        textError.setText("");
        znak.setText("");
        inputFirst.setText(null);
        inputSecond.setText(null);
        textRes.setText("Результат");
    }
}