package com.javabom.minilog.persistence;

import com.javabom.minilog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    // 상속만으로 save(),  findOne(), findAll(), count(), delete()의 기본 기능 자동 제공
    // 기본 기능 이외의 조회기능을 추가할 때 메소드 추가
    Article findByCategory(String category);
}
