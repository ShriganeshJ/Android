package com.js.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //TO override the default menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.custom, menu);

        //search view
        //initialize search view and get search action
        SearchView sv =(SearchView) menu.findItem(R.id.search).getActionView();
          //search manager service
        SearchManager sm =(SearchManager) getSystemService(Context.SEARCH_SERVICE);
        //set  searchable info to search view using manager

        sv.setSearchableInfo(sm.getSearchableInfo(getComponentName()));

        //event

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                //It work when we hit search query or submit query


                Toast.makeText(getApplicationContext(),query,Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                //when text is changes run time in search bar
                //its work like AJAX
                return false;
            }
        });





        return true;
    }

    //Menu bar click event action
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.home:
                Toast.makeText(this,"Home",Toast.LENGTH_LONG).show();
                return  true;

            /*case  R.id.add:
                Toast.makeText(this,"Add",Toast.LENGTH_LONG).show();
                return  true;*/
            default:
                return super.onOptionsItemSelected(item);



        }
    }




}
