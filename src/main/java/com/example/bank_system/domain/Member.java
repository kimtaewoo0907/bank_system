package com.example.bank_system.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @Column(length = 50, unique = true)
    private String email;

    @Column
    private String account_number;

    @Column
    private int special_exchange_rate;

    @Column(name = "file", columnDefinition = "varchar(255) default 'N'")
    private String file;

    // 자동 날짜 생성 어노테이션
    @CreatedDate
    private LocalDateTime createDate;

    @Builder
    public Member(String name, String email, String account_number, int special_exchange_rate) {
        this.name = name;
        this.email = email;
        this.account_number = account_number;
        this.special_exchange_rate = special_exchange_rate;
    }
}
