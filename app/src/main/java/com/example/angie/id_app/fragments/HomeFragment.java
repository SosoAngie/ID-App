package com.example.angie.id_app.fragments;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.angie.id_app.R;

/**
 * Created by angie on 28/01/18.
 */

public class HomeFragment extends Fragment {

    Button seeMore;

    public HomeFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        seeMore = new Button(getActivity().getBaseContext());
        seeMore.findViewById(R.id.seeMore);
        seeMore.isEnabled();

        seeMore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                MainFragment mainFragment = new MainFragment();
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment, mainFragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        return inflater.inflate(R.layout.fragment_home, container, false);
    }


}
