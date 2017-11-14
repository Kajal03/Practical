package com.example.tanujrohilla.finish;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Button.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==b)
            this.finish();
    }
}
