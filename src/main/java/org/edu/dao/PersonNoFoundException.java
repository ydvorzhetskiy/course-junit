package org.edu.dao;

public class PersonNoFoundException extends RuntimeException {
    public PersonNoFoundException(String message) {
        super(message);
    }
}
