package com.teste.handson.apibancaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.handson.apibancaria.controller.dto.PacoteCartaoDto;
import com.teste.handson.apibancaria.repository.PacoteCartaoRepository;

@Service
public class PacoteCartaoService {
	@Autowired
	private PacoteCartaoRepository repository;

	public PacoteCartaoDto findByNomePacote(String nomePacote) {
		var pacote = repository.findOneBynomePacote(nomePacote);
		var dto = new PacoteCartaoDto().converter(pacote);
		return dto;
	}
}
