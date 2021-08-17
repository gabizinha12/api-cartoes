package com.teste.handson.apibancaria.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class AplicarDescontoPacoteCartao {
 public BigDecimal CalculaDesconto(Cargo cargo, BigDecimal bigDecimal) {
	return bigDecimal.multiply(new BigDecimal(cargo.getDesconto())).divide(new BigDecimal(100));
	 
 }
}
