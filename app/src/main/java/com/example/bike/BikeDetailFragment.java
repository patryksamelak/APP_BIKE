package com.example.bike;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BikeDetailFragment extends Fragment {
    private long bikeId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            StoperFragment stoper = new StoperFragment();
            FragmentTransaction ft = getChildFragmentManager().beginTransaction();
            ft.add(R.id.stoper_container, stoper);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            bikeId = savedInstanceState.getLong("bikeId");
        }
    }

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
            TextView dlugosckm = (TextView) view.findViewById(R.id.textDlugoscKM);
            dlugosckm.setText(bike.getDlugoscKM());
            TextView trudnosc = (TextView) view.findViewById(R.id.textTrudnosc);
            trudnosc.setText(bike.getTrudnosc());
            TextView nalepszy_czas = (TextView) view.findViewById(R.id.textNajlepszyCzas);
            nalepszy_czas.setText(bike.getNajlepszyCzas());
            TextView ostatni_czas = (TextView) view.findViewById(R.id.textOstatniCzas);
            ostatni_czas.setText(bike.getOstatniCzas());
            TextView nalepszy_czas_data = (TextView) view.findViewById(R.id.textNajlepszyCzasData);
            nalepszy_czas_data.setText(bike.getNajlepszyCzasData());
            TextView ostatni_czas_data = (TextView) view.findViewById(R.id.textOstatniCzasData);
            ostatni_czas_data.setText(bike.getOstatniCzasData());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("bikeId", bikeId);
    }
}