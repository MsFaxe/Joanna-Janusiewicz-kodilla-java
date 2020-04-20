package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //given
        int[] tab = new int[]{3,2,4,12,89,152,4};

        //when
        double result = ArrayOperations.getAverage(tab);

        //then
        double sum = 0;
        for (double value: tab){
            sum+=value;
        }
        double average = sum/tab.length;
        System.out.println(average);
        Assert.assertEquals(average, result, 0);
    }
}
