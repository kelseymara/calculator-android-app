package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initAddButton();
        initSubtractButton();
        initMultiplyButton();
         initDivideButton();
    }

    private void initAddButton() {
        Button button = findViewById(R.id.button_add);
        button.setOnClickListener((view) -> {
            EditText editText_firstNumber = findViewById(R.id.editText_firstNumber);
            EditText editText_secondNumber = findViewById(R.id.editText_secondNumber);
            TextView textView = findViewById(R.id.textView_answer);

            double firstNumber = Double.valueOf(editText_firstNumber.getText().toString());
            double secondNumber = Double.valueOf(editText_secondNumber.getText().toString());
            double answer = firstNumber + secondNumber;

            textView.setText(String.valueOf(answer));

        });
    }

    private void initSubtractButton() {
        Button button = findViewById(R.id.button_subtract);
        button.setOnClickListener((view) -> {
            EditText editText_firstNumber = findViewById(R.id.editText_firstNumber);
            EditText editText_secondNumber = findViewById(R.id.editText_secondNumber);
            TextView textView = findViewById(R.id.textView_answer);

            double firstNumber = Double.valueOf(editText_firstNumber.getText().toString());
            double secondNumber = Double.valueOf(editText_secondNumber.getText().toString());
            double answer = firstNumber - secondNumber;

            textView.setText(String.valueOf(answer));

        });
    }

    private void initMultiplyButton() {
        Button button = findViewById(R.id.button_multiply);
        button.setOnClickListener((view) -> {
            EditText editText_firstNumber = findViewById(R.id.editText_firstNumber);
            EditText editText_secondNumber = findViewById(R.id.editText_secondNumber);
            TextView textView = findViewById(R.id.textView_answer);

            double firstNumber = Double.valueOf(editText_firstNumber.getText().toString());
            double secondNumber = Double.valueOf(editText_secondNumber.getText().toString());
            double answer = firstNumber * secondNumber;

            textView.setText(String.valueOf(answer));

        });
    }

    private void initDivideButton() {
        Button button = findViewById(R.id.button_divide);
        button.setOnClickListener((view) -> {
            EditText editText_firstNumber = findViewById(R.id.editText_firstNumber);
            EditText editText_secondNumber = findViewById(R.id.editText_secondNumber);
            TextView textView = findViewById(R.id.textView_answer);

            double firstNumber = Double.valueOf(editText_firstNumber.getText().toString());
            double secondNumber = Double.valueOf(editText_secondNumber.getText().toString());
            double answer = firstNumber / secondNumber;

            textView.setText(String.valueOf(answer));

        });
    }

}