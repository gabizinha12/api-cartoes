package com.teste.handson.apibancaria.controller;

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
import com.teste.handson.apibancaria.controller.dto.PacoteCartaoDto;
import com.teste.handson.apibancaria.controller.form.ClienteForm;
import com.teste.handson.apibancaria.model.Cliente;
import com.teste.handson.apibancaria.repository.ClienteRepository;
import com.teste.handson.apibancaria.service.ConsultaPacoteCartaoService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ConsultaPacoteCartaoService consultaPacoteCartaoService;
	
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
	@PostMapping
	public ResponseEntity<List<PacoteCartaoDto>> registrar(@RequestBody @Valid ClienteForm form, UriComponentsBuilder uriBuilder) {
		Cliente cliente = form.converter(clienteRepository);
		clienteRepository.save(cliente);
		var cartao = consultaPacoteCartaoService.consultaPacotesDisponiveis(cliente);
		return ResponseEntity.ok(cartao);
		
		
	}
}
