package com.teste.handson.apibancaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.handson.apibancaria.model.Cartao;

public interface CartaoRepository extends JpaRepository<Cartao, Long>{
	List<Cartao> findByNomePacote(String nome);
	Cartao findByNome(String nomePacote);

}
