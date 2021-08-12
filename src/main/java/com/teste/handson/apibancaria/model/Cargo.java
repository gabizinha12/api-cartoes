package com.teste.handson.apibancaria.model;

public enum Cargo {
	AUXILIAR(30), ANALISTA(45), GERENTE(60);

	public Integer desconto;
	public Boolean Tem5Anos;

	public Boolean getTem5Anos() {
		return Tem5Anos;
	}

	public Integer getDesconto() {
		return desconto;
	}

	Cargo(int valorDesconto) {
		valorDesconto = desconto;
	}
	
}
