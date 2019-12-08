package com.example.motioneventexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Matrix;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;

public class ZoomActivity extends AppCompatActivity {
    private Matrix imageMatrix = new Matrix();
    private ImageView imageView;
    private float scale = 2f;
    private ScaleGestureDetector gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom);
        imageView=findViewById(R.id.myImage);

        gestureDetector=new ScaleGestureDetector(ZoomActivity.this,new ImageListener());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return  true;
    }

    private class ImageListener extends  ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scale*=detector.getScaleFactor();
            scale=Math.max(0.2f, Math.min(scale,6.0f));
            imageMatrix.setScale(scale,scale);
            imageView.setImageMatrix(imageMatrix);
            return  true;
        }
    }

}
