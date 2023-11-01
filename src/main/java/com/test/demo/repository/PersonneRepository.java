package com.test.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.test.demo.Personne;
public interface PersonneRepository extends JpaRepository<Personne,Long> {
    
}
