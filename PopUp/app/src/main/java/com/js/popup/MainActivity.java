package com.js.popup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SetIdt(String msg)
    {
         if(msg.equals("123")) {
             Toast.makeText(this, "Welcome", Toast.LENGTH_LONG).show();
         }
         else
         {
             Toast.makeText(this, "Transaction Failed", Toast.LENGTH_LONG).show();
         }

    }



    public void onClick(View view) {

        FragmentManager fm = getSupportFragmentManager();
        PopUp pop = new PopUp();
        pop.show(fm,"show");

    }


}
