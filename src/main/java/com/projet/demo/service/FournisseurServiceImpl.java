package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.demo.model.Fournisseur;
import com.projet.demo.repository.FournisseurRepository;
@Service
public class FournisseurServiceImpl implements FournisseurService {
private FournisseurRepository fournisseurRepository;
public FournisseurServiceImpl(FournisseurRepository fournisseurRepository){
this.fournisseurRepository=fournisseurRepository;
}
    @Override
    public Fournisseur ajouter(Fournisseur fournisseur) {
        if(fournisseur.getAdresse()==null || fournisseur.getAdresse().isEmpty()){
        throw(new RuntimeException("Veuillez renseigner l adresse"));
        }
          if(fournisseur.getCode()==null || fournisseur.getCode().isEmpty()){
         throw(new RuntimeException("Veuillez renseigner le code"));
          }
          if(fournisseur.getRaisonSociale()==null || fournisseur.getRaisonSociale().isEmpty()){
            throw(new RuntimeException("Veuiller renseigner la raison sociale"));
          }
        return fournisseurRepository.save(fournisseur);
    }

    @Override
    public void supprimer(Integer id) {
        if(id==null){
            throw(new RuntimeException("le id est vide"));
        }
       fournisseurRepository.deleteById(id);
    }

    @Override
    public List<Fournisseur> listeFourns() {
       return fournisseurRepository.findAll();
    }

    @Override
    public
    Optional <Fournisseur> recherche(Integer id) {
          if(id==null){
            throw(new RuntimeException("le id est vide"));
        }
    return fournisseurRepository.findById(id);
    }
    
}
