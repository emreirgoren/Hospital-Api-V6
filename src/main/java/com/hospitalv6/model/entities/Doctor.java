package com.hospitalv6.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name="doctors")
public class Doctor {

    @Id
    @GeneratedValue
    private int doctorId;

    @Column(name="doctor_name")
    private String doctorName;

    @Column(name="doctor_gender")
    private String gender;

    /*@Column(name="doctor_department")
    private String department;*/

    @Column(name="doctor_email")
    private String email;

    @Column(name="doctor_dateOfBirth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime dateOfBirth;

    /* // OneToOne İlişkisi
    @OneToOne
    @JoinColumn(name = "patient_id") doctors
    private Patient patient;
    */

    @OneToMany(mappedBy = "doctor")
    private List<Patient> patientList;
    
    @ManyToOne
    @JoinColumn(name = "doctor_department")
    private Department department;




}
