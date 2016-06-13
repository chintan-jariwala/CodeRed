package com.example.samberg.codered;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CycleDetails extends AppCompatActivity {

    private TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_details);

        Details details = Details.findById(Details.class,1);

        tvDetails = (TextView) findViewById(R.id.tvDetails);

        tvDetails.setText(details.getSymptoms());
    }

}
