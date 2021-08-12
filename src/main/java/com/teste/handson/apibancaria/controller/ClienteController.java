package com.teste.handson.apibancaria.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.teste.handson.apibancaria.controller.dto.ClienteDto;
import com.teste.handson.apibancaria.controller.form.ClienteForm;
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
			List<Cliente> cliente = clienteRepository.findByNomeCliente(nome);
			return ClienteDto.converter(cliente);
			
		}
	}
	@PostMapping
	public ResponseEntity<ClienteDto> registrar(@RequestBody @Valid ClienteForm form, UriComponentsBuilder uriBuilder) {
		Cliente cliente = form.converter(clienteRepository);
		clienteRepository.save(cliente);
		URI uri = uriBuilder.path("/clientes/{id}").buildAndExpand(cliente.getId()).toUri();
		return ResponseEntity.created(uri).body(new ClienteDto(cliente));
		
	}
}
