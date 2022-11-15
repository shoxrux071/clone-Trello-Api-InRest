package uz.shox.clonetrelloapiinrest.domains.workspace;

import lombok.*;
import uz.shox.clonetrelloapiinrest.domains.auth.AuthUser;
import uz.shox.clonetrelloapiinrest.domains.board.Board;
import uz.shox.clonetrelloapiinrest.enums.workspace.WorkspaceType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 15/11/22 23:13 (Tuesday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Workspace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    @JoinColumn(nullable = false,referencedColumnName = "id",name = "created_by")
    private AuthUser createdBy;
    @Enumerated(EnumType.STRING)
    private WorkspaceType type;

    private String description;
    @Builder.Default
    private Boolean isVisible = true;
    @Builder.Default
    @OneToMany(mappedBy = "workspace",fetch = FetchType.LAZY)
    private Set<Board> boards = new HashSet<>();

    @Builder.Default
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinTable(joinColumns = @JoinColumn(name = "workspace_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<AuthUser> members = new HashSet<>();
}
