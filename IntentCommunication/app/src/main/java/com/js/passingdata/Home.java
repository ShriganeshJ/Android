package com.js.passingdata;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

     TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        text = (TextView) findViewById(R.id.welcome);

        Bundle b = getIntent().getExtras();

        String name = b.getString("name");

        text.setText("Welcome Mr."+name);




    }


    public void Onclose(View view) {
         finish();

    }
}

