package com.js.sharedpreferance;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.EditText;

public class SharedPreferanceLogic {


    SharedPreferences shp;

    SharedPreferanceLogic(Context context) {
        shp = context.getSharedPreferences("data", Context.MODE_PRIVATE);


    }


    public void saveData(String userName, String password) {
        SharedPreferences.Editor editor = shp.edit();
        editor.putString("userName", userName);
        editor.putString("password", password);
        editor.commit();

    }


    public String loadData()
    {
        String message;
        message=shp.getString("userName","InvalidUsernae");
        message=message+"password is ::"+shp.getString("password","InvalidPassword");
return  message;
    }
}
