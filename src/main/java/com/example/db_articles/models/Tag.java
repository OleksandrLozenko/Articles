package com.example.db_articles.models;
import jakarta.persistence.*;
import lombok. AllArgsConstructor;
import lombok.Getter;
import lombok. NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "tag")
public class Tag {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 6)
    private Date createdAt;

    @Column(nullable = false, length = 20)
    private String name;


}
