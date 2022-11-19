package uz.shox.clonetrelloapiinrest.config.openApi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 19/11/22 19:40 (Saturday)
 * clone-Trello-Api-InRest/IntelliJ IDEA
 */
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "my first Api in restful way", version = "v1.1",
                description = "this is ongoing long supported version . Do not repeat at home ",
                contact = @Contact(name = "Shoxrux Berdimurodov", url = "https://pdp.uz", email = "faker@gamilcom"),
                license = @License(name = "Apache Foundation", url = "http://apache.org")
        ),
        security = {@SecurityRequirement(name = "Bearer")

        }
)

@SecurityScheme(
        name = "Bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "Bearer"
)
public class OpenApiConfigurer {
}
