package com.example.bike;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_BIKE_ID = "id";

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Boolean[] isAllFabsVisible = new Boolean[1];
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_launcher);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        BikeDetailFragment frag = (BikeDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int bikeId = (int) getIntent().getExtras().get(EXTRA_BIKE_ID);
        frag.setBike(bikeId);

        FloatingActionButton mAddFab, mPlayStoper, mPauseStoper, mResetSaveStoper, mStatistics;
        TextView addPlayActionText, addPauseActionText, addResetSaveActionText, addStatisticsActionText;
        mAddFab = findViewById(R.id.add_fab);
        // FAB button
        mPlayStoper = findViewById(R.id.add_play_fab);
        mPauseStoper = findViewById(R.id.add_pause_fab);
        mResetSaveStoper = findViewById(R.id.add_resetsave_fab);
        mStatistics = findViewById(R.id.add_statistics_fab);

        addPlayActionText = findViewById(R.id.add_play_action_text);
        addPauseActionText = findViewById(R.id.add_pause_action_text);
        addResetSaveActionText = findViewById(R.id.add_resetsave_action_text);
        addStatisticsActionText = findViewById(R.id.add_statistics_action_text);

        mPlayStoper.setVisibility(View.GONE);
        mPauseStoper.setVisibility(View.GONE);
        mResetSaveStoper.setVisibility(View.GONE);
        mStatistics.setVisibility(View.GONE);
        addPlayActionText.setVisibility(View.GONE);
        addPauseActionText.setVisibility(View.GONE);
        addResetSaveActionText.setVisibility(View.GONE);
        addStatisticsActionText.setVisibility(View.GONE);

        isAllFabsVisible[0] = false;

        mAddFab.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!isAllFabsVisible[0]) {
                            mPlayStoper.show();
                            mPauseStoper.show();
                            mResetSaveStoper.show();
                            mStatistics.show();
                            addPlayActionText.setVisibility(View.VISIBLE);
                            addPauseActionText.setVisibility(View.VISIBLE);
                            addResetSaveActionText.setVisibility(View.VISIBLE);
                            addStatisticsActionText.setVisibility(View.VISIBLE);
                            isAllFabsVisible[0] = true;
                        } else {

                            mPlayStoper.hide();
                            mPauseStoper.hide();
                            mResetSaveStoper.hide();
                            mStatistics.hide();
                            addPlayActionText.setVisibility(View.GONE);
                            addPauseActionText.setVisibility(View.GONE);
                            addResetSaveActionText.setVisibility(View.GONE);
                            addStatisticsActionText.setVisibility(View.GONE);
                            isAllFabsVisible[0] = false;
                        }
                    }
                });

        mPauseStoper.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        StoperFragment.onClickStop();
                    }
                });

        mPlayStoper.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        StoperFragment.onClickStart();
                    }
                });

        mResetSaveStoper.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        StoperFragment.onClickReset();
                    }
                });

        mStatistics.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(DetailActivity.this, StatisticsActivity.class);
                        startActivity(intent);
                    }
                });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
