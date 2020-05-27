package com.js.ageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText getDob;
    TextView showAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDob = (EditText) findViewById(R.id.dob);
        showAge= (TextView) findViewById(R.id.output);





    }

    public void clickEvent(View view) {
        Calendar calendar = Calendar.getInstance();
        int cyear = calendar.get(Calendar.YEAR);
        int DOB= Integer.parseInt(getDob.getText().toString());

        int finalAge = cyear-DOB;
        showAge.setText("Your Age Is::"+String.valueOf(finalAge));
        showAge.setTextColor(Color.GREEN);


    }
}
