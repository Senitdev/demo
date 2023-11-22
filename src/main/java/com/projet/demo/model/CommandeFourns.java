package com.projet.demo.model;
import java.io.Serializable;
import java.time.Instant;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommandeFourns  implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="datecommande",nullable=false)
    private Instant dateCommande;
    @Column(name="numerocommande",nullable = false)
    private String numeroCommande;
    private Integer qte;
     @OneToOne
     Fournisseur fournisseur;
     @OneToOne
     private Article article;
}
