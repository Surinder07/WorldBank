package com.session.Exception;

public class InvalidNameException extends RuntimeException{

    public InvalidNameException(String message) {
        super("invalid lang code supplied ! ");
    }
}
