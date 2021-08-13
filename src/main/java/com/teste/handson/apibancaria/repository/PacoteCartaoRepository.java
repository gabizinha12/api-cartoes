package com.teste.handson.apibancaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.handson.apibancaria.model.PacoteCartao;

public interface PacoteCartaoRepository extends JpaRepository<PacoteCartao, Long>{
	List<PacoteCartao> findByNomePacote(String nomePacote);

}
