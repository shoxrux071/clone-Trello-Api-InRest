package uz.shox.clonetrelloapiinrest.exceptions;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:26 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
