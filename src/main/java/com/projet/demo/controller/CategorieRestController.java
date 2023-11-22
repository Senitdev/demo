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
import com.projet.demo.model.Categorie;
import com.projet.demo.service.CategorieService;
@RestController
@RequestMapping("categorie")
public class CategorieRestController  {
    private CategorieService categorieService;
    public CategorieRestController(CategorieService categorieService){
        this.categorieService=categorieService;
    }
    @PostMapping("/ajouter")
    public Categorie ajouter(@RequestBody Categorie categorie){
 return categorieService.ajouter(categorie);
    }
    @GetMapping("/recherche/{id}")
    Optional<Categorie>recherche(@PathVariable Integer id){
        return categorieService.findById(id);
    }
    @GetMapping("/all")
    List<Categorie>lister(){
        return categorieService.lister();
    }
    @DeleteMapping("/supprimer/{id}")
    public void delete(@PathVariable Integer id){
        categorieService.supprimer(id);
    }
}
