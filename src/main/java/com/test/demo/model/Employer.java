package com.test.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String prenom;
    private String nom;
    private String adresse;
    public Long getId() {
        return id;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public Employer(String prenom, String nom, String adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
    }
    public Employer() {
    }
    
}
