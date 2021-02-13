package mountainmadness2021.ohtheplacesyoullgo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import mountainmadness2021.ohtheplacesyoullgo.R;
import mountainmadness2021.ohtheplacesyoullgo.model.Location;

public class PlaceInfoActivity extends AppCompatActivity {

    public static final String EXTRA_LOCATION = "location";

    public static Intent makeLaunchIntent(Context context, String location){
        Intent intent = new Intent(context, PlaceInfoActivity.class);
        intent.putExtra(EXTRA_LOCATION, location);
        return intent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);

        Intent intent = getIntent();
        String place = intent.getStringExtra(EXTRA_LOCATION);

        TextView location = findViewById(R.id.tv_location);
        location.setText(place);
    }
}