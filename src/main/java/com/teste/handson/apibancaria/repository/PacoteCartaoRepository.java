package com.teste.handson.apibancaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.handson.apibancaria.model.PacoteCartao;

@Repository
public interface PacoteCartaoRepository extends JpaRepository<PacoteCartao, Long>{
	PacoteCartao findByNomePacote(String nomePacote);

}
