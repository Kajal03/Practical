package com.example.tanujrohilla.backgroundcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.*;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1=null;
    Button b2=null;
    Button b3=null;
    LinearLayout l=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        l=(LinearLayout)findViewById(R.id.linear);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        l.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(b1==v)
        {
            l.setBackgroundColor(Color.BLUE);
        }
        else if(b2==v)
        {
            l.setBackgroundColor(Color.YELLOW);
        }
        else if(b3==v)
        {
            l.setBackgroundColor(Color.GREEN);
        }
    }
}
