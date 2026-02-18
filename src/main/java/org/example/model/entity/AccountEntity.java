package org.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
    private String accNumber;
    private String type;
    private BigDecimal balance;
    @ManyToOne
    CustomerEntity customerEntity;
}
