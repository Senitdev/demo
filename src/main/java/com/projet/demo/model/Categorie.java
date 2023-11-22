package com.projet.demo.model;
import java.time.Instant;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Categorie {
    @Id@GeneratedValue
    private Integer id;
    @CreatedDate
    @Column(name="datecredate",updatable = false,nullable = false)
    private Instant dateCreation;
    @Column(nullable = false)
    private String designation;
    @OneToMany
    List<Entreprise> idEntreprise;
}
