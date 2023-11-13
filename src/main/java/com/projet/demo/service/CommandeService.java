package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import com.projet.demo.model.CommandeFourns;

public interface CommandeService {
    CommandeFourns ajouter(CommandeFourns commandeFourns);
    List<CommandeFourns>lister();
    Optional<CommandeFourns> recherche(Integer id);
    public void supprimeCommande(Integer id);
}
