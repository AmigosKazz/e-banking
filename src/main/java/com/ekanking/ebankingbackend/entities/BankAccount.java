package com.ekanking.ebankingbackend.entities;

import com.ekanking.ebankingbackend.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private double balance;
    private Date createAt;
    private AccountStatus status;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "bankAccount")
    private List<AccountOperation> accountOperations;
}
