package com.example.bank_system.controller;

import com.example.bank_system.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class FileUploadController {

    @Autowired
    FileUploadService fileUploadService;

    @PostMapping("file/create")
    @ResponseBody
    public String fileUpload(@RequestParam("file")MultipartFile file,
                             @RequestParam("member_email")String email) throws IOException {
        fileUploadService.fileSave(file, email);
        return "ok";
    }

}
