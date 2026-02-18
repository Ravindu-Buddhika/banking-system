package org.example.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class TransactionEntity {
    @Id
    private String id;
    private BigDecimal amount;
    private LocalDateTime dateTime;
    private String reference;
    @ManyToOne
    @JoinColumn(name = "sender_account_no")
    private AccountEntity senderAccount;

    @ManyToOne
    @JoinColumn(name = "receiver_account_no")
    private AccountEntity receiverAccount;
}
