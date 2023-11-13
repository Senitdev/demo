package com.projet.demo.controller.api;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.projet.demo.dto.MecanicienDto;
import com.projet.demo.service.MecanicienService;
@RestController
public class MecanicienApiImpl implements MecanicienApi {
private MecanicienService mecanicienService;
public MecanicienApiImpl(MecanicienService mecanicienService){
    this.mecanicienService=mecanicienService;
}
    @Override
    public MecanicienDto save(MecanicienDto dto) {
    return  mecanicienService.save(dto);
    }

    @Override
    public List<MecanicienDto> lister() {
       return mecanicienService.lister();
    }

    @Override
    public MecanicienDto findById(Integer id) {
       return mecanicienService.findById(id);
    }
    @Override
    public void delete(Integer id) {
      mecanicienService.delete(id);
    }
    
}
