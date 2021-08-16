package com.teste.handson.apibancaria.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.handson.apibancaria.controller.dto.PacoteCartaoDto;
import com.teste.handson.apibancaria.model.Cliente;

@Service
public class ConsultaPacoteCartaoService {
	@Autowired
	private PacoteCartaoService pacoteCartaoService;

	public PacoteCartaoDto consultaPacotesDisponiveis(Cliente cliente) {

		if (cliente.getEhFuncionario()) {
			if (cliente.getSalario().compareTo(new BigDecimal("11000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Gold");
				return pacote;
			} else if (cliente.getSalario().compareTo(new BigDecimal("5000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Silver");
				return pacote;
			} else if (cliente.getSalario().equals(new BigDecimal("2000"))) {
				var pacote = pacoteCartaoService.findByNomePacote("Basic");
				return pacote;
			}
		} else {
			if (cliente.getSalario().compareTo(new BigDecimal("11000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Gold");
				return pacote;
			} else if (cliente.getSalario().compareTo(new BigDecimal("5000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Silver");
				return pacote;
			} else if (cliente.getSalario().compareTo(new BigDecimal("2000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Basic");
				return pacote;
			}
		}
		return null;
	}

}
