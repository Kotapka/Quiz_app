package com.example.Quiz_app.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class responsible for access to repository.
 */
@Service
public class UserService {
    private final UserRepository userRepository;

    /**
     * Constructor.
     * @param userRepository - chosen repository.
     */
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Method returning all items found in repository.
     * @return all items from repository.
     */
    public List<Users> getUser(){
        return userRepository.findAll();
    }
}
