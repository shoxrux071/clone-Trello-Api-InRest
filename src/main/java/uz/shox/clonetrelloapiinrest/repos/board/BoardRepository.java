package uz.shox.clonetrelloapiinrest.repos.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.shox.clonetrelloapiinrest.domains.board.Board;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 18/11/22 16:51 (Friday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Repository
public interface BoardRepository extends JpaRepository<Board,Long> {
}
