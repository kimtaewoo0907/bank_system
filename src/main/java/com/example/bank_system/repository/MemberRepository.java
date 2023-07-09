package com.example.bank_system.repository;

import com.example.bank_system.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}
