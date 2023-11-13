package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.demo.model.Article;
import com.projet.demo.repository.ArticleRepository;
@Service
public class ArticleServiceImpl implements ArticleService{
     private final  ArticleRepository articleRepository;
      public ArticleServiceImpl(ArticleRepository articleRepository){
        this.articleRepository=articleRepository;
      }
    @Override
    public Article ajouter(Article article){
     if(article.getNomArticle()== null || article.getNomArticle().isEmpty()){
        throw(new RuntimeException("Veuillez renseigner le nom de l article"+article.getNomArticle()));
     }
     if(article.getDesignation()== null || article.getDesignation().isEmpty()){
        throw(new RuntimeException("Veuillez remplir la designation"));
     }
      if(article.getPrix()== null || article.getPrix()<5){
        throw(new RuntimeException("Veuillez remplir le prix"));
     }
    if(article.getQte()== null || article.getQte()<1 ){
        throw(new RuntimeException("Veuillez remplir la quantite"));
     } 
     return articleRepository.save(article);
    }

    @Override
    public List<Article> lister() {
       return articleRepository.findAll();
    }


    @Override
    public void supprime(Integer id) {
    articleRepository.deleteById(id);
    }
    @Override
    public Optional<Article> findById(Integer id) {
     return articleRepository.findById(id);
    }
    
}
