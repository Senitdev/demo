package com.test.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.test.demo.model.Personne;
import com.test.demo.repository.PersonneRepository;
import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class PersonneServiceImpl implements PersonneService {
     private final PersonneRepository personneRepository;
    @Override
    public Personne ajouter(Personne personne) {
        return personneRepository.save(personne);
    }

    @Override
    public void delete(Long id) {
        personneRepository.deleteById(id);
    }


    @Override
    public List<Personne> lister() {
        return personneRepository.findAll();
    }

    @Override
    public Personne update(Long id, Personne pe) {
        return personneRepository.findById(id)
        .map(pers->{
          pers.setNom(pe.getNom());
          pers.setPrenom(pe.getPrenom());
          pers.setAdresse(pe.getAdresse());
          return personneRepository.save(pers);
        }).orElseThrow(()->new RuntimeException("Personne non trouver"));
    }
    
}
