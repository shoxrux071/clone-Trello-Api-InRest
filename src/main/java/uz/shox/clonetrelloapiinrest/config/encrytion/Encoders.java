package uz.shox.clonetrelloapiinrest.config.encrytion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 19/11/22 19:38 (Saturday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Configuration
public class Encoders {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
