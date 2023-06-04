package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViewAndButton();
    }

    private void initTextViewAndButton() {
        final TextView resultTextView = findViewById(R.id.result_text_view);
        final TextView poleTextView = findViewById(R.id.pole_text_view);

        final Button clearButton = findViewById(R.id.button_clear);
        final Button plusAndMinusButton = findViewById(R.id.button_plus_and_minus);
        final Button procButton = findViewById(R.id.button_proc);
        final Button divButton = findViewById(R.id.button_div);
        final Button sevenButton = findViewById(R.id.button_seven);
        final Button sixButton  = findViewById(R.id.button_six);
        final Button fiveButton  = findViewById(R.id.button_five);
        final Button fourButton  = findViewById(R.id.button_four);
        final Button myltiButton  = findViewById(R.id.button_mylti);
        final Button oneButton  = findViewById(R.id.button_one);
        final Button twoButton  = findViewById(R.id.button_two);
        final Button threeButton  = findViewById(R.id.button_three);
        final Button plusButton  = findViewById(R.id.button_plus);
        final Button pointButton  = findViewById(R.id.button_point);
        final Button zeroButton  = findViewById(R.id.button_zero);
        final Button delButton  = findViewById(R.id.button_del);
        final Button equalsButton  = findViewById(R.id.button_equals);






    }
}