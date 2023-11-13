package com.projet.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projet.demo.model.CommandeFourns;
import com.projet.demo.service.CommandeService;
@RestController
@RequestMapping("/commande")
public class CommandeRestController {
    private  CommandeService commandeService;
    public CommandeRestController(CommandeService commandeService){
        this.commandeService=commandeService;
    }
    //ajout
  @PostMapping("/ajouter")
    CommandeFourns save(@RequestBody CommandeFourns commandeFourns){
        return commandeService.ajouter(commandeFourns);
    }
    //lister
    @GetMapping("/all")
    List<CommandeFourns> liste(){
        return commandeService.lister();
    }
    //Supprimer
    @DeleteMapping("/supprimer/{id}")
    public void supprimeCommande(@PathVariable Integer id){
      commandeService.supprimeCommande(id);
    }
    //recherche
    @GetMapping("/search/{id}")
    Optional<CommandeFourns>search(@PathVariable Integer id){
      return commandeService.recherche(id);
    }
}
