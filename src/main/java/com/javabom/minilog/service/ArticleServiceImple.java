package com.javabom.minilog.service;

import com.javabom.minilog.domain.Article;
import com.javabom.minilog.dto.ArticleData;
import com.javabom.minilog.dto.ArticleObject;
import com.javabom.minilog.dto.Attributes;
import com.javabom.minilog.persistence.ArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImple implements ArticleService {
    Logger logger = LoggerFactory.getLogger("com.javabom.minilog.MiniLogApplication");

    @Autowired
    private ArticleRepository articleRepository;

    @Override
//    public List<Article> findAll() {
//        return articleRepository.findAll();
//    }
    public ArticleData findAll() {

        List<ArticleObject> articleObjectList = new ArrayList<ArticleObject>();

        List<Article> articles = articleRepository.findAll();

        for (Article article : articles) {
            ArticleObject articleObject = new ArticleObject();
            articleObject.setId(String.valueOf(article.getId()));
            articleObject.setType("articles");
//            articleObject.setAttributes(new Attributes(article.getTitle(), article.getContent(), article.getRegdate()));
            articleObject.setAttributes(new Attributes().fromArticle(article));
            articleObject.setLinks("/" + article.getId());

            articleObjectList.add(articleObject);
        }

        return new ArticleData(articleObjectList);
    }

    @Override
    public List<Article> findAllByCategory(String category) {
        return articleRepository.findAllByCategory(category);
    }

    @Override
    //TODO: Optional - Java 8부터 들어간 기능. NullPointException 방지
//    public Optional<Article> findById(int articleId) {
//        return articleRepository.findById(articleId);
//    }
    public ArticleData findById(int articleId) {
        Optional<Article> article = articleRepository.findById(articleId);

//        Attributes attributes = new Attributes(article.get().getTitle(), article.get().getContent(), article.get().getRegdate());

        ArticleObject articleObject = new ArticleObject();
        articleObject.setId(String.valueOf(articleId));
        articleObject.setType("articles");
//        articleObject.setAttributes(new Attributes(article.get().getTitle(), article.get().getContent(), article.get().getRegdate()));
        articleObject.setAttributes(new Attributes().fromArticle(article.get()));
        articleObject.setLinks("/" + articleId);

        return new ArticleData(articleObject);
    }

//    @Override
//    public Article create(Article article) {
//        return articleRepository.save(article);
//    }

    @Override
    public ArticleData create(ArticleObject articleObject) {
//    public Article create(ArticleData articleDTO) {

        Article article = new Article();
        article.setTitle(articleObject.getAttributes().getTitle());
        article.setContent(articleObject.getAttributes().getContent());
        article.setRegdate(LocalDateTime.now());

//        new Attributes().toArticle(articleObject.getAttributes());
        article.setSymbol("color,#efefef");
        article.setCategory("test");
        article.setStars(0);
        article.setAuthor(1);

        Article responseArticle = articleRepository.save(article);

        ArticleObject newArticleObject = new ArticleObject();
        newArticleObject.setId(String.valueOf(responseArticle.getId()));
        newArticleObject.setType("articles");
//        Attributes attributes = new Attributes(responseArticle.getTitle(), responseArticle.getContent(), responseArticle.getRegdate());
//        newArticleObject.setAttributes(attributes);
        newArticleObject.setAttributes(new Attributes().fromArticle(article));
        newArticleObject.setLinks("/" + responseArticle.getId());

//        Article newArticle = articleRepository.save();

//        ArticleObject articleObject = new ArticleObject();
//        articleObject.setId(String.valueOf(newArticle.getId()));
//        articleObject.setType("articles");
//        articleObject.setAttributes(new Attributes(newArticle.getTitle(), newArticle.getContent()));

        return new ArticleData(newArticleObject);
    }

    @Override
    public ArticleData update(int articleId, ArticleData<ArticleObject> articleData) {
        Optional<Article> article = articleRepository.findById(articleId);
//        logger.info("불러온 article 제목: " + article.get().getTitle());
        Article newArticle = article.orElse(new Article());
//        logger.info("newArticle 제목확인: " + newArticle.getTitle());

//        Attributes attributes = articleData.getData().getAttributes();
//        logger.info("수정한 제목: " + attributes.getTitle());


        Attributes attributes = new Attributes();
//        attributes.toArticle(articleData.getData().getAttributes());

        newArticle.updateArticle(articleData.getData().getAttributes());
//        articleRepository.save(newArticle);
//       attributes.fromArticle(articleRepository.save(newArticle));

        ArticleObject articleObject = articleData.getData();

        articleObject.setId(String.valueOf(newArticle.getId()));
        articleObject.setAttributes(attributes.fromArticle(articleRepository.save(newArticle)));


//        articleData.setData(articleObject);

//        articleObject.getAttributes();

//        Article newArticle = new Article();
//        if (articleObject.getAttributes().getTitle() != null) {
//            article.get().setTitle(articleObject.getAttributes().getTitle());
//        }
//        if (articleObject.getAttributes().getContent() != null) {
//            article.get().setContent(articleObject.getAttributes().getContent());
//        }
//        article.get().setRegdate(LocalDateTime.now());



//        articleData.getData().setAttributes(articleRepository.save(newArticle).getAttributes());

//          articleRepository.save(newArticle).getAttributes();
//        article.setTitle(articleObject.getAttributes().getTitle());
//        article.setContent(articleObject.getAttributes().getContent());
//        article.setSymbol("color,#efefef");
//        article.setCategory("test");
//        article.setStars(0);
//        article.setAuthor(1);

//        Article changedArticle = articleRepository.save(article);

//        ArticleObject newArticleObject = new ArticleObject();
//        newArticleObject.setId(String.valueOf(responseArticle.getId()));
//        newArticleObject.setType("articles");
//        Attributes attributes = new Attributes(responseArticle.getTitle(), responseArticle.getContent(), responseArticle.getRegdate());
//        newArticleObject.setAttributes(attributes);
//        newArticleObject.setLinks("/" + responseArticle.getId());

//        articleObject.setAttributes(new Attributes(changedArticle.getTitle(), changedArticle.getContent(), changedArticle.getRegdate()));

        return new ArticleData(articleObject);
//        return findById(articleId);
//        return articleData;
    }

    @Override
    public void delete(int articleId) {
        articleRepository.deleteById(articleId);
    }
}
