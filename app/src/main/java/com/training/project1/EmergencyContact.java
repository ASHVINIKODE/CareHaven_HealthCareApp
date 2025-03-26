package com.training.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EmergencyContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_emergency_contact);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openHospitalsClinics(View view) {
        Intent intent = new Intent(this, HospitalsClinics.class);
        startActivity(intent);
    }
    public void openAmbulanceService(View view) {
        Intent intent = new Intent(this, AmbulanceService.class);
        startActivity(intent);
    }
    public void openSavedEmergencies(View view) {
        Intent intent = new Intent(this, SavedEmegencies.class);
        startActivity(intent);
    }
    public void openAddEmergencyContact(View view) {
        Intent intent = new Intent(this, AddEmegencies.class);
        startActivity(intent);
    }
    public void openCallEmergencyContact(View view) {
        Intent intent = new Intent(this, CallEmergencies.class);
        startActivity(intent);
    }
}
