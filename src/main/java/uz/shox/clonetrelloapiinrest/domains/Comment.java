package uz.shox.clonetrelloapiinrest.domains;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import uz.shox.clonetrelloapiinrest.domains.auth.AuthUser;
import uz.shox.clonetrelloapiinrest.domains.board.Card;

import javax.persistence.*;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 15:25 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = AuthUser.class)
    @JoinColumn(nullable = false, referencedColumnName = "id", name = "created_by")
    private AuthUser creator;
    @Column(nullable = false)
    private String text;
    private String attachment;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(nullable = false, name = "card_id", referencedColumnName = "id")
    private Card card;
}