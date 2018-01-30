package com.example.angie.id_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.angie.id_app.fragments.HomeFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        HomeFragment fragment = new HomeFragment();
        getFragmentManager().beginTransaction()
                .add(R.id.fragment, fragment)
                .commit();
    }
}
