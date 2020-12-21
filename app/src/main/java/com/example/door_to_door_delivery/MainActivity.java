package com.example.door_to_door_delivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.door_to_door_delivery.Adapter_Fragement_Main_Activity.FragementLayoutAdapter_Main;
import com.example.door_to_door_delivery.Fragements_Main_Activity.Fragement1;
import com.example.door_to_door_delivery.Fragements_Main_Activity.Fragement2;
import com.example.door_to_door_delivery.Fragements_Main_Activity.Fragement3;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager home_viewpager;
    PagerAdapter home_pageradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        List<Fragment> fragementslist = new ArrayList<>();

        fragementslist.add(new Fragement1());
        fragementslist.add(new Fragement2());
        fragementslist.add(new Fragement3());


        home_viewpager = findViewById(R.id.home_viewpager);
        home_pageradapter = new FragementLayoutAdapter_Main(getSupportFragmentManager(),fragementslist);
        home_viewpager.setAdapter(home_pageradapter);


    }
}