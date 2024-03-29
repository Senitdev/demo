package com.projet.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.demo.model.Employer;
import com.projet.demo.service.EmployerService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/employe")
@AllArgsConstructor
public class EmployerRestController {
    private  EmployerService employerService;
    @PostMapping("/ajout")
      public Employer ajouter(@RequestBody Employer employer) {
      return employerService.ajouter(employer);
      
    }
    @GetMapping()
    public List<Employer> lister() {
     return  employerService.lister();
    }
    @PutMapping("/update/{id}")
    public Employer modifier(@PathVariable Long id, @RequestBody Employer employer) {
        return employerService.modifier(id,employer);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
    employerService.delete(id);
    }
    @GetMapping("/recherche/{id}") 
    public Optional<Employer> getEmployerById(@PathVariable Long id) {
       return  employerService.getEmployerById(id);
      }
    }
