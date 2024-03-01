package com.example.db_articles;
import com.example.db_articles.models.Article;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.db_articles.repository.UserRepository;
import com.example.db_articles.repository.TagRepository;
import com.example.db_articles.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure. SpringBootApplication;
import java.util.List;
@SpringBootApplication
public class DbArticlesApplication implements CommandLineRunner {

	@Autowired
	private ArticleRepository articleRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private TagRepository tagRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbArticlesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Article> list = articleRepository.findAllByOrderByTitle();
		for (Article article: list) {
			System.out.println(article.getSlug());
		}
	}
}



