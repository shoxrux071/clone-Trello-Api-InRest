package uz.shox.clonetrelloapiinrest.validators.board;

import org.springframework.stereotype.Component;
import uz.shox.clonetrelloapiinrest.domains.board.BoardColumn;
import uz.shox.clonetrelloapiinrest.dto.boardColumn.BoardColumnCreateDto;
import uz.shox.clonetrelloapiinrest.dto.boardColumn.BoardColumnUpdateDto;
import uz.shox.clonetrelloapiinrest.exceptions.ValidationException;
import uz.shox.clonetrelloapiinrest.validators.base.AbstractValidator;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 19/11/22 21:21 (Saturday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Component
public class BoardColumnValidator extends AbstractValidator<BoardColumnCreateDto, BoardColumnUpdateDto,Long> {



    @Override
    public void validateKeY(Long id) throws ValidationException {

    }
    protected BoardColumn getBoardColumn(Long id){

    }

    @Override
    public void validateOnCreate(BoardColumnCreateDto dto) throws ValidationException {

    }

    @Override
    public void validateOnUpdate(BoardColumnUpdateDto dto) throws ValidationException {

    }
}
