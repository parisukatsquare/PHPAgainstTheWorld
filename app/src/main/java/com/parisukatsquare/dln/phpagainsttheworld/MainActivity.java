package com.parisukatsquare.dln.phpagainsttheworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertAmount(View view) {

        Log.i("Info", "Test");

        EditText editTextAmount = (EditText) findViewById(R.id.editTextAmount);

       double convertedValue = Double.parseDouble(editTextAmount.getText().toString()) * 0.020;

        Log.i("Info", "Value in Dollars: " + convertedValue);
        Toast.makeText(this, "Value in Dollars: $" + String.format("%.2f", convertedValue), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
