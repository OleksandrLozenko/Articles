package com.example.db_articles.repository;
import com.example.db_articles.models.User;
import com.example.db_articles.models.User_follow;
import com.example.db_articles.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsername(String username);

    List<User> findByEmail(String email);

    List<User> findByBio(String bio);

    void deleteByUsername(String username);
}