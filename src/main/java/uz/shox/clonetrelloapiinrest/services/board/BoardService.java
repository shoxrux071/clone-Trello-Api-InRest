package uz.shox.clonetrelloapiinrest.services.board;

import uz.shox.clonetrelloapiinrest.dto.board.BoardChangeVisibilityDto;
import uz.shox.clonetrelloapiinrest.dto.board.BoardCreateDto;
import uz.shox.clonetrelloapiinrest.dto.board.BoardDto;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 19/11/22 20:16 (Saturday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
public interface BoardService {
    BoardDto save(BoardCreateDto dto);

    BoardDto get(Long id);

    void changeVisibility(BoardChangeVisibilityDto dto);

    void deleteBoard(Long id);
}
