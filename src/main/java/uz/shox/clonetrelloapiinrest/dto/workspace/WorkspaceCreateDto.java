package uz.shox.clonetrelloapiinrest.dto.workspace;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.base.BaseGenericDto;
import uz.shox.clonetrelloapiinrest.enums.workspace.WorkspaceType;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:14 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class WorkspaceCreateDto implements BaseGenericDto {
    private String name;
    private Long userId;
    private WorkspaceType type;
    private String description;
}
