package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class CustomerEntity {
    @Id
    private String id;
    private String firstName;
    private String secondName;
    private String nic;
    private String email;
    private String phone;
}
