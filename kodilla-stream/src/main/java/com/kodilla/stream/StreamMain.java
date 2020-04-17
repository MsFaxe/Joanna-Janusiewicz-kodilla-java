package com.kodilla.stream;

import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.SaySomething;

public class StreamMain {
    public static void main (String[] args){
        System.out.println("Welcome to module 7 - Stream");

        //użycie klasy Processor do wykonania zadań przewidzianych dla przykładowej implementacji interfejsu Executor
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        //tworzenie obiektu klasy i wywołanie metody
        //SaySomething saySomething = new SaySomething();
        //saySomething.say();
    }
}
