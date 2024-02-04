package com.hospitalv6.controller;

import com.hospitalv6.model.dtos.AppointmentResponseDto;
import com.hospitalv6.model.dtos.PatientResponseDto;
import com.hospitalv6.service.DoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v6/doctorPage")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    //Randevulu Hastaları Getirme
    @GetMapping("/getAppointmentList")
    public List<AppointmentResponseDto> getAppointmentList(){
        return doctorService.getAppointmentList();
    }

    //Serviste Yatan Hasta Listesi
    @GetMapping("/getPatientList")
    public List<PatientResponseDto> getPatientList(){
        return doctorService.getPatientList();
    }

    


}
