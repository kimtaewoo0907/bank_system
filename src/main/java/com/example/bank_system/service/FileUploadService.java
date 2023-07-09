package com.example.bank_system.service;

import com.example.bank_system.domain.FileUpload;
import com.example.bank_system.repository.FileUploadRepository;
import com.example.bank_system.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;

@Service
@Transactional
public class FileUploadService {

    @Autowired
    FileUploadRepository fileUploadRepository;
    @Autowired
    MemberRepository memberRepository;

    public void fileSave(MultipartFile file, String email) throws IOException {
        // 서버 디스크의 실제 저장위치를 지정 : FileUploadTest
//        String folder = "C:\\FileUploadTest\\"+email;
        // 해당 폴더가 있는지 검사 후, 없으면 폴더 생성
        File folder = new File("C:\\FileUploadTest\\"+email);
        if(!folder.exists()) {
            folder.mkdirs();
        }
        File uploadFolder = new File(folder, file.getOriginalFilename());
        file.transferTo(uploadFolder);
        // fileupload DB save
        FileUpload fileUpload = FileUpload.builder()
                        .file_path(uploadFolder.toString())
                        .member(memberRepository.findByEmail(email))
                        .build();
        fileUploadRepository.save(fileUpload);
        // 고객정보 : upload 여부
    }
}
