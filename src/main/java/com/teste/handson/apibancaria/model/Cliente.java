package com.teste.handson.apibancaria.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "cliente")
public class Cliente extends AplicarDescontoPacoteCartao {

	public Cliente(String nome, String cpf, String email, String dtNascimento, String cep, String endereco,
			String numeroEndereco, String complementoEndereco, String cidadeEndereco, String bairroEndereco,
			String estadoEndereco, String profissao, BigDecimal salario, Boolean ehFuncionario, String matricula,
			String dtAdmissao, Cargo cargo) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
		this.cep = cep;
		this.endereco = endereco;
		this.numeroEndereco = numeroEndereco;
		this.complementoEndereco = complementoEndereco;
		this.cidadeEndereco = cidadeEndereco;
		this.bairroEndereco = bairroEndereco;
		this.estadoEndereco = estadoEndereco;
		this.profissao = profissao;
		this.salario = salario;
		this.ehFuncionario = ehFuncionario;
		this.matricula = matricula;
		this.dtAdmissao = dtAdmissao;
		this.cargo = cargo;
	}

	

	public Cliente() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String nome;
	private String cpf;
	@Column
	private String dtNascimento;
	@Column
	private String cep;
	@Column
	private String endereco;
	@Column
	private String numeroEndereco;
	@Column
	private String complementoEndereco;
	@Column
	private String bairroEndereco;
	@Column
	private String cidadeEndereco;
	@Column
	private String estadoEndereco;
	@Column
	private String profissao;
	@Column
	private BigDecimal salario;
	@Column
	private Boolean ehFuncionario;
	@Column
	private Boolean tem5Anos;

	public Boolean getTem5Anos() {
		return tem5Anos;
	}

	public void setTem5Anos(Boolean tem5Anos) {
		this.tem5Anos = tem5Anos;
	}

	@Column
	private String matricula;
	private String dtAdmissao;
	@Enumerated(EnumType.STRING)
	@Transient
	private Cargo cargo;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getComplementoEndereco() {
		return complementoEndereco;
	}

	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}

	public String getCidadeEndereco() {
		return cidadeEndereco;
	}

	public void setCidadeEndereco(String cidadeEndereco) {
		this.cidadeEndereco = cidadeEndereco;
	}

	public String getEstadoEndereco() {
		return estadoEndereco;
	}

	public void setEstadoEndereco(String estadoEndereco) {
		this.estadoEndereco = estadoEndereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public BigDecimal getSalario() {
		return salario;
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

	public Cargo getCargo() {
		return cargo;
	}

	public String getBairroEndereco() {
		return bairroEndereco;
	}

	public void setBairroEndereco(String bairroEndereco) {
		this.bairroEndereco = bairroEndereco;
	}

}
