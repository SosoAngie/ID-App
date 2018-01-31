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
import java.util.ArrayList;
import java.util.List;

/**
 * Created by angie on 30/01/18.
 */

public class ProjectsFragment extends Fragment {

    ListView projects;

    public ProjectsFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_projects, container, false);

        projects = (ListView) view.findViewById(R.id.listProjects);

        List<CustomItem> projectsItems = genererItem();

        CustomListAdapter projectsListAdapter = new CustomListAdapter(getActivity().getBaseContext(),projectsItems);
        projects.setAdapter(projectsListAdapter);

        return view;
    }

    private List<CustomItem> genererItem(){
        List<CustomItem> item = new ArrayList<CustomItem>();
        item.add(new CustomItem("TROULOU","zoeuvzubv"));
        item.add(new CustomItem("DIBIDI","zevuz"));
        item.add(new CustomItem("AKAKAKNA","fzvzuhiezh"));
        item.add(new CustomItem("PATAPATA","iuvziefi"));
        return item;
    }
}
