package com.baqynra.withbaqyand.a3layoutpwpb;


import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.baqynra.withbaqyand.a3layoutpwpb.adapter.SectionsPageAdapter;
import com.baqynra.withbaqyand.a3layoutpwpb.fragment.Tab1Fragment;
import com.baqynra.withbaqyand.a3layoutpwpb.fragment.Tab2Fragment;
import com.baqynra.withbaqyand.a3layoutpwpb.fragment.Tab3Fragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "PROFILE");
        adapter.addFragment(new Tab2Fragment(), "SOSMED");
        adapter.addFragment(new Tab3Fragment(), "LAYOUT");
        viewPager.setAdapter(adapter);
    }
}
