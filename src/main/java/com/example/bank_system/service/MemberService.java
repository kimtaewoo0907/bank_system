package com.example.bank_system.service;

import com.example.bank_system.domain.Member;
import com.example.bank_system.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void create(Member member) throws SQLException {
        memberRepository.save(member);
    }

    public List<Member> findAll() {
        List<Member> members = memberRepository.findAll();
        return members;
    }

    public Member findByEmail(String email) {
        return memberRepository.findByEmail(email);
    }

}
