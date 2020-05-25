package com.js.sqllite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DBManager  {




     static  final  String dbName="abhi1";
     static final    String ColUserName="UserName";
     static final String ColPassWord ="Password";
     static  final int dBVersion =1;
     static  final  String tableName="login1";
     private SQLiteDatabase sqlDB;
     DataBaseHealper dataBaseHealper;


     private static  String sqlQuery = "Create table IF NOT EXISTS "+tableName+"(ID integer PRIMARY KEY AUTOINCREMENT,"+ ColUserName+" text,"+ ColPassWord +" text)";


     static  class DataBaseHealper extends SQLiteOpenHelper
    {
        Context context;
        DataBaseHealper(Context context)
        {
            super(context,dbName,null,dBVersion);
            //sqlLite Open Healper Context
            this.context=context;
        }
        @Override
        public void onCreate(SQLiteDatabase db) {


            db.execSQL(sqlQuery);
            Toast.makeText(context,"tableCreated",Toast.LENGTH_LONG).show();

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            db.execSQL("Drop table IF EXISTS "+tableName);
            onCreate(db);

        }




    }

    public  long InsertLoin(ContentValues values)
    {
        return sqlDB.insert(tableName," ",values);
    }


    public Cursor getData()
    {
        SQLiteDatabase dbread =  dataBaseHealper.getReadableDatabase();
        return  dbread.rawQuery("select * from "+tableName,null);
    }

    DBManager(Context context)
    {
         dataBaseHealper= new DataBaseHealper(context);
        sqlDB = dataBaseHealper.getWritableDatabase();
    }


}
