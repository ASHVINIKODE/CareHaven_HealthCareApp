package com.training.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EPrescriptionActivity extends AppCompatActivity {

    private EditText editPatientName, editMedicineDetails, editDosage, editInstructions;
    private Button btnGeneratePrescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eprescription);

        // Initialize UI Elements
        editPatientName = findViewById(R.id.editPatientName);
        editMedicineDetails = findViewById(R.id.editMedicineDetails);
        editDosage = findViewById(R.id.editDosage);
        editInstructions = findViewById(R.id.editInstructions);
        btnGeneratePrescription = findViewById(R.id.btnGeneratePrescription);

        // Button Click Listener
        btnGeneratePrescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generatePrescription();
            }
        });
    }

    // Method to Generate Prescription (Replace with API or Database Integration)
    private void generatePrescription() {
        String patientName = editPatientName.getText().toString().trim();
        String medicineDetails = editMedicineDetails.getText().toString().trim();
        String dosage = editDosage.getText().toString().trim();
        String instructions = editInstructions.getText().toString().trim();

        if (patientName.isEmpty() || medicineDetails.isEmpty() || dosage.isEmpty() || instructions.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Mock Prescription Generation (Replace with real logic)
        String prescription = "Patient: " + patientName + "\nMedicine: " + medicineDetails +
                "\nDosage: " + dosage + "\nInstructions: " + instructions;

        Toast.makeText(this, "Prescription Generated:\n" + prescription, Toast.LENGTH_LONG).show();
    }
}