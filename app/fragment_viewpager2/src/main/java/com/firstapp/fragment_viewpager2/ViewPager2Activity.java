package com.firstapp.fragment_viewpager2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ViewPager2Activity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;

    MyPager2Adapter myPager2Adapter;
    BadgeDrawable badgeDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager2);

        tabLayout=findViewById(R.id.tablayout);
        viewPager2=findViewById(R.id.viewPager2);

        myPager2Adapter=new MyPager2Adapter(getSupportFragmentManager(),getLifecycle());
        viewPager2.setAdapter(myPager2Adapter);

        tabLayout.addTab(tabLayout.newTab().setText("one"));
        tabLayout.addTab(tabLayout.newTab().setText("Two"));


        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position)
                {
                    case 0:
                        tab.setIcon(R.drawable.ic_launcher_background);
                        tab.setText("Android");
                        badgeDrawable=tab.getOrCreateBadge();
                        badgeDrawable.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.teal_700));
                        badgeDrawable.setVisible(true);
                        badgeDrawable.setNumber(30);
                        badgeDrawable.setMaxCharacterCount(3);
                        break;

                    case 1:
                        tab.setIcon(R.drawable.ic_launcher_background);
                        tab.setText("Kotiln");
                        badgeDrawable=tab.getOrCreateBadge();
                        badgeDrawable.setBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.teal_700));
                        badgeDrawable.setVisible(true);
                        badgeDrawable.setNumber(30);
                        badgeDrawable.setMaxCharacterCount(3);
                        break;
                }
            }
        });
        tabLayoutMediator.attach();

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

                badgeDrawable=tabLayout.getTabAt(position).getOrCreateBadge();
                badgeDrawable.setVisible(false);
            }
        });


    }
}