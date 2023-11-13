package com.projet.demo.dto;
import com.projet.demo.model.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDto {
   private Integer id;
   private String prenom;
   private String nom;
   private String adresse;
   private Double soldeCompte; 
public static ClientDto fromEntity(Client client){
if(client==null){
   return null;
}
return ClientDto.builder()
.id(client.getId())
.nom(client.getNom())
.prenom(client.getPrenom())
.adresse(client.getAdresse())
.soldeCompte(client.getSoldeCompte())
.build();
  }
  public static Client toEntity(ClientDto clientDto){
   if(clientDto==null){
      return null;
   }
   Client client=new Client();
   client.setId(clientDto.getId());
   client.setPrenom(clientDto.getPrenom());
   client.setNom(clientDto.getNom());
   client.setAdresse(clientDto.getAdresse());
   client.setSoldeCompte(clientDto.getSoldeCompte());
   return client;
  }
}
