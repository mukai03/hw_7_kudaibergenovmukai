package com.geektech.hw_7_kudaibergenov_mukai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer result = 0;
    private TextView textView;
    private Integer firstVar, secondVar;
    private Boolean isOperationClick;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onClickNumber(View view) {
        switch (view.getId()){
            case R.id.btn_zero:
                setNumber("0");
                break;

            case R.id.btn_one:
                setNumber("1");
                break;

            case R.id.btn_two:
                setNumber("2");
                break;

            case R.id.btn_three:
                setNumber("3");
                break;

            case R.id.btn_four:
                setNumber("4");
                break;

            case R.id.btn_five:
                setNumber("5");
                break;

            case R.id.btn_six:
                setNumber("6");
                break;

            case R.id.btn_seven:
                setNumber("7");
                break;

            case R.id.btn_eight:
                setNumber("8");
                break;

            case R.id.btn_nine:
                setNumber("9");
                break;

            case R.id.btn_allClear:
                textView.setText("0");
                isOperationClick = false;
                firstVar = 0;
                secondVar = 0;
                break;


        }

    }
    private void setNumber(String number){
        if (textView.getText().toString().equals("0")){
            textView.setText(number);
        }else if (isOperationClick){
            textView.setText(number);
        }else {
            textView.append(number); }
        isOperationClick = false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                operation = "+";
                firstVar = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;

            case R.id.btn_minus:
                operation = "-";
                firstVar = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;

            case R.id.btn_division:
                operation = "/";
                firstVar = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;

            case R.id.btn_multiplication:
                operation = "*";
                firstVar = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_percent:
                operation = "%";
                firstVar = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;
            case R.id.btn_plus_minus:
                operation = "+/-";
                firstVar = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;
                break;

            case R.id.btn_equal:
                result = 0;
                secondVar = Integer.parseInt(textView.getText().toString());
                isOperationClick = true;


                switch (operation) {
                    case "+":
                        result = firstVar + secondVar;
                        break;
                    case "-":
                        result = firstVar - secondVar;
                        break;
                    case "/":
                        result = firstVar / secondVar;
                        break;
                    case "*":
                        result = firstVar * secondVar;
                        break;

                    case "%":
                        result = (secondVar * 100) / firstVar;
                        break;

                    case "+/-":
                        result = firstVar -= secondVar;
                        break;

                }
                textView.setText(result.toString());
                break;
        }

    }



}