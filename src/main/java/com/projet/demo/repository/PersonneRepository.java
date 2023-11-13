package com.projet.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projet.demo.model.Personne;
public interface PersonneRepository extends JpaRepository<Personne,Long> {
    
}
