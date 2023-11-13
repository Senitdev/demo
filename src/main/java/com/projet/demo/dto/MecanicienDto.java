package com.projet.demo.dto;
import com.projet.demo.model.Mecanicien;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MecanicienDto {
    private Integer id;
    private String prenom;
    private String adresse;
    public static MecanicienDto fromEntity(Mecanicien mecanicien){
        if(mecanicien==null){
            return null;
        }
        return MecanicienDto.builder()
        .id(mecanicien.getId())
        .prenom(mecanicien.getPrenom())
        .adresse(mecanicien.getAdresse())
        .build();
    }
    public static Mecanicien toEntity(MecanicienDto mecaniciendDto){
        Mecanicien mecanicien=new Mecanicien();
        mecanicien.setId(mecaniciendDto.getId());
        mecanicien.setPrenom(mecaniciendDto.getPrenom());
        mecanicien.setAdresse(mecaniciendDto.getAdresse());
        return mecanicien;
       }
}
