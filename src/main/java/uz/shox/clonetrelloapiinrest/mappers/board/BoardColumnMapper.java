package uz.shox.clonetrelloapiinrest.mappers.board;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uz.shox.clonetrelloapiinrest.domains.board.BoardColumn;
import uz.shox.clonetrelloapiinrest.dto.boardColumn.BoardColumnCreateDto;
import uz.shox.clonetrelloapiinrest.dto.boardColumn.BoardColumnDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 21:11 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */

@Mapper(componentModel = "spring",
        uses = {CardMapper.class},
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BoardColumnMapper {
    BoardColumn fromCreateDto(BoardColumnCreateDto dto);

    @Mapping(target = "boardId", source = "board.id")
    BoardColumnDto fromBoardColumn(BoardColumn boardColumn);
}