package com.kodilla.paterns2.decorator.taxiportal;

import java.math.BigDecimal;

//podstawową klasę we wzorcu Decorator często nazywamy delegatem tego wzorca
public class BasicTaxiOrder implements TaxiOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5.00);
    }

    @Override
    public String getDescription() {
        return "Drive a course";
    }
}
