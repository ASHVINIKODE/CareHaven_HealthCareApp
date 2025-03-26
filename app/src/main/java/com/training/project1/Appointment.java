package com.training.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Appointment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_appointment);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void openUpcomingAppointments(View view) {
        Intent intent = new Intent(this, UpcomingAppoints.class);
        startActivity(intent);
    }
    public void openPastAppointments(View view){
        Intent intent = new Intent(this, PastAppoints.class);
        startActivity(intent);
    }
    public void openBookNewAppointments(View view){
        Intent intent = new Intent(this, BookNewAppoints.class);
        startActivity(intent);
    }
    public void openRescheduleAppointments(View view){
        Intent intent = new Intent(this, RescheduleAppoints.class);
        startActivity(intent);
    }
    public void openCancelAppointments(View view){
        Intent intent = new Intent(this, CancelAppoints.class);
        startActivity(intent);
    }
}
