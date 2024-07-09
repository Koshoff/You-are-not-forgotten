package com.example.You.are.not.forgotten.services.impl;

import com.example.You.are.not.forgotten.entities.Post;
import com.example.You.are.not.forgotten.entities.User;
import com.example.You.are.not.forgotten.entities.dto.PostDTO;
import com.example.You.are.not.forgotten.repositories.PostRepository;
import com.example.You.are.not.forgotten.repositories.UserRepository;
import com.example.You.are.not.forgotten.services.PostService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import util.SecurityUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    private static final String UPLOADED_FOLDER = "C:/Users/Koshoff/Downloads/You are not forgotten/You-are-not-forgotten/src/main/resources/static/images/post_images";


    private final PostRepository postRepository;

    private final UserRepository userRepository;

    public PostServiceImpl(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void savePost(MultipartFile image, String content, LocalDate publishDate) throws IOException {
        // Ensure the base upload directory exists
        Path uploadPath = Paths.get(UPLOADED_FOLDER);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }

        // Generate a unique file name
        String uniqueFileName = image.getOriginalFilename();
        Path path = uploadPath.resolve(uniqueFileName);
        Files.write(path, image.getBytes());

        // Save post details to the database
        Post post = new Post();
        post.setImageFilename(uniqueFileName);
        post.setContent(content);
        post.setPublishDate(publishDate);

        postRepository.save(post);

    }
    @Override
    public List<PostDTO> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream()
                .map(post -> {
                    PostDTO dto = new PostDTO();
                    dto.setId(post.getId());
                    dto.setContent(post.getContent());
                    dto.setImageFilename(post.getImageFilename());
                    dto.setPublishDate(post.getPublishDate());
                    return dto;
                })
                .collect(Collectors.toList());
    }

    @Override
    public Post findByImageFilename(String imageFilename) {
        return postRepository.findByImageFilename(imageFilename);
    }


}
