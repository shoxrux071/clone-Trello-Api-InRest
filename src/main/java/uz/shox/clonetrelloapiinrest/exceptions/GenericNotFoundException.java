package uz.shox.clonetrelloapiinrest.exceptions;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:25 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
public class GenericNotFoundException extends RuntimeException{
    public GenericNotFoundException(String message) {
        super(message);
    }

    public GenericNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
