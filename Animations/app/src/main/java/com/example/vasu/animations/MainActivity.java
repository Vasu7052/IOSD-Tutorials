package com.example.vasu.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnFadeIn , btnFadeOut , btnBlink , btnZoomIn , btnZoomOut , btnRotate ;
    ImageView image ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFadeIn = (Button) findViewById(R.id.fade_in);
        btnFadeOut = (Button) findViewById(R.id.fade_out);
        btnBlink = (Button) findViewById(R.id.blink);
        btnZoomIn = (Button) findViewById(R.id.zoom_in);
        btnZoomOut = (Button) findViewById(R.id.zoom_out);
        btnRotate = (Button) findViewById(R.id.rotate);

        image = (ImageView) findViewById(R.id.image);

        btnFadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this , R.anim.fade_in) ;
                image.startAnimation(animation);
            }
        });

        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this , R.anim.fade_out) ;
                image.startAnimation(animation);
            }
        });

        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this , R.anim.blink) ;
                animation.setRepeatCount(10);
                image.startAnimation(animation);
            }
        });

        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this , R.anim.zoom_in) ;
                image.startAnimation(animation);
            }
        });

        btnZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this , R.anim.zoom_out) ;
                image.startAnimation(animation);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this , R.anim.rotate) ;
                image.startAnimation(animation);
            }
        });




    }
}
