package edu.icet.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class Config {
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("My API")
                        .version("1.0")
                        .description("This is the API documentation for my Spring Boot application"));
    }

}
