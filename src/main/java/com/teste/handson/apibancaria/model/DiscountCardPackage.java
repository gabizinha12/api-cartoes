package com.teste.handson.apibancaria.model;

import java.math.BigDecimal;
import java.math.MathContext;

import org.springframework.stereotype.Service;

@Service
public class DiscountCardPackage implements applyDiscount {


    @Override
    public BigDecimal calculateDiscountByFunction(JobRole role, BigDecimal packagePrice) {
       return packagePrice.subtract(packagePrice.multiply(new BigDecimal(role.getDiscount()))).divide(new BigDecimal(100));
    }

    @Override
    public BigDecimal calculateDiscountByDateOfAdmission(BigDecimal packagePrice) {
        return packagePrice.subtract(packagePrice.multiply(new BigDecimal(10))).divide(new BigDecimal(100));
    }


}
