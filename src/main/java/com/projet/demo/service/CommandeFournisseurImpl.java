package com.projet.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.projet.demo.model.CommandeFourns;
import com.projet.demo.model.Stock;
import com.projet.demo.repository.CommandeFournisseurRepository;
import com.projet.demo.repository.StockRepository;
@Service
public class CommandeFournisseurImpl implements CommandeService {
  private CommandeFournisseurRepository commandeFournisseurRepository;
   private StockRepository stockRepository;
  public CommandeFournisseurImpl(CommandeFournisseurRepository commandeFournisseurRepository){
     this.commandeFournisseurRepository=commandeFournisseurRepository;
  }
    @Override
    public CommandeFourns ajouter(CommandeFourns commandeFourns) {
       
        Stock stock=new Stock();
        stock.setIdArticle(commandeFourns.getId());
        stock.setQteStock(commandeFourns.getQte());
        stockRepository.save(stock);
     return commandeFournisseurRepository.save(commandeFourns);
    }

    @Override
    public List<CommandeFourns> lister() {
       return commandeFournisseurRepository.findAll();
    }

    @Override
    public Optional<CommandeFourns> recherche(Integer id) {
       return commandeFournisseurRepository.findById(id);
    }

    @Override
    public void supprimeCommande(Integer id) {
    commandeFournisseurRepository.deleteById(id);
    }
    
}
