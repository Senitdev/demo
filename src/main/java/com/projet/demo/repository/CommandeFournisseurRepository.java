package com.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.demo.model.CommandeFourns;
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFourns,Integer> {
    
}
