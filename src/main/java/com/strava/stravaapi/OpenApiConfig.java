package com.strava.stravaapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("My Strava API")
                        .version("v6.6.6")
                        .description("This is my custom API documentation")
                        .contact(new Contact().name("Dhiego Silva").email("dhiego.silva@good.com"))
                );
    }
}
