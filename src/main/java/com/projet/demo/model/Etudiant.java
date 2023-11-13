package com.projet.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Etudiant {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    @Column(nullable =false,length = 150)
    private String prenom;
    @Column(nullable = false, length = 150)
    private String nom;
    @OneToOne
    Filliere idfFilliere;
}
