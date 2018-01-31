package com.example.angie.id_app.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.angie.id_app.R;

/**
 * Created by angie on 28/01/18.
 */

public class MainFragment extends Fragment {

    Button exp;
    Button skills;
    Button projects;
    Button hobbies;

    public MainFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_main, container, false);

        exp = (Button) view.findViewById(R.id.exp);
        exp.isEnabled();

        exp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment, new ExpFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        projects = (Button) view.findViewById(R.id.projects);
        projects.isEnabled();

        projects.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment, new ProjectsFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        skills = (Button) view.findViewById(R.id.skills);
        skills.isEnabled();

        skills.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment, new SkillsFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

        hobbies = (Button) view.findViewById(R.id.hobbies);
        hobbies.isEnabled();

        hobbies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment, new HobbiesFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });


        return view;
    }


}
