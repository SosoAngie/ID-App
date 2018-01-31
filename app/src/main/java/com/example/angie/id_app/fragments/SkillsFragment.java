package com.example.angie.id_app.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.angie.id_app.R;
import com.example.angie.id_app.model.CustomItem;
import com.example.angie.id_app.model.CustomListAdapter;
import com.example.angie.id_app.model.SkillsItem;
import com.example.angie.id_app.model.SkillsListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by angie on 30/01/18.
 */

public class SkillsFragment extends Fragment{

    ListView skills;

    public SkillsFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_skills, container, false);
        skills = (ListView) view.findViewById(R.id.listSkills);

        List<SkillsItem> skillsItems = genererItem();

        SkillsListAdapter skillsListAdapter = new SkillsListAdapter(getActivity().getBaseContext(),skillsItems);
        skills.setAdapter(skillsListAdapter);

        return view;
    }

    private List<SkillsItem> genererItem(){
        List<SkillsItem> item = new ArrayList<SkillsItem>();
       // item.add(new SkillsItem("TROULOU",R.drawable.androidcoffee_300));
        //item.add(new SkillsItem("TROULOU",R.drawable.bonbon_300));
        //item.add(new SkillsItem("TROULOU",R.drawable.orange_cat_128));
        //item.add(new SkillsItem("TROULOU",R.drawable.bluehome_300));
        return item;
    }
}
