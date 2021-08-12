package com.teste.handson.apibancaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.handson.apibancaria.controller.dto.CartaoDto;
import com.teste.handson.apibancaria.model.Cartao;
import com.teste.handson.apibancaria.repository.CartaoRepository;

@RestController
@RequestMapping("cartoes")
public class CartaoController {
	@Autowired
	private CartaoRepository cartaoRepository;
	@GetMapping
	public List<CartaoDto> list(String nome) {
		if(nome == null) {
			List<Cartao> cartoes = cartaoRepository.findAll();
			return CartaoDto.converter(cartoes);
			
		} else {
			List<Cartao> cartao = cartaoRepository.findByNomePacote(nome);
			return CartaoDto.converter(cartao);
			
		}
	}

}
