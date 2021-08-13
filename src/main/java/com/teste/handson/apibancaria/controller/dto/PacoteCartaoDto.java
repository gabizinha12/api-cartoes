package com.teste.handson.apibancaria.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.teste.handson.apibancaria.model.PacoteCartao;

public class PacoteCartaoDto {
	private Long id;
	private Long codigoPacote;
	private String nomePacote;
	private BigDecimal valorPacote;
	public PacoteCartaoDto(PacoteCartao cartao) {
		this.codigoPacote = cartao.getCodigoPacote();
		this.valorPacote = cartao.getValorPacote();
		this.id = cartao.getId();
	}
	public Long getId() {
		return id;
	}
	public Long getCodigoPacote() {
		return codigoPacote;
	}
	public String getNomePacote() {
		return nomePacote;
	}
	public BigDecimal getValorPacote() {
		return valorPacote;
	}
	public static List<PacoteCartaoDto> converter(List<PacoteCartao>  cartoes) {
		return cartoes.stream().map(PacoteCartaoDto::new).collect(Collectors.toList());
		
	}

}
