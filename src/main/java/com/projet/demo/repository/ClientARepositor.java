package com.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.demo.model.ClientA;

public interface ClientARepositor extends JpaRepository<ClientA,Integer>{
    
}
