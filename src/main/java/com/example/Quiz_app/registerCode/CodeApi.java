package com.example.Quiz_app.registerCode;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeApi {
    @PostMapping("/apiCode")
    public ResponseEntity<Code> greet(@RequestBody Code code) {

        return ResponseEntity.ok(code); //return ResponseEntity.badRequest(loginRequest);
    }
}