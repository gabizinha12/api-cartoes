package com.teste.handson.apibancaria.controller.dto;

import java.util.List;

import com.teste.handson.apibancaria.model.PacoteCartao;

public class ResponseClienteDto {
public ResponseClienteDto(List<PacoteCartao> pacoteCartoes) {
		this.pacoteCartoes = pacoteCartoes;
	}

List<PacoteCartao> pacoteCartoes;
}
