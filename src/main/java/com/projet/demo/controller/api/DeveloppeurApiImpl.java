package com.projet.demo.controller.api;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.projet.demo.dto.DeveloppeurDto;
import com.projet.demo.service.DeveloppeurService;
@RestController
public class DeveloppeurApiImpl implements DeveloppeurApi {
    private  DeveloppeurService developpeurService;
     public DeveloppeurApiImpl(DeveloppeurService developpeurService){
        this.developpeurService=developpeurService;
     }
    @Override
    public DeveloppeurDto save(DeveloppeurDto devto) {
     return developpeurService.save(devto);
    }

    @Override
    public DeveloppeurDto findById(Integer id) {
     return developpeurService.findById(id);
    }

    @Override
    public List<DeveloppeurDto> lister() {
       return developpeurService.lister();
    }

    @Override
    public void delete(Integer id) {
    developpeurService.delete(id);
    }

}
