package com.teste.handson.apibancaria.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.teste.handson.apibancaria.controller.dto.DetalhePacoteDto;
import com.teste.handson.apibancaria.model.Cliente;

@Service
public class ConsultaPacoteCartaoService {

	public DetalhePacoteDto consultaPacotesDisponiveis(Cliente cliente) {

		if (cliente.getEhFuncionario()) {
			if (cliente.getSalario().compareTo(new BigDecimal("11000")) == 1) {

			} else if (cliente.getSalario().compareTo(new BigDecimal("5000")) == 1) {

			} else if (cliente.getSalario().compareTo(new BigDecimal("2000")) == 1) {
            
			} 
		} else {
			if (cliente.getSalario().compareTo(new BigDecimal("11000")) == 1) {

			} else if (cliente.getSalario().compareTo(new BigDecimal("5000")) == 1) {

			} else if (cliente.getSalario().compareTo(new BigDecimal("2000")) == 1) {
            
			} 
		}
		return null;
	}

}
