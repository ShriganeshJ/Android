package com.js.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //alert dialog



    }

    public void OnShow(View view) {

        Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_LONG).show();

        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Are you want to Delete ");
        alert.setTitle("Conformation");

        //positive
        alert.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                Toast.makeText(getApplicationContext(),"Deleted",Toast.LENGTH_LONG).show();
            }
        });


        //positive
        alert.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(),"Cancelled",Toast.LENGTH_LONG).show();

            }
        }).show();


    }
}
