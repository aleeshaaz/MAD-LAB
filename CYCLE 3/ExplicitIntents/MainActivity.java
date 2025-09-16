package com.example.explicitintents;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private Button navigateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button from the layout file by its ID.
        navigateButton = findViewById(R.id.navigateButton);
// Set an OnClickListener on the button to handle clicks.
        navigateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// An explicit intent is used to launch a specific component (Activity).
// It requires two arguments: the current context and the target class.
                Intent explicitIntent = new Intent(MainActivity.this, SecondActivity.class);
                // Use startActivity() to execute the intent and launch the new activity.
                startActivity(explicitIntent);
            }
        });
    }
}
