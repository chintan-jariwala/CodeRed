package com.example.samberg.codered;

import com.orm.SugarRecord;
import com.orm.dsl.Table;

@Table
public class Details extends SugarRecord {
    String startDate;
    String endDate;
    String symptomDate;
    String symptoms;


    public Details() {
    }

    public Details(String startDate, String endDate, String symptomDate, String symptoms) {

        this.startDate = startDate;
        this.endDate = endDate;
        this.symptomDate = symptomDate;
        this.symptoms = symptoms;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSymptomDate() {
        return symptomDate;
    }

    public void setSymptomDate(String symptomDate) {
        this.symptomDate = symptomDate;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }


}
