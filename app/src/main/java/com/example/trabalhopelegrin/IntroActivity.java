package com.example.trabalhopelegrin;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(IntroActivity.this, MainActivity.class));
            finish(); // "noHistory" na prática
        }, 5000);
    }
}