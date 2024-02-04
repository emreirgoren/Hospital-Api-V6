package com.hospitalv6.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "departments")
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "discription")
    private String discription;
/*
    @OneToOne(mappedBy = "doctor")
    private Doctor doctor;
    */

    @OneToMany(mappedBy = "department")
    private List<Doctor> doctorList;



}
