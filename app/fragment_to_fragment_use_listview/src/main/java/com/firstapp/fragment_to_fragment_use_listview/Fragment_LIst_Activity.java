package com.firstapp.fragment_to_fragment_use_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Fragment_LIst_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_list);

        getSupportFragmentManager().beginTransaction().add(R.id.main_container1,new List1_Fragment()).commit();
    }
}