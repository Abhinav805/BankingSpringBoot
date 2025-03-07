package com.banking.banking_app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="accounts")
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="account_name_holder")
    private String accountHolderName;

    public Account(String accountHolderName, Double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    private double balance;
}
