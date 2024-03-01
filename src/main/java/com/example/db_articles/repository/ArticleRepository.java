package com.example.db_articles.repository;
import com.example.db_articles.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository public interface ArticleRepository extends JpaRepository<Article, Long> {
    List<Article> findByTitle(String title);

    List<Article> findBySlug(String slug);

    List<Article> findByDescription(String description);

    List<Article> findAllByOrderByTitle();

    void deleteByTitle(String title);
}
