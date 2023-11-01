package com.test.demo.service;
import java.util.List;

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
      employerRepository.save(employer);
        throw new UnsupportedOperationException("Unimplemented method 'ajouter'");
    }

    @Override
    public List<Employer> lister() {
       employerRepository.findAll();
        throw new UnsupportedOperationException("Unimplemented method 'lister'");
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
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}