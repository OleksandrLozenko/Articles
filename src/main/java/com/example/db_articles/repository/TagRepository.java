package com.example.db_articles.repository;
import com.example.db_articles.models.Article;
import com.example.db_articles.models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository public interface TagRepository extends JpaRepository<Tag, Long> {
    List<Tag> findByName(String name);

    void deleteByName(String name);
}
