package com.example.dell.wifipositionwithfrontend;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.Window;
import android.view.WindowManager;

import com.example.dell.wifipositionwithfrontend.fragments.MySlide;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;


public class IntroActivity extends AppIntro {
    // 要申请的权限
    String[] permissionStr = new String[]{
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE};

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN ,WindowManager.LayoutParams. FLAG_FULLSCREEN);
//        addSlide(AppIntroFragment.newInstance("开发中的室内定位", "copyright © 2017\n即将上市有限公司", R.mipmap.logo, Color.parseColor("#aa96da"), Color.BLACK, Color.BLACK));
//        addSlide(AppIntroFragment.newInstance("This is Title2", "Long Description......", R.drawable.ic_arrow_back_white, Color.parseColor("#ff9a00")));
        addSlide(AppIntroFragment.newInstance("This is Title3", "Long Description......", R.drawable.ic_arrow_back_white, Color.parseColor("#ff165d")));
//        addSlide(AppIntroFragment.newInstance("This is Title 4", "A Looooong Des", R.drawable.ic_arrow_back_white, Color.parseColor("#ff165d"), Color.WHITE, Color.WHITE));
        addSlide(MySlide.newInstance(R.layout.fragment_sample_slide, Color.parseColor("#3f72af")));
        addSlide(MySlide.newInstance(R.layout.fragment_sample_slide2, Color.parseColor("#e23e57")));
//        askForPermissions(permissionStr, 2);
//        setColorTransitionsEnabled(true);


        // Hide Skip/Done button.e
        showSkipButton(false);
//        setProgressButtonEnabled(false);

        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permission in Manifest.
//        setVibrate(true);
//        setVibrateIntensity(30);


        // Set Animation
//        setFlowAnimation();
//        setFadeAnimation();
//        setZoomAnimation();
//        setDepthAnimation();
//        setSlideOverAnimation();





    }


    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
