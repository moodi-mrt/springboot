package com.Example.CrudeStudentException.Excpetons;

public class ResourceNotFoundExceptions extends RuntimeException {
    public ResourceNotFoundExceptions(String message){
        super(message);
    }
}
