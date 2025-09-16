package br.com.despezza.despezza_api.exceptions;

public class EventFullException extends RuntimeException{

    public EventFullException() {
        super("Internal Error.");
    }

    public EventFullException(String message) {super(message);}
}
