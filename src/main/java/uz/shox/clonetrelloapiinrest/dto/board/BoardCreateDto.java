package uz.shox.clonetrelloapiinrest.dto.board;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.base.BaseGenericDto;
import uz.shox.clonetrelloapiinrest.enums.board.BoardVisibilityType;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:10 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardCreateDto implements BaseGenericDto {
    private String name;
    @Builder.Default
    private BoardVisibilityType visibilityType = BoardVisibilityType.PUBLIC;
    private Long workspaceId;
}
