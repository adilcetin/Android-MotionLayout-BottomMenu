package com.example.motionlayout_experiment;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    boolean active = false;
    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MotionLayout motionLayout = findViewById(R.id.motionLayout);
        motionLayout.transitionToStart();
        motionLayout.transitionToEnd();

        findViewById(R.id.main_layout_mail).setOnClickListener(v -> motionLayout.transitionToState(R.id.homeScene, 200));
        findViewById(R.id.main_layout_browser).setOnClickListener(v -> motionLayout.transitionToState(R.id.browserScene, 200));

        findViewById(R.id.main_layout_whatsapp).setOnClickListener(v -> motionLayout.transitionToState(R.id.whatsappScene, 200));

        findViewById(R.id.main_layout_home).setOnClickListener(v -> motionLayout.transitionToState(R.id.mailScene, 200));
    }
}