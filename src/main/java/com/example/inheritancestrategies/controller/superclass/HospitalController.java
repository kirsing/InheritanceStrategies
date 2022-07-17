package com.example.inheritancestrategies.controller.superclass;

import com.example.inheritancestrategies.model.superclass.Doctor;
import com.example.inheritancestrategies.model.superclass.Patient;
import com.example.inheritancestrategies.repository.superclass.DoctorRepository;
import com.example.inheritancestrategies.repository.superclass.PatientRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hospital")
public class HospitalController {

    DoctorRepository doctorRepository;

    PatientRepository patientRepository;

    public HospitalController(DoctorRepository doctorRepository, PatientRepository patientRepository) {
        this.doctorRepository = doctorRepository;
        this.patientRepository = patientRepository;
    }


    @PostMapping("/adddoctor")
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    @PostMapping("/addpatient")
    public Patient addPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

}
