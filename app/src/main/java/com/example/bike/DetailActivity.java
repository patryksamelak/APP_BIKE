package com.example.bike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_BIKE_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        BikeDetailFragment frag = (BikeDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int bikeId = (int) getIntent().getExtras().get(EXTRA_BIKE_ID);
        frag.setBike(bikeId);
    }
}