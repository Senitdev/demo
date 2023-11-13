package com.projet.demo.service.impl;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.projet.demo.dto.MecanicienDto;
import com.projet.demo.model.Mecanicien;
import com.projet.demo.repository.MecanicienRepository;
import com.projet.demo.service.MecanicienService;
@Service
public class MecanicienImpl implements MecanicienService {
 private MecanicienRepository mecanicienRepository;
 public MecanicienImpl(MecanicienRepository mecanicienRepository){
    this.mecanicienRepository=mecanicienRepository;
 }
    @Override
    public MecanicienDto save(MecanicienDto dto) {
        if(dto==null){
            return null;
        }
        if(dto.getPrenom().isEmpty()){
            throw(new RuntimeException("Veuillez remplir le prenom"));
        }
        if(dto.getAdresse().isEmpty()){
            throw(new RuntimeException("Veuillez remplir l adresse"));
        }
     return MecanicienDto.fromEntity(mecanicienRepository.save(MecanicienDto.toEntity(dto)));
    }

    @Override
    public List<MecanicienDto> lister() {
     return mecanicienRepository.findAll().stream().map(MecanicienDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public MecanicienDto findById(Integer id) {
        Optional<Mecanicien>mec=mecanicienRepository.findById(id);
        return  MecanicienDto.fromEntity(mec.get());
    }

    @Override
    public void delete(Integer id) {
    mecanicienRepository.deleteById(id);
    }
    
}
