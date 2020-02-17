package me.angeschossen.chestprotect.api.exceptions;

public class NameAlreadyTakenException extends RuntimeException {

    public NameAlreadyTakenException(String errorMessage) {
        super(errorMessage);
    }
}
