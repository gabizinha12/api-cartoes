package com.teste.handson.apibancaria.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.teste.handson.apibancaria.model.Cartao;

public class CartaoDto {
	private Long id;
	private Long codigoPacote;
	public CartaoDto(Cartao cartao) {
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
	public static List<CartaoDto> converter(List<Cartao>  cartoes) {
		return cartoes.stream().map(CartaoDto::new).collect(Collectors.toList());
		
	}
	private String nomePacote;
	private BigDecimal valorPacote;
}
