package com.teste.handson.apibancaria.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.handson.apibancaria.controller.dto.PacoteCartaoDto;
import com.teste.handson.apibancaria.model.AplicarDescontoPacoteCartao;
import com.teste.handson.apibancaria.model.Cliente;
import com.teste.handson.apibancaria.model.PacoteCartao;

@Service
public class ConsultaPacoteCartaoService {
	@Autowired
	private PacoteCartaoService pacoteCartaoService;
	@Autowired
	private AplicarDescontoPacoteCartao aplicarDescontoPacote;

	public List<PacoteCartaoDto> consultaPacotesDisponiveis(Cliente cliente) {
		List<PacoteCartaoDto> listPacotes = new ArrayList<>();
		if (cliente.getEhFuncionario()) {
			if (cliente.getSalario().compareTo(new BigDecimal("11000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Black");
				pacote.setValorPacote(
						aplicarDescontoPacote.CalculaDesconto(cliente.getCargo(), pacote.getValorPacote()));
				listPacotes.add(pacote);
			}
			if (cliente.getSalario().compareTo(new BigDecimal("5000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Gold");
				pacote.setValorPacote(
						aplicarDescontoPacote.CalculaDesconto(cliente.getCargo(), pacote.getValorPacote()));
				listPacotes.add(pacote);
			}
			if (cliente.getSalario().compareTo(new BigDecimal("2000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Silver");
				pacote.setValorPacote(
						aplicarDescontoPacote.CalculaDesconto(cliente.getCargo(), pacote.getValorPacote()));
				listPacotes.add(pacote);
			}
		} else {
			if (cliente.getSalario().compareTo(new BigDecimal("11000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Black");
				listPacotes.add(pacote);
			}
			if (cliente.getSalario().compareTo(new BigDecimal("5000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Gold");
				listPacotes.add(pacote);
			}
			if (cliente.getSalario().compareTo(new BigDecimal("2000")) == 1) {
				var pacote = pacoteCartaoService.findByNomePacote("Silver");
				listPacotes.add(pacote);
			}
			var pacote = pacoteCartaoService.findByNomePacote("Basic");
			listPacotes.add(pacote);
		}
		return listPacotes;
	}

}
