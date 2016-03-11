package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method is called when a button is pressed
    public void launchApp(View view) {
        Button button = (Button) view;
        String appName = button.getText().toString();

        Toast.makeText(getApplicationContext(), "This button will launch " + appName, Toast.LENGTH_SHORT).show();
    }
}
