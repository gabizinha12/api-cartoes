package com.teste.handson.apibancaria.repository;

import com.teste.handson.apibancaria.controller.dto.CardPackageDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teste.handson.apibancaria.model.CardPackage;

@Repository
public interface CardPackageRepository extends CrudRepository<CardPackage, Long>{

	CardPackageDTO findByPackageName(String namePackage);

}
