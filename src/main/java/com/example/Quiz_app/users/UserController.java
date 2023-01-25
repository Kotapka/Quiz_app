package com.example.Quiz_app.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Class containing information about used service.
 */
@RestController
@RequestMapping(path = "/apiLogin")
public class UserController {
    private final UserService userService;

    /**
     * Constructor.
     * @param userService - service being used.
     */
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Function returning User class object.
     * @return - User class object from user's service.
     */
    @PostMapping
    public List<Users> getUser(){
        return userService.getUser();
    }
}
