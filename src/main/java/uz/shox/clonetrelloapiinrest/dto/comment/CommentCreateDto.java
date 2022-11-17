package uz.shox.clonetrelloapiinrest.dto.comment;

import lombok.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:07 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentCreateDto {
    private String creatorEmail;
    private String text;
    private String attachment;
    private Long cardId;
}