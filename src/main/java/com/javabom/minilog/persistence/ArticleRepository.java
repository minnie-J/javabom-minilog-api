package com.javabom.minilog.persistence;

import com.javabom.minilog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@RepositoryRestResource(collectionResourceRel = "data", path = "data")
//@RepositoryRestResource(collectionResourceRel = "data", path = "articles")
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    // 상속만으로 save(),  findOne(), findAll(), count(), delete()의 기본 기능 자동 제공
    // 기본 기능 이외의 조회 기능을 추가할 때 메소드 추가
//    Article findByAuthor(String author);
//    Article findByAuthorAndCategory(String author, String category);
    List<Article> findAllByCategory(String category);
}
