package com.example.angie.id_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.angie.id_app.fragments.HomeFragment;
import com.example.angie.id_app.fragments.MainFragment;

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



    public void OnDestroy(){
        super.onDestroy();
    }
}
