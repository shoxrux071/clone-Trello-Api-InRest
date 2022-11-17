package uz.shox.clonetrelloapiinrest.mappers.board;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uz.shox.clonetrelloapiinrest.domains.board.Card;
import uz.shox.clonetrelloapiinrest.dto.card.CardCreateDto;
import uz.shox.clonetrelloapiinrest.dto.card.CardDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 21:03 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Mapper(componentModel = "spring",uses = {CommentMapper.class},injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CardMapper {
    @Mapping(target = "boardColumnId",source = "boardColumn.id")
    CardDto fromCard(Card card);

    Card fromCreateDto(CardCreateDto cardCreateDto);
}
