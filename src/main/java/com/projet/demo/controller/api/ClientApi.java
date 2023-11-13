package com.projet.demo.controller.api;

import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet.demo.dto.ClientDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
public interface ClientApi {
    @PostMapping(value = "client/create",consumes=MediaType.APPLICATION_JSON_VALUE ,produces=MediaType.APPLICATION_JSON_VALUE)
    @Tag(name="Enregistrer ou modifier un client",description = "Permet d enregsitrer ou de modifier un client,la modification il faut fournir l'id") 
    ClientDto save(@RequestBody ClientDto clientdto);
     @GetMapping(value = "client/all",produces =MediaType.APPLICATION_JSON_VALUE)
     @Operation(summary ="Lister les clients",description = "Fourni la liste des clients de la base")
    List<ClientDto>lister();
    @DeleteMapping(value="client/delete/{id}")
     @Operation(summary = "supprimer un client", description = "Suppression client en fournissant un id valide")
    void delete(@PathVariable Integer id);
    @GetMapping("client/search/{id}")
    @Operation(summary = "Rechercher un client ",description = "Rechercher un client dans la base en passant en parametre le id du client")
    public  ClientDto findById(@PathVariable Integer id);   
}
