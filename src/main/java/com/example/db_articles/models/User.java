package com.example.db_articles.models;
import jakarta.persistence.*;
import lombok. AllArgsConstructor;
import lombok. Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 30)
    private String username;

    @Column(nullable = false, length = 30)
    private String email;

    @Column(nullable = false, length = 200)
    private String password;

    @Column(nullable = false, length = 500)
    private String bio;

    @Column(nullable = false)
    private LocalDateTime created_at;

    @Column(nullable = false, length = 200)
    private String image_url;

    @OneToMany(mappedBy = "user")
    private List<Article> articles;


}