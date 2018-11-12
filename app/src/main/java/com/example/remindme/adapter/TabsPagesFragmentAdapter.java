package com.example.remindme.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.remindme.adapter.fragment.ExampleFragment;

public class TabsPagesFragmentAdapter extends FragmentPagerAdapter {
    private String[] tabs;
    public TabsPagesFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{
                "Напоминания",
                "Избранное",
                "Tab 2",
                "Tab 3"
        };
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return ExampleFragment.getInstance();
            case 1: return ExampleFragment.getInstance();
            case 2: return ExampleFragment.getInstance();
            case 3: return ExampleFragment.getInstance();
        }

        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
