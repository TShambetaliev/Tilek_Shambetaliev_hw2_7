package com.example.tilek_shambetaliev_hw2_7;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Double first, second, result;
    private Boolean isOperationClick;
    String Operation;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_views);
    }

    public void onNumberClick(View view) {
        switch (view.getId()) {
            case R.id.btn_zero:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;
            case R.id.btn_one:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.btn_two:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;
            case R.id.btn_three:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.btn_four:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;
            case R.id.btn_five:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.btn_six:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.btn_seven:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.btn_eight:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.btn_nine:
                if (textView.getText().toString().equals("0") || isOperationClick) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.btn_ac:
                textView.setText("0");
                first = 0.0;
                second = 0.0;
                result = 0.0;
                break;
        }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                rememberFirst();
                Operation = "+";
                break;
            case R.id.btn_minus:
                rememberFirst();
                Operation = "-";
                break;
            case R.id.btn_multiplication:
                rememberFirst();
                Operation = "*";
                break;
            case R.id.btn_division:
                rememberFirst();
                Operation = "/";
                break;
            case R.id.btn_percent:
                rememberFirst();
                Operation = "%";
                result = first / 100;
                textView.setText(result.toString());
                break;
            case R.id.btn_plus_minus:
                rememberFirst();
                Operation = "+/-";
                result = first - (first * 2);
                textView.setText(result.toString());
                break;
            case R.id.btn_equals:
                second = Double.valueOf(textView.getText().toString());
                switch (Operation) {
                    case "+":
                        result = first +  second;
                        textView.setText(result.toString());
                        break;
                    case "-":
                        result = first - second;
                        textView.setText(result.toString());
                        break;
                    case "*":
                        result = first * second;
                        textView.setText(result.toString());
                        break;
                    case "/":
                        result = first / second;
                        textView.setText(result.toString());
                        break;

                }
        }
        isOperationClick = true;
    }

    public void rememberFirst() {
        first = Double.valueOf(textView.getText().toString());
    }
}