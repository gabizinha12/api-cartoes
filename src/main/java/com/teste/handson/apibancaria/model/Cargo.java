package com.teste.handson.apibancaria.model;

public enum Cargo {
	AUXILIAR(30), ANALISTA(45), GERENTE(60);

	public Integer desconto;

	public Integer getDesconto() {
		return desconto;
	}

	Cargo(int valorDesconto) {
		valorDesconto = desconto;
	}
	
}
