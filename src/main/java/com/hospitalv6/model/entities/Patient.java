package com.hospitalv6.model.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "patients")
public class Patient {

    @Id
    @GeneratedValue
    private int patientId;

    @Column(name="patient_name")
    private String patientName;

    @Column(name="patient_gender")
    private String patientGender;

    @Column(name="patient_tcno")
    private Long patientTcno;

    /*
    @OneToOne
    @JoinColumn(name = "doctor_id") doctors veritabanına doctor_id olarak katılır.
    @JsonIgnore
    private Doctor doctor;
    */


    @ManyToOne
    @JoinColumn(name = "doctor_id")
    @JsonBackReference
    private Doctor doctor;
}
