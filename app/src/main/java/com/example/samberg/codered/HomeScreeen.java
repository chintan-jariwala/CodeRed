package com.example.samberg.codered;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeScreeen extends AppCompatActivity {


    private Button btnRecordMyData;
    private Button btnImportantInfo;
    private Button btnPregnancy;
    private Button btnSeeADrIf;
    private Button btnSupplies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screeen);



        btnRecordMyData = (Button) findViewById(R.id.btnRecordMyData);
        btnImportantInfo = (Button) findViewById(R.id.btnImportantInfo);
        btnPregnancy = (Button) findViewById(R.id.btnPregnancy);
        btnSeeADrIf = (Button) findViewById(R.id.btnSeeADRIF);
        btnSupplies = (Button) findViewById(R.id.btnSupplies);


        btnRecordMyData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CycleInfo.class);
                startActivity(intent);
               // finish();
            }
        });

        btnImportantInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Time pass",Toast.LENGTH_LONG).show();
            }
        });
        btnPregnancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                // finish();
            }
        });

        btnSeeADrIf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Notifications.class);
                startActivity(intent);
                // finish();
            }
        });

        btnSupplies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CycleInfo.class);
                startActivity(intent);
                // finish();
            }
        });


    }
}
