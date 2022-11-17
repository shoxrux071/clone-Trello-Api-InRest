package uz.shox.clonetrelloapiinrest.dto.card;

import lombok.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:31 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardAddMemberDto {
    private Long id;
    private String memberEmail;
}
