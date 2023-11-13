package com.projet.demo.service;

import java.util.List;

import com.projet.demo.dto.ClientDto;

public interface ClientService {
    ClientDto save(ClientDto clientdto);
    List<ClientDto>lister();
    void delete(Integer id);
    public  ClientDto findById(Integer id);
}
