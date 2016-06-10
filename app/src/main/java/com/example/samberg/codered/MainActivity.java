package com.example.samberg.codered;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private Button btnRecordMyData;
    private Button btnImportantInfo;
    private Button btnPregnancy;
    private Button btnSeeADrIf;
    private Button btnSupplies;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRecordMyData = (Button) findViewById(R.id.btnRecordMyData);
        btnImportantInfo = (Button) findViewById(R.id.btnImportantInfo);
        btnPregnancy = (Button) findViewById(R.id.btnPregnancy);
        btnSeeADrIf = (Button) findViewById(R.id.btnSeeADRIF);
        btnSupplies = (Button) findViewById(R.id.btnSupplies);


        btnRecordMyData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Time pass",Toast.LENGTH_LONG).show();
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
                Toast.makeText(getApplicationContext(),"Time pass",Toast.LENGTH_LONG).show();
            }
        });

        btnSeeADrIf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Time pass",Toast.LENGTH_LONG).show();
            }
        });

        btnSupplies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Time pass",Toast.LENGTH_LONG).show();
            }
        });


    }
}
