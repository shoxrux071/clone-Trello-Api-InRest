package uz.shox.clonetrelloapiinrest.mappers.board;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uz.shox.clonetrelloapiinrest.domains.Comment;
import uz.shox.clonetrelloapiinrest.dto.comment.CommentCreateDto;
import uz.shox.clonetrelloapiinrest.dto.comment.CommentDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 21:10 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Mapper(componentModel = "spring")
public interface CommentMapper {

    Comment fromCreateDto(CommentCreateDto dto);

    @Mapping(target = "creator", source = "creator.email")
    @Mapping(target = "cardId", source = "card.id")
    CommentDto fromComment(Comment comment);
}