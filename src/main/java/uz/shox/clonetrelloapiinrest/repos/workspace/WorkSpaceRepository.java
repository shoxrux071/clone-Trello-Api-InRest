package uz.shox.clonetrelloapiinrest.repos.workspace;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.shox.clonetrelloapiinrest.domains.auth.AuthUser;
import uz.shox.clonetrelloapiinrest.domains.workspace.Workspace;

import java.util.List;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 18/11/22 17:00 (Friday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Repository
public interface WorkSpaceRepository extends JpaRepository<Workspace,Long> {
    @Query(value = """
select t from Workspace  t where (t.createdBy=:user or :user member of t.members) and t.isDeleted=false 
""")
    List<Workspace> findAllByUser(AuthUser user);
}
