package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class UserEntity {
    @Id
    private String id;
    private String pin;
    @OneToOne
    CustomerEntity customerEntity;
    @OneToOne
    AccountEntity accountEntity;
}
