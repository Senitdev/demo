package com.projet.demo.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projet.demo.model.Entreprise;
import com.projet.demo.service.EntrepriseService;
@RestController
@RequestMapping("entreprise")
public class EntrepriseRestController {
    private EntrepriseService entrepriseService;
    public EntrepriseRestController(EntrepriseService entrepriseService){
        this.entrepriseService=entrepriseService;
    }
    @PostMapping("/ajouter")
   Entreprise ajout(@RequestBody Entreprise entreprise){
    return entrepriseService.add(entreprise);
   } 
   @GetMapping("/all")
   List<Entreprise>liste(){
    return entrepriseService.lister();
   }
   @GetMapping("/recherche/{id}")
   Optional<Entreprise>recherche(@PathVariable Integer id){
    return entrepriseService.finbyId(id);
   }
   @DeleteMapping("/supprimer/{id}")
   public void deteleEntreprise(@PathVariable Integer id){
    entrepriseService.supprimer(id);
   }
}
