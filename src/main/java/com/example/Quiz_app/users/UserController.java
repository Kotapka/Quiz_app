package com.example.Quiz_app.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/Register")
    public Users registerUser(@RequestBody Users user){
        System.out.println(user);
        userService.saveUserFromApi(user);
        return userService.registerUser(user);
    }
    @PostMapping("/Login")
    public ResponseEntity<String> login(@RequestBody Users user) {
        boolean isValid = userService.checkCredentials(user);
        if (isValid) {
            return ResponseEntity.ok("Logowanie powiodło sie");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PostMapping
    public List<Users> getUser(){
        return userService.getUser();
    }
}
