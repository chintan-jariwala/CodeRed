package com.example.cidseuser.cycleinfo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] arraySpinner = new String[] {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        Spinner s = (Spinner) findViewById(R.id.startMonthSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter);

        String[] arraySpinner1 = new String[] {
                "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };
        Spinner s1 = (Spinner)findViewById(R.id.endMonthSpinner);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter1);



        String[] arraySpinner2 = new String[] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"
        };
        Spinner s2 = (Spinner) findViewById(R.id.startDaySpinner);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter2);


        String[] arraySpinner3 = new String[] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"
        };
        Spinner s3 = (Spinner) findViewById(R.id.endDaySpinner);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter3);


        String[] arraySpinner4 = new String[] {
                "2016", "2017", "2018", "2019", "2020"
        };
        Spinner s4 = (Spinner) findViewById(R.id.endYearSpinner);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter4);

        String[] arraySpinner5 = new String[] {
                "2016", "2017", "2018", "2019", "2020"
        };
        Spinner s5 = (Spinner) findViewById(R.id.endYearSpinner);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        s.setAdapter(adapter5);
    }
    }
















