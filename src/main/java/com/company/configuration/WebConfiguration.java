package com.company.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    public void addViewController(ViewControllerRegistry registry) {

        registry.addViewController(">>> something here <<<");
    }
}
