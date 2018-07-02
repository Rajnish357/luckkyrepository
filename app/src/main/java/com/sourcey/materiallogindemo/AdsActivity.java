package com.sourcey.materiallogindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AdsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads);
    }


    @Override
    public void onBackPressed() {
        // Disable going back to the MainActivity
        finish();
        startActivity(new Intent(this,MainActivity.class));
    }
}
