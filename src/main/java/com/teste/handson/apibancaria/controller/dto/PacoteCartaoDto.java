package com.teste.handson.apibancaria.controller.dto;

import java.math.BigDecimal;

import com.teste.handson.apibancaria.model.PacoteCartao;

public class PacoteCartaoDto {
	private Long codigoPacote;

	public void setCodigoPacote(Long codigoPacote) {
		this.codigoPacote = codigoPacote;
	}

	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}

	public void setValorPacote(BigDecimal valorPacote) {
		this.valorPacote = valorPacote;
	}

	private String nomePacote;
	private BigDecimal valorPacote;

	public PacoteCartaoDto(PacoteCartao cartao) {
		this.codigoPacote = cartao.getCodigoPacote();
		this.nomePacote = cartao.getNomePacote();
		this.valorPacote = cartao.getValorPacote();
	}
	public PacoteCartaoDto() {
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

	public PacoteCartaoDto converter(PacoteCartao pacoteCartao) {
		var dto = new PacoteCartaoDto();
		dto.setCodigoPacote(pacoteCartao.getCodigoPacote());
		dto.setNomePacote(pacoteCartao.getNomePacote());
		dto.setValorPacote(pacoteCartao.getValorPacote());
		return dto;

	}

}
