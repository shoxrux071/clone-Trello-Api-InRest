package uz.shox.clonetrelloapiinrest.dto.board;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.base.BaseGenericDto;
import uz.shox.clonetrelloapiinrest.enums.board.BoardVisibilityType;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:15 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardChangeVisibilityDto {
    private Long id;
    private BoardVisibilityType visibility;
}
