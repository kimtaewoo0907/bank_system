package com.example.bank_system.controller;

import com.example.bank_system.domain.Member;
import com.example.bank_system.domain.MemberDto;
import com.example.bank_system.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("member/create")
    @ResponseBody
    public String createMember(@RequestBody MemberDto memberDto) throws SQLException {
        Member member1 = Member.builder()
                .name(memberDto.getName())
                .email(memberDto.getEmail())
                .account_number(memberDto.getAccount_number())
                .special_exchange_rate(memberDto.getSpecial_exchange_rate())
                .build();
        memberService.create(member1);
        return "ok";
    }

    @PostMapping("send/money")
    @ResponseBody
    public String sendMoney() {
        // 송금할 화폐 선택

        return "ok";
    }

}
