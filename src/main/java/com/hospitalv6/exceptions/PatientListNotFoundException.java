package com.hospitalv6.exceptions;

public class PatientListNotFoundException extends CustomRuntimeException{

    public PatientListNotFoundException(String code) {
        super(code);
    }

    public PatientListNotFoundException(String code, Object... userNameArgs) {
        super(code, userNameArgs);
    }

}
