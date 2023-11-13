package com.projet.demo.service;
import java.util.List;

import com.projet.demo.dto.DeveloppeurDto;

public interface DeveloppeurService {
    DeveloppeurDto save(DeveloppeurDto devto);
     DeveloppeurDto findById(Integer id);
     List<DeveloppeurDto>lister();
     void delete(Integer id);

   
}
