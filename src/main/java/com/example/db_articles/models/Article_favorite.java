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
@Table (name = "articleFavorites")
public class Article_favorite {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 6)
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn (name = "articleId")
    private Article articleId;

    @ManyToOne
    @JoinColumn (name = "userId")
    private User userId;


}
