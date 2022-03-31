package com.hrapau.docker.service;

import com.hrapau.docker.dao.UserRepository;
import com.hrapau.docker.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
