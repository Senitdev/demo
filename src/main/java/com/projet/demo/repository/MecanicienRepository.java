package com.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.demo.model.Mecanicien;

public interface MecanicienRepository extends JpaRepository<Mecanicien,Integer> {
    
}
