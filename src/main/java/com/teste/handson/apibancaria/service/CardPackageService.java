package com.teste.handson.apibancaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.handson.apibancaria.controller.dto.CardPackageDTO;
import com.teste.handson.apibancaria.repository.CardPackageRepository;

import java.util.List;

@Service
public class CardPackageService {
	@Autowired
	private CardPackageRepository repository;

	public CardPackageDTO findByNamePackage(String namePackage) {
	CardPackageDTO cardPackage =	repository.findByPackageName(namePackage);
	return cardPackage;
	}
}
