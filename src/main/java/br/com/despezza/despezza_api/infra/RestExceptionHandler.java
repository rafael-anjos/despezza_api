package br.com.despezza.despezza_api.infra;

import br.com.despezza.despezza_api.exceptions.EventFullException;
import br.com.despezza.despezza_api.exceptions.EventNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EventNotFoundException.class)
    private ResponseEntity<String> eventNotFoundHandler(EventNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found.");

    }

    @ExceptionHandler(EventFullException.class)
    private ResponseEntity<String> eventFullErrorHandler(EventFullException exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Event is sold out.");
    }
}
