package com.js.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView result;
    RadioButton male;
    RadioButton female;
    CheckBox checkBox;
    EditText date;
    EditText name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=(TextView) findViewById(R.id.result);
        male=(RadioButton) findViewById(R.id.male);
        female=(RadioButton) findViewById(R.id.female);
        checkBox = (CheckBox) findViewById(R.id.check);
        name=(EditText) findViewById(R.id.name);
        date=(EditText) findViewById(R.id.dob);


    }




    public void onClick(View view) {
         String res=" ";
        if(checkBox.isChecked())
        {
            res="Status::Married\n";
        }
        else
        {
            res="Status::Un-Married\n";
        }
/////////////////////////////////////////////////

    if(male.isChecked())
    {
       res= res+"Gener:Male \n";
    }
    else
    {
        res= res+"Gener:Female \n";
    }
     res=res+"DateIs::"+name.getText().toString()+"\n";
        res=res+"DobIs"+date.getText().toString()+"\n";
    result.setText(res);

    }




}
