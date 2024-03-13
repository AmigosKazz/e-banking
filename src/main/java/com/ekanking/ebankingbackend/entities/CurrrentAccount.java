package com.ekanking.ebankingbackend.entities;

import jakarta.persistence.OneToMany;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@NonNull
public class CurrrentAccount extends BankAccount {

    private double overdraft;

}
