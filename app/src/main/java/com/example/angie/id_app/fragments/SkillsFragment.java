package com.example.angie.id_app.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.example.angie.id_app.R;
import com.example.angie.id_app.model.SkillsItem;
import com.example.angie.id_app.model.SkillsListAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by angie on 30/01/18.
 */

public class SkillsFragment extends Fragment{

    ListView skills;

    String[] titles = {
            "Google Plus",
            "Twitter",
            "Windows",
            "Bing"  } ;

    Integer[] imageId = {
            R.drawable.androidcoffee_300,
            R.drawable.bonbon_300,
            R.drawable.cat_300,
            R.drawable.orange_cat_128 };

    public SkillsFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_skills, container, false);
        skills = (ListView) view.findViewById(R.id.listSkills);

        List<SkillsItem> skillsItems = generateItem();

        SkillsListAdapter skillsListAdapter = new SkillsListAdapter(getActivity().getBaseContext(),skillsItems);
        Log.d("itemCount before",Integer.toString(skillsListAdapter.getCount()));
        skills.setAdapter(skillsListAdapter);
        Log.d("itemCount after",Integer.toString(skillsListAdapter.getCount()));

        return view;
    }

    private List<SkillsItem> generateItem(){
        List<SkillsItem> item = new ArrayList<SkillsItem>();

        for(int i = 1; i <= 3; i++) {
            item.add(new SkillsItem(titles[i], getResources().getDrawable(imageId[i])));
        }
        return item;
    }
}
