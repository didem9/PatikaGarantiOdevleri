package com.gtspring.BankingApp.repository;

import com.gtspring.BankingApp.entity.Account;
import com.gtspring.BankingApp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    // query yazmadan
    List<Account> findAllByCustomerId(Long customerId);

    //query yazarak
    @Query("select a from Account a where a.ibanNo = :ibanNo")
    List<Customer> findByIbanNo(String ibanNo);

}
