package com.example.remindme.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.remindme.adapter.fragment.AbstractTabFragment;
import com.example.remindme.adapter.fragment.BirthDaysFragment;
import com.example.remindme.adapter.fragment.HistoryFragment;
import com.example.remindme.adapter.fragment.IdeasFragment;
import com.example.remindme.adapter.fragment.TodoFragment;

import java.util.HashMap;
import java.util.Map;

public class TabsPagesFragmentAdapter extends FragmentPagerAdapter {
    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsPagesFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int i) {
        return  tabs.get(i);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthDaysFragment.getInstance(context));
    }
}
