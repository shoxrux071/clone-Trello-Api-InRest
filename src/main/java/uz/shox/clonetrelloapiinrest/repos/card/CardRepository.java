package uz.shox.clonetrelloapiinrest.repos.card;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.shox.clonetrelloapiinrest.domains.board.Card;
import uz.shox.clonetrelloapiinrest.domains.workspace.Workspace;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 18/11/22 16:54 (Friday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Repository
public interface CardRepository extends JpaRepository<Card,Long> {
    @Query("""
select w from Card c join c.boardColumn t join t.board b join b.workspace w where c.id=:cardId
""")
    Workspace findWorkspaceByCard(Long cardId);
}
