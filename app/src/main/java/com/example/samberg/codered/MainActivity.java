package com.example.samberg.codered;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSave;
    private EditText etOther;
    private CheckBox cbCramps;
    private CheckBox cbHeadache;
    private CheckBox cbAbdominalBloating;
    private CheckBox cbSoreTenderBreasts;
    private CheckBox cbHeavyFlow;
    private CheckBox cbIrritability;
    private CheckBox cbCrying;
    private CheckBox cbLowerBackPain;
    private CheckBox cbFoodCravings;
    private CheckBox cbMoodSwings;
    private CheckBox cbFatigue;
    private CheckBox cbWeightGain;
    private CheckBox cbIncreasedFoodConsumption;
    private CheckBox cbEdema;
    private CheckBox cbDysmenorrhea;
    private CheckBox cbMigrane;
    private CheckBox cbConstipation;
    private CheckBox cbDiarrhea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final StringBuffer finalResult = new StringBuffer();

        btnSave = (Button) findViewById(R.id.btnSave);
        etOther = (EditText) findViewById(R.id.etOther);

        cbCramps = (CheckBox) findViewById(R.id.cbCramps);
        cbHeadache = (CheckBox) findViewById(R.id.cbHeadache);
        cbAbdominalBloating = (CheckBox) findViewById(R.id.cbAbdominalBloating);
        cbSoreTenderBreasts = (CheckBox) findViewById(R.id.cbSoreTenderBreasts);
        cbHeavyFlow = (CheckBox) findViewById(R.id.cbHeavyFlow);
        cbIrritability = (CheckBox) findViewById(R.id.cbIrritability);
        cbCrying = (CheckBox) findViewById(R.id.cbCrying);
        cbLowerBackPain = (CheckBox) findViewById(R.id.cbLowerBackPain);
        cbFoodCravings = (CheckBox) findViewById(R.id.cbFoodCravings);
        cbMoodSwings = (CheckBox) findViewById(R.id.cbMoodSwings);
        cbFatigue = (CheckBox) findViewById(R.id.cbFatigue);
        cbWeightGain = (CheckBox) findViewById(R.id.cbWeightGain);
        cbIncreasedFoodConsumption = (CheckBox) findViewById(R.id.cbIncreasedFoodConsumption);
        cbEdema = (CheckBox) findViewById(R.id.cbEdema);
        cbDysmenorrhea = (CheckBox) findViewById(R.id.cbDysmenorrhea);
        cbMigrane = (CheckBox) findViewById(R.id.cbMigrane);
        cbConstipation = (CheckBox) findViewById(R.id.cbConstipation);
        cbDiarrhea = (CheckBox) findViewById(R.id.cbDiarrhea);




        cbCramps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbCramps.isChecked()){
                    finalResult.append(" cramps");
                }
            }
        });
        cbHeadache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbHeadache.isChecked()){
                    finalResult.append(" Headache");
                }
            }
        });
        cbAbdominalBloating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbAbdominalBloating.isChecked()){
                    finalResult.append(" Abdominal Bloating");
                }
            }
        });
        cbSoreTenderBreasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbSoreTenderBreasts.isChecked()){
                    finalResult.append(" Sore/Tender Breasts");
                }
            }
        });
        cbHeavyFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbHeavyFlow.isChecked()){
                    finalResult.append(" Heavy Flow");
                }
            }
        });
        cbIrritability.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbIrritability.isChecked()){
                    finalResult.append(" Irritability");
                }
            }
        });
        cbCrying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cbCrying.isChecked()){
                    finalResult.append(" Crying");
                }
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalResult.append(etOther.getText().toString());
                Toast.makeText(getApplicationContext(),finalResult.toString(),Toast.LENGTH_LONG).show();
            }

        });

    }
}
