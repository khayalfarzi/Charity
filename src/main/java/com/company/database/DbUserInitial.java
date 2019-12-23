package com.company.database;

import com.company.entity.UsersEntity;
import com.company.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DbUserInitial {
    private final UsersRepository usersRepository;
    private final PasswordEncoder encoder;

    public DbUserInitial(UsersRepository usersRepository, PasswordEncoder encoder) {
        this.usersRepository = usersRepository;
        this.encoder = encoder;
    }

    public UsersRepository getUsersRepository() {
        return usersRepository;
    }

    public PasswordEncoder getEncoder() {
        return encoder;
    }

    public void create(UsersEntity entity) {
        usersRepository.save(entity);
    }
}
