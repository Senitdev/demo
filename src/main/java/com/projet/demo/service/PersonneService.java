package com.projet.demo.service;

import java.util.List;

import com.projet.demo.model.Personne;

public interface PersonneService {
Personne ajouter(Personne personne);
List<Personne> lister();
public void delete(Long id);
public Personne update(Long id,Personne pe);
}
