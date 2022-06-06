package ru.mirea.zavarzin.intentapp;

import android.os.Bundle;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String text = (String) getIntent().getSerializableExtra("key");
        TextView textViewToChange = (TextView) findViewById(R.id.textView);
        textViewToChange.setText(text);
    }

}