package com.example.bank_system.controller;

import com.example.bank_system.domain.Account;
import com.example.bank_system.domain.AccountDto;
import com.example.bank_system.domain.Member;
import com.example.bank_system.domain.MemberDto;
import com.example.bank_system.repository.MemberRepository;
import com.example.bank_system.service.AccountService;
import com.example.bank_system.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    MemberRepository memberRepository;

    @PostMapping("account/create")
    @ResponseBody
    public String createAccount(@RequestBody AccountDto accountDto) {
        Member member1 = memberRepository.findByEmail(accountDto.getEmail());
        Account account1 = Account.builder()
                        .bank_name(accountDto.getBank_name())
                        .account_number(accountDto.getAccount_number())
                        .amount(accountDto.getAmount())
                        .member(member1)
                        .build();
        accountService.create(account1);
        return "ok";
    }

}
