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
import android.widget.Toast;

import com.orm.SugarContext;

import java.util.Calendar;


public class SymptomsDateActivity extends AppCompatActivity {


    private Button btnGoToSymptomsList;
    String date="";
    String symptomlist="";
    Details details;
    String startDate="";
    String endDate="";
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms_front_page);

        sharedPreferences = this.getSharedPreferences("Code_Red",Context.MODE_PRIVATE);

        startDate = sharedPreferences.getString("startdate",null);


        endDate =  sharedPreferences.getString("enddate",null);



        btnGoToSymptomsList = (Button) findViewById(R.id.btnGoToSymptomsList);

        btnGoToSymptomsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();

                symptomlist = intent.getStringExtra("Symptom");
                details = new Details(startDate,endDate,date,symptomlist);

                details.save();
                Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_LONG).show();
                Intent intent1 = new Intent(getApplicationContext(),CycleDetails.class);
                startActivity(intent1);
                finish();
            }

        });


    }

    public void chooseAnotherButtonClicked (View dateButton) {


        // TODO Auto-generated method stub
        //To show current date in the datepicker
        Calendar mcurrentDate=Calendar.getInstance();
        int mYear=mcurrentDate.get(Calendar.YEAR);
        int mMonth=mcurrentDate.get(Calendar.MONTH);
        int mDay=mcurrentDate.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog mDatePicker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {

                date = (selectedmonth+1)+ "/" + selectedday + "/"  + selectedyear;

            }

        },mYear, mMonth, mDay);
        mDatePicker.setTitle("Select date");
        mDatePicker.show();

    }


}
