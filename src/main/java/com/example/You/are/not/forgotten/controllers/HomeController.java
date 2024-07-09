package com.example.You.are.not.forgotten.controllers;

import com.example.You.are.not.forgotten.entities.Post;
import com.example.You.are.not.forgotten.entities.dto.PostDTO;
import com.example.You.are.not.forgotten.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final PostService postService;

    public HomeController(PostService postService) {
        this.postService = postService;
    }


    @GetMapping("/index")
    public String index(Model model) {
        // Retrieve all posts from the service
        List<PostDTO> posts = postService.getAllPosts();
        // Add the posts to the model
        model.addAttribute("posts", posts);
        // Return the name of the Thymeleaf template to render
        return "index";
    }
}
