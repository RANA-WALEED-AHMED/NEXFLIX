
package com.example.netflix;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        getWindow().setStatusBarColor(Color.BLACK);
        getWindow().setNavigationBarColor(Color.BLACK);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, ProfilesActivity.class);
            startActivity(intent);
            finish();
        }, 2000);
    }
}
