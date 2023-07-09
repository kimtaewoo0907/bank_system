package com.example.bank_system.repository;

import com.example.bank_system.domain.FileUpload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FileUploadRepository extends JpaRepository<FileUpload, Long> {
}
