package com.example.dotonscreenandbutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.MotionEventCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Defining the Constraint layout
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layout);


        Button B1 = (Button)findViewById(R.id.button1);
        Button B2 = (Button)findViewById(R.id.button2);
        Button B3 = (Button)findViewById(R.id.button3);
        Button B4 = (Button)findViewById(R.id.button4);
        Button B5 = (Button)findViewById(R.id.button5);
        Button B6 = (Button)findViewById(R.id.button6);

        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                // If 6 Fingers are Touched and Leaves the Screen The POSITION Where They were should note
                if(event.getPointerCount() == 6 && event.getActionMasked() == MotionEvent.ACTION_POINTER_UP){
                    Log.i("MultiTouch","1 Finger Touched "+event.getX(0)*event.getXPrecision()+" "+event.getY(0)*event.getYPrecision());


                    // BUTTON 1
                    RelativeLayout.LayoutParams BtnLayout = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

                    BtnLayout.leftMargin = (int) (event.getX(0)*event.getXPrecision()) - 100;
                    BtnLayout.topMargin =  (int) (event.getY(0)*event.getYPrecision()) - 150;
                    BtnLayout.height = 280;
                    BtnLayout.width = 280;


                    B1.setVisibility(View.VISIBLE);
                    B1.setLayoutParams(BtnLayout);

                    // BUTTON 2
                    RelativeLayout.LayoutParams BtnLayout2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

                    BtnLayout2.leftMargin = (int) (event.getX(1)*event.getXPrecision()) - 100;
                    BtnLayout2.topMargin =  (int) (event.getY(1)*event.getYPrecision()) - 150;
                    BtnLayout2.height = 280;
                    BtnLayout2.width = 280;


                    B2.setVisibility(View.VISIBLE);
                    B2.setLayoutParams(BtnLayout2);

                    // BUTTON 3
                    RelativeLayout.LayoutParams BtnLayout3 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

                    BtnLayout3.leftMargin = (int) (event.getX(2)*event.getXPrecision()) - 100;
                    BtnLayout3.topMargin =  (int) (event.getY(2)*event.getYPrecision()) - 150;
                    BtnLayout3.height = 280;
                    BtnLayout3.width = 280;


                    B3.setVisibility(View.VISIBLE);
                    B3.setLayoutParams(BtnLayout3);

                    // BUTTON 4
                    RelativeLayout.LayoutParams BtnLayout4 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

                    BtnLayout4.leftMargin = (int) (event.getX(3)*event.getXPrecision()) - 100;
                    BtnLayout4.topMargin =  (int) (event.getY(3)*event.getYPrecision()) - 150;
                    BtnLayout4.height = 280;
                    BtnLayout4.width = 280;


                    B4.setVisibility(View.VISIBLE);
                    B4.setLayoutParams(BtnLayout4);

                    // BUTTON 5
                    RelativeLayout.LayoutParams BtnLayout5 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

                    BtnLayout5.leftMargin = (int) (event.getX(4)*event.getXPrecision()) - 100;
                    BtnLayout5.topMargin =  (int) (event.getY(4)*event.getYPrecision()) - 150;
                    BtnLayout5.height = 280;
                    BtnLayout5.width = 280;


                    B5.setVisibility(View.VISIBLE);
                    B5.setLayoutParams(BtnLayout5);

                    // BUTTON 6
                    RelativeLayout.LayoutParams BtnLayout6 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);

                    BtnLayout6.leftMargin = (int) (event.getX(5)*event.getXPrecision()) - 100;
                    BtnLayout6.topMargin =  (int) (event.getY(5)*event.getYPrecision()) - 150;
                    BtnLayout6.height = 280;
                    BtnLayout6.width = 280;


                    B6.setVisibility(View.VISIBLE);
                    B6.setLayoutParams(BtnLayout6);

                }
                return true;
            }
        });

    }
}