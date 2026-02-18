package org.example.model.dto;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Transaction {
    private String sender;
    private String receiver;
    private BigDecimal amount;
    private LocalDateTime dateTime;
    private String reference;
}
