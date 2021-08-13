package com.teste.handson.apibancaria.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import com.teste.handson.apibancaria.model.Cargo;
import com.teste.handson.apibancaria.model.Cliente;

public class ClienteDto {
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}
	

	private String bairroEndereco;
	public String getBairroEndereco() {
		return bairroEndereco;
	}
	public ClienteDto(Cliente cliente) {
		this.nome = cliente.getNome();
		this.cpf = cliente.getCpf();
		this.dtNascimento = cliente.getDtNascimento();
		this.email = cliente.getEmail();
		this.cep = cliente.getCep();
		this.endereco = cliente.getEndereco();
		this.complementoEndereco = cliente.getComplementoEndereco();
		this.bairroEndereco = cliente.getBairroEndereco();
		this.cidadeEndereco = cliente.getCidadeEndereco();
		this.estadoEndereco = cliente.getEstadoEndereco();
		this.profissao = cliente.getProfissao();
		this.salario = cliente.getSalario();
		this.ehFuncionario = cliente.getEhFuncionario();
		this.matricula = cliente.getMatricula();
		this.dtAdmissao = cliente.getDtAdmissao();
		this.cargo = cliente.getCargo();
	}

	private Long id;
	public static List<ClienteDto> converter(List<Cliente>  clientes) {
		return clientes.stream().map(ClienteDto::new).collect(Collectors.toList());
		
	}

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getDtNascimento() {
		return dtNascimento;
	}
	public String getEmail() {
		return email;
	}
	public String getCep() {
		return cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getNumeroEndereco() {
		return numeroEndereco;
	}
	public String getComplementoEndereco() {
		return complementoEndereco;
	}
	public String getCidadeEndereco() {
		return cidadeEndereco;
	}
	public void setCidadeEndereco(String cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}
	
	public void setEstadoEndereco(String estadoEndereco) {
		this.estadoEndereco = estadoEndereco;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public Boolean getEhFuncionario() {
		return ehFuncionario;
	}
	public void setEhFuncionario(Boolean ehFuncionario) {
		this.ehFuncionario = ehFuncionario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	public Long getId() {
		return id;
	}
	public String getEstadoEndereco() {
		return estadoEndereco;
	}
	public String getProfissao() {
		return profissao;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public Cargo getCargo() {
		return cargo;
	}

	private String nome;
	private String cpf;
	private String dtNascimento;
	private String email;
	private String cep;
	private String endereco;
	private String numeroEndereco;
	private String complementoEndereco;
	private String cidadeEndereco;
	private String estadoEndereco;
	private String profissao;
	private BigDecimal salario;
	private Boolean ehFuncionario;
	private String matricula;
	private String dtAdmissao;
	private Cargo cargo;

}
