package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        BigDecimal cost = order.getCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Pizza with: sauce, mozzarella", description);
    }

    @Test
    public void testHawaiianPizzaWithExtraSauceGetCost() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HawaiianDecorator(order);
        order = new ExtraSauceDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        //Then
        assertEquals(new BigDecimal(35), cost);
    }

    @Test
    public void testHawaiianPizzaWithExtraSauceGetDescription() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HawaiianDecorator(order);
        order = new ExtraSauceDecorator(order);
        //When
        String description = order.getDescription();
        //Then
        assertEquals("Pizza with: sauce, mozzarella, pineapple, chicken with extra sauce", description);
    }
}
