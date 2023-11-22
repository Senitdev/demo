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

import com.projet.demo.model.ClientA;
import com.projet.demo.service.ClientAServiceImpl;
@RestController
@RequestMapping("/clientA")
public class ClientARestController {
    ClientAServiceImpl clientAServiceImpl;
    public ClientARestController(ClientAServiceImpl clientAServiceImpl) {
        this.clientAServiceImpl = clientAServiceImpl;
    }
    @PostMapping("/ajout")
    public ClientA ajout(@RequestBody ClientA clientA){
        return clientAServiceImpl.save(clientA);
    }
    @GetMapping("/all")
    public List<ClientA>findAll(){
        return clientAServiceImpl.lister();
    }
    @DeleteMapping("/supprime/{id}")
    public void delete(@PathVariable Integer id){
        clientAServiceImpl.delete(id);
    }
    @GetMapping("/chercidhe(/{id})")
    public Optional<ClientA>rechercher(@PathVariable Integer id){
       return clientAServiceImpl.cherche(id);
    }
}
