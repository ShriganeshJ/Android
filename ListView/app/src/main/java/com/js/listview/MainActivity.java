package com.js.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //adapter class
    ArrayList<PolicyBo>    listnewsData = new ArrayList();
    MyCustomAdapter myadapter;
    PolicyBo bo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview);



        //add data to adapter

        //listnewsData.add(new AdapterItems(1,"developer"," develop apps"));

        for(int i=0;i<10;i++) {
            bo = new PolicyBo();
            bo.setPolicy("GHFB001");
            bo.setName("Raja");
            bo.setEmail("raja@gmail.com");
            bo.setMobile("9960866761");
            bo.setAdd("Kurla east");
            bo.setCity("Mumbai");
            listnewsData.add(bo);
        }
        //pass data to adapter
        myadapter=new MyCustomAdapter(listnewsData);

        //set adapter to list view
        listView.setAdapter(myadapter);

    }


    private class MyCustomAdapter extends BaseAdapter {
        public  ArrayList<PolicyBo>  arrayList ;

        public MyCustomAdapter(ArrayList<PolicyBo> listnewsDataAdpater) {
            this.arrayList=listnewsDataAdpater;
        }


        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public String getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        //This method execute accolading to  getCount() if count=10 then execute 10 times
        @Override
        public View getView(int position, View convertView, ViewGroup parent)
        {
            LayoutInflater mInflater = getLayoutInflater();
            View myView = mInflater.inflate(R.layout.policylog, null);

            final PolicyBo s = arrayList.get(position);



            TextView policyNumber=( TextView)myView.findViewById(R.id.policynumber);
            policyNumber.setText(s.getPolicy());


            TextView name=( TextView)myView.findViewById(R.id.name);
            name.setText(s.getName());


            TextView city=( TextView)myView.findViewById(R.id.city);
            city.setText(s.getCity());

            TextView email=( TextView)myView.findViewById(R.id.email);
            email.setText(s.getEmail());


            TextView mobile=( TextView)myView.findViewById(R.id.moboff);
            mobile.setText(s.getMobile());

            TextView address=( TextView)myView.findViewById(R.id.address);
            address.setText(s.getAdd());



            return myView;
        }

    }



}


