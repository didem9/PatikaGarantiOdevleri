package com.gtspring.BankingApp.service.entityservice;

import com.gtspring.BankingApp.entity.Customer;
import com.gtspring.BankingApp.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerEntityService {

    private CustomerRepository customerRepository;

    public CustomerEntityService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer) {
        customer = customerRepository.save(customer);

        return customer;
    }

    public void deleteCustomer(Customer customer){
        customerRepository.delete(customer);
    }

    public Optional<Customer> findById(Long id){
        Optional<Customer> customerOptional = customerRepository.findById(id);
        return customerOptional;
    }

    public Optional<Customer> findByIdentityNo(String identityNo){
        Optional<Customer> customerIdentityNo = customerRepository.findByIdentityNo(identityNo);
        return customerIdentityNo;
    }
}
