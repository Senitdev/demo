package com.projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.demo.model.Employer;
public interface EmployerRepository extends JpaRepository<Employer ,Long>{

}
