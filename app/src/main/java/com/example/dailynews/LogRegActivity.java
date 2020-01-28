package com.example.dailynews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogRegActivity extends AppCompatActivity {

    private Button joinBtn, logRegBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_reg);

        joinBtn = findViewById(R.id.joinNowBtn);
        logRegBtn = findViewById(R.id.logOregBtn);

        joinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LogRegActivity.this, RegistrationActivity.class);
                startActivity(i);
            }
        });

        logRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LogRegActivity.this, LoginActivity.class);
                startActivity(i);
            }
        });

    }
}
