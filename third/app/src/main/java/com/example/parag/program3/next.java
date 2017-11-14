package com.example.parag.program3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class next extends AppCompatActivity {
String xyz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        TextView textView=(TextView) findViewById(R.id.textView);
        Intent intent =getIntent();
        xyz = intent.getStringExtra("XYZ");
        textView.setText(xyz);
    }
}
