package mountainmadness2021.ohtheplacesyoullgo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import mountainmadness2021.ohtheplacesyoullgo.R;
import mountainmadness2021.ohtheplacesyoullgo.model.Location;
import mountainmadness2021.ohtheplacesyoullgo.model.LocationsManager;

public class PlaceInfoActivity extends AppCompatActivity {

    private LocationsManager manager = new LocationsManager();
    private Location location;

    public static Intent makeLaunchIntent(Context context){
        Intent intent = new Intent(context, PlaceInfoActivity.class);
        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);

        location = manager.getRandomLocation();

        TextView locationtv = findViewById(R.id.tv_location);
        locationtv.setText(location.getCity() + ",\n" + location.getCountry());

        flags();
        setupAttractions();

        TextView funFacts = findViewById(R.id.titleFunFact);
        funFacts.setText(funFacts.getText() + location.getFact());

        setupBackButton();
    }

    private void flags() {
//        FlagURL.fineFlag();
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