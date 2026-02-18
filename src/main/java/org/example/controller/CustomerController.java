package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.dto.SignupRequest;
import org.example.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/signup")
    public ResponseEntity<String> createCustomer(@RequestBody SignupRequest signupRequest) {
        try {
            String result = customerService.register(signupRequest);

            return ResponseEntity.status(201).body(result);
        } catch (Exception e) {
            return ResponseEntity.status(400).body("Registration Failed: " + e.getMessage());
        }
    }
}