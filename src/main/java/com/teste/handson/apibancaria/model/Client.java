package com.teste.handson.apibancaria.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

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
@Table(name = "client")
public class Client  implements Serializable {


	private static final long serialVersionUID = 451296965219399073L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String name;
	private String numDocument;
	@Column
	private String birthDate;
	@Column
	private String zipCode;
	@Column
	private String address;
	@Column
	private String addressNumber;
	@Column
	private String addressComplement;
	@Column
	private String neighborhood;
	@Column
	private String cityAddress;
	@Column
	private String state;
	@Column
	private String profession;
	@Column
	private BigDecimal salary;
	@Column
	private Boolean isEmployee;
	@Column
	private Boolean has5Years;
	@Column
	private String enrollment;
	private String admissionDate;
	@Enumerated(EnumType.STRING)
	@Transient
	private JobRole role;


	public Client() {

	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Client client = (Client) o;
		return id.equals(client.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumDocument() {
		return numDocument;
	}

	public void setNumDocument(String numDocument) {
		this.numDocument = numDocument;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getAddressComplement() {
		return addressComplement;
	}

	public void setAddressComplement(String addressComplement) {
		this.addressComplement = addressComplement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCityAddress() {
		return cityAddress;
	}

	public void setCityAddress(String cityAddress) {
		this.cityAddress = cityAddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Boolean getEmployee() {
		return isEmployee;
	}

	public void setEmployee(Boolean employee) {
		isEmployee = employee;
	}

	public Boolean getHas5Years() {
		return has5Years;
	}

	public void setHas5Years(Boolean has5Years) {
		this.has5Years = has5Years;
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public JobRole getRole() {
		return role;
	}

	public void setRole(JobRole role) {
		this.role = role;
	}

	public Client(String email, String name, String numDocument, String birthDate, String zipCode, String address, String addressNumber, String addressComplement, String neighborhood, String cityAddress, String state, String profession, BigDecimal salary, Boolean isEmployee, Boolean has5Years, String enrollment, String admissionDate, JobRole role) {
		this.email = email;
		this.name = name;
		this.numDocument = numDocument;
		this.birthDate = birthDate;
		this.zipCode = zipCode;
		this.address = address;
		this.addressNumber = addressNumber;
		this.addressComplement = addressComplement;
		this.neighborhood = neighborhood;
		this.cityAddress = cityAddress;
		this.state = state;
		this.profession = profession;
		this.salary = salary;
		this.isEmployee = isEmployee;
		this.has5Years = has5Years;
		this.enrollment = enrollment;
		this.admissionDate = admissionDate;
		this.role = role;
	}
}
