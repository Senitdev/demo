package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import com.projet.demo.model.Fournisseur;

public interface FournisseurService {
    public Fournisseur ajouter(Fournisseur fournisseur);
    public void supprimer(Integer id);
    List<Fournisseur>listeFourns();
    Optional <Fournisseur> recherche(Integer id);
}
