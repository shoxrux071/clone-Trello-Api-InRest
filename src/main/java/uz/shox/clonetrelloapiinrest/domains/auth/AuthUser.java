package uz.shox.clonetrelloapiinrest.domains.auth;

import lombok.*;
import uz.shox.clonetrelloapiinrest.domains.workspace.Workspace;
import uz.shox.clonetrelloapiinrest.enums.auth.UserStatus;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 15/11/22 22:35 (Tuesday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AuthUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<AuthRole> roles = new HashSet<>();
    @Builder.Default
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus = UserStatus.ACTIVE;
    @Builder.Default
    private Boolean isActive = true;

    @OneToMany(mappedBy ="createdBy",fetch = FetchType.LAZY)
    private Set<Workspace> workspaces = new HashSet<>();
}
