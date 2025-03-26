package com.training.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class medicine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_medicine);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openUpcomingConsultation(View view) {
        Intent intent = new Intent(this, UpcomingConsultations.class);
        startActivity(intent);
    }
    public void openPastConsultation(View view) {
        Intent intent = new Intent(this, PastConsultation.class);
        startActivity(intent);
    }
    public void openJoinConsultation(View view) {
        Intent intent = new Intent(this, JoinConsultation.class);
        startActivity(intent);
    }
    public void openScheduleConsultation(View view) {
        Intent intent = new Intent(this, ScheduleConsultation.class);
        startActivity(intent);
    }
    public void openViewDoctors(View view) {
        Intent intent = new Intent(this, ViewDoctors.class);
        startActivity(intent);
    }
}
