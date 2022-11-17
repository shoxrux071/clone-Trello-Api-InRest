package uz.shox.clonetrelloapiinrest.dto.workspace;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.base.GenericDto;
import uz.shox.clonetrelloapiinrest.enums.workspace.WorkspaceType;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:16 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class WorkspaceUpdateDto extends GenericDto {
    private Long id;
    private String name;
    private WorkspaceType type;
    private String description;
}
