package com.teste.handson.apibancaria.service;

import com.teste.handson.apibancaria.controller.dto.ClientDTO;
import com.teste.handson.apibancaria.model.Client;
import com.teste.handson.apibancaria.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public ClientDTO createNewClient(ClientDTO dto) {
       ClientDTO client = repository.saveClient(dto);
        return client;
    }

}
