package com.example.samberg.codered;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class CycleInfo extends AppCompatActivity implements com.borax12.materialdaterangepicker.date.DatePickerDialog.OnDateSetListener{

    Button btnStart;
    String startdate,enddate;
    TextView tvSetDate, tvEndDate;
    private SharedPreferences sharedPreferences;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_info);


        btnStart = (Button) findViewById(R.id.btnstart);
        tvSetDate = (TextView) findViewById(R.id.tvSetDate);
        tvEndDate = (TextView) findViewById(R.id.tvEndDate);
        saveButton = (Button) findViewById(R.id.saveButton);
        sharedPreferences = this.getSharedPreferences("Code_Red", Context.MODE_PRIVATE);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar now = Calendar.getInstance();
                com.borax12.materialdaterangepicker.date.DatePickerDialog dpd = com.borax12.materialdaterangepicker.date.DatePickerDialog.newInstance(
                        CycleInfo.this,
                        now.get(Calendar.YEAR),
                        now.get(Calendar.MONTH),
                        now.get(Calendar.DAY_OF_MONTH)
                );
                dpd.show(getFragmentManager(), "Datepickerdialog");
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CycleInfo.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public void onDateSet(com.borax12.materialdaterangepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth, int yearEnd, int monthOfYearEnd, int dayOfMonthEnd) {
        startdate = "Your Start Date: "+(monthOfYear+1)+"/"+dayOfMonth+"/"+year;
        tvSetDate.setText(startdate);
        enddate = "Your End Date: "+(monthOfYearEnd+1)+"/"+dayOfMonthEnd+"/"+yearEnd;
        tvEndDate.setText(enddate);

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("startdate",(monthOfYear+1)+"/"+dayOfMonth+"/"+year);
        editor.putString("enddate",(monthOfYearEnd+1)+"/"+dayOfMonthEnd+"/"+yearEnd);
        editor.commit();

    }
}
