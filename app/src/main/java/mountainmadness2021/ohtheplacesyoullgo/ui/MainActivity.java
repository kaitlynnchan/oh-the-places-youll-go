package mountainmadness2021.ohtheplacesyoullgo.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.ObjectAnimator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.*;

import mountainmadness2021.ohtheplacesyoullgo.R;
import mountainmadness2021.ohtheplacesyoullgo.model.LocationsManager;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onResume() {
        super.onResume();
        ImageView plane = findViewById(R.id.plane);
        plane.setX(0);
        plane.setY(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtons();
    }

    private void setupButtons() {
        Button generateBtn = findViewById(R.id.btn_generate);
        generateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView plane = findViewById(R.id.plane);
                ObjectAnimator moveY = ObjectAnimator.ofFloat(plane , "translationY", -2000);
                moveY.setDuration(500);
                moveY.start();

                ObjectAnimator moveX = ObjectAnimator.ofFloat(plane, "translationX", 2000);
                moveX.setDuration(500);
                moveX.start();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = PlaceInfoActivity.makeLaunchIntent(MainActivity.this);
                        startActivity(intent);
                    }
                }, 500);

            };
        });
    }
}