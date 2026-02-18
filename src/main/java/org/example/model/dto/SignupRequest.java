package org.example.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SignupRequest {
    private String firstName;
    private String secondName;
    private String nic;
    private String email;
    private String phone;
    private String password;
}