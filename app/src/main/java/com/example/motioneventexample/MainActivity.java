package com.example.motioneventexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static final String TAG="MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //return super.onTouchEvent(event);
        int myAction= MotionEventCompat.getActionMasked(event);
        switch (myAction){
            case (MotionEvent.ACTION_UP):
                Log.i(TAG,"Up Action");
                Toast.makeText(MainActivity.this,"Up Action",Toast.LENGTH_SHORT).show();
                return true;

            case (MotionEvent.ACTION_DOWN):
                Log.i(TAG,"Down Action");
                Toast.makeText(MainActivity.this,"Down Action",Toast.LENGTH_SHORT).show();
                return true;

            case (MotionEvent.ACTION_MOVE):
                Log.i(TAG,"Move Action");
                Toast.makeText(MainActivity.this,"Move Action",Toast.LENGTH_SHORT).show();
                return true;

            case (MotionEvent.ACTION_CANCEL):
                Log.i(TAG,"Cancel Action");
                Toast.makeText(MainActivity.this,"Cancel Action",Toast.LENGTH_SHORT).show();
                return true;

                default:return super.onTouchEvent(event);
        }
    }
}
