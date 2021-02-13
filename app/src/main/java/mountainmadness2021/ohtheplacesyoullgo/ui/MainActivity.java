package mountainmadness2021.ohtheplacesyoullgo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.*;

import mountainmadness2021.ohtheplacesyoullgo.R;

public class MainActivity extends AppCompatActivity {

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
                // generate places
                Random rand = new Random();
                int numPlaces = 21;

                // Strings of places
                String[] places = { "Paris, France", "Sydney, Australia", "Queenstown, New Zealand", "Dublin, Ireland", "New York City, USA", "Maui, USA",
                        "Reykjavik, Iceland", "Cancun, Mexico", "Santorini, Greece", "Venice, Italy", "Milan, Italy", "Bora Bora", "Dubai, United Arabs Emirates",
                        "Bangkok, Thailand", "Bali, India", "London, England", "New Orleans, USA", "Honolulu, USA", "Kuala Lumpur, Malaysia", "Istanbul, Turkey", "Tokyo, Japan",};

                // Generates random number for array position
                int int_random = rand.nextInt(places.length);
//                System.out.println(places[int_random]);


                Intent intent = PlaceInfoActivity.makeLaunchIntent(MainActivity.this, places[int_random]);
                startActivity(intent);
            }
        });
    }
}