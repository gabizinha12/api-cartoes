package com.teste.handson.apibancaria.model;

import java.math.BigDecimal;


public class Cartao {
	private Long id;
	private Long codigoPacote;
	public Long getCodigoPacote() {
		return codigoPacote;
	}
	public void setCodigoPacote(Long codigoPacote) {
		this.codigoPacote = codigoPacote;
	}
	public String getNomePacote() {
		return nomePacote;
	}
	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}
	public BigDecimal getValorPacote() {
		return valorPacote;
	}
	public void setValorPacote(BigDecimal valorPacote) {
		this.valorPacote = valorPacote;
	}
	public Long getId() {
		return id;
	}
	private String nomePacote;
	private BigDecimal valorPacote;

}
