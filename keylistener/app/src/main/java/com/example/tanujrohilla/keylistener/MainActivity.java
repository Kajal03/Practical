package com.example.tanujrohilla.keylistener;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View.*;
import android.view.*;
import android.widget.*;


public class MainActivity extends AppCompatActivity implements OnKeyListener {

    EditText e=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e=(EditText)findViewById(R.id.eid);
        e.setOnKeyListener(this);

    }

    @Override
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if(event.getAction()==KeyEvent.ACTION_DOWN) {
            if (keyCode == KeyEvent.KEYCODE_ENTER) {
                String str = e.getText().toString();
                str = str.toUpperCase();
                e.setText(str);
            }
        }
        return false;
    }



}
