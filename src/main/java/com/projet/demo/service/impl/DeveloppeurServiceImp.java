package com.projet.demo.service.impl;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.projet.demo.model.Developpeur;
import com.projet.demo.dto.DeveloppeurDto;
import com.projet.demo.repository.DeveloppeurRepository;
import com.projet.demo.service.DeveloppeurService;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class DeveloppeurServiceImp implements DeveloppeurService {
    private  final DeveloppeurRepository developpeurRepository;
    public DeveloppeurServiceImp(DeveloppeurRepository developpeurRepository){
        this.developpeurRepository=developpeurRepository;
    }
    @Override

    public DeveloppeurDto save(DeveloppeurDto devto) {
        if(devto.getNom()==null || devto.getNom().isEmpty()){
            throw(new RuntimeException("Veuillez remplir le nom du client"+devto.getNom()));
           }
           if(devto.getPrenom()==null || devto.getPrenom().isEmpty()){
            throw(new RuntimeException("Veuillez remplir le prenom"));
           }
            if(devto.getSpecialite()==null || devto.getSpecialite().isEmpty()){
             throw(new RuntimeException("Veuillez renseigner l adresse"));
            }
       return DeveloppeurDto.fromEntity(developpeurRepository.save(DeveloppeurDto.toEntity(devto)));
    }

    @Override
    public DeveloppeurDto findById(Integer id) {
        Optional<Developpeur>developpeur=developpeurRepository.findById(id);
        if(developpeurRepository.findById(id).isEmpty()){
            log.error("Developpeur inconnu");
        }
         return DeveloppeurDto.fromEntity(developpeur.get());
    }

    @Override
    public List<DeveloppeurDto> lister() {
        if(developpeurRepository.findAll().isEmpty()){
        log.error("liste vide");
        }
        return developpeurRepository.findAll().stream().map(DeveloppeurDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        if(id==null){
            log.error("Veuillez remplir le id");
            return;
        }
      developpeurRepository.deleteById(id);
    }
    
}
