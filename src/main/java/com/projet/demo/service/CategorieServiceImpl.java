package com.projet.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.demo.model.Categorie;
import com.projet.demo.repository.CategorieRepository;
@Service
public class CategorieServiceImpl implements CategorieService {
  private CategorieRepository categorieRepository;
  public CategorieServiceImpl(CategorieRepository categorieRepository){
    this.categorieRepository=categorieRepository;
  }
    @Override
    public Categorie ajouter(Categorie categorie) {
     return categorieRepository.save(categorie);
    }

    @Override
    public
    Optional <Categorie>findById(Integer id) {
       return categorieRepository.findById(id);
    }

    @Override
    public List<Categorie> lister() {
      return categorieRepository.findAll();
    }

    @Override
    public void supprimer(Integer id) {
       categorieRepository.deleteById(id);
    }
    
}
