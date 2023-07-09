package com.example.bank_system.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountDto {
    private String bank_name;
    private String email;
    private String account_number;
    private int amount;
}
