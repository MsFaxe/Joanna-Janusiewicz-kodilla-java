package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else{
            System.out.println("Error!");
        }

        System.out.println("\nTest kalkulatora:");

        Calculator calculator = new Calculator();
        int add = calculator.add(5, 2);
        int sub = calculator.subtract(7,3);

        if (add == 7 && sub == 4){
            System.out.println("Calculator - OK");
        } else{
            System.out.println("Calculator - error!");
        }



    }
}
