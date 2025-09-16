package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the Spinner from the layout file by its ID.
        Spinner spinner = findViewById(R.id.languageSpinner);
// Create an ArrayAdapter using the string array from strings.xml and a default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.languages_array,// Reference to the string array defined in strings.xml
                android.R.layout.simple_spinner_item // A default layout for the spinner's items
        );
// Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner.
        spinner.setAdapter(adapter);

        // Set an event listener to handle item selection.
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
// Get the selected item's text from the parent AdapterView.
                String selectedItem = parent.getItemAtPosition(position).toString();
// Show a toast message with the selected item.
                Toast.makeText(MainActivity.this, "Selected: " + selectedItem,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
// This method is called when no item is selected.
// You can add logic here if needed.
            }
        });
    }
}
