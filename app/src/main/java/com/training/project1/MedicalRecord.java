package com.training.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MedicalRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medical_record);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openPrescriptions(View view) {
        Intent intent = new Intent(this, prescription.class);
        startActivity(intent);
    }
    public void openLabReport(View view) {
        Intent intent = new Intent(this, LabReport.class);
        startActivity(intent);
    }
    public void openDiagnosisHistory(View view) {
        Intent intent = new Intent(this, DiagnosisHistory.class);
        startActivity(intent);
    }
    public void openViewAllRecords(View view) {
        Intent intent = new Intent(this, ViewAllRecord.class);
        startActivity(intent);
    }
    public void openUploadRecords(View view) {
        Intent intent = new Intent(this, UploadRecords.class);
        startActivity(intent);
    }
}
