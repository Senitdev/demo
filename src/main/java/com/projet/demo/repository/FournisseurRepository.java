package com.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.demo.model.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Integer> {
    
}
