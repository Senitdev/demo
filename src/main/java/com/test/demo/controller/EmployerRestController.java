package com.test.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.model.Employer;
import com.test.demo.service.EmployerService;

@RestController
@RequestMapping("/employe")
public class EmployerRestController {
    private EmployerService employerService;
    @PostMapping("/ajout")
      public Employer ajouter(@RequestBody Employer employer) {
        employerService.ajouter(employer);
        throw new UnsupportedOperationException("Unimplemented method 'ajouter'");
    }
    @GetMapping()
    public List<Employer> lister() {
     return  employerService.lister();
    }
    @PutMapping("/update/{id}")
    public Employer modifier(Long id, Employer employer) {
        return employerService.modifier(id,employer);
    }
    @GetMapping("/delete/{id}")
    public void delete(Long id) {
    employerService.delete(id);
    }

}
