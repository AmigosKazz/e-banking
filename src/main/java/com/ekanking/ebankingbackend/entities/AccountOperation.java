package com.ekanking.ebankingbackend.entities;

import com.ekanking.ebankingbackend.enums.OperationType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    @ManyToOne
    private BankAccount bankAccount;
}
