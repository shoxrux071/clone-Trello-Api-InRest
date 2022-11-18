package uz.shox.clonetrelloapiinrest.repos.boardColumn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.shox.clonetrelloapiinrest.domains.board.BoardColumn;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 18/11/22 16:52 (Friday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Repository
public interface BoardColumnRepository extends JpaRepository<BoardColumn,Long> {
}
