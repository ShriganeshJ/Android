package com.js.sqllite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
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
        setContentView(R.layout.login);




    }


    public void onLogin(View view) {
        /*  long stats;

        userName = (EditText)findViewById(R.id.username);
        password= (EditText) findViewById(R.id.password);
        DBManager manager = new DBManager(this);

        //set values
        ContentValues values = new ContentValues();
        values.put(DBManager.ColUserName,userName.getText().toString());
        values.put(DBManager.ColPassWord,password.getText().toString());

       stats= manager.InsertLoin(values);

       //clear text box
        userName.getText().clear();
        password.getText().clear();


       if(stats>0)
       {
           Toast.makeText(getApplicationContext(),"Inserted",Toast.LENGTH_LONG).show();
       }
       else
       {
           Toast.makeText(getApplicationContext(),"Not Inserted",Toast.LENGTH_LONG).show();
       }*/


       DBManager manager = new DBManager(this);
        Cursor rs = manager.getData();


        if(rs.moveToFirst()) {
            String data = " ";

            do {
                data += rs.getString(rs.getColumnIndex(DBManager.ColUserName));


            } while (rs.moveToNext());
            Toast.makeText(getApplicationContext(), data, Toast.LENGTH_LONG).show();

        }




    }

    public void OpenSignupPage(View view) {


    }
}
