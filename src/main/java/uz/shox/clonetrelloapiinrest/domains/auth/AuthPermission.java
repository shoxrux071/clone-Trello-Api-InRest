package uz.shox.clonetrelloapiinrest.domains.auth;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 15/11/22 23:25 (Tuesday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AuthPermission implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String code;


    @Override
    public String getAuthority() {
        return this.code;
    }
}
