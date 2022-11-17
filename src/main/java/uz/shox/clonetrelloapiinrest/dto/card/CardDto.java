package uz.shox.clonetrelloapiinrest.dto.card;

import lombok.*;
import uz.shox.clonetrelloapiinrest.dto.auth.UserDto;
import uz.shox.clonetrelloapiinrest.dto.comment.CommentDto;

import java.util.List;
import java.util.Set;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:27 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDto {
    private Long id;
    private String name;
    private Set<UserDto> members;
    private Long boardColumnId;
    private List<CommentDto> comments;
}
