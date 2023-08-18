package com.gtspring.BankingApp.entity;

import com.gtspring.BankingApp.enums.AccountTypeEnum;
import com.gtspring.BankingApp.enums.CurrencyTypeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Account")
    @SequenceGenerator(name = "Account", sequenceName = "ACCOUNT_ID_SEQ", allocationSize = 1)
    private Long Id;

   @Column(name = "customerId", length = 50, nullable = false)
    private Long customerId;

    @Column(name = "ibanNo", length = 50, nullable = false)
    private String ibanNo;

    @Column(name = "currentBalance")
    private Long currentBalance;

    @Column(name = "currencyType")
    @Enumerated(EnumType.STRING)
    private CurrencyTypeEnum currencyTypeEnum;

    @Column(name = "accountTypeEnum")
    @Enumerated(EnumType.STRING)
    private AccountTypeEnum accountTypeEnum;

}