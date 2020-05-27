package com.js.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    static  int i=0;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv =(ImageView) findViewById(R.id.imageView);


    }

    public void OnClickNext(View view) {
        i++;

   iv.setImageResource(R.drawable.image1);


    }


    public void OnClickPrevious(View view) {
        iv.setImageResource(R.drawable.image2);
    }
}
