package com.example.bank_system.member.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
    private String name;
    private String email;
    private String account_number;
    private int special_exchange_rate;
}
