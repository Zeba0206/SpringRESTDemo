package com.stackroute.com.stackroute.exceptions;

public class UserAlreadyExistsException extends Exception {

    private String message;

    public UserAlreadyExistsException(){}

    public UserAlreadyExistsException(String message){
        super (message);
        this.message=message;
    }
}
