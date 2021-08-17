package com.teste.handson.apibancaria.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class AplicarDescontoPacoteCartao {
 public BigDecimal calculaDescontoPorCargo(Cargo cargo, BigDecimal valorPacote) {
	return valorPacote.multiply(new BigDecimal(cargo.getDesconto())).divide(new BigDecimal(100));
	 
 }
 public BigDecimal calculaDescontoPorDataDeAdmissao(BigDecimal valorPacote) {
		return valorPacote.multiply(new BigDecimal(10).divide(new BigDecimal(100)));
 }
}
