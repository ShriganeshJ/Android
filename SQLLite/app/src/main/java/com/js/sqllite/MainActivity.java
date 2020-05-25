package com.js.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     EditText regUser;
     EditText regPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


    }


    public void onLogin(View view) {

        regUser=(EditText) findViewById(R.id.regUser);
        regPass=(EditText) findViewById(R.id.regPass);


        if(regUser.getText().toString().length()>1&&regUser.getText().toString().length()>1) {


            DBManager manager = new DBManager(this);
            Cursor rs = manager.getData();


            if (rs.moveToFirst()) {
                String uerName = " ";
                String password = " ";

                do {
                    uerName = rs.getString(rs.getColumnIndex(DBManager.ColUserName));
                    password = rs.getString(rs.getColumnIndex(DBManager.ColPassWord));

                    if (uerName.equals(regUser.getText().toString()) && password.equals(regPass.getText().toString())) {

                        Intent intent = new Intent(getApplicationContext(), Welcome.class);
                        intent.putExtra("Key", "123");
                        intent.putExtra("userName", uerName);
                        startActivity(intent);

                    } else {
                        Toast.makeText(getApplicationContext(), "User Not Exist", Toast.LENGTH_LONG).show();
                    }


                } while (rs.moveToNext());


            }

        }
        else
        {
            Toast.makeText(getApplicationContext(), "Please Enter User Name and Password", Toast.LENGTH_LONG).show();
            regUser.getText().clear();
            regPass.getText().clear();
        }


    }

    public void OpenSignupPage(View view) {

        Intent intent = new Intent(getApplicationContext(), Register.class);
        startActivity(intent);
    }
}