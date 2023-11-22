package com.projet.demo.service;

import java.util.List;

import com.projet.demo.dto.MecanicienDto;
public interface MecanicienService {
    public MecanicienDto save(MecanicienDto dto);
    List<MecanicienDto>lister();
    public MecanicienDto findById(Integer id);
    public void delete(Integer id);
    
}
