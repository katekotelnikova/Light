package com.example.kev.light;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "StartActivity";
    Button btnRed;
    Button btnYellow;
    Button btnGreen;
    LinearLayout ll;
    int backgroungColor;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.l1);
        btnRed = (Button) findViewById(R.id.red);
        btnYellow = (Button) findViewById(R.id.yellow);
        btnGreen = (Button) findViewById(R.id.green);

        btnRed.setOnClickListener(this);
        btnYellow.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.red:
                backgroungColor = R.color.colorRed;
                ll.setBackgroundResource(backgroungColor);
                break;
            case R.id.yellow:
                backgroungColor = R.color.colorYellow;
                ll.setBackgroundResource(backgroungColor);
                break;
            case R.id.green:
                backgroungColor = R.color.colorGreen;
                ll.setBackgroundResource(backgroungColor);
                break;
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("color", backgroungColor);
        Log.d(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("color")) {
            backgroungColor = (int) savedInstanceState.get("color");
            findViewById(R.id.l1).setBackgroundResource(backgroungColor);
        }
        Log.d(TAG, "onRestoreInstanceState");
    }


}
