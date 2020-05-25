package com.js.popup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.DialogFragment;

public class PopUp extends DialogFragment implements View.OnClickListener {

    View view;
    TextView tv;
    Button bt;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.popup,container,false);

        tv=(TextView)view.findViewById(R.id.editText11);
        bt=(Button)view.findViewById(R.id.sub);
        //set lister for this button
        bt.setOnClickListener(this);

   return  view;

    }

    @Override
    public void onClick(View v) {

   this.dismiss();
   //String otp = tv.getText().toString();
        //because main activity is already instantiate by DVM
   MainActivity ma =(MainActivity) getActivity();

ma.SetIdt(tv.getText().toString());





    }
}
