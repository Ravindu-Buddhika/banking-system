package org.example.model.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Deposit {
    private String sender;
    private String receiver;
    private BigDecimal amount;
    private String reference;
}
