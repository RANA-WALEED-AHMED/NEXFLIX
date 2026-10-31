
package com.example.netflix;

import android.os.Bundle;
import android.content.Intent;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class ProfilesActivity extends AppCompatActivity {

    LinearLayout waleedProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiles);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        waleedProfile = findViewById(R.id.waleedProfile);

        waleedProfile.setOnClickListener(v -> {
            Intent intent = new Intent(ProfilesActivity.this, PinActivity.class);
            startActivity(intent);
        });
    }
}
