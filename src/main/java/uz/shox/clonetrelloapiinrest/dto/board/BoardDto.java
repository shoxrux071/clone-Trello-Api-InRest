package uz.shox.clonetrelloapiinrest.dto.board;

import uz.shox.clonetrelloapiinrest.dto.base.BaseGenericDto;
import uz.shox.clonetrelloapiinrest.dto.boardColumn.BoardColumnDto;
import uz.shox.clonetrelloapiinrest.enums.board.BoardVisibilityType;

import java.util.Base64;
import java.util.Set;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 16:02 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
public class BoardDto implements BaseGenericDto {

    private Long id;
    private String name;
    private BoardVisibilityType visibilityType;
    private Long workspaceId;
    private Set<BoardColumnDto> boardColumns;
}
