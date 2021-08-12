package com.teste.handson.apibancaria.model;

public class AplicarDescontoPacoteCartao {
 public Integer CalculaDesconto(Cargo cargo, Integer valorDoPlano) {
	return valorDoPlano * (cargo.getDesconto()) / 100;
	 
 }
}
