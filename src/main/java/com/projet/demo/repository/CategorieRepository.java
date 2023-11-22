package com.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.demo.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie,Integer> {
    
}
