package com.example.menu_barrainferior.ui.infos.model;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;


import com.example.menu_barrainferior.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class TesteDicas extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_os);

        ViewPager2 viewPager = findViewById(R.id.viewPager2);
        TabLayout tabLayout = findViewById(R.id.tabLayout2);

        int[] imageIds = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
        ImagePagerAdapter adapter = new ImagePagerAdapter(imageIds);
        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            // Customize the tab if necessary
        }).attach();
    }
}
