package com.projet.demo.controller.api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.projet.demo.dto.MecanicienDto;
import io.swagger.v3.oas.annotations.Operation;

public interface MecanicienApi {
@PostMapping("/mecanicien/ajout")
@Operation(summary = "Ajout et modification",description = "Ajouter ou enregistrer")
public MecanicienDto save(@RequestBody MecanicienDto dto);
 @GetMapping("/mecanicien/all")
 @Operation(summary = "Lister")
    List<MecanicienDto>lister();
@GetMapping("mecanicien/search/{id}")
@Operation(summary = "Rechercher un mecanicien par id",description = "Permet de rechercher un mecanicien")
    public MecanicienDto findById(@PathVariable Integer id);
 @DeleteMapping("/mecanicien/delete/{id}")
 @Operation(summary = "Supprimer un element",description = "Permet de supprimer un element")
     public void delete(@PathVariable Integer id);
}
