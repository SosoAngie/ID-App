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

public class ExpFragment extends Fragment {

    ListView exp;

    public ExpFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exp, container, false);

        exp = (ListView) view.findViewById(R.id.listExp);

        List<CustomItem> expItems = genererItem();

        CustomListAdapter expListAdapter = new CustomListAdapter(getActivity().getBaseContext(),expItems);
        exp.setAdapter(expListAdapter);

        return view;
    }

    private List<CustomItem> genererItem(){
        List<CustomItem> item = new ArrayList<CustomItem>();
        item.add(new CustomItem("BLOU BLOU","zoeuvzubv"));
        item.add(new CustomItem("LA LA LA","zevuz"));
        item.add(new CustomItem("ICH ICHI CHI","fzvzuhiezh"));
        item.add(new CustomItem("PATAPATA","iuvziefi"));
        return item;
    }
}
