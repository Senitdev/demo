package com.test.demo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonneInterface extends CrudRepository<Personne ,Long>{ 
}
