package com.js.passingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName=(EditText) findViewById(R.id.userName);
        password=(EditText) findViewById(R.id.password);
    }

    public void OnLogin(View view) {
          String srtUser=userName.getText().toString();
         String strPassword=password.getText().toString();





         if(srtUser.equalsIgnoreCase("Admin")&&strPassword.equals("pass@123"))
         {
             Intent intent = new Intent(this,Home.class);
             //Vulnerability issue pass one encryped key
             //to avoid to access second (Home) activity directly calling from android consol
             intent.putExtra("key","encrypted key");
             intent.putExtra("name","Ganesh");

             startActivity(intent);
         }
         else
         {
             Toast toast=Toast.makeText(getApplicationContext(),"Invalid User Name/Password",Toast.LENGTH_SHORT);
             toast.setMargin(80,80);
             toast.show();

         }


    }
}
