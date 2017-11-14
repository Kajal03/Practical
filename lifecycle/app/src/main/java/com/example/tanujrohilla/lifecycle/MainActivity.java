package com.example.tanujrohilla.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("android","onCreate() is executed");

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
