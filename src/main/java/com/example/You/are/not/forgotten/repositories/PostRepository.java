package com.example.You.are.not.forgotten.repositories;

import com.example.You.are.not.forgotten.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Post findByImageFilename(String filename);
}
