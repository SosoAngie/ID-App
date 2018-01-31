package com.example.angie.id_app.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.angie.id_app.R;

/**
 * Created by angie on 30/01/18.
 */

public class HobbiesFragment extends Fragment {

    public HobbiesFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hobbies, container, false);

        return view;
    }
}
