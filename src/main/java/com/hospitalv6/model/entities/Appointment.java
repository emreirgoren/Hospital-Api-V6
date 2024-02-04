package com.hospitalv6.model.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="appointment_patient_name")
    private String name;

    @Column(name="appointment_patient_gender")
    private String gender;

    @Column(name="appointment_patient_tcno")
    private Long tcno;

    @Column(name = "appointment_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime appointmentDate;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;




}
