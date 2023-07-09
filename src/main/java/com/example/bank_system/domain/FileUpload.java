package com.example.bank_system.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class FileUpload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String file_path;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Member member;

    @CreatedDate
    private LocalDateTime createDate;

    @Builder
    public FileUpload(String file_path, Member member) {
        this.file_path = file_path;
        this.member = member;
    }

}
