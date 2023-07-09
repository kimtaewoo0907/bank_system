package com.example.bank_system.service;

import com.example.bank_system.domain.Account;
import com.example.bank_system.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public void create(Account account) {
        accountRepository.save(account);
    }

}
