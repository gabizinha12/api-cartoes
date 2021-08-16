package com.teste.handson.apibancaria.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teste.handson.apibancaria.model.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

List<Cliente> findByNome(String nome);


}
