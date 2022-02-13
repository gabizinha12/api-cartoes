package com.teste.handson.apibancaria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "card_package")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardPackage implements Serializable {

    private static final long serialVersionUID = -7942407583272797034L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long packageCode;
    @Column
    private String namePackage;
    @Column
    private BigDecimal packagePrice;

}
