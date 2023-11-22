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
import com.projet.demo.model.CommandeA;
import com.projet.demo.service.CommandeAserviceImpl;

import io.swagger.v3.oas.annotations.Operation;
@RestController
@RequestMapping("/commandeA")
public class CommandeARestController {
    CommandeAserviceImpl commandeAserviceImpl;
    
    public CommandeARestController(CommandeAserviceImpl commandeAserviceImpl) {
        this.commandeAserviceImpl = commandeAserviceImpl;
    }
    @Operation(summary ="Ajouter ",description = "Ajouter commande")
    @PostMapping("/ajouter")
    CommandeA ajouter(@RequestBody CommandeA commandeA){
        return commandeAserviceImpl.ajouter(commandeA);
    }
    @GetMapping("/all")
    @Operation(summary="Lister commande",description = "Permet d'afficher la liste des commandes")
    List<CommandeA>findAll(){
    return commandeAserviceImpl.lister();
    }
    @DeleteMapping("/supprime/{id}")
    @Operation(summary = "supprimer",description = "Supprimer un commande passer en parametre")
    public void delete(@PathVariable Integer id){
        commandeAserviceImpl.supprime(id);
    }
    @GetMapping("/cherche/{id}")
    @Operation(summary = "Cherche commande",description = "Permet de chercher une commande passer en param")
    public Optional<CommandeA>chercher(@PathVariable Integer id){
        return commandeAserviceImpl.findById(id);
    }
}
