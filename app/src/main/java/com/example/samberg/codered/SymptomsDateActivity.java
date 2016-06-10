package com.example.samberg.codered;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

    private Button btnGoToSymptomsList;

public class SymptomsDateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms_front_page);

        btnGoToSymptomsList = (Button) findViewById(R.id.btnGoToSymptomsList);
    }

    public void chooseAnotherButtonClicked (View dateButton) {


        btnGoToSymptomsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Time Pass",Toast.LENGTH_LONG).show();
            }

        });

        // TODO Auto-generated method stub
        //To show current date in the datepicker
        Calendar mcurrentDate=Calendar.getInstance();
        int mYear=mcurrentDate.get(Calendar.YEAR);
        int mMonth=mcurrentDate.get(Calendar.MONTH);
        int mDay=mcurrentDate.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog mDatePicker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker datepicker, int selectedyear, int selectedmonth, int selectedday) {

                String date = selectedmonth + "/" + selectedday + "/"  + selectedyear;

                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);

                int count = sharedPref.getInt("count", 0);

                String symptomDateKey = "cycle_" + count +"_symptom_date";
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putString(symptomDateKey, date);
                editor.commit();
            }

        },mYear, mMonth, mDay);
        mDatePicker.setTitle("Select date");
        mDatePicker.show();
    }


}
