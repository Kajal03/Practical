 package com.example.tanujrohilla.toast_and_alertdialogbox;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1=null;
    Button b2=null;
    Context mycontext=null;
    AlertDialog.Builder abd=null;
    AlertDialog ad=null;
    TextView t=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mycontext=this.getApplicationContext();
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        t=(TextView)findViewById(R.id.textview);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mycontext,"You have pressed the toast button",Toast.LENGTH_LONG).show();
            }
        });

        abd=new AlertDialog.Builder(this);
        abd.setCancelable(false);
        abd.setMessage("Respond Ok or Cancel");
        abd.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                t.setText("You have pressed Ok to the pop up");
            }
        });
        abd.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                t.setText("You have pressed Cancel to the popup");
            }
        });

        abd.setNeutralButton("Remind me later", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                t.setText("You have pressed Remind me later to the popup");
            }
        });

        ad=abd.create();
        ad.setTitle("Select from the following Ok or cancel");
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ad.show();
            }
        });

    }

    protected void onStart(){
        super.onStart();
        Log.d("android", "onStart() is executing");

    }

    protected void onResume(){
        super.onResume();
        Log.d("android", "onResume() is executing");
    }

    protected void onPause(){
        super.onPause();
        Log.d("android", "onPause() is executing");
    }

    protected void onStop(){
        super.onStop();
        Log.d("android", "onStop() is executing");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("android", "onDestroy() is executing");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("android", "onRestart() is executing");
    }
}
