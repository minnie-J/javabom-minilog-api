package com.javabom.minilog.persistence;

import com.javabom.minilog.domain.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleRepositoryTest {

    @Autowired
    ArticleRepository articleRepository;

    public void cleanup() {
        articleRepository.deleteAll();
    }

    @Test
    public void TestGetArticles() {

        articleRepository.save(new Article(1, "title", "content", "symbol", Timestamp.valueOf(LocalDateTime.now()), "class", "a", 3.5, "a", "a", "a", "a", 50));

        List<Article> list = articleRepository.findAll();

        Article article = list.get(0);
    }
}
