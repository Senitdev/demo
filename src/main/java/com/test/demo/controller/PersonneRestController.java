package com.test.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.demo.service.PersonneService;
import com.test.demo.model.Personne;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/personne")
@AllArgsConstructor
public class PersonneRestController {
    private final PersonneService personneService;
    @PostMapping("/ajouter")
     Personne save(@RequestBody Personne personne){
     return personneService.ajouter(personne);
    }
    @GetMapping
    List <Personne>lister(){
        return personneService.lister();
    }
    @DeleteMapping("/delete/{id}")
    public void deletePersonne(@PathVariable Long id){
        personneService.delete(id);
    }
    @PutMapping("/update/{id}")
    public Personne  update(@PathVariable Long id , @RequestBody Personne pe){
        return personneService.update(id, pe);
    }
    
}
