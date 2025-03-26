package com.training.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Scroll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
    }

    public void openAppointments(View view) {
        Intent intent = new Intent(this, Appointment.class);
        startActivity(intent);
    }

    public void openMedicalRecord(View view) {
        Intent intent = new Intent(this, MedicalRecord.class);
        startActivity(intent);
    }

    public void openTelemedicine(View view) {
        Intent intent = new Intent(this, medicine.class);
        startActivity(intent);
    }

    public void openMedicationReminders(View view) {
        Intent intent = new Intent(this, medicationReminder.class);
        startActivity(intent);
    }

    public void openHealthAnalytics(View view) {
        Intent intent = new Intent(this, HealthAnalysis.class);
        startActivity(intent);
    }

    public void openEmergencyContact(View view) {
        Intent intent = new Intent(this, EmergencyContact.class);
        startActivity(intent);
    }

    public void goBack(View view) {
        finish(); // Closes this activity and goes back
    }
}
