package com.teste.handson.apibancaria.repository;



import com.teste.handson.apibancaria.controller.dto.ClientDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.handson.apibancaria.model.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

// List<Client> findByName(String name);
ClientDTO findByClientId(Long id);
ClientDTO saveClient(ClientDTO dto);
}
