package com.projet.demo.model;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Serializable{
   @Id
    @GeneratedValue
   private Integer id;
   @Column(nullable = false)
   private String prenom;
   @Column(nullable = false,length = 100)
   private String nom;
   @Column(nullable=false,length = 155)
   private String adresse;
   @Column(name="soldecompte",nullable = false)
   private Double soldeCompte; 
}
