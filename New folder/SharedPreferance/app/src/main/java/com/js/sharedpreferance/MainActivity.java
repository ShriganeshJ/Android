package com.js.sharedpreferance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name= (EditText) findViewById(R.id.name);
        password=(EditText) findViewById(R.id.password);

    }

    public void onLoad(View view) {

        SharedPreferanceLogic saveLogic = new SharedPreferanceLogic(this);
        Toast.makeText(getApplicationContext(),saveLogic.loadData().toString(),Toast.LENGTH_LONG).show();

    }

    public void onSave(View view) {

        SharedPreferanceLogic saveLogic = new SharedPreferanceLogic(this);
        saveLogic.saveData(name.getText().toString(),password.getText().toString());
    }
}
