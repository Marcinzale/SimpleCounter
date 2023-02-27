package com.marcinzale.simplecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView value;
    int numberOfClicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment (View v) {
        numberOfClicks++;

        value = (TextView) findViewById(R.id.value);
        value.setText(""+numberOfClicks);
    }
    public void decrement (View v) {
        numberOfClicks--;
        value = (TextView) findViewById(R.id.value);
        value.setText(""+numberOfClicks);
    }
}