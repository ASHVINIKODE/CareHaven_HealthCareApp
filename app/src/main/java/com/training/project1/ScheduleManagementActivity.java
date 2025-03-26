//package com.training.project1;
//
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.ListView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ScheduleManagementActivity extends AppCompatActivity {
//
//    private ListView scheduleListView;
//    private List<String> scheduleList;
//    private ArrayAdapter<String> adapter;
//    private Button btnAddSlot;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_schedule_management);
//
//        // Initialize ListView & Button
//        scheduleListView = findViewById(R.id.scheduleListView);
//        btnAddSlot = findViewById(R.id.btnAddSlot);
//
//        // Dummy Schedule Data (Replace with database later)
//        scheduleList = new ArrayList<>();
//        scheduleList.add("Monday - 9:00 AM to 12:00 PM");
//        scheduleList.add("Tuesday - 10:00 AM to 2:00 PM");
//        scheduleList.add("Wednesday - 3:00 PM to 6:00 PM");
//        scheduleList.add("Friday - 8:00 AM to 11:00 AM");
//
//        // Setup Adapter
//        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, scheduleList);
//        scheduleListView.setAdapter(adapter);
//
//        // Button Click Listener for Adding Slots
//        btnAddSlot.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                scheduleList.add("New Slot - 4:00 PM to 7:00 PM");
//                adapter.notifyDataSetChanged();
//                Toast.makeText(ScheduleManagementActivity.this, "New schedule slot added!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        // Item Click Listener to Remove Slot
//        scheduleListView.setOnItemClickListener((parent, view, position, id) -> {
//            String selectedSlot = scheduleList.get(position);
//            scheduleList.remove(position);
//            adapter.notifyDataSetChanged();
//            Toast.makeText(ScheduleManagementActivity.this, "Removed: " + selectedSlot, Toast.LENGTH_SHORT).show();
//        }
package com.training.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ScheduleManagementActivity extends AppCompatActivity {

    private ListView scheduleListView;
    private List<String> scheduleList;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_management);

        initializeViews();
        initializeScheduleList();
        setupAdapter();
        setupButtonClickListener();
        setupItemClickListener();
    }

    private void initializeViews() {
        scheduleListView = findViewById(R.id.scheduleListView);
        Button btnAddSlot = findViewById(R.id.btnAddSlot);
    }

    private void initializeScheduleList() {
        scheduleList = new ArrayList<>();
        scheduleList.add("Monday - 9:00 AM to 12:00 PM");
        scheduleList.add("Tuesday - 10:00 AM to 2:00 PM");
        scheduleList.add("Wednesday - 3:00 PM to 6:00 PM");
        scheduleList.add("Friday - 8:00 AM to 11:00 AM");
    }

    private void setupAdapter() {
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, scheduleList);
        scheduleListView.setAdapter(adapter);
    }

    private void setupButtonClickListener() {
        Button btnAddSlot = findViewById(R.id.btnAddSlot);
        btnAddSlot.setOnClickListener(v -> {
            scheduleList.add("New Slot - 4:00 PM to 7:00 PM");
            adapter.notifyDataSetChanged();
            Toast.makeText(ScheduleManagementActivity.this, "New schedule slot added!", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupItemClickListener() {
        scheduleListView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedSlot = scheduleList.get(position);
            scheduleList.remove(position);
            adapter.notifyDataSetChanged();
            Toast.makeText(ScheduleManagementActivity.this, "Removed: " + selectedSlot, Toast.LENGTH_SHORT).show();
        });
    }
}