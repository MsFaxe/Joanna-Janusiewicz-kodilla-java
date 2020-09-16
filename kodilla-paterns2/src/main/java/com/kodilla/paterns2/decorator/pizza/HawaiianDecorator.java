package com.kodilla.paterns2.decorator.pizza;

import java.math.BigDecimal;

public class HawaiianDecorator extends AbstractPizzaOrderDecorator{
    public HawaiianDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost () {
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pineapple, chicken";
    }
}
