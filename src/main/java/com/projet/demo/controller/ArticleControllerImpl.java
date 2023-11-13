package com.projet.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projet.demo.model.Article;
import com.projet.demo.service.ArticleService;

import io.swagger.v3.oas.annotations.Operation;
@RestController
@RequestMapping("/article")
public class ArticleControllerImpl{
    private ArticleService articleservice; 
    public ArticleControllerImpl(ArticleService articleservice){
        this.articleservice=articleservice;
    }
    @PostMapping("/ajout")
    @Operation(summary ="Ajout article",description = "Ajouter ou modifier un article dans la base")
    public Article ajouter(@RequestBody Article article) {
      return articleservice.ajouter(article);
    }
    @GetMapping("/all")
    @Operation(summary = "Lister les articles",description = "Permet de lister les articles de la base")
    public List<Article> listerArticles() {
    return articleservice.lister();
    }
    @GetMapping("/{id}")
    @Operation(summary = "Rechercher par id", description = "Recherche un article en passant en parametre le id")
    public Optional<Article> rechercher(@PathVariable Integer id) {
       return articleservice.findById(id);
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "Supprimer un article",description = "Permet de supprimer un article par son id")
    public void supprimerArticle(@PathVariable Integer id) {
      articleservice.supprime(id);
    }
    
}
