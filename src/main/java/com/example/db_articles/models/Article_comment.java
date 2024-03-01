package com.example.db_articles.models;
import jakarta.persistence.*;
import lombok. AllArgsConstructor;
import lombok.Getter;
import lombok. NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "articleComments")
public class Article_comment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 500)
    private String content;

    @Column(nullable = false, length = 6)
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn (name = "authorId")
    private User userId;

    @ManyToOne
    @JoinColumn (name = "articleId")
    private Article article;


}
