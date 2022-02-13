package com.teste.handson.apibancaria.service;

import com.teste.handson.apibancaria.controller.dto.ClientDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
public class ClientService {


    @Transactional
    public ClientDTO createNewClient(ClientDTO dto) {

    }

}
