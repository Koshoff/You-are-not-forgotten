package com.example.You.are.not.forgotten.services;

import com.example.You.are.not.forgotten.entities.Post;
import com.example.You.are.not.forgotten.entities.dto.PostDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public interface PostService {

    void savePost(MultipartFile image, String content, LocalDate publishDate) throws IOException;

    List<PostDTO> getAllPosts();

    Post findByImageFilename(String imageFilename);




}
