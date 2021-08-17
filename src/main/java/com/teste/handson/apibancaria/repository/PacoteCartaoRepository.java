package com.teste.handson.apibancaria.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teste.handson.apibancaria.model.PacoteCartao;

@Repository
public interface PacoteCartaoRepository extends CrudRepository<PacoteCartao, Long>{
//	@Query(nativeQuery = true, value = "select"
//			+ "        	p.id as id1_0_,"
//			+ "         p.codigo_pacote as codigo_p2_0_,"
//			+ "         p.nome_pacote as nome_pac3_0_,"
//			+ "         p.valor_pacote as valor_pa4_0_ "
//			+ "    from"
//			+ "        pacotecartao p "
//			+ "    where"
//			+ "       p.nome_pacote' ")
	PacoteCartao findByNomePacote(String nomePacote);

}
