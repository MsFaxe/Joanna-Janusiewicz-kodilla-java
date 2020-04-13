package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.*;
import java.lang.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,5));
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        exterminator.exterminate(numbers);
        ArrayList<Integer> result = exterminator.getEvenNumbers();
        //Then
        Assert.assertEquals(null, result);

        System.out.println("testOddNumbersExterminatorEmptyList: OK");
    }

    @Test
    public void testOddNumbersExterminatorNormalList (){
        //Given
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(2,4));
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        //When
        exterminator2.exterminate(numbers2);
        ArrayList<Integer> result = exterminator2.getEvenNumbers();
        //Then
        ArrayList<Integer> evenNumbers = new ArrayList<>(Arrays.asList(2,4));
        Assert.assertEquals(evenNumbers, result);

        System.out.println("testOddNumbersExterminatorNormalList: OK");
    }




}
