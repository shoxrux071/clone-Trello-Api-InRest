package uz.shox.clonetrelloapiinrest.dto.boardColumn;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.base.GenericDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:20 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardColumnUpdateDto extends GenericDto {
    private Long id;
    private String name;
    private Integer order;
    private Long boardId;
}