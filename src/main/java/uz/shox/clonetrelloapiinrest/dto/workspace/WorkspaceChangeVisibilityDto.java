package uz.shox.clonetrelloapiinrest.dto.workspace;

import lombok.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:21 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class WorkspaceChangeVisibilityDto {
    private Long id;
    private Boolean visibility;
}
