package com.example.tanujrohilla.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioButton b1=null;
    RadioButton b2=null;
    RadioButton b3=null;
    EditText e2=null;
    EditText e1=null;
    RadioGroup r=null;
    DecimalFormat d=new DecimalFormat("####.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(RadioButton)findViewById(R.id.button1);
        b2=(RadioButton) findViewById(R.id.button2);
        b3=(RadioButton) findViewById(R.id.button3);
        e2=(EditText)findViewById(R.id.result);
        e1=(EditText)findViewById(R.id.get);
        r=(RadioGroup)findViewById(R.id.group);

        r.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        double num;
        String s;
        s=e1.getText().toString();
        num=Double.parseDouble(s);

        if(checkedId==b1.getId())
        {
            e2.setText(d.format(num + (num*0.1)));
        }
        else if(checkedId==b2.getId())
        {
            e2.setText(d.format(num + (num*0.2)));
        }
        else if(checkedId==b3.getId())
        {
            e2.setText(d.format(num + (num*0.3)));
        }
    }
}
