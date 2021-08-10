package com.teste.handson.apibancaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.handson.apibancaria.controller.dto.ClienteDto;
import com.teste.handson.apibancaria.model.Cliente;
import com.teste.handson.apibancaria.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<ClienteDto> list(String nome) {
		if(nome == null) {
			List<Cliente> clientes = clienteRepository.findAll();
			return ClienteDto.converter(clientes);
			
		} else {
			List<Cliente> cliente = clienteRepository.findByNome(nome);
			return ClienteDto.converter(cliente);
			
		}
	}
}
