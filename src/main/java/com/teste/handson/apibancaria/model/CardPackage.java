package com.teste.handson.apibancaria.model;

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

    public CardPackage(Long packageCode, String namePackage, BigDecimal packagePrice) {
        this.packageCode = packageCode;
        this.namePackage = namePackage;
        this.packagePrice = packagePrice;
    }

    public CardPackage() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(Long packageCode) {
        this.packageCode = packageCode;
    }

    public String getNamePackage() {
        return namePackage;
    }

    public void setNamePackage(String namePackage) {
        this.namePackage = namePackage;
    }

    public BigDecimal getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(BigDecimal packagePrice) {
        this.packagePrice = packagePrice;
    }
}
