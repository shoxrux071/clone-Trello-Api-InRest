package uz.shox.clonetrelloapiinrest.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import uz.shox.clonetrelloapiinrest.exceptions.GenericNotFoundException;
import uz.shox.clonetrelloapiinrest.exceptions.ValidationException;
import uz.shox.clonetrelloapiinrest.handlers.errorResponse.ApiErrorResponse;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:36 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(GenericNotFoundException.class)
    public ResponseEntity<ApiErrorResponse> handler404(GenericNotFoundException e, HttpServletRequest request) {
        return new ResponseEntity<>(ApiErrorResponse.builder()
                .friendlyMessage(e.getMessage())
                .developerMessage(Arrays.toString(e.getStackTrace()))
                .path(request.getRequestURL().toString())
                .build(),
                HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ApiErrorResponse> handle400(ValidationException e, HttpServletRequest request) {
        return new ResponseEntity<>(ApiErrorResponse.builder()
                .friendlyMessage(e.getMessage())
                .developerMessage(Arrays.toString(e.getStackTrace()))
                .path(request.getRequestURL().toString())
                .build(),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<ApiErrorResponse> handle403(IllegalAccessException e, HttpServletRequest request) {
        return new ResponseEntity<>(ApiErrorResponse.builder()
                .friendlyMessage(e.getMessage())
                .developerMessage(Arrays.toString(e.getStackTrace()))
                .path(request.getRequestURL().toString())
                .build(),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ApiErrorResponse> handle500(NullPointerException e, HttpServletRequest request) {
        return new ResponseEntity<>(ApiErrorResponse.builder()
                .friendlyMessage(e.getMessage())
                .developerMessage(Arrays.toString(e.getStackTrace()))
                .path(request.getRequestURL().toString())
                .build(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
