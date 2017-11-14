package com.example.tanujrohilla.tablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox c1=null;
    CheckBox c2=null;
    CheckBox c3=null;
    TextView t=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.checkBox1);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkbox3);
        t=(TextView)findViewById(R.id.textView);
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(c1.isChecked() && c2.isChecked() && c3.isChecked())
                t.setText("DONE !!!");
        else
                t.setText("");
    }
}
