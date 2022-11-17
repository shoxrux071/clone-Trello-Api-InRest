package uz.shox.clonetrelloapiinrest.dto.auth;

import uz.shox.clonetrelloapiinrest.dto.base.BaseGenericDto;
import uz.shox.clonetrelloapiinrest.dto.base.GenericDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 15:59 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
public record UserCreateDto(String email,String password) implements BaseGenericDto {
}
