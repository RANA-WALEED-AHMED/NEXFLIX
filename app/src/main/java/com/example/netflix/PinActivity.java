
package com.example.netflix;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PinActivity extends AppCompatActivity {

    EditText pinInput;
    Button continueButton;
    TextView errorMessage;

    private final String correctPin = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        pinInput = findViewById(R.id.pinInput);
        continueButton = findViewById(R.id.continueButton);
        errorMessage = findViewById(R.id.errorMessage);

        continueButton.setOnClickListener(v -> {

            String enteredPin = pinInput.getText().toString();

            if (enteredPin.equals(correctPin)) {

                errorMessage.setText("PIN Accepted!");

            } else {

                errorMessage.setText("Incorrect PIN. Try Again!");
                pinInput.setText("");

            }
        });
    }
}
