package com.teste.handson.apibancaria.controller.form;

import java.math.BigDecimal;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.teste.handson.apibancaria.model.Cartao;
import com.teste.handson.apibancaria.repository.CartaoRepository;

public class CartaoForm {
	@NotNull @NotEmpty
	private String nomePacote;
	private Long codigoPacote;
	private BigDecimal valorPacote;

	public String getNomePacote() {
		return nomePacote;
	}
	public Cartao converter(CartaoRepository cartaoRepository) {
		cartaoRepository.findByNome(nomePacote);
		return new Cartao(codigoPacote, nomePacote, valorPacote);
	}
	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}

	public Long getCodigoPacote() {
		return codigoPacote;
	}

	public void setCodigoPacote(Long codigoPacote) {
		this.codigoPacote = codigoPacote;
	}

	public BigDecimal getValorPacote() {
		return valorPacote;
	}

	public void setValorPacote(BigDecimal valorPacote) {
		this.valorPacote = valorPacote;
	}

}
