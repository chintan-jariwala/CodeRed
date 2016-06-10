package com.example.cidseuser.cycleinfo;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.borax12.materialdaterangepicker.date.DatePickerDialog;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    Button btnStart;
    String startdate,enddate;
    TextView tvSetDate, tvEndDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = (Button) findViewById(R.id.btnstart);
        tvSetDate = (TextView) findViewById(R.id.tvSetDate);
        tvEndDate = (TextView) findViewById(R.id.tvEndDate);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar now = Calendar.getInstance();
                DatePickerDialog dpd = DatePickerDialog.newInstance(
                        MainActivity.this,
                        now.get(Calendar.YEAR),
                        now.get(Calendar.MONTH),
                        now.get(Calendar.DAY_OF_MONTH)
                );
                dpd.show(getFragmentManager(), "Datepickerdialog");
            }
        });
    }

    @Override
    public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth, int yearEnd, int monthOfYearEnd, int dayOfMonthEnd) {
        startdate = "Your Start Date: "+(monthOfYear+1)+"/"+dayOfMonth+"/"+year;
        tvSetDate.setText(startdate);
        enddate = "Your End Date: "+(monthOfYearEnd+1)+"/"+dayOfMonthEnd+"/"+yearEnd;
        tvEndDate.setText(enddate);

        String date = monthOfYear + "/" + dayOfMonth + "/" + year;

        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);

        int count = sharedPref.getInt("count", 0);

        String startDateKey = "cycle_" + "_start_date_";
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(startDateKey, date);
        editor.commit();
    }

    SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);

    int count = sharedPref.getInt("count", 0);

    String endDateKey = "cycle_" + "_end_date_";
    SharedPreferences.Editor editor = sharedPref.edit();
    editor.putString(endDateKey, date);
    editor.commit();
}
}



