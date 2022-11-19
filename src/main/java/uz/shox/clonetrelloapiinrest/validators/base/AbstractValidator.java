package uz.shox.clonetrelloapiinrest.validators.base;

import uz.shox.clonetrelloapiinrest.dto.base.BaseGenericDto;
import uz.shox.clonetrelloapiinrest.dto.base.GenericDto;
import uz.shox.clonetrelloapiinrest.exceptions.ValidationException;

import java.io.Serializable;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 19/11/22 20:31 (Saturday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
public abstract class AbstractValidator<CD extends BaseGenericDto,
        UD extends GenericDto,
        K extends Serializable
        > {


    public abstract void validateKeY(K id) throws ValidationException;

    public abstract void validateOnCreate(CD dto) throws ValidationException;

    public abstract void validateOnUpdate(UD dto) throws ValidationException;


}
