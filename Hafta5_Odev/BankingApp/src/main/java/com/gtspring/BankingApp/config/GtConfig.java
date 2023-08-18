package com.gtspring.BankingApp.config;

import com.gtspring.BankingApp.repository.CustomerRepository;
import com.gtspring.BankingApp.service.entityservice.CustomerEntityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GtConfig {

    @Bean
    public CustomerEntityService CustomerEntityService(CustomerRepository customerRepository){

        return new CustomerEntityService(customerRepository);
    }


}
