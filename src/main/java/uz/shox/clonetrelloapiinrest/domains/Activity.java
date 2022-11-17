package uz.shox.clonetrelloapiinrest.domains;

import lombok.*;
import uz.shox.clonetrelloapiinrest.domains.auth.AuthUser;
import uz.shox.clonetrelloapiinrest.domains.board.Board;

import javax.persistence.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 15:43 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private AuthUser user;
    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;
    private String description;
}
