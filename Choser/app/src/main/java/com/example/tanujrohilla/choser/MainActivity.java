package com.example.tanujrohilla.choser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b=null;
    EditText et=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText)findViewById(R.id.et);
        b=(Button)findViewById(R.id.bt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=et.getText().toString();
       /* Intent intent = new Intent(Intent.ACTION_SEND,temp);


        Intent chooser = Intent.createChooser(intent, temp);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(chooser);
        }*/

                // Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+9292943736"));
       /* String title="How to open the app";
        Intent chooser=Intent.createChooser(intent,title);
        startActivity(chooser);*/
                Intent intent=new Intent(Intent.ACTION_SEND); //Uri.parse(et.getText().toString()));
                intent.setType("Text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,temp);
                String title="How to open the app";
                Intent chooser=Intent.createChooser(intent,title);
                startActivity(chooser);



            }
        });
    }




    }
