package com.ekanking.ebankingbackend.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "customer")
    private List<BankAccount> bankAccounts;
}
