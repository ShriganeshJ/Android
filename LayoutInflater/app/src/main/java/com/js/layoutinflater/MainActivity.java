package com.js.layoutinflater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //access other layout


    }

    public void Onsdhow(View view) {
        // communicate / access one layout to other layout
        LayoutInflater li = getLayoutInflater();
        View view1 = li.inflate(R.layout.displaylayout,null);
        //set value for another layout
        EditText userName= (EditText) view1.findViewById(R.id.editText);
        userName.setText("Ganesh");
        EditText password= (EditText) view1.findViewById(R.id.editText2);
        password.setText("Ganesh");
        Toast toast = new Toast(getApplicationContext());
        toast.setView(view1);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
        toast.show();



    }
}
