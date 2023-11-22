package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import com.projet.demo.model.Categorie;

public interface CategorieService {
    public Categorie ajouter(Categorie categorie);
    Optional<Categorie> findById(Integer id);
    List<Categorie>lister();
    public void supprimer(Integer id);
    
}
