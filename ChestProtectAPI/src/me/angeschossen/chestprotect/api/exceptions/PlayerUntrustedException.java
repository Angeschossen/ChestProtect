package me.angeschossen.chestprotect.api.exceptions;

public class PlayerUntrustedException extends RuntimeException {
    public PlayerUntrustedException(String errorMessage) {
        super(errorMessage);
    }

}
