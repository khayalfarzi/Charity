package com.company;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    public void addViewController(ViewControllerRegistry registry) {
        String[][] mapped = {
                {"/", "main"},
                {"", ""},        // please give me input...
                {"", ""},
                {"", ""}
        };

        for (String[] site : mapped) {
            registry.addViewController(site[0]).setViewName(site[1]);
        }
    }
}
