package com.teste.handson.apibancaria.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cartao")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long codigoPacote;
	private String nomePacote;
	private BigDecimal valorPacote;

	public Long getCodigoPacote() {
		return codigoPacote;
	}
	public Cartao() {}
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
