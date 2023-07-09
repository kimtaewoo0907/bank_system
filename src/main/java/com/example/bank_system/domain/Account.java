package com.example.bank_system.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bank_name;

    private String account_number;

    private int amount;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Member member;

    @CreatedDate
    private LocalDateTime createDate;

    @Builder
    public Account(String bank_name, String account_number, int amount, Member member) {
        this.bank_name = bank_name;
        this.account_number = account_number;
        this.amount = amount;
        this.member = member;
    }

}
