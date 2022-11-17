package uz.shox.clonetrelloapiinrest.dto.boardColumn;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.base.BaseGenericDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:19 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardColumnOrderChangeDto implements BaseGenericDto {
    private Long id;
    private Integer order;
}