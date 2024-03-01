package com.example.db_articles.models;
import jakarta.persistence.*;
import lombok. AllArgsConstructor;
import lombok. Getter;
import lombok.NoArgsConstructor; import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "user_follows")
public class User_follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 6)
    private LocalDateTime created_at;

    @ManyToOne
    @JoinColumn (name = "follower_id")
    private User user_id;

    @ManyToOne
    @JoinColumn (name = "following_id")
    private Article article_id;



}