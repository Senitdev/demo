package com.projet.demo.exception;

public class EntityNotFoundException extends RuntimeException {
    /**
     * @param message
     */
    public EntityNotFoundException(String message){
        super(message);
    }
}
