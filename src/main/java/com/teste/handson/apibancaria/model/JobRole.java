package com.teste.handson.apibancaria.model;

public enum JobRole {
    ASSISTANT(30), ANALYST(45), MANAGER(60);

    public final Integer discount;
    public Boolean has5Years;

    JobRole(int discountValue) {
        this.discount = discountValue;
    }

    public Integer getDiscount() {
        return discount;
    }

}
