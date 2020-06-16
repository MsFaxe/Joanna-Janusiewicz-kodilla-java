package com.kodilla.patterns.builder.bigmac;

import jdk.nashorn.internal.AssertsEnabled;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBurger()
                .bun("Sesame roll")
                .sauce("Standard")
                .burgers(2)
                .ingredient("Onion")
                .ingredient("Bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatSauce = bigmac.getSauce();
        String whatBun = bigmac.getBun();
        //Then
        Assert.assertEquals(2, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals("Standard", whatSauce);
        Assert.assertEquals("Sesame roll", whatBun);
    }
}
