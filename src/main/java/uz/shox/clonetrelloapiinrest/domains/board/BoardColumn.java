package uz.shox.clonetrelloapiinrest.domains.board;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 15:11 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class BoardColumn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "column_order")
    private Integer order;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Board.class)
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @Builder.Default
    @OneToMany(
            mappedBy = "boardColumn",
            cascade = CascadeType.MERGE,
            fetch = FetchType.LAZY
    )
    private List<Card> cardSet = Collections.emptyList();
    @Builder.Default
    @Column(columnDefinition = "bool default false")
    private Boolean isDeleted = false;



}
