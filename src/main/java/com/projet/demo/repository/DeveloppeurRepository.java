package com.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projet.demo.model.Developpeur;

public interface DeveloppeurRepository extends JpaRepository<Developpeur,Integer> {
  
}
