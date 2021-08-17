package com.teste.handson.apibancaria.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pacotecartao")
public class PacoteCartao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Long codigoPacote;
	@Column
	private String nomePacote;
	@Column
	private BigDecimal valorPacote;

	public PacoteCartao(Long codigoPacote, String nomePacote, BigDecimal valorPacote) {
		super();
		this.codigoPacote = codigoPacote;
		this.nomePacote = nomePacote;
		this.valorPacote = valorPacote;
	}
	public PacoteCartao() {
		
	}

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

}
