package mountainmadness2021.ohtheplacesyoullgo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import mountainmadness2021.ohtheplacesyoullgo.R;
import mountainmadness2021.ohtheplacesyoullgo.model.Location;
import mountainmadness2021.ohtheplacesyoullgo.model.LocationsManager;

public class PlaceInfoActivity extends AppCompatActivity {

    public static final String EXTRA_LOCATION = "location";

    private LocationsManager manager = new LocationsManager();
    private Location location;

    public static Intent makeLaunchIntent(Context context, Location location){
        Intent intent = new Intent(context, PlaceInfoActivity.class);
//        intent.putExtra(EXTRA_LOCATION, location);
        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);

//        Intent intent = getIntent();
//        String place = intent.getStringExtra(EXTRA_LOCATION);

        location = manager.getRandomLocation();

        TextView locationtv = findViewById(R.id.tv_location);
        locationtv.setText(location.getCity() + ",\n" + location.getCountry());

        flags();
        setupAttractions();
        setupBackButton();
    }

    private void flags() {
        try {
            URL url = new URL("https://entertainingwithbeth.com/foolproof-french-macaron-recipe/");

            Scanner scanner = new Scanner(url.openStream());
//            int i = 0;
//            while(scanner.hasNext() && i < 5){
//                String line = scanner.nextLine();
//                System.out.println(line);
//                i++;
//            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void setupAttractions() {
        LinearLayout attractionsLl = findViewById(R.id.ll_attractions);
        for(String attraction : location.attractions()){
            TextView textView = new TextView(this);
            textView.setText(attraction);

            attractionsLl.addView(textView);
        }
    }

    private void setupBackButton() {
        ImageButton backBtn = findViewById(R.id.img_btn_back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}