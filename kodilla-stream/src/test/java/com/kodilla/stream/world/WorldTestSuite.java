package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;
import com.sun.media.jfxmediaimpl.HostUtils;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        //Create Countries
        Country poland = new Country("Poland", "123456789012340");
        Country england = new Country("England", "454534321321546");
        Country china = new Country("China", "867651542332132");
        Country japan = new Country("Japan", "564512312313121");
        Country tailand = new Country("Tailand", "545454545424566");

        Continent Europe = new Continent("Europe");
        Europe.addCountry(poland);
        Europe.addCountry(england);
        Continent Asia = new Continent("Asia");
        Europe.addCountry(china);
        Europe.addCountry(japan);
        Europe.addCountry(tailand);

        World world = new World();
        world.addContinent(Europe);
        world.addContinent(Asia);

        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        System.out.println(totalPeopleQuantity);

        //Then
        BigDecimal expectedPeople = new BigDecimal("2555609510403705");
        Assert.assertEquals(expectedPeople, totalPeopleQuantity);

    }
}
