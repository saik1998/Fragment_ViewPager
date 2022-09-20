package com.firstapp.fragment_viewpager;

import static com.firstapp.fragment_viewpager.R.id.tablayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity  {
    Fragment fragment;
    TabLayout tabLayout;
    ViewPager viewPager;
    MyPagerAdapter myPagerAdapter;

    TextView textContent0,textContent1,textContent2,textContent3;
    LinearLayout linearLayout;

    String[] tabTitle={"android", "apple", "linux", "windows"};
//    String tabTitle2="apple";
//    String tabTitle3="linux";
//    String tabTitle4="windows";



    LinearLayout tabLinearlayout0,tabLinearlayout1,tabLinearlayout2,tabLinearlayout3;

    ActionBar actionBar;
    int[] ICONS=new int[]{R.drawable.android,
           R.drawable.apple,
           R.drawable.windows,
           R.drawable.lunix};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint("WrongViewCast") TabLayout tabLayout=findViewById(tablayout);

        myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager(),getLifecycle());
//        viewPager.setAdapter(myPagerAdapter);
//        viewPager.setAdapter();
//        tabLayout.setupWithViewPager(viewPager);

        tabLinearlayout0= (LinearLayout) LayoutInflater.from(this).inflate(R.layout.custom_design,null);
        textContent0=(TextView)tabLinearlayout1.findViewById(tablayout);
        textContent0.setText(" "+tabTitle[0]);
        textContent0.setCompoundDrawablesWithIntrinsicBounds(ICONS[0],0,0,0);
        tabLayout.addTab(tabLayout.newTab().setCustomView(textContent0));

        tabLinearlayout1= (LinearLayout) LayoutInflater.from(this).inflate(R.layout.custom_design,null);
        textContent1=(TextView)tabLinearlayout1.findViewById(R.id.tablayout);
        textContent1.setText(" "+tabTitle[0]);
        textContent1.setCompoundDrawablesWithIntrinsicBounds(0,ICONS[1],0,0);
        tabLayout.addTab(tabLayout.newTab().setCustomView(textContent1));

        tabLinearlayout2= (LinearLayout) LayoutInflater.from(this).inflate(R.layout.custom_design,null);
        textContent2=(TextView)tabLinearlayout1.findViewById(R.id.tablayout);
        textContent2.setText(" "+tabTitle[1]);
        textContent2.setCompoundDrawablesWithIntrinsicBounds(0,ICONS[2],0,0);
        tabLayout.addTab(tabLayout.newTab().setCustomView(textContent2));

        tabLinearlayout3= (LinearLayout) LayoutInflater.from(this).inflate(R.layout.custom_design,null);
        textContent3=(TextView)tabLinearlayout1.findViewById(R.id.tablayout);
        textContent3.setText(" "+tabTitle[2]);
        textContent3.setCompoundDrawablesWithIntrinsicBounds(0,0,ICONS[3],0);
        tabLayout.addTab(tabLayout.newTab().setCustomView(textContent3));


//        tabLinearlayout4= (LinearLayout) LayoutInflater.from(this).inflate(R.layout.custom_design,null);
//        textContent4=tabLinearlayout1.findViewById(R.id.tab_content);
//        textContent4.setText(" "+tabTitle[3]);
//        textContent4.setCompoundDrawablesWithIntrinsicBounds(0,0,0,R.drawable.windows);
//        tabLayout.addTab(tabLayout.newTab().setCustomView(textContent4));




        viewPager=findViewById(R.id.viewPager);

//        myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager(),getLifecycle());


        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });





//        for(int i=0;i<tabLayout.)




//        tabLayout.getTabAt(0).setIcon(ICONS[0]);
//        tabLayout.getTabAt(1).setIcon(ICONS[1]);
//        tabLayout.getTabAt(2).setIcon(ICONS[2]);
//        tabLayout.getTabAt(3).setIcon(ICONS[3]);





//        tabLayout.getTabAt(0).setIcon(R.drawable.android);
//        tabLayout.getTabAt(1).setIcon(R.drawable.apple);
//        tabLayout.getTabAt(2).setIcon(R.drawable.windows);
//        tabLayout.getTabAt(3).setIcon(R.drawable.lunix);
    }



}