package com.example.samberg.codered;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CycleDetails extends AppCompatActivity {

    private List<Details> detailsList = Details.listAll(Details.class);
    private RecyclerView recyclerView;
    private CycleAdapter cycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycle_details);

        recyclerView = (RecyclerView) findViewById(R.id.cardList);

        cycleAdapter = new CycleAdapter(detailsList);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(cycleAdapter);


    }

}
