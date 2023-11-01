package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.model.Employer;

public interface EmployerRepository extends JpaRepository<Employer ,Long>{

}
