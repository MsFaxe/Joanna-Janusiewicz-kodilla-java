package com.kodilla.exception.test;

public class FirstChallenge {

    public void divide(double a, double b)/* throws  ArithmeticException*/{
        try{
            double result =  a / b;
            if (Double.isInfinite(result))
                throw new ArithmeticException();

        }catch (ArithmeticException e){
            System.out.println("Exception: " + e);
        }finally {

        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) throws ArithmeticException{

        FirstChallenge firstChallenge = new FirstChallenge();

        firstChallenge.divide(3.2, 0);
    }
}