package com.example.parag.program3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {
String abc="Hello";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b= (Button) findViewById(R.id.button);
       b.setOnClickListener(new View.OnClickListener()
       {

           @Override

           public void onClick (View v){
               Intent intent =new Intent(MainActivity.this,next.class);
               intent.putExtra("XYZ",abc);
               startActivity(intent);

           }


       });

    }
}
