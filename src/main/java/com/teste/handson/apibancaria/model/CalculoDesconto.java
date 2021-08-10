package com.teste.handson.apibancaria.model;


import java.math.BigDecimal;
import java.util.List;

public abstract class CalculoDesconto {
public abstract List<Cartao> cartao();
public abstract BigDecimal CalcularDesconto();
}
