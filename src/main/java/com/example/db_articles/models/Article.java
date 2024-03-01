package com.example.db_articles.models;
import jakarta.persistence.*;
import lombok. AllArgsConstructor;
import lombok.Getter;
import lombok. NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "articles")
public class Article {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 50)
    private String slug;

    @Column(nullable = false, length = 50)
    private String description;

    @Column(nullable = false, length = 1000)
    private String content;

    @Column(nullable = false, length = 6)
    private LocalDateTime created_at;

    @Column(nullable = false, length = 6)
    private LocalDateTime  updated_at;

    @ManyToOne
    @JoinColumn (name = "author_id")
    private User user;




}