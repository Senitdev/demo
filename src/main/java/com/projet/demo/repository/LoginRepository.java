package com.projet.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.demo.model.Login;

public interface LoginRepository extends JpaRepository<Login,String> {
    Optional<Login>findByEmail(String email);
}
