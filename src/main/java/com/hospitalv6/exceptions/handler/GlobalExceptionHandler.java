package com.hospitalv6.exceptions.handler;

import com.hospitalv6.exceptions.AppointmentListNotFoundException;
import com.hospitalv6.exceptions.PatientListNotFoundException;
import com.hospitalv6.model.dtos.exceptionDtos.ErrorDto;
import com.hospitalv6.model.dtos.exceptionDtos.ServiceResultDto;
import com.hospitalv6.model.dtos.exceptionDtos.ServiceResultStatusCode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(AppointmentListNotFoundException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ServiceResultDto<Void>> appointmentListNotFound(AppointmentListNotFoundException e){
        ErrorDto errorDto = ErrorDto.builder()
                .message(e.getCode())
                .build();
        return ResponseEntity.ok(new ServiceResultDto<>((errorDto), ServiceResultStatusCode.APPOINTMENTLIST_NOT_FOUND));
    }

    @ExceptionHandler(PatientListNotFoundException.class)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ServiceResultDto<Void>> patientListNotFound(PatientListNotFoundException e){
        ErrorDto errorDto = ErrorDto.builder()
                .message(e.getCode())
                .build();
        return ResponseEntity.ok(new ServiceResultDto<>((errorDto),ServiceResultStatusCode.PATINETLIST_NOT_FOUND));
    }

}
