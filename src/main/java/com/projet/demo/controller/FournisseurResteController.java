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

import com.projet.demo.model.Fournisseur;
import com.projet.demo.service.FournisseurService;

import io.swagger.v3.oas.annotations.Operation;
@RestController
@RequestMapping("/fournisseur")
public class FournisseurResteController {
   private final FournisseurService fournisseurService;
   public FournisseurResteController(FournisseurService fournisseurService){
    this.fournisseurService = fournisseurService;
   }
   @GetMapping("/all")
   @Operation(summary = "Lister les fournisseurs",description = "Liste de toutes les fournisseurs")
   List<Fournisseur>liste(){
    return fournisseurService.listeFourns();
   }
   @PostMapping("/ajouter")
   @Operation(summary = "Ajouter/Fournisseur",description = "Ajouter un fournisseur")
   public Fournisseur save(@RequestBody Fournisseur fournisseur){
    return fournisseurService.ajouter(fournisseur);
   }
   @Operation(summary = "Rechercher",description = "Cherche par id")
   @GetMapping("/rechercher/{id}")
   public Optional <Fournisseur> cherche(@PathVariable Integer id){
    return fournisseurService.recherche(id);
   }
   @DeleteMapping("/supprimer/{id}")
   @Operation(summary = "supprimer", description = "Permet de supprimer un fournisseur")
   public void supprimeFournisseur(@PathVariable Integer id){
    fournisseurService.supprimer(id);
   }
}
