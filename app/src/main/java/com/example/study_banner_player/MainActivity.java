package com.example.study_banner_player;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;

import android.app.PictureInPictureParams;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerAdapter;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //    private int[] img = {R.drawable.one, R.drawable.two, R.drawable.there, R.drawable.four};
    private List<Drawable> img = new ArrayList<>();
    private Banner banner;
    private ViewPager viewPager;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img.add(getDrawable(R.drawable.one));
        img.add(getDrawable(R.drawable.two));
        img.add(getDrawable(R.drawable.there));
        img.add(getDrawable(R.drawable.four));
        initBanner();
    }

    private void initBanner() {
        banner = findViewById(R.id.id_banner);
        banner.setAdapter(new BannerImageAdapter<Drawable>(img) {

            @Override
            public void onBindView(BannerImageHolder holder, Drawable data, int position, int size) {
holder.imageView.setImageDrawable(img.get(position));
            }
        });
    }}