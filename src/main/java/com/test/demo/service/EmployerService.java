package com.test.demo.service;

import java.util.List;

import com.test.demo.model.Employer;

public interface EmployerService {
Employer ajouter(Employer employer);
List<Employer> lister();
public Employer modifier(Long id,Employer employer);
public void delete (Long id);
}
