package com.projet.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Operateur {
    @Id@GeneratedValue
    private Integer id;
    private String adresse;
    private ListeOperateurEnum listeOperateurEnum;
}
