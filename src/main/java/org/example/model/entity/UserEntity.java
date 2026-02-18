package org.example.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pin;
    @OneToOne
    @JoinColumn(name = "cust_id")
    CustomerEntity customerEntity;
    @OneToOne
    @JoinColumn(name = "acc_id")
    AccountEntity accountEntity;
}
