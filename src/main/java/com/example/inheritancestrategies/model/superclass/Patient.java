package com.example.inheritancestrategies.model.superclass;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Entity
@Table(name = "patients")
public class Patient extends PersonInfo {

    @Column(name = "dateTime_admission")
    private LocalDateTime admission;

    @Column(name = "patient_symptoms")
    private String symptoms;

    @Column(name = "having_insurance")
    private boolean insurance;

    public LocalDateTime getAdmission() {
        return admission;
    }

    public void setAdmission(LocalDateTime admission) {
        this.admission = admission;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }
}

