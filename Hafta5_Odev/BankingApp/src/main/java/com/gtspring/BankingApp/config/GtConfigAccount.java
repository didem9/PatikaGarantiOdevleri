package com.gtspring.BankingApp.config;

import com.gtspring.BankingApp.repository.AccountRepository;
import com.gtspring.BankingApp.service.entityservice.AccountEntityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GtConfigAccount {
    @Bean
    public AccountEntityService AccountEntityService(AccountRepository accountRepository){

        return new AccountEntityService(accountRepository);
    }
}
