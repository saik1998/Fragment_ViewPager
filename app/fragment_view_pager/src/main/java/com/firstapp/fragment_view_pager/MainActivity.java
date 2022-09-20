package com.firstapp.fragment_view_pager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import com.firstapp.fragment_view_pager.ui.Page1_Fragment;
import com.firstapp.fragment_view_pager.ui.Page_2Fragment;

public class MainActivity extends AppCompatActivity {


    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.main_container,new Page1_Fragment()).commit();

//        Page1_Fragment page1_fragment = new Page1_Fragment();
//
//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.main_container);
//
//        if (fragment == null) {
//            fm.beginTransaction()
//                    .add(R.id.fragment_1,fragment)
//                    .commit();
//
//            Page_2Fragment secondFragment = new Page_2Fragment();
//            fm.beginTransaction()
//                    .add(R.id.fragment_2, secondFragment)
//                    .commit();
//        }
    }


    public void page1(View view) {
        fragment=new Page1_Fragment();
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container,fragment);
        fragmentTransaction.commit();
    }

    public void page2(View view) {
        fragment=new Page_2Fragment();
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_container,fragment);
        fragmentTransaction.commit();
    }
}

