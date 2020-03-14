package com.jetec.viewpagerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<View> mPages = new ArrayList<>();
        for (int i=0;i<5;i++) {
            mPages.add(new Pagers(this, (i + 1)));
        }

        ViewPager viewPager = findViewById(R.id.mViewPager);
        TabLayout tab = findViewById(R.id.tab);
        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(mPages);

        tab.setupWithViewPager(viewPager);
        viewPager.setAdapter(myPagerAdapter);
        viewPager.setCurrentItem(0);//指定跳到某頁，一定得設置在setAdapter後面
    }
}
