package com.projet.demo.controller;

import java.util.List;
import java.util.Optional;

import com.projet.demo.model.Article;

public interface ArticleController {
 Article save(Article article);
List<Article>lister(); 
Optional  <Article> findById(Integer id);
public void supprime(Integer id);
}
