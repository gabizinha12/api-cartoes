package com.teste.handson.apibancaria.controller.dto;

import java.math.BigDecimal;
import java.util.List;

import com.teste.handson.apibancaria.model.CardPackage;

public class PackageSpecificationsDTO {
	private Long id;
	private Long codePackage;
	private String namePackage;
	private BigDecimal valuePackage;
	private List<CardPackage> packages;

}
