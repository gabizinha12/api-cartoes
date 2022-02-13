package com.teste.handson.apibancaria.model;

import lombok.*;

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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
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




}
