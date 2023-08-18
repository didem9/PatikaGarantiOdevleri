package com.gtspring.BankingApp.repository;

import com.gtspring.BankingApp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // query yazmadan
    Optional<Customer> findByIdentityNo(String identityNo);

    //query yazarak
    @Query("select c from Customer c where c.email = :email")
    List<Customer> findByEmail(String email);
}
