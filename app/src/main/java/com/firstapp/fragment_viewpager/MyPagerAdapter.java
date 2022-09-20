package com.firstapp.fragment_viewpager;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.google.android.material.tabs.TabLayout;

public class MyPagerAdapter extends FragmentStateAdapter {


    Fragment fragment;
    String string;
    int image;
    LinearLayout linearLayout;
    TextView textView;
    TabLayout mTabLayout;


    public MyPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        fragment = new Fragment();
//
        switch (position) {
            case 0:
                fragment = new AndroidFragment();

                break;
            case 1:
                fragment = new IosFragment();
                break;
            case 2:
                fragment = new WindowsFragment();
                break;
            case 3:
                fragment = new LinuxFragment();
                break;
        }
//
            return fragment;
        }



        @Override
        public int getItemCount () {
            return 4;
        }
    }


//    Fragment fragment;
//    String string;
//    int image;
//    LinearLayout linearLayout;
//    TextView textView;
//    TabLayout mTabLayout;
//
//    public MyPagerAdapter(@NonNull FragmentManager fm) {
//        super(fm);
//    }
//
////    LinearLayout tabLinearLayout = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.activity_main, null);
////    TabLayout tabContent = tabLinearLayout.findViewById(R.id.tab_content);
////    tabContent.setText("  "+getApplicationContext().getResources().getString(tabTitles[i]));
////    tabContent.setCompoundDrawablesWithIntrinsicBounds(tabIcons[i], 0, 0, 0);
////    mTabLayout.getTabAt(i).setCustomView(tabContent);
//
//    @NonNull
//    @Override
//    public Fragment getItem(int position) {
//        fragment=new Fragment();
//
//        switch (position){
//            case 0:
//                fragment=new AndroidFragment();
//
//                break;
//            case 1:
//                fragment=new IosFragment();
//                break;
//            case 2:
//                fragment=new WindowsFragment();
//                break;
//            case 3:
//                fragment=new LinuxFragment();
//                break;
//
//        }
////        @Override
////        public Fragment getItem(int position) {
////            if(position == 0) return new FirstFragment();
////            if(position == 1) return new SecoundFragment();
////            if(position == 2) return new LoginFragment();
////            throw new IllegalStateException("Position is unexpectedly " + position);
//
//
//
//        return fragment;
//
//    }
//
//    @Override
//    public int getCount() {
//        return 4;
//    }
//
//    @Nullable
//    @Override
//    public CharSequence getPageTitle(int position) {
//        switch (position)
//        {
//
//            case 0:
////                image=R.drawable.android;
//                string="Android";
//                break;
//            case 1:
////                image=R.drawable.apple;
//                string="Apple";
//
//                break;
//            case 2:
////                image=R.drawable.windows;
//                string="Windows";
//
//                break;
//            case 3:
////                image=R.drawable.lunix;
//                string="Lunix";
//
//
//        }
//
//        return string;
//    }

