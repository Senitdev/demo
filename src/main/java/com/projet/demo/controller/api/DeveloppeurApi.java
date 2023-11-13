package com.projet.demo.controller.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet.demo.dto.DeveloppeurDto;
import io.swagger.v3.oas.annotations.Operation;
public interface DeveloppeurApi {
        //Ajout et modification
    @PostMapping("developpeur/ajout")
    @Operation(summary ="Ajout & modification",description = "Permet d'ajouter ou de modifier un developpeur, pour la modification renseiger l id ")
    DeveloppeurDto save(@RequestBody DeveloppeurDto devto);
    //Recherche par id
    @GetMapping("developpeur/search/{id}")
    @Operation(summary ="retourne un developpeur par son id",description = "Permet de rechercher un developpeur passé en parametre(id)")
     DeveloppeurDto findById(@PathVariable Integer id);
     //Lister les developpeurs
     @GetMapping("developpeur/all")
     @Operation(summary = "Lister les developpeurs",description = "Fournit la liste de tous les dev")
     List<DeveloppeurDto>lister();
     //Supprimer un développeur
     @DeleteMapping("developpeur/delete/{id}")
     @Operation(summary = "supprimer un dev",description = "Permet de supprimer un developpeur passé en parametre (id)")
     void delete(@PathVariable Integer id);
}
