package uz.shox.clonetrelloapiinrest.dto.jwt;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 17/11/22 17:11 (Thursday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
public record JwtResponseDto(
        String accessToken,
        String refreshToken,
        String tokenType) {
}
