package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.demo.model.CommandeA;
import com.projet.demo.repository.CommandeARepository;
@Service
public class CommandeAserviceImpl {
    private CommandeARepository commandeARepository;
    public CommandeAserviceImpl(CommandeARepository commandeARepository){
        this.commandeARepository=commandeARepository;
    }
    public CommandeA ajouter(CommandeA commandeA){
        return commandeARepository.save(commandeA);
    }
   public List<CommandeA>lister(){
        return commandeARepository.findAll();
    }
    public void supprime(Integer id){
        commandeARepository.deleteById(id);
    }
   public  Optional<CommandeA>findById(Integer id){
        return commandeARepository.findById(id);
    }

}
