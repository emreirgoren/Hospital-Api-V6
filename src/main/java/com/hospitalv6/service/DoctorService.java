package com.hospitalv6.service;

import com.hospitalv6.exceptions.AppointmentListNotFoundException;
import com.hospitalv6.exceptions.PatientListNotFoundException;
import com.hospitalv6.model.dtos.AppointmentResponseDto;
import com.hospitalv6.configurations.MapperConfiguration.MapperConfig;
import com.hospitalv6.model.dtos.PatientResponseDto;
import com.hospitalv6.model.entities.Appointment;
import com.hospitalv6.model.entities.Patient;
import com.hospitalv6.repository.AppointmentRepository;
import com.hospitalv6.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    private final AppointmentRepository appointmentRepository;
    private final MapperConfig mapperConfig;
    private final PatientRepository patientRepository;

    public DoctorService(AppointmentRepository appointmentRepository, MapperConfig mapperConfig, PatientRepository patientRepository) {
        this.appointmentRepository = appointmentRepository;
        this.mapperConfig = mapperConfig;
        this.patientRepository = patientRepository;
    }

    public List<AppointmentResponseDto> getAppointmentList() {
        List<Appointment> appointmentList = appointmentRepository.findAll();

        if(appointmentList.isEmpty()){
            throw new AppointmentListNotFoundException("Randevu Listesi Bulunamamıstır");
        }

        List<AppointmentResponseDto> appointmentResponseDtoList = new ArrayList<>();

        for (Appointment appointment : appointmentList) {
            AppointmentResponseDto appointmentResponseDto = mapperConfig.modelMapper().map(appointment, AppointmentResponseDto.class);
            appointmentResponseDtoList.add(appointmentResponseDto);
        }

        return appointmentResponseDtoList;

    }

    public List<PatientResponseDto> getPatientList() {
        List<Patient> patientList = patientRepository.findAll();

        if(patientList.isEmpty()){
            throw new PatientListNotFoundException("Hasta Listesi Bulunamamıştır");
        }

        List<PatientResponseDto> patientResponseDtoList = new ArrayList<>();

        for (Patient patient : patientList) {
            // if patient.doctorid == ROLE.doctorıd{}
            PatientResponseDto patientResponseDto = mapperConfig.modelMapper().map(patient, PatientResponseDto.class);
            patientResponseDtoList.add(patientResponseDto);
        }
        return patientResponseDtoList;
    }

}
