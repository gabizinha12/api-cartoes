package com.teste.handson.apibancaria.model;

public enum JobRole {
    AUXILIAR(30), ANALISTA(45), GERENTE(60);

    public Integer discount;
    public Boolean has5Years;

    JobRole(int discountValue) {
        this.discount = discountValue;
    }

    public Integer getDiscount() {
        return discount;
    }

}
