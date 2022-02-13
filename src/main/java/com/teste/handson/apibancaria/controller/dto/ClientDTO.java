package com.teste.handson.apibancaria.controller.dto;

import com.teste.handson.apibancaria.model.Client;
import com.teste.handson.apibancaria.model.JobRole;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDTO implements Serializable {

	private static final long serialVersionUID = -6888687462217037788L;
	private Long id;
	private String email;
	private String name;
	private String numDocument;
	private String birthDate;
	private String zipCode;
	private String address;
	private String addressNumber;
	private String addressComplement;
	private String neighborhood;
	private String cityAddress;
	private String state;
	private String profession;
	private BigDecimal salary;
	private Boolean isEmployee;
	private Boolean has5Years;
	private String enrollment;
	private String admissionDate;
	private JobRole role;



}
