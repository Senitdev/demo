package com.projet.demo.service;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.projet.demo.exception.EntityNotFoundException;
import com.projet.demo.model.ClientA;
import com.projet.demo.repository.ClientARepositor;
import com.projet.demo.repository.CommandeARepository;
@Service
public class ClientAServiceImpl {
    private ClientARepositor clientARepositor;
    private CommandeARepository commandeARepository;
    public ClientAServiceImpl(ClientARepositor clientARepositor,CommandeARepository commandeARepository){
        this.clientARepositor=clientARepositor;
        this.commandeARepository=commandeARepository;
    }
    public ClientA save(ClientA clientA){
        if(clientA.getPrenom()==null || clientA.getPrenom().isEmpty()){
          throw(new EntityNotFoundException("Veuillez remplir le prenom"));
        }
        return clientARepositor.save(clientA);
    }
   public List<ClientA>lister(){
        return clientARepositor.findAll();
    }
    public void delete(Integer id){
        if(commandeARepository.findById(id).isPresent()){
        throw (new EntityNotFoundException("Ce client a une commande vous ne pouvez pas la supprimer"));
        }
        clientARepositor.deleteById(id);
    }
    public Optional<ClientA>cherche(Integer id){
        return clientARepositor.findById(id);
    }
    
    
}
