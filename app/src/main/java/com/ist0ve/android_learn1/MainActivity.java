package com.ist0ve.android_learn1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    TextView textView = findViewById(R.id.textView);
//    EditText editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
//    EditText editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
//    Button button = findViewById(R.id.button);

//    public void onClick(View target) {
//        float num1 = Float.valueOf(editTextTextPersonName.getText().toString());
//        float num2 = Float.valueOf(editTextTextPersonName2.getText().toString());
//        float res = num1 + num2;
//        textView .setText(String.valueOf(res));
//    }
}