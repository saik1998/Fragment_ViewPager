package com.firstapp.fragment_viewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyPager2Adapter extends FragmentStateAdapter {
    public MyPager2Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment=new Fragment();
        switch (position)
        {
            case 0:
                fragment=new OneFragment();
                break;
            case 1:
                fragment=new TwoFragment();
                break;

        }


        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
