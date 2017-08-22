package com.example.qthjen.multiautocompletetextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MultiAutoCompleteTextView multiAutoCompleteTextView;
    Button btClick;
    String array[] = {"Twich", "Caitlyn", "Vayne", "Tristana", "Ezeal", "Jinx", "Kalista", "Sivir"
            , "Jhin", "Xarah", "Ashe", "Miss fortun", "Varus", "Ekko", "Fizz", "Javan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiAutoCompleteTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCTV);
        btClick = (Button) findViewById(R.id.btClick);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, array);
        multiAutoCompleteTextView.setAdapter(arrayAdapter);
        multiAutoCompleteTextView.setThreshold(1);
        multiAutoCompleteTextView.setDropDownHeight(400);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        btClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, multiAutoCompleteTextView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
