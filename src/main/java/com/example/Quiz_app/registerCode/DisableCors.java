package com.example.Quiz_app.registerCode;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Class responsible for disabling Cross-Origin Resource Sharing (CORS).
 */
@Configuration
public class DisableCors implements WebMvcConfigurer {

    /**
     * Method responsible for restricting the resources implemented in web browsers.
     * @param registry - CORS registry, on which mappping is being performed.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*");
    }
}

