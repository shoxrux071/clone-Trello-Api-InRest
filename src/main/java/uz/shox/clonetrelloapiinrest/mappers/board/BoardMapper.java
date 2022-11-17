package uz.shox.clonetrelloapiinrest.mappers.board;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uz.shox.clonetrelloapiinrest.domains.board.Board;
import uz.shox.clonetrelloapiinrest.dto.board.BoardCreateDto;
import uz.shox.clonetrelloapiinrest.dto.board.BoardDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 21:07 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Mapper(componentModel = "spring",uses = {CommentMapper.class,BoardColumnMapper.class},injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BoardMapper {
    Board fromCreateDto(BoardCreateDto dto);

    @Mapping(target = "workspaceId", source = "workspace.id")
    BoardDto fromBoard(Board board);
}
