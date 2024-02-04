package com.hospitalv6.model.dtos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hospitalv6.model.entities.Department;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AppointmentResponseDto {


    private String name;

    private String gender;

    private Long tcno;

    private LocalDateTime appointmentDate;

    @JsonIgnoreProperties({"id","discription"})
    @JsonBackReference
    private Department department;


}
