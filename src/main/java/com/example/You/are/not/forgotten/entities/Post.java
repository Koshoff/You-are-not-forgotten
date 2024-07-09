package com.example.You.are.not.forgotten.entities;

import com.example.You.are.not.forgotten.entities.base.entity.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post extends BaseEntity {

    @Column(columnDefinition = "TEXT") // For longer texts
    private String content;

    @Column(nullable = false)
    private String imageFilename;
    private LocalDate publishDate;

    public Post() {

    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public String getImageFilename() {
        return imageFilename;
    }

    public void setImageFilename(String imageFilename) {
        this.imageFilename = imageFilename;
    }
}
