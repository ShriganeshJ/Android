package com.js.sqllite;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    TextView welcome;
    String key;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        welcome = (TextView) findViewById(R.id.welcome);

        Bundle bundle = getIntent().getExtras();

        key=bundle.getString("Key");

        if(key.equals("123"))
        {
            welcome.setText(bundle.getString("userName"));

            Toast.makeText(getApplicationContext(),bundle.getString("userName"),Toast.LENGTH_LONG).show();
        }




    }



}
