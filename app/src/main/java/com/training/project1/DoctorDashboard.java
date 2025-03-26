package com.training.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DoctorDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_dashboard);

        // Initialize Buttons
        Button btnScheduleManagement = findViewById(R.id.btnScheduleManagement);
        Button btnTelemedicine = findViewById(R.id.btnTelemedicine);
        Button btnEPrescription = findViewById(R.id.btnEPrescription);
        Button btnBack = findViewById(R.id.btnBack); // Back Button

        // Button Click Listeners
        btnScheduleManagement.setOnClickListener(v -> openActivity(ScheduleManagementActivity.class));
        btnTelemedicine.setOnClickListener(v -> openActivity(TelemedicineActivity.class));
        btnEPrescription.setOnClickListener(v -> openActivity(EPrescriptionActivity.class));

        // Navigate Back to DashboardActivity
        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(DoctorDashboard.this, DashboardActivity.class);
            startActivity(intent);
            finish(); // Close DoctorDashboard after navigating back
        });
    }

    // Generic Method to Open Activities
    private void openActivity(Class<?> activityClass) {
        Intent intent = new Intent(DoctorDashboard.this, activityClass);
        startActivity(intent);
    }
}