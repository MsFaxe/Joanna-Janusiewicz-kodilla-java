package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculationsAddMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(13, 17);
        //Then
        Assert.assertEquals(30, add, 0);
    }

    @Test
    public void testCalculationsSubMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double sub = calculator.sub(9, 17);
        //Then
        Assert.assertEquals(-8, sub, 0);
    }

    @Test
    public void testCalculationsMulMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double mul = calculator.mul(5, 8);
        //Then
        Assert.assertEquals(40, mul, 0);
    }

    @Test
    public void testCalculationsDivMethod() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double div = calculator.div(20, 4);
        //Then
        Assert.assertEquals(5, div, 0);
    }
}
