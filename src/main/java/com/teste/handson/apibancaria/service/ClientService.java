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
        Client client = Client.builder().build();
        client.setAdmissionDate(dto.getAdmissionDate());
        client.setCityAddress(dto.getCityAddress());
        client.setAddress(dto.getAddress());
        client.setAddressNumber(dto.getAddressNumber());
        client.setAddressComplement(dto.getAddressComplement());
        client.setCityAddress(dto.getCityAddress());
        client.setEmail(dto.getEmail());
        client.setBirthDate(dto.getBirthDate());
        client.setEnrollment(dto.getEnrollment());
        client.setName(dto.getName());
        client.setHas5Years(dto.getHas5Years());
        client.setIsEmployee(dto.getIsEmployee());
        client.setNumDocument(dto.getNumDocument());
        client.setNeighborhood(dto.getNeighborhood());
        client.setProfession(dto.getProfession());
        client.setRole(dto.getRole());
        client.setSalary(dto.getSalary());
        client.setState(dto.getState());
        client.setZipCode(dto.getZipCode());
        repository.save(client);
        return dto;
    }

}
