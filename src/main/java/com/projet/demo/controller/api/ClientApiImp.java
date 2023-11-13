package com.projet.demo.controller.api;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.projet.demo.dto.ClientDto;
import com.projet.demo.service.ClientService;
@RestController
public class ClientApiImp  implements ClientApi{
     private ClientService clientservice;
     public ClientApiImp(ClientService clientService){
        this.clientservice=clientService;

     }
    @Override
    public ClientDto save(ClientDto clientdto) {
     return clientservice.save(clientdto);
    }

    @Override
    public List<ClientDto> lister() {
      return clientservice.lister();
    }

    @Override
    public void delete(Integer id) {
      clientservice.delete(id);
    }

    @Override
    public ClientDto findById(Integer id) {
      return clientservice.findById(id);
    }
    
}
