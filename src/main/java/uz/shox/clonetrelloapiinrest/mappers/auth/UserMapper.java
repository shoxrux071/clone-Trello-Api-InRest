package uz.shox.clonetrelloapiinrest.mappers.auth;

import org.mapstruct.Mapper;
import uz.shox.clonetrelloapiinrest.domains.auth.AuthUser;
import uz.shox.clonetrelloapiinrest.dto.auth.UserDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 20:48 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto fromUser(AuthUser authUser);
}
