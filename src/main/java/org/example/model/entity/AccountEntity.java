package org.example.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String accNumber;
    private String pin;
    private String type;
    private BigDecimal balance;
    @ManyToOne
    @JoinColumn(name = "cust_id")
    CustomerEntity customerEntity;
}
