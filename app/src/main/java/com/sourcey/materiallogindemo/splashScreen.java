package com.sourcey.materiallogindemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(splashScreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withBackgroundColor(Color.parseColor("#E43F3F"))
                .withLogo(R.drawable.logo)
                //.withHeaderText("Welcome Guest !!!")
                .withFooterText("Copyright 2018")
                .withBeforeLogoText("You Can Make Real Money with");
                //.withAfterLogoText("Time is Money");

        //Set Text Color
        //config.getHeaderTextView().setTextColor(android.graphics.Color.WHITE);
        config.getFooterTextView().setTextColor(android.graphics.Color.WHITE);
        //config.getAfterLogoTextView().setTextColor(android.graphics.Color.WHITE);
        config.getBeforeLogoTextView().setTextColor(android.graphics.Color.WHITE);

        //Set to view
        View view = config.create();
        setContentView(view);
    }
}
