package com.cis2162.planetgame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.WindowManager;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    private float x;
    private float y;
    private float dx;
    private float dy;

    GifImageView mercury_gif, venus_gif, earth_gif, mars_gif, saturn_gif, jupiter_gif, uranus_gif, neptune_gif;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        mercury_gif = findViewById(R.id.mercury_gif);
        mercury_gif.setOnTouchListener((v, event) -> {
            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    dx = event.getX() - x;
                    dy = event.getY() - y;

                    mercury_gif.setX(mercury_gif.getX() + dx);
                    mercury_gif.setY(mercury_gif.getY() + dy);

                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    v.performClick();
                    break;
            }
            return true;
        });

        venus_gif = findViewById(R.id.venus_gif);
        venus_gif.setOnTouchListener((v, event) -> {
            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    dx = event.getX() - x;
                    dy = event.getY() - y;

                    venus_gif.setX(venus_gif.getX() + dx);
                    venus_gif.setY(venus_gif.getY() + dy);

                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    v.performClick();
                    break;
            }
            return true;
        });

        earth_gif = findViewById(R.id.earth_gif);
        earth_gif.setOnTouchListener((v, event) -> {
            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    dx = event.getX() - x;
                    dy = event.getY() - y;

                    earth_gif.setX(earth_gif.getX() + dx);
                    earth_gif.setY(earth_gif.getY() + dy);

                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    v.performClick();
                    break;
            }
            return true;
        });

        mars_gif = findViewById(R.id.mars_gif);
        mars_gif.setOnTouchListener((v, event) -> {
            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    dx = event.getX() - x;
                    dy = event.getY() - y;

                    mars_gif.setX(mars_gif.getX() + dx);
                    mars_gif.setY(mars_gif.getY() + dy);

                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    v.performClick();
                    break;
            }
            return true;
        });

        jupiter_gif = findViewById(R.id.jupiter_gif);
        jupiter_gif.setOnTouchListener((v, event) -> {
            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    dx = event.getX() - x;
                    dy = event.getY() - y;

                    jupiter_gif.setX(jupiter_gif.getX() + dx);
                    jupiter_gif.setY(jupiter_gif.getY() + dy);

                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    v.performClick();
                    break;
            }
            return true;
        });

        saturn_gif = findViewById(R.id.saturn_gif);
        saturn_gif.setOnTouchListener((v, event) -> {
            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    dx = event.getX() - x;
                    dy = event.getY() - y;

                    saturn_gif.setX(saturn_gif.getX() + dx);
                    saturn_gif.setY(saturn_gif.getY() + dy);

                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    v.performClick();
                    break;
            }
            return true;
        });

        uranus_gif = findViewById(R.id.uranus_gif);
        uranus_gif.setOnTouchListener((v, event) -> {
            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    dx = event.getX() - x;
                    dy = event.getY() - y;

                    uranus_gif.setX(uranus_gif.getX() + dx);
                    uranus_gif.setY(uranus_gif.getY() + dy);

                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    v.performClick();
                    break;
            }
            return true;
        });

        neptune_gif = findViewById(R.id.neptune_gif);
        neptune_gif.setOnTouchListener((v, event) -> {
            switch(event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_MOVE:
                    dx = event.getX() - x;
                    dy = event.getY() - y;

                    neptune_gif.setX(neptune_gif.getX() + dx);
                    neptune_gif.setY(neptune_gif.getY() + dy);

                    x = event.getX();
                    y = event.getY();
                    break;
                case MotionEvent.ACTION_UP:
                    v.performClick();
                    break;
            }
            return true;
        });
    }
}