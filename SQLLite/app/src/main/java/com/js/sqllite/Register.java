package com.js.sqllite;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    EditText userName;
    EditText password;
    private String strUserName;
    private String strPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);




    }


    public void OnLogIn(View view) {

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void OnRegister(View view) {




        strUserName=" ";
        strPassword=" ";
        long stats;

        userName = (EditText)findViewById(R.id.name);
        password= (EditText) findViewById(R.id.password);

        strUserName=userName.getText().toString();
        strPassword=password.getText().toString();


        if(strUserName.length()>1&&strPassword.length()>1) {


            DBManager manager = new DBManager(this);

            //set values
            ContentValues values = new ContentValues();
            values.put(DBManager.ColUserName, strUserName);
            values.put(DBManager.ColPassWord, strPassword);

            stats = manager.InsertLoin(values);

            //clear text box
            userName.getText().clear();
            password.getText().clear();


            if (stats > 0) {
                Toast.makeText(getApplicationContext(), "Register", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);

            } else {
                Toast.makeText(getApplicationContext(), "Not Register", Toast.LENGTH_LONG).show();
            }


        }
        else
        {
            Toast.makeText(getApplicationContext(), "Please Enter User Name and Password", Toast.LENGTH_LONG).show();
            userName.getText().clear();
            password.getText().clear();
        }



    }
}
