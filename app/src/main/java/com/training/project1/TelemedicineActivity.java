package com.training.project1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TelemedicineActivity extends AppCompatActivity {

    private Button btnStartVideoCall, btnStartAudioCall, btnChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telemedicine);

        // Initialize buttons
        btnStartVideoCall = findViewById(R.id.btnStartVideoCall);
        btnStartAudioCall = findViewById(R.id.btnStartAudioCall);
        btnChat = findViewById(R.id.btnChat);

        // Video Call Button Click
        btnStartVideoCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startVideoCall();
            }
        });

        // Audio Call Button Click
        btnStartAudioCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAudioCall();
            }
        });

        // Chat Button Click
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChat();
            }
        });
    }

    // Method to start a video call (Replace with actual API integration)
    private void startVideoCall() {
        Toast.makeText(this, "Starting Video Call...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/"));
        startActivity(intent);
    }

    // Method to start an audio call (Replace with actual API integration)
    private void startAudioCall() {
        Toast.makeText(this, "Starting Audio Call...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"));
        startActivity(intent);
    }

    // Method to start a chat (Replace with actual API integration)
    private void startChat() {
        Toast.makeText(this, "Opening Chat...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://web.whatsapp.com/"));
        startActivity(intent);
    }
}