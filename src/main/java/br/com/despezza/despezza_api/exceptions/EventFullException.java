package br.com.despezza.despezza_api.exceptions;

public class EventFullException extends RuntimeException{

    public EventFullException() {
        super("Event is sold out.");
    }

    public EventFullException(String message) {super(message);}
}
