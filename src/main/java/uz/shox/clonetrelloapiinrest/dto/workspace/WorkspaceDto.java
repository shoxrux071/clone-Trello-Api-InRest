package uz.shox.clonetrelloapiinrest.dto.workspace;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.auth.UserDto;
import uz.shox.clonetrelloapiinrest.dto.board.BoardDto;
import uz.shox.clonetrelloapiinrest.enums.workspace.WorkspaceType;

import java.util.Set;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:13 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WorkspaceDto {
    private Long id;
    private String name;
    private Long createdBy;
    private WorkspaceType type;
    private String description;
    private Boolean isVisible;
    private Set<BoardDto> boards;
    private Set<UserDto> members;
}
