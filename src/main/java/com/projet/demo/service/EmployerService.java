package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import com.projet.demo.model.Employer;

public interface EmployerService {
Employer ajouter(Employer employer);
List<Employer> lister();
public Employer modifier(Long id,Employer employer);
public void delete (Long id);
public Optional<Employer> getEmployerById(Long id);
}
