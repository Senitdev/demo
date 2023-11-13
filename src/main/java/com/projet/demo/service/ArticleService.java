package com.projet.demo.service;

import java.util.List;
import java.util.Optional;
import com.projet.demo.model.Article;
public interface ArticleService {
    Article ajouter(Article article);
    List<Article>lister(); 
   Optional  <Article> findById(Integer id);
    public void supprime(Integer id);
}
