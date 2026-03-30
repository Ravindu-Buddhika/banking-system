package org.example.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private String firstName;
    private String secondName;
    private String nic;
    private String email;
    private String phone;
}
