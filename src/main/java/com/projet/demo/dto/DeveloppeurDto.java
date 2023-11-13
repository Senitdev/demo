package com.projet.demo.dto;

import com.projet.demo.model.Developpeur;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DeveloppeurDto {
    private Integer id;
    private String nom;
    private  String prenom;
    private String specialite;
    public static DeveloppeurDto fromEntity(Developpeur dev){
        if(dev==null){
            return null;
        }
        return DeveloppeurDto.builder()
        .id(dev.getId())
        .prenom(dev.getPrenom())
        .nom(dev.getNom())
        .specialite(dev.getSpecialite())
        .build();
    }
    public static Developpeur toEntity(DeveloppeurDto devtdo){
        if(devtdo==null){
            return null;
        }
     Developpeur dev=new Developpeur();
     dev.setId(devtdo.getId());
     dev.setPrenom(devtdo.getPrenom());
     dev.setNom(devtdo.getNom());
     dev.setSpecialite(devtdo.getSpecialite());
     return dev;
    }
}
