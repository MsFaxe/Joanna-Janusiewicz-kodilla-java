package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main (String[] args){
        System.out.println("Welcome to module 7 - Stream");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Ala ma kota", (string) -> "<3 " + string + " <3");
        poemBeautifier.beautify("Ala ma kota", (string) -> string.toUpperCase());
        poemBeautifier.beautify("         Ala ma kota          ", (string) -> string.trim());
        poemBeautifier.beautify("ALA MA KOTA", (string) -> string.toLowerCase() );


        ExpressionExecutor simpleCalculator = new ExpressionExecutor();
        /*MathExpression codeLambda = (a, b) -> a + b;
        expressionExecutor.executeExpression(5,3, codeLambda);
*/
        System.out.println("\nCalculating expressions with lambdas");
        simpleCalculator.executeExpression(10, 5, (a, b) -> a+b);
        simpleCalculator.executeExpression(10, 5, (a, b) -> a-b);
        simpleCalculator.executeExpression(10, 5, (a, b) -> a*b);
        simpleCalculator.executeExpression(10, 5, (a, b) -> a/b);

        System.out.println("\nCalculating expressions with method references");
        simpleCalculator.executeExpression(10, 5, FunctionalCalculator::addAToB);
        simpleCalculator.executeExpression(10, 5, FunctionalCalculator::subBFromA);
        simpleCalculator.executeExpression(10, 5, FunctionalCalculator::multiplyAByB);
        simpleCalculator.executeExpression(10, 5, FunctionalCalculator::divideAByB);

/*
        //wyrażenie lambda zamiast tworzenia klasy implementującej interfejs Executor
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("\nThis is example text.");
        processor.execute(codeToExecute);
        //LUB
        //Processor processor = new Processor();
        //        processor.execute(() -> System.out.println("This is an example text."));


        //użycie klasy Processor do wykonania zadań przewidzianych dla przykładowej implementacji interfejsu Executor
        Processor processor2 = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor2.execute(executeSaySomething);

        //tworzenie obiektu klasy i wywołanie metody
        SaySomething saySomething = new SaySomething();
        saySomething.say();*/

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
