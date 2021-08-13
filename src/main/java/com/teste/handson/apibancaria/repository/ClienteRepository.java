package com.teste.handson.apibancaria.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.handson.apibancaria.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

List<Cliente> findByNome(String nome);


}
