package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {
    //ArrayList<Integer> allNumbers;
    ArrayList<Integer> evenNumbers = new ArrayList<Integer>();


    /*public OddNumbersExterminator(ArrayList<Integer> numbers){
        this.allNumbers = numbers;
    }*/

    public ArrayList<Integer> getEvenNumbers(){
        return evenNumbers;
    }
    public void exterminate(ArrayList<Integer> numbers){

        for (int i = 0;i<numbers.size();i++) {
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }
    }

    public void showList(){
        System.out.println("Lista przystych liczb:");
        for (Integer a: evenNumbers){
            System.out.println(a);
        }
    }
}
