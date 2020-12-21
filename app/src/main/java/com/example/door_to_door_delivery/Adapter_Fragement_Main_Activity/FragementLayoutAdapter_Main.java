package com.example.door_to_door_delivery.Adapter_Fragement_Main_Activity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class FragementLayoutAdapter_Main extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList;
    public FragementLayoutAdapter_Main(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);

    }

    @Override
    public int getCount() {
        return fragmentList.size();

    }
}

