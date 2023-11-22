package com.projet.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projet.demo.model.CommandeA;


public interface CommandeARepository extends JpaRepository<CommandeA,Integer> {
}
