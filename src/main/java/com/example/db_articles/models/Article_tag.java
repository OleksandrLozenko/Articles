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
@Table (name = "article_tags")
public class Article_tag {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 6)
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn (name = "article_id")
    private Article article_id;

    @ManyToOne
    @JoinColumn (name = "tag_id")
    private Tag tag_id;


}