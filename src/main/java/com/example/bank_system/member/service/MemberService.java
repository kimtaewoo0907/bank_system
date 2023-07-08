package com.example.bank_system.member.service;

import com.example.bank_system.member.domain.Member;
import com.example.bank_system.member.domain.MemberDto;
import com.example.bank_system.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void create(Member member) throws SQLException {
        memberRepository.save(member);
    }
}
