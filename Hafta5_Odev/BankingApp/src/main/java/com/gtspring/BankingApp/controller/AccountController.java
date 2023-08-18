package com.gtspring.BankingApp.controller;

import com.gtspring.BankingApp.entity.Account;
import com.gtspring.BankingApp.entity.Customer;
import com.gtspring.BankingApp.service.entityservice.AccountEntityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    private AccountEntityService accountEntityService;

    public AccountController(AccountEntityService accountEntityService) {
        this.accountEntityService = accountEntityService;
    }

    @PostMapping
    public Account save(@RequestBody Account account) {
        account = accountEntityService.saveAccount(account);

        return account;
    }

    @DeleteMapping
    public void deleteAccount(@PathVariable Account account){
        accountEntityService.deleteAccount(account);
        System.out.println("Account is deleted: ");

    }
}
