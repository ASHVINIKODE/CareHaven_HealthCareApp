package com.training.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HealthAnalysis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_health_analysis);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openHeartBP(View view) {
        Intent intent = new Intent(this, heartBP.class);
        startActivity(intent);
    }
    public void openWeightBMI(View view) {
        Intent intent = new Intent(this, WeightBMI.class);
        startActivity(intent);
    }
    public void openBloodSugarLevels(View view) {
        Intent intent = new Intent(this, BloodSugarLevel.class);
        startActivity(intent);
    }
    public void openDoctorInsight(View view) {
        Intent intent = new Intent(this, DoctorInsight.class);
        startActivity(intent);
    }
    public void openOverallHealthSummary(View view) {
        Intent intent = new Intent(this, OverallHealthSummary.class);
        startActivity(intent);
    }
}