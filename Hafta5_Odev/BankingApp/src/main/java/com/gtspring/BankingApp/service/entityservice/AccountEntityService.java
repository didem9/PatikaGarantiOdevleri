package com.gtspring.BankingApp.service.entityservice;

import com.gtspring.BankingApp.entity.Account;
import com.gtspring.BankingApp.entity.Customer;
import com.gtspring.BankingApp.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountEntityService {

    private AccountRepository accountRepository;

    public AccountEntityService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account saveAccount(Account account) {
        account = accountRepository.save(account);

        return account;
    }

    public void deleteAccount(Account account){
        accountRepository.delete(account);
    }
}
