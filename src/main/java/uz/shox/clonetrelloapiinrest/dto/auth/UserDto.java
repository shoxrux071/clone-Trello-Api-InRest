package uz.shox.clonetrelloapiinrest.dto.auth;

import lombok.*;
import uz.shox.clonetrelloapiinrest.domains.auth.AuthRole;
import uz.shox.clonetrelloapiinrest.dto.base.GenericDto;
import uz.shox.clonetrelloapiinrest.enums.auth.UserStatus;

import java.util.Set;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 15:55 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends GenericDto {
    private String email;
    private Set<AuthRole> roles;

    private UserStatus status;
    private Boolean isActive;
    @Builder(builderMethodName = "childBuilder")
    public UserDto(Long id,String email, Set<AuthRole> roles, UserStatus status, Boolean isActive) {
        super(id);
        this.email = email;
        this.roles = roles;
        this.status = status;
        this.isActive = isActive;
    }
}
