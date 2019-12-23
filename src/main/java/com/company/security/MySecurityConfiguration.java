package com.company.security;

import com.company.database.DbUserInitial;
import com.company.entity.UsersEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Slf4j
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {

    public MySecurityConfiguration(DbUserInitial initial) {

        log.info("insert process started...");
        initial.create(new UsersEntity());
        log.info("insert process successfully.");
    }
}
