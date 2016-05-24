package ru.topjava06.kve.gp.model;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

public class Restaurant extends BaseEntity {

    protected Map<String, BigDecimal> menu;
    BigInteger rating;
}
