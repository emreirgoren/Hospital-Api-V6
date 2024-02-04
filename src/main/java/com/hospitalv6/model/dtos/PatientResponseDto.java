package com.hospitalv6.model.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hospitalv6.model.entities.Doctor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientResponseDto {

    private String patientName;

    private String patientGender;

    private Long patientTcno;

    @JsonIgnoreProperties({"doctorId","gender","email","dateOfBirth","patientList","department"})
    //@JsonBackReference
    private Doctor doctor;

}
