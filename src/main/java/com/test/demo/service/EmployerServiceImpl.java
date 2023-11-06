package com.test.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.test.demo.model.Employer;
import com.test.demo.repository.EmployerRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class EmployerServiceImpl implements EmployerService{
  private final EmployerRepository employerRepository;
    @Override
    public Employer ajouter(Employer employer) {
      if(employer.getAdresse()==null || employer.getPrenom().isEmpty()){
       throw(new RuntimeException("Veuillez remplir le prenom"));
      }
      if(employer.getNom()==null || employer.getNom().isEmpty() || employer.getNom().length()<2){
        throw(new RuntimeException("Veuillez renseigner le nom "));
      } 
      if(employer.getAdresse()==null || employer.getAdresse().isEmpty() || employer.getAdresse().isBlank()){
        throw(new RuntimeException("L ardresse est obligatoire"));
      }
      return employerRepository.save(employer);
    }


    @Override
    public List<Employer> lister() {
       return employerRepository.findAll();
    }

    @Override
    public Employer modifier(Long id, Employer employer) {
        return employerRepository.findById(id)
        .map(emp->{
          emp.setPrenom(employer.getPrenom());
          emp.setNom(employer.getNom());
          emp.setAdresse(employer.getAdresse());
        return employerRepository.save(emp);
        }).orElseThrow(()->new RuntimeException("Produit not found"));

    }

    @Override
    public void delete(Long id) {
        employerRepository.deleteById(id);
    }


    @Override
    public Optional<Employer> getEmployerById(Long id) {
      if(employerRepository.findById(id).isEmpty()){
          throw(new RuntimeException("Employer non trouver id "));
      }else{
        return employerRepository.findById(id);
      }
    }
     }
