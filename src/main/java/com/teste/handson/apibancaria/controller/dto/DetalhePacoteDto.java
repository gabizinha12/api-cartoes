package com.teste.handson.apibancaria.controller.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.teste.handson.apibancaria.model.PacoteCartao;

public class DetalhePacoteDto {
	private Long id;
	private Long codigoPacote;
	private String nomePacote;
	private BigDecimal valorPacote;
	private List<PacoteCartao> pacotes;
	public DetalhePacoteDto(PacoteCartao cartao) {
		this.codigoPacote = cartao.getCodigoPacote();
		this.nomePacote = cartao.getNomePacote();
		this.valorPacote = cartao.getValorPacote();
		this.pacotes = new ArrayList<>();
		this.pacotes.addAll(pacotes);
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
