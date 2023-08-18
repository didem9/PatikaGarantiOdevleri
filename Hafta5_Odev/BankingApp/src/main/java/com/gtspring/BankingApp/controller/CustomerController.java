package com.gtspring.BankingApp.controller;

import com.gtspring.BankingApp.entity.Customer;
import com.gtspring.BankingApp.service.entityservice.CustomerEntityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    private CustomerEntityService customerEntityService;

    public CustomerController(CustomerEntityService customerEntityService) {
        this.customerEntityService = customerEntityService;
    }

    @PostMapping
    public Customer saveC(@RequestBody Customer customer) {
        customer = customerEntityService.saveCustomer(customer);

        return customer;
    }

    @DeleteMapping
    public void deleteCustomer(@PathVariable Customer customer){
        customerEntityService.deleteCustomer(customer);
        System.out.println("customer is deleted: ");

    }

    @GetMapping("/{id}")
    public Optional<Customer> getById(@PathVariable Long id){
        Optional<Customer> customer = customerEntityService.findById(id);
        return customer;
    }

    @GetMapping
    public Optional<Customer> getByIdentityNo(@RequestParam String identityNo){
        Optional<Customer> customerIdentityNo = customerEntityService.findByIdentityNo(identityNo);
        return customerIdentityNo;
    }
}
