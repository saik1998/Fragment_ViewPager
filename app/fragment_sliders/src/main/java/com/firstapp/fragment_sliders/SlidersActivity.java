package com.firstapp.fragment_sliders;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

public class SlidersActivity extends AppCompatActivity {
    ViewPager2 viewPager2;
    SliderAdapter sliderAdapter;
    int[] drawables={R.drawable.tele1,R.drawable.tele2,R.drawable.tele3,R.drawable.tele4,R.drawable.tele5,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sliders);

        viewPager2=findViewById(R.id.viewpager2);
        sliderAdapter=new SliderAdapter(getApplicationContext(),drawables);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);
        viewPager2.setAdapter(sliderAdapter);


        CompositePageTransformer compositePageTransformer=new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(8));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float v=1-Math.abs(position);
                page.setScaleY(0.8f+v*0.2f);
            }
        });
        viewPager2.setPageTransformer(compositePageTransformer);
    }
}