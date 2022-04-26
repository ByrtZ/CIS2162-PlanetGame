package com.cis2162.planetgame.activity;

import androidx.annotation.Nullable;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.cis2162.planetgame.R;
import com.cis2162.planetgame.dragdrop.DragShadow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

import pl.droidsonroids.gif.GifImageView;

public class GameActivity extends Activity {
    ArrayList<Integer> planetList = new ArrayList<>();
    ArrayList<Integer> finalPlanetList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Button returnToHome = findViewById(R.id.backToHome);

        finalPlanetList.add(R.id.mercury_gif);
        finalPlanetList.add(R.id.venus_gif);
        finalPlanetList.add(R.id.earth_gif);
        finalPlanetList.add(R.id.mars_gif);
        finalPlanetList.add(R.id.jupiter_gif);
        finalPlanetList.add(R.id.saturn_gif);
        finalPlanetList.add(R.id.uranus_gif);
        finalPlanetList.add(R.id.neptune_gif);

        planetList.add(R.id.mars_gif);
        planetList.add(R.id.mercury_gif);
        planetList.add(R.id.earth_gif);
        planetList.add(R.id.jupiter_gif);
        planetList.add(R.id.neptune_gif);
        planetList.add(R.id.saturn_gif);
        planetList.add(R.id.venus_gif);
        planetList.add(R.id.uranus_gif);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);


        View.OnLongClickListener listenClick = v -> {

            ClipData data = ClipData.newPlainText("","");
            View.DragShadowBuilder dragShadow = new DragShadow(v);

            v.startDragAndDrop(data, dragShadow, v, 0);
            return false;
        };

        View.OnDragListener listenDrag = (v, event) -> {
            int dragEvent = event.getAction();

            switch (dragEvent)
            {
                case DragEvent.ACTION_DRAG_ENTERED:
                    Log.i("Drag Event", "Entered");
                    break;

                case DragEvent.ACTION_DRAG_EXITED:
                    Log.i("Drag Event", "Exited");
                    break;

                case DragEvent.ACTION_DROP:
                    GifImageView target = (GifImageView) v;
                    GifImageView dragged = (GifImageView) event.getLocalState();

                    Drawable target_draw = target.getDrawable();
                    Drawable dragged_draw = dragged.getDrawable();

                    dragged.setImageDrawable(target_draw);
                    int draggedId = dragged.getId();
                    dragged.setId(target.getId());

                    target.setImageDrawable(dragged_draw);
                    target.setId(draggedId);

                    Collections.swap(planetList, planetList.indexOf(dragged.getId()), planetList.indexOf(target.getId()));
                    for(int i = 0; i < planetList.size(); i++) {
                        if(!planetList.get(i).equals(finalPlanetList.get(i))) {
                            break;
                        }
                        if(i == planetList.size() - 1) {
                            Intent intent = new Intent(this, EndActivity.class);
                            startActivity(intent);
                        }
                    }
                    break;
            }
            return true;
        };

        findViewById(R.id.mercury_gif).setOnLongClickListener(listenClick);
        findViewById(R.id.mercury_gif).setOnDragListener(listenDrag);
        findViewById(R.id.venus_gif).setOnLongClickListener(listenClick);
        findViewById(R.id.venus_gif).setOnDragListener(listenDrag);
        findViewById(R.id.earth_gif).setOnDragListener(listenDrag);
        findViewById(R.id.earth_gif).setOnLongClickListener(listenClick);
        findViewById(R.id.mars_gif).setOnDragListener(listenDrag);
        findViewById(R.id.mars_gif).setOnLongClickListener(listenClick);
        findViewById(R.id.saturn_gif).setOnLongClickListener(listenClick);
        findViewById(R.id.saturn_gif).setOnDragListener(listenDrag);
        findViewById(R.id.jupiter_gif).setOnLongClickListener(listenClick);
        findViewById(R.id.jupiter_gif).setOnDragListener(listenDrag);
        findViewById(R.id.uranus_gif).setOnLongClickListener(listenClick);
        findViewById(R.id.uranus_gif).setOnDragListener(listenDrag);
        findViewById(R.id.neptune_gif).setOnLongClickListener(listenClick);
        findViewById(R.id.neptune_gif).setOnDragListener(listenDrag);

        returnToHome.setOnClickListener(v -> {
            Intent intent = new Intent(this, StartActivity.class);
            startActivity(intent);
        });
    }
}