package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import com.projet.demo.model.Entreprise;

public interface EntrepriseService {
    Entreprise add(Entreprise entreprise);
    List<Entreprise>lister();
    Optional<Entreprise>finbyId(Integer id);
    public void supprimer(Integer id);

}
