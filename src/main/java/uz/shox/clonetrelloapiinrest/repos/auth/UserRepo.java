package uz.shox.clonetrelloapiinrest.repos.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.shox.clonetrelloapiinrest.domains.auth.AuthUser;

import java.util.Optional;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 18/11/22 16:49 (Friday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Repository
public interface UserRepo extends JpaRepository<AuthUser,Long> {
    Optional<AuthUser> findByEmail(String email);
}
