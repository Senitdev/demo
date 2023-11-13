package com.projet.demo.service.impl;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.projet.demo.dto.ClientDto;
import com.projet.demo.model.Client;
import com.projet.demo.repository.ClientRepository;
import com.projet.demo.service.ClientService;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class ClientServiceImpl implements ClientService {

private  final ClientRepository clientRepository;
public ClientServiceImpl(ClientRepository clientRepository){
  this.clientRepository=clientRepository; 
}

    @Override
    public ClientDto save(ClientDto dto) {
       if(dto==null){
        return null;
       }
       if(dto.getNom()==null || dto.getNom().isEmpty()){
        throw(new RuntimeException("Veuillez remplir le nom du client"+dto.getNom()));
       }
       if(dto.getPrenom()==null || dto.getPrenom().isEmpty()){
        throw(new RuntimeException("Veuillez remplir le prenom"));
       }
        if(dto.getAdresse()==null || dto.getAdresse().isEmpty()){
         throw(new RuntimeException("Veuillez renseigner l adresse"));
        }
        
       return ClientDto.fromEntity(clientRepository.save(ClientDto.toEntity(dto)));
        }

    @Override
    public List<ClientDto> lister() {
        return clientRepository.findAll().stream()
        .map(ClientDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
      if(id==null){
        log.error("Id de supression est null");
        throw(new RuntimeException("L id ne doit pas etre null"));
      }
    if(clientRepository.findById(id).isEmpty()){
        log.error("Client inconnu");
     throw(new RuntimeException("Client non trouve dans la base"));
      }
      clientRepository.deleteById(id);
    }

    @Override
    public ClientDto findById(Integer id) {
       if(id==null){
        log.error("id de l'article est vide");
        throw (new RuntimeException("L'id de l'article ne doit pas etre null"));
       }
       Optional<Client> client=clientRepository.findById(id);
       if(clientRepository.findById(id).isEmpty()){
         throw(new RuntimeException("CLIENT NO TROUVE"));
       }
        return ClientDto.fromEntity(client.get());
    }
    
}
