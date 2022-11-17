package uz.shox.clonetrelloapiinrest.dto.card;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.base.BaseGenericDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:29 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardCreateDto implements BaseGenericDto {
    private String name;
    private Long boardColumnId;
}