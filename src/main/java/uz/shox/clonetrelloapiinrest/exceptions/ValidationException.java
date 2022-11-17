package uz.shox.clonetrelloapiinrest.exceptions;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:26 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
public class ValidationException extends RuntimeException{

    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable throwable) {
        super(message, throwable);
    }
}