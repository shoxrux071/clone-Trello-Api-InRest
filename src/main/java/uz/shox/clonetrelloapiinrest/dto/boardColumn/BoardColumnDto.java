package uz.shox.clonetrelloapiinrest.dto.boardColumn;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.base.BaseGenericDto;
import uz.shox.clonetrelloapiinrest.dto.card.CardDto;

import java.util.List;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:04 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardColumnDto implements BaseGenericDto    {
    private Long id;
    private String name;
    private Integer order;
    private Long boardId;
    private List<CardDto> cardSet;
}
