package com.example.Quiz_app.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterApi {
    @PostMapping("/apiRegister")
    public ResponseEntity<LoginRequest> greet(@RequestBody LoginRequest loginRequest) {

        return (ResponseEntity<LoginRequest>) ResponseEntity.status(400); //return ResponseEntity.badRequest(loginRequest);
    }
}
