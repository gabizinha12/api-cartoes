package com.teste.handson.apibancaria.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


import com.teste.handson.apibancaria.model.DiscountCardPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.handson.apibancaria.controller.dto.CardPackageDTO;
import com.teste.handson.apibancaria.model.Client;

@Service
public class checkDiscountByCardPackageService {
	private final CardPackageService cardPackageService;
	private final DiscountCardPackage discountCardPackage;

	public checkDiscountByCardPackageService(CardPackageService cardPackageService, DiscountCardPackage discountCardPackage) {
		this.cardPackageService = cardPackageService;
		this.discountCardPackage = discountCardPackage;
	}


	public List<CardPackageDTO> findAvaliablePackages(Client client) throws ParseException {
		List<CardPackageDTO> listPackages = new ArrayList<>();
//		if (cliente.getEhFuncionario()) {
//			if (cliente.getSalario().compareTo(new BigDecimal("11000")) == 1) {
//				var pacote = pacoteCartaoService.findByNomePacote("Black");
//				pacote.setValorPacote(
//						aplicarDescontoPacote.calculaDescontoPorCargo(cliente.getCargo(), pacote.getValorPacote()));
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//				LocalDate ld = LocalDate.parse(cliente.getDtAdmissao(), formatter);
//				if (ld.isBefore(LocalDate.now().minus(5, ChronoUnit.YEARS))) {
//					pacote.setValorPacote(
//							aplicarDescontoPacote.calculaDescontoPorDataDeAdmissao(pacote.getValorPacote()));
//				}
//				listPacotes.add(pacote);
//			}
//
//			if (cliente.getSalario().compareTo(new BigDecimal("5000")) == 1) {
//				var pacote = pacoteCartaoService.findByNomePacote("Gold");
//				pacote.setValorPacote(
//						aplicarDescontoPacote.calculaDescontoPorCargo(cliente.getCargo(), pacote.getValorPacote()));
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//				LocalDate ld = LocalDate.parse(cliente.getDtAdmissao(), formatter);
//				if (ld.isAfter(LocalDate.now().plus(5, ChronoUnit.YEARS))) {
//					pacote.setValorPacote(
//							aplicarDescontoPacote.calculaDescontoPorDataDeAdmissao(pacote.getValorPacote()));
//				}
//				listPacotes.add(pacote);
//			}
//			if (cliente.getSalario().compareTo(new BigDecimal("2000")) == 1) {
//				var pacote = pacoteCartaoService.findByNomePacote("Silver");
//				pacote.setValorPacote(
//						aplicarDescontoPacote.calculaDescontoPorCargo(cliente.getCargo(), pacote.getValorPacote()));
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//				LocalDate ld = LocalDate.parse(cliente.getDtAdmissao(), formatter);
//				if (ld.isAfter(LocalDate.now().plus(5, ChronoUnit.YEARS))) {
//					pacote.setValorPacote(
//							aplicarDescontoPacote.calculaDescontoPorDataDeAdmissao(pacote.getValorPacote()));
//				}
//				listPacotes.add(pacote);
//			}
//		} else {
//			if (cliente.getSalario().compareTo(new BigDecimal("11000")) == 1) {
//				var pacote = pacoteCartaoService.findByNomePacote("Black");
//				listPacotes.add(pacote);
//			}
//			if (cliente.getSalario().compareTo(new BigDecimal("5000")) == 1) {
//				var pacote = pacoteCartaoService.findByNomePacote("Gold");
//				listPacotes.add(pacote);
//			}
//			if (cliente.getSalario().compareTo(new BigDecimal("2000")) == 1) {
//				var pacote = pacoteCartaoService.findByNomePacote("Silver");
//				listPacotes.add(pacote);
//			}
//			var pacote = pacoteCartaoService.findByNomePacote("Basic");
//			listPacotes.add(pacote);
//		}
//		return listPacotes;
//	}

}
