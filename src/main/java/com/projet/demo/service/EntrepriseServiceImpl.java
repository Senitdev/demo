package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.demo.model.Entreprise;
import com.projet.demo.repository.EntrepriseRepository;
@Service
public class EntrepriseServiceImpl implements EntrepriseService {
  private EntrepriseRepository entrepriseRepository;
  public EntrepriseServiceImpl(EntrepriseRepository entrepriseRepository){
    this.entrepriseRepository=entrepriseRepository;
  }
    @Override
    public Entreprise add(Entreprise entreprise) {
   return entrepriseRepository.save(entreprise);
    }

    @Override
    public List<Entreprise> lister() {
        return entrepriseRepository.findAll();
    }

    @Override
    public Optional<Entreprise> finbyId(Integer id) {
      return entrepriseRepository.findById(id);
    }

    @Override
    public void supprimer(Integer id) {
       entrepriseRepository.deleteById(id);
    }
    
}
