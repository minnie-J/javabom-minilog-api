package com.javabom.minilog.persistence;

import com.javabom.minilog.domain.Article;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

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
//        Article article = new Article(1, "title", "content", "symbol", Timestamp.valueOf(LocalDateTime.now()), "class", "a", 3.5, "a", "a", "a", "a", 1);
//        articleRepository.save(article);

        List<Article> list = articleRepository.findAll();

        Article article1 = list.get(0);
        assertThat(article1.getId()).isEqualTo(1);
    }
}
