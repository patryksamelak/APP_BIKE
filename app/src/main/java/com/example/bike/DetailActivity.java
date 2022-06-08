package com.example.bike;

import android.annotation.SuppressLint;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        BikeDetailFragment frag = (BikeDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int bikeId = (int) getIntent().getExtras().get(EXTRA_BIKE_ID);
        frag.setBike(bikeId);

        FloatingActionButton mAddFab, mAddAlarmFab, mAddPersonFab, mAddPersonFab2;

        TextView addAlarmActionText, addPersonActionText, addPersonActionText2;

            mAddFab = findViewById(R.id.add_fab);
            // FAB button
            mAddAlarmFab = findViewById(R.id.add_alarm_fab);
            mAddPersonFab = findViewById(R.id.add_person_fab);
            mAddPersonFab2 = findViewById(R.id.add_person_fab2);

            addAlarmActionText = findViewById(R.id.add_alarm_action_text);
            addPersonActionText = findViewById(R.id.add_person_action_text);
            addPersonActionText2 = findViewById(R.id.add_person_action_text2);

            mAddAlarmFab.setVisibility(View.GONE);
            mAddPersonFab.setVisibility(View.GONE);
            mAddPersonFab2.setVisibility(View.GONE);
            addAlarmActionText.setVisibility(View.GONE);
            addPersonActionText.setVisibility(View.GONE);
            addPersonActionText2.setVisibility(View.GONE);

            isAllFabsVisible[0] = false;

            mAddFab.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (!isAllFabsVisible[0]) {
                                mAddAlarmFab.show();
                                mAddPersonFab.show();
                                mAddPersonFab2.show();
                                addAlarmActionText.setVisibility(View.VISIBLE);
                                addPersonActionText.setVisibility(View.VISIBLE);
                                addPersonActionText2.setVisibility(View.VISIBLE);

                                isAllFabsVisible[0] = true;
                            } else {

                                mAddAlarmFab.hide();
                                mAddPersonFab.hide();
                                mAddPersonFab2.hide();
                                addAlarmActionText.setVisibility(View.GONE);
                                addPersonActionText.setVisibility(View.GONE);
                                addPersonActionText2.setVisibility(View.GONE);

                                isAllFabsVisible[0] = false;
                            }
                        }
                    });

            mAddPersonFab.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            StoperFragment.onClickStop();
                        }
                    });


            mAddAlarmFab.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            StoperFragment.onClickStart();
                        }
                    });

            mAddPersonFab2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        StoperFragment.onClickReset();
                    }
                });
        }
    }
