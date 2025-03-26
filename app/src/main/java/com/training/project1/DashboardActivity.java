package com.training.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Find buttons
        Button btnDoctorDashboard = findViewById(R.id.btnDoctorDashboard);
        Button btnProfile = findViewById(R.id.button1); // Profile button
        Button btnPatient = findViewById(R.id.button2); // Patient button

        // Navigate to DoctorDashboard
        btnDoctorDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, DoctorDashboard.class);
                startActivity(intent);
            }
        });

        // Navigate to NewActivity (Profile)
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, NewActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to Scroll (Patient)
        btnPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, Scroll.class);
                startActivity(intent);
            }
        });
    }
}