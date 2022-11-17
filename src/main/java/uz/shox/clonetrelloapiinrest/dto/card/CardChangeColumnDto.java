package uz.shox.clonetrelloapiinrest.dto.card;

import lombok.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:32 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardChangeColumnDto {
    private Long id;
    private Long boardColumnId;
}