package com.example.bike;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BikeDetailFragment extends Fragment {
    private long bikeId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedinstanceState) {
        return inflater.inflate(R.layout.fragment_bike_detail, container, false);
    }

    public void setBike(long id) {
        this.bikeId = id;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Bike bike = Bike.bikes[(int) bikeId];
            title.setText(bike.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(bike.getRecipe());
        }
    }

}
