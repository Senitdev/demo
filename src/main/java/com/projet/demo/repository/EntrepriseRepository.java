package com.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.demo.model.Entreprise;

public interface EntrepriseRepository  extends JpaRepository<Entreprise,Integer>{
    
}
