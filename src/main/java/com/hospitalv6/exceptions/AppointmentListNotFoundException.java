package com.hospitalv6.exceptions;

public class AppointmentListNotFoundException extends CustomRuntimeException {

    public AppointmentListNotFoundException(String code){
        super(code);
    }

    public AppointmentListNotFoundException(String code, Object... userNameArg){
        super(code,userNameArg);
    }

}
