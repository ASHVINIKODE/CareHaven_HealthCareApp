package com.training.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class medicationReminder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medication_reminder);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openCurrentMedications(View view) {
        Intent intent = new Intent(this, CurrentMedications.class);
        startActivity(intent);
    }
    public void openMissedMedications(View view) {
        Intent intent = new Intent(this, MissedMedication.class);
        startActivity(intent);
    }
    public void openAddNewMedications(View view) {
        Intent intent = new Intent(this, AddNewMedication.class);
        startActivity(intent);
    }
    public void openSetEditReminders(View view) {
        Intent intent = new Intent(this, SetEditReminders.class);
        startActivity(intent);
    }
    public void openMedicationHistory(View view) {
        Intent intent = new Intent(this, MedicationHistory.class);
        startActivity(intent);
    }
}
