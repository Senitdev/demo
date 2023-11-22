package com.projet.demo.model;
import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ClientPK implements Serializable {

    private String nom;
    private Date dateNaissance;
}
