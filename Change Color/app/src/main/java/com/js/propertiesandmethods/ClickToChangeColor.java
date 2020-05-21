package com.js.propertiesandmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClickToChangeColor extends AppCompatActivity {
     Button tabButton;
    Button redButton;
    Button greenButton;
    Button orangeButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabButton  = (Button) findViewById(R.id.tab);
        redButton  = (Button) findViewById(R.id.red);
        greenButton  = (Button) findViewById(R.id.green);
        orangeButton  = (Button) findViewById(R.id.orange);

            //Red Color
        redButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tabButton.setBackgroundColor(Color.RED);
                tabButton.setText("RED");
                tabButton.setTextColor(Color.WHITE);
            }
        });


        //Green color

        greenButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tabButton.setBackgroundColor(Color.GREEN);
                tabButton.setText("GREEN");
                tabButton.setTextColor(Color.WHITE);
            }
        });

        //ornage button

        orangeButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                tabButton.setBackgroundColor(Color.MAGENTA);
                tabButton.setText("MAGENTA");
                tabButton.setTextColor(Color.WHITE);
            }
        });

    }


}
