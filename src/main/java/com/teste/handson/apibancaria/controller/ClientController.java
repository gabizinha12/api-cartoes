package com.teste.handson.apibancaria.controller;

import com.teste.handson.apibancaria.controller.dto.ClientDTO;
import com.teste.handson.apibancaria.model.Client;
import com.teste.handson.apibancaria.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private final ClientRepository repository;


	public ClientController(ClientRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/{id}")
	public ResponseEntity<ClientDTO> findClientById(@PathVariable Long id) {
		ClientDTO client = repository.findByClientId(id);
		return ResponseEntity.ok().body(client);
	}
}
