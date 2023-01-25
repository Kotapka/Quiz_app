package com.example.Quiz_app.registerCode;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class responsible for providing a HTTP response.
 */
@RestController
public class CodeApi {

    /**
     * Method returning response code to get information about the connection.
     * @param code - body of a response.
     * @return - response code.
     */
    @PostMapping("/apiCode")
    public ResponseEntity<Code> greet(@RequestBody Code code) {
        return ResponseEntity.ok(code); //return ResponseEntity.badRequest(loginRequest);
    }
}