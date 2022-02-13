package com.teste.handson.apibancaria.controller.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.teste.handson.apibancaria.model.CardPackage;

public class CardPackageDTO implements Serializable {

	private static final long serialVersionUID = -1478877049613485927L;
	private Long codePackage;
	private String namePackage;
	private BigDecimal valuePackage;

	public CardPackageDTO(Long codePackage, String namePackage, BigDecimal valuePackage) {
		this.codePackage = codePackage;
		this.namePackage = namePackage;
		this.valuePackage = valuePackage;
	}

	public Long getCodePackage() {
		return codePackage;
	}

	public void setCodePackage(Long codePackage) {
		this.codePackage = codePackage;
	}

	public String getNamePackage() {
		return namePackage;
	}

	public void setNamePackage(String namePackage) {
		this.namePackage = namePackage;
	}

	public BigDecimal getValuePackage() {
		return valuePackage;
	}

	public void setValuePackage(BigDecimal valuePackage) {
		this.valuePackage = valuePackage;
	}
}
