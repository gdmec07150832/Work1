package com.example.wolf.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("MainActivity","onCreate方法被执行");
    }

    @Override
    protected void onStart() {
        Log.v("MainActivity","onStart方法被执行");
    }

    @Override
    protected void onResume() {
        Log.v("MainActivity","onResume方法被执行");
    }

    @Override
    protected void onPause() {
        Log.v("MainActivity","onPause方法被执行");
    }

    @Override
    protected void onStop() {
        Log.v("MainActivity","onStop方法被执行");
    }

    @Override
    protected void onRestart() {
        Log.v("MainActivity","onRestart方法被执行");
    }

    @Override
    protected void onDestroy() {
        Log.v("MainActivity","onDestroy方法被执行");
    }
}
