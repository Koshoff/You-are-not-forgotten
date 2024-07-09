package com.example.You.are.not.forgotten.rest_controllers;


import com.example.You.are.not.forgotten.services.PostService;
import com.example.You.are.not.forgotten.services.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;


@RestController
public class UploadPostRestController {


    private final UserService userService;

    private final PostService postService;


    public UploadPostRestController(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @PostMapping("/upload-post")
    public String handleFileUpload(
            @RequestParam("image") MultipartFile image,
            @RequestParam("content") String content) throws IOException {

        if (image.isEmpty() || content.isEmpty()) {
            return "Please fill all required fields";
        }

        postService.savePost(image, content, LocalDate.now());

        return "palec";
    }



}
