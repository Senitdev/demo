package com.test.demo;
import jakarta.persistence.*;
@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     Long id;
     String prenom;
     String nom;
    String adresse;
     String tel;
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
    public String getTel() {
        return tel;
    }
    public void setId(Long id) {
        this.id = id;
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
    public void setTel(String tel) {
        this.tel = tel;
    }
    public Personne(String prenom, String nom, String adresse, String tel) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
    }
    public Personne() {
    }
    
}
