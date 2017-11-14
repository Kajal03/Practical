package com.example.tanujrohilla.myapplication3;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View.*;
import android.view.*;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button b=null;
    EditText e=null;
    TextView t=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        e=(EditText)findViewById(R.id.editText);
        t=(TextView)findViewById(R.id.textView);
        b.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        String s=t.getText().toString();
        s=s.toUpperCase();
        e.setText(s);

    }
}
