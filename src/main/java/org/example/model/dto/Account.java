package org.example.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {
    private String accNumber;
    private String type;
    private BigDecimal balance;
}
