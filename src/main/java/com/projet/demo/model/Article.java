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
@NoArgsConstructor
@AllArgsConstructor
public class Article implements Serializable{
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name="nomarticle",nullable = false)
    private String nomArticle;
    @Column(nullable = false)
    private String designation;
    @Column(nullable = false)
    private Double prix;
    @Column(nullable = false)
    private Integer qte;
    private Integer stock;
}
