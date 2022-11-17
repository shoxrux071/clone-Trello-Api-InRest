package uz.shox.clonetrelloapiinrest.domains.board;

import lombok.*;
import uz.shox.clonetrelloapiinrest.domains.workspace.Workspace;
import uz.shox.clonetrelloapiinrest.enums.board.BoardVisibilityType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 15/11/22 23:53 (Tuesday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private BoardVisibilityType visibilityType;
    @Builder.Default
    @OneToMany(mappedBy = "board")
    private Set<BoardColumn> columns = new HashSet<>();
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id", nullable = false, referencedColumnName = "id")
    private Workspace workspace;

    @Builder.Default
    @Column(columnDefinition = "bool default false")
    private Boolean isDeleted = false;


}
