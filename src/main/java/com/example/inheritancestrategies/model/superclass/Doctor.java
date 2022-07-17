package com.example.inheritancestrategies.model.superclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctors")
public class Doctor extends PersonInfo {

    @Column(name = "work_experience")
    private double experience;

    @Column(name = "doctor_specialization")
    private String specialization;
}

