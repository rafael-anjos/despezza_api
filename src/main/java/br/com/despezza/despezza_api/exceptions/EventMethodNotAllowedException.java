package br.com.despezza.despezza_api.exceptions;

public class EventMethodNotAllowedException extends RuntimeException{

    public EventMethodNotAllowedException() {
        super("Event not allowed - Error 405");
    }

    public EventMethodNotAllowedException(String message) {
        super(message);
    }
}
