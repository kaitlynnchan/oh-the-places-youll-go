package mountainmadness2021.ohtheplacesyoullgo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.*;

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
                ArrayList<String> places = new ArrayList<String>();

                String[] strs = { "Paris, France", "Sydney, Australia", "Queenstown, New Zealand", "Dublin, Ireland", "New York City, USA", "Maui, USA",
                        "Reykjavik, Iceland", "Cancun, Mexico", "Santorini, Greece", "Venice, Italy", "Milan, Italy", "Bora Bora", "Dubai, United Arabs Emirates",
                        "Bangkok, Thailand", "Bali, India", "London, England", "New Orleans, USA", "Honolulu, USA", "Kuala Lumpur, Malaysia", "Istanbul, Turkey", "Tokyo, Japan",};

                places.addAll( Arrays.asList(strs) );
            }
        });
    }
}