package com.company.service;

import com.company.entity.UsersEntity;
import com.company.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UsersRepository getUsersRepository() {
        return usersRepository;
    }

    public Optional<UsersEntity> findById(long id) {
        return usersRepository.findById(id);
    }

    public void insertUser(UsersEntity entity) {
        usersRepository.save(entity);
    }

    public Iterable<UsersEntity> getAllUsers() {
        return usersRepository.findAll();
    }

    public void deleteUserById(Long id) {
        usersRepository.deleteById(id);
    }

    public void deleteAllUsers() {
        usersRepository.deleteAll();
    }
}
