package com.teste.handson.apibancaria.model;

import java.math.BigDecimal;

public interface applyDiscount {
    BigDecimal calculateDiscountByFunction(JobRole role, BigDecimal valorPacote);

    BigDecimal calculateDiscountByDateOfAdmission(BigDecimal packagePrice);
}
